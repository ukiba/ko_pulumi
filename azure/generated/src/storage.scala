package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object storage:
  /** Manages an Entity within a Table in an Azure Storage Account. */
  def TableEntity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.TableEntityArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.storage.TableEntityArgs.builder
    com.pulumi.azure.storage.TableEntity(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.storage.TableArgs.Builder)
    /**
     * @param acls One or more `acl` blocks as defined below.
     * @return builder
     */
    def acls(args: Endofunction[com.pulumi.azure.storage.inputs.TableAclArgs.Builder]*):
        com.pulumi.azure.storage.TableArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.TableAclArgs.builder
      builder.acls(args.map(_(argsBuilder).build)*)

  /** Manages an Immutability Policy for a Container within an Azure Storage Account. */
  def ContainerImmutabilityPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.ContainerImmutabilityPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.storage.ContainerImmutabilityPolicyArgs.builder
    com.pulumi.azure.storage.ContainerImmutabilityPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Storage Mover Job Definition. */
  def MoverJobDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.MoverJobDefinitionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.MoverJobDefinitionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.MoverJobDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the Queue Properties of an Azure Storage Account. */
  def AccountQueueProperties(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.AccountQueuePropertiesArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.storage.AccountQueuePropertiesArgs.builder
    com.pulumi.azure.storage.AccountQueueProperties(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.storage.ManagementPolicyArgs.Builder)
    /**
     * @param rules A `rule` block as documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.storage.inputs.ManagementPolicyRuleArgs.Builder]*):
        com.pulumi.azure.storage.ManagementPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.ManagementPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  /**
   * Manages a Storage Encryption Scope.
   * 
   *  &gt; **Note:** Storage Encryption Scopes are in Preview [more information can be found here](https://docs.microsoft.com/azure/storage/blobs/encryption-scope-manage).
   */
  def EncryptionScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.EncryptionScopeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.EncryptionScopeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.EncryptionScope(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.storage.AccountArgs.Builder)
    /**
     * @param azureFilesAuthentication A `azureFilesAuthentication` block as defined below.
     * @return builder
     */
    def azureFilesAuthentication(args: Endofunction[com.pulumi.azure.storage.inputs.AccountAzureFilesAuthenticationArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountAzureFilesAuthenticationArgs.builder
      builder.azureFilesAuthentication(args(argsBuilder).build)

    /**
     * @param blobProperties A `blobProperties` block as defined below.
     * @return builder
     */
    def blobProperties(args: Endofunction[com.pulumi.azure.storage.inputs.AccountBlobPropertiesArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountBlobPropertiesArgs.builder
      builder.blobProperties(args(argsBuilder).build)

    /**
     * @param customDomain A `customDomain` block as documented below.
     * @return builder
     */
    def customDomain(args: Endofunction[com.pulumi.azure.storage.inputs.AccountCustomDomainArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountCustomDomainArgs.builder
      builder.customDomain(args(argsBuilder).build)

    /**
     * @param customerManagedKey A `customerManagedKey` block as documented below.
     * 
     *  &gt; **Note:** It&#39;s possible to define a Customer Managed Key both within either the `customerManagedKey` block or by using the `azure.storage.CustomerManagedKey` resource. However, it&#39;s not possible to use both methods to manage a Customer Managed Key for a Storage Account, since these will conflict. When using the `azure.storage.CustomerManagedKey` resource, you will need to use `ignoreChanges` on the `customerManagedKey` block.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.storage.inputs.AccountCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.storage.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param immutabilityPolicy An `immutabilityPolicy` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def immutabilityPolicy(args: Endofunction[com.pulumi.azure.storage.inputs.AccountImmutabilityPolicyArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountImmutabilityPolicyArgs.builder
      builder.immutabilityPolicy(args(argsBuilder).build)

    /**
     * @param networkRules A `networkRules` block as documented below.
     * @return builder
     */
    def networkRules(args: Endofunction[com.pulumi.azure.storage.inputs.AccountNetworkRulesArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountNetworkRulesArgs.builder
      builder.networkRules(args(argsBuilder).build)

    /**
     * @param queueProperties A `queueProperties` block as defined below.
     * 
     *  &gt; **Note:** `queueProperties` can only be configured when `accountTier` is set to `Standard` and `accountKind` is set to either `Storage` or `StorageV2`.
     * @return builder
     * @deprecated this block has been deprecated and superseded by the `azure.storage.AccountQueueProperties` resource and will be removed in v5.0 of the AzureRM provider
     */
    @deprecated def queueProperties(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesArgs.builder
      builder.queueProperties(args(argsBuilder).build)

    /**
     * @param routing A `routing` block as defined below.
     * @return builder
     */
    def routing(args: Endofunction[com.pulumi.azure.storage.inputs.AccountRoutingArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountRoutingArgs.builder
      builder.routing(args(argsBuilder).build)

    /**
     * @param sasPolicy A `sasPolicy` block as defined below.
     * @return builder
     */
    def sasPolicy(args: Endofunction[com.pulumi.azure.storage.inputs.AccountSasPolicyArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountSasPolicyArgs.builder
      builder.sasPolicy(args(argsBuilder).build)

    /**
     * @param shareProperties A `shareProperties` block as defined below.
     * 
     *  &gt; **Note:** `shareProperties` can only be configured when either `accountTier` is `Standard` and `accountKind` is either `Storage` or `StorageV2` - or when `accountTier` is `Premium` and `accountKind` is `FileStorage`.
     * @return builder
     */
    def shareProperties(args: Endofunction[com.pulumi.azure.storage.inputs.AccountSharePropertiesArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountSharePropertiesArgs.builder
      builder.shareProperties(args(argsBuilder).build)

    /**
     * @param staticWebsite A `staticWebsite` block as defined below.
     * 
     *  &gt; **Note:** `staticWebsite` can only be set when the `accountKind` is set to `StorageV2` or `BlockBlobStorage`.
     * 
     *  &gt; **Note:** If `staticWebsite` is specified, the service will automatically create a `azure.storage.Container` named `$web`.
     * @return builder
     * @deprecated this block has been deprecated and superseded by the `azure.storage.AccountStaticWebsite` resource and will be removed in v5.0 of the AzureRM provider
     */
    @deprecated def staticWebsite(args: Endofunction[com.pulumi.azure.storage.inputs.AccountStaticWebsiteArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountStaticWebsiteArgs.builder
      builder.staticWebsite(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages the Static Website of an Azure Storage Account. */
  def AccountStaticWebsite(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.AccountStaticWebsiteArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.storage.AccountStaticWebsiteArgs.builder
    com.pulumi.azure.storage.AccountStaticWebsite(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Storage Sync Group. */
  def SyncGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.SyncGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.SyncGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.SyncGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Table within an Azure Storage Account.
   * 
   *  &gt; **Note:** Shared Key authentication will always be used for this resource, as AzureAD authentication is not supported when setting or retrieving ACLs for Tables.
   */
  def Table(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.TableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.TableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.Table(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type StorageFunctions = com.pulumi.azure.storage.StorageFunctions
  object StorageFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.storage.StorageFunctions.*
  extension (self: StorageFunctions.type)
    /** Use this data source to access information about an existing Storage Account. */
    def getAccount(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getAccount(args(argsBuilder).build)

    /** Use this data source to access information about an existing Storage Account. */
    def getAccountPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getAccountPlain(args(argsBuilder).build)

    /**
     * Use this data source to obtain a Shared Access Signature (SAS Token) for an existing Storage Account Blob Container.
     * 
     *  Shared access signatures allow fine-grained, ephemeral access control to various aspects of an Azure Storage Account Blob Container.
     */
    def getAccountBlobContainerSAS(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetAccountBlobContainerSASResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getAccountBlobContainerSAS(args(argsBuilder).build)

    /**
     * Use this data source to obtain a Shared Access Signature (SAS Token) for an existing Storage Account Blob Container.
     * 
     *  Shared access signatures allow fine-grained, ephemeral access control to various aspects of an Azure Storage Account Blob Container.
     */
    def getAccountBlobContainerSASPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetAccountBlobContainerSASResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getAccountBlobContainerSASPlain(args(argsBuilder).build)

    /**
     * Use this data source to obtain a Shared Access Signature (SAS Token) for an existing Storage Account.
     * 
     *  Shared access signatures allow fine-grained, ephemeral access control to various aspects of an Azure Storage Account.
     * 
     *  Note that this is an [Account SAS](https://docs.microsoft.com/rest/api/storageservices/constructing-an-account-sas)
     *  and *not* a [Service SAS](https://docs.microsoft.com/rest/api/storageservices/constructing-a-service-sas).
     */
    def getAccountSAS(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountSASArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetAccountSASResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountSASArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getAccountSAS(args(argsBuilder).build)

    /**
     * Use this data source to obtain a Shared Access Signature (SAS Token) for an existing Storage Account.
     * 
     *  Shared access signatures allow fine-grained, ephemeral access control to various aspects of an Azure Storage Account.
     * 
     *  Note that this is an [Account SAS](https://docs.microsoft.com/rest/api/storageservices/constructing-an-account-sas)
     *  and *not* a [Service SAS](https://docs.microsoft.com/rest/api/storageservices/constructing-a-service-sas).
     */
    def getAccountSASPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountSASPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetAccountSASResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountSASPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getAccountSASPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Storage Blob. */
    def getBlob(args: Endofunction[com.pulumi.azure.storage.inputs.GetBlobArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetBlobResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetBlobArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getBlob(args(argsBuilder).build)

    /** Use this data source to access information about an existing Storage Blob. */
    def getBlobPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetBlobPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetBlobResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetBlobPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getBlobPlain(args(argsBuilder).build)

    /** Use this data source to access information about the existing Storage Containers within a Storage Account. */
    def getContainers(args: Endofunction[com.pulumi.azure.storage.inputs.GetContainersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetContainersResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetContainersArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getContainers(args(argsBuilder).build)

    /** Use this data source to access information about the existing Storage Containers within a Storage Account. */
    def getContainersPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetContainersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetContainersResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetContainersPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getContainersPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Storage Encryption Scope. */
    def getEncryptionScope(args: Endofunction[com.pulumi.azure.storage.inputs.GetEncryptionScopeArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetEncryptionScopeResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetEncryptionScopeArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getEncryptionScope(args(argsBuilder).build)

    /** Use this data source to access information about an existing Storage Encryption Scope. */
    def getEncryptionScopePlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetEncryptionScopePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetEncryptionScopeResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetEncryptionScopePlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getEncryptionScopePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Storage Management Policy. */
    def getPolicy(args: Endofunction[com.pulumi.azure.storage.inputs.GetPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetPolicyResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetPolicyArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getPolicy(args(argsBuilder).build)

    /** Use this data source to access information about an existing Storage Management Policy. */
    def getPolicyPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetPolicyResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetPolicyPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getPolicyPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Storage Queue. */
    def getQueue(args: Endofunction[com.pulumi.azure.storage.inputs.GetQueueArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetQueueArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getQueue(args(argsBuilder).build)

    /** Use this data source to access information about an existing Storage Queue. */
    def getQueuePlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetQueuePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetQueuePlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getQueuePlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing File Share.
     * 
     *  &gt; **Note:** Shared Key authentication will always be used for this data source, as AzureAD authentication is not supported by the Storage API for files.
     */
    def getShare(args: Endofunction[com.pulumi.azure.storage.inputs.GetShareArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetShareResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetShareArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getShare(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing File Share.
     * 
     *  &gt; **Note:** Shared Key authentication will always be used for this data source, as AzureAD authentication is not supported by the Storage API for files.
     */
    def getSharePlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetSharePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetShareResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetSharePlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getSharePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Storage Container. */
    def getStorageContainer(args: Endofunction[com.pulumi.azure.storage.inputs.GetStorageContainerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetStorageContainerResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetStorageContainerArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getStorageContainer(args(argsBuilder).build)

    /** Use this data source to access information about an existing Storage Container. */
    def getStorageContainerPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetStorageContainerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetStorageContainerResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetStorageContainerPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getStorageContainerPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Storage Sync. */
    def getSync(args: Endofunction[com.pulumi.azure.storage.inputs.GetSyncArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetSyncResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetSyncArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getSync(args(argsBuilder).build)

    /** Use this data source to access information about an existing Storage Sync. */
    def getSyncPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetSyncPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetSyncResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetSyncPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getSyncPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Storage Sync Group. */
    def getSyncGroup(args: Endofunction[com.pulumi.azure.storage.inputs.GetSyncGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetSyncGroupResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetSyncGroupArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getSyncGroup(args(argsBuilder).build)

    /** Use this data source to access information about an existing Storage Sync Group. */
    def getSyncGroupPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetSyncGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetSyncGroupResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetSyncGroupPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getSyncGroupPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Storage Table. */
    def getTable(args: Endofunction[com.pulumi.azure.storage.inputs.GetTableArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetTableResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetTableArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getTable(args(argsBuilder).build)

    /** Use this data source to access information about an existing Storage Table. */
    def getTablePlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetTablePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetTableResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetTablePlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getTablePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Storage Table Entity. */
    def getTableEntities(args: Endofunction[com.pulumi.azure.storage.inputs.GetTableEntitiesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetTableEntitiesResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetTableEntitiesArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getTableEntities(args(argsBuilder).build)

    /** Use this data source to access information about an existing Storage Table Entity. */
    def getTableEntitiesPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetTableEntitiesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetTableEntitiesResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetTableEntitiesPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getTableEntitiesPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Storage Table Entity. */
    def getTableEntity(args: Endofunction[com.pulumi.azure.storage.inputs.GetTableEntityArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetTableEntityResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetTableEntityArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getTableEntity(args(argsBuilder).build)

    /** Use this data source to access information about an existing Storage Table Entity. */
    def getTableEntityPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetTableEntityPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetTableEntityResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetTableEntityPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getTableEntityPlain(args(argsBuilder).build)

  /**
   * Manages a Data Lake Gen2 Path in a File System within an Azure Storage Account.
   * 
   *  &gt; **Note:** This resource requires some `Storage` specific roles which are not granted by default. Some of the built-ins roles that can be attributed are [`Storage Account Contributor`](https://docs.microsoft.com/azure/role-based-access-control/built-in-roles#storage-account-contributor), [`Storage Blob Data Owner`](https://docs.microsoft.com/azure/role-based-access-control/built-in-roles#storage-blob-data-owner), [`Storage Blob Data Contributor`](https://docs.microsoft.com/azure/role-based-access-control/built-in-roles#storage-blob-data-contributor), [`Storage Blob Data Reader`](https://docs.microsoft.com/azure/role-based-access-control/built-in-roles#storage-blob-data-reader).
   */
  def DataLakeGen2Path(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.DataLakeGen2PathArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.storage.DataLakeGen2PathArgs.builder
    com.pulumi.azure.storage.DataLakeGen2Path(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Queue within an Azure Storage Account. */
  def Queue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.QueueArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.QueueArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.Queue(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Storage Account Local User. */
  def LocalUser(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.LocalUserArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.LocalUserArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.LocalUser(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Storage Mover Target Endpoint. */
  def MoverTargetEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.MoverTargetEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.MoverTargetEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.MoverTargetEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Storage Account. */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.AccountArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.AccountArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.storage.Account(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Container within an Azure Storage Account. */
  def Container(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.ContainerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.ContainerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.Container(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a File within an Azure Storage File Share.
   * 
   *  &gt; **Note:** When using Azure Active Directory Authentication (i.e. setting the provider property `storageUseAzuread = true`), the principal running Terraform must have the *Storage File Data Privileged Contributor* IAM role assigned. The *Storage File Data SMB Share Contributor* does not have sufficient permissions to create files. Refer to [official documentation](https://learn.microsoft.com/en-us/rest/api/storageservices/authorize-with-azure-active-directory#permissions-for-file-service-operations) for more details.
   */
  def ShareFile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.ShareFileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.ShareFileArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.ShareFile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Storage Sync. */
  def Sync(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.SyncArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.SyncArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.storage.Sync(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Directory within an Azure Storage File Share.
   * 
   *  &gt; **Note:** When using Azure Active Directory Authentication (i.e. setting the provider property `storageUseAzuread = true`), the principal running Terraform must have the *Storage File Data Privileged Contributor* IAM role assigned. The *Storage File Data SMB Share Contributor* does not have sufficient permissions to create directories. Refer to [official documentation](https://learn.microsoft.com/en-us/rest/api/storageservices/authorize-with-azure-active-directory#permissions-for-file-service-operations) for more details.
   */
  def ShareDirectory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.ShareDirectoryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.ShareDirectoryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.ShareDirectory(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** @deprecated ZipBlob resource is deprecated in the 2.0 version of the provider. Use Blob resource instead. */
  @deprecated() def ZipBlob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.ZipBlobArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.ZipBlobArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.ZipBlob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.storage.DataLakeGen2PathArgs.Builder)
    /**
     * @param aces One or more `ace` blocks as defined below to specify the entries for the ACL for the path.
     * @return builder
     */
    def aces(args: Endofunction[com.pulumi.azure.storage.inputs.DataLakeGen2PathAceArgs.Builder]*):
        com.pulumi.azure.storage.DataLakeGen2PathArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.DataLakeGen2PathAceArgs.builder
      builder.aces(args.map(_(argsBuilder).build)*)

  /** Manages a Storage Blob Inventory Policy. */
  def BlobInventoryPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.BlobInventoryPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.storage.BlobInventoryPolicyArgs.builder
    com.pulumi.azure.storage.BlobInventoryPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.storage.AccountNetworkRulesArgs.Builder)
    /**
     * @param privateLinkAccessRules One or more `privateLinkAccess` block as defined below.
     * @return builder
     */
    def privateLinkAccessRules(args: Endofunction[com.pulumi.azure.storage.inputs.AccountNetworkRulesPrivateLinkAccessRuleArgs.Builder]*):
        com.pulumi.azure.storage.AccountNetworkRulesArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.AccountNetworkRulesPrivateLinkAccessRuleArgs.builder
      builder.privateLinkAccessRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.LocalUserArgs.Builder)
    /**
     * @param permissionScopes One or more `permissionScope` blocks as defined below.
     * @return builder
     */
    def permissionScopes(args: Endofunction[com.pulumi.azure.storage.inputs.LocalUserPermissionScopeArgs.Builder]*):
        com.pulumi.azure.storage.LocalUserArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.LocalUserPermissionScopeArgs.builder
      builder.permissionScopes(args.map(_(argsBuilder).build)*)

    /**
     * @param sshAuthorizedKeys One or more `sshAuthorizedKey` blocks as defined below.
     * @return builder
     */
    def sshAuthorizedKeys(args: Endofunction[com.pulumi.azure.storage.inputs.LocalUserSshAuthorizedKeyArgs.Builder]*):
        com.pulumi.azure.storage.LocalUserArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.LocalUserSshAuthorizedKeyArgs.builder
      builder.sshAuthorizedKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.DataLakeGen2FilesystemArgs.Builder)
    /**
     * @param aces One or more `ace` blocks as defined below to specify the entries for the ACL for the path.
     * @return builder
     */
    def aces(args: Endofunction[com.pulumi.azure.storage.inputs.DataLakeGen2FilesystemAceArgs.Builder]*):
        com.pulumi.azure.storage.DataLakeGen2FilesystemArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.DataLakeGen2FilesystemAceArgs.builder
      builder.aces(args.map(_(argsBuilder).build)*)

  /**
   * Manages a Data Lake Gen2 File System within an Azure Storage Account.
   * 
   *  &gt; **Note:** This resource requires some `Storage` specific roles which are not granted by default. Some of the built-ins roles that can be attributed are [`Storage Account Contributor`](https://docs.microsoft.com/azure/role-based-access-control/built-in-roles#storage-account-contributor), [`Storage Blob Data Owner`](https://docs.microsoft.com/azure/role-based-access-control/built-in-roles#storage-blob-data-owner), [`Storage Blob Data Contributor`](https://docs.microsoft.com/azure/role-based-access-control/built-in-roles#storage-blob-data-contributor), [`Storage Blob Data Reader`](https://docs.microsoft.com/azure/role-based-access-control/built-in-roles#storage-blob-data-reader).
   */
  def DataLakeGen2Filesystem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.DataLakeGen2FilesystemArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.DataLakeGen2FilesystemArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.DataLakeGen2Filesystem(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Customer Managed Key for a Storage Account.
   * 
   *  &gt; **Note:** It&#39;s possible to define a Customer Managed Key both within the `azure.storage.Account` resource via the `customerManagedKey` block and by using the `azure.storage.CustomerManagedKey` resource. However it&#39;s not possible to use both methods to manage a Customer Managed Key for a Storage Account, since there&#39;ll be conflicts.
   */
  def CustomerManagedKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.CustomerManagedKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.storage.CustomerManagedKeyArgs.builder
    com.pulumi.azure.storage.CustomerManagedKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Storage Object Replication. */
  def ObjectReplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.ObjectReplicationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.storage.ObjectReplicationArgs.builder
    com.pulumi.azure.storage.ObjectReplication(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Blob within a Storage Container. */
  def Blob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.BlobArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.BlobArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.Blob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.storage.ShareArgs.Builder)
    /**
     * @param acls One or more `acl` blocks as defined below.
     * @return builder
     */
    def acls(args: Endofunction[com.pulumi.azure.storage.inputs.ShareAclArgs.Builder]*):
        com.pulumi.azure.storage.ShareArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.ShareAclArgs.builder
      builder.acls(args.map(_(argsBuilder).build)*)

  /**
   * Manages a Storage Sync Server Endpoint.
   * 
   *  &gt; **Note:** The parent `azure.storage.SyncGroup` must have an `azure.storage.SyncCloudEndpoint` available before an `azure.storage.SyncServerEndpoint` resource can be created.
   */
  def SyncServerEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.SyncServerEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.SyncServerEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.SyncServerEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Storage Mover Project. */
  def MoverProject(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.MoverProjectArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.MoverProjectArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.MoverProject(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.storage.BlobInventoryPolicyArgs.Builder)
    /**
     * @param rules One or more `rules` blocks as defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.storage.inputs.BlobInventoryPolicyRuleArgs.Builder]*):
        com.pulumi.azure.storage.BlobInventoryPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.BlobInventoryPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  /** Manages a Storage Mover. */
  def Mover(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.MoverArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.MoverArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.storage.Mover(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Storage Mover Source Endpoint. */
  def MoverSourceEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.MoverSourceEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.MoverSourceEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.MoverSourceEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Storage Mover Agent. */
  def MoverAgent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.MoverAgentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.MoverAgentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.MoverAgent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.storage.ObjectReplicationArgs.Builder)
    /**
     * @param rules One or more `rules` blocks as defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.storage.inputs.ObjectReplicationRuleArgs.Builder]*):
        com.pulumi.azure.storage.ObjectReplicationArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.ObjectReplicationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  /**
   * Manages a Storage Sync Cloud Endpoint.
   * 
   *  &gt; **Note:** Please ensure Azure File Sync has access to the storage account in your subscription, which indicates that `Microsoft.StorageSync` is assigned role `Reader and Data Access` ( refer to details [here](https://docs.microsoft.com/azure/storage/files/storage-sync-files-troubleshoot?tabs=portal1%2Cazure-portal#common-troubleshooting-steps)).
   */
  def SyncCloudEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.SyncCloudEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.SyncCloudEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.SyncCloudEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages network rules inside of a Azure Storage Account.
   * 
   *  &gt; **Note:** Network Rules can be defined either directly on the `azure.storage.Account` resource, or using the `azure.storage.AccountNetworkRules` resource - but the two cannot be used together. Spurious changes will occur if both are used against the same Storage Account.
   * 
   *  &gt; **Note:** Only one `azure.storage.AccountNetworkRules` can be tied to an `azure.storage.Account`. Spurious changes will occur if more than `azure.storage.AccountNetworkRules` is tied to the same `azure.storage.Account`.
   * 
   *  &gt; **Note:** Deleting this resource updates the storage account back to the default values it had when the storage account was created.
   */
  def AccountNetworkRules(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.AccountNetworkRulesArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.storage.AccountNetworkRulesArgs.builder
    com.pulumi.azure.storage.AccountNetworkRules(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.storage.AccountQueuePropertiesArgs.Builder)
    /**
     * @param corsRules A `corsRule` block as defined above.
     * @return builder
     */
    def corsRules(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesCorsRuleArgs.Builder]*):
        com.pulumi.azure.storage.AccountQueuePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesCorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

    /**
     * @param hourMetrics A `hourMetrics` block as defined below.
     * 
     *  &gt; **Note:** At least one of `corsRule`, `logging`, `minuteMetrics`, or `hourMetrics` must be specified.
     * @return builder
     */
    def hourMetrics(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesHourMetricsArgs.Builder]):
        com.pulumi.azure.storage.AccountQueuePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesHourMetricsArgs.builder
      builder.hourMetrics(args(argsBuilder).build)

    /**
     * @param logging A `logging` block as defined below.
     * @return builder
     */
    def logging(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesLoggingArgs.Builder]):
        com.pulumi.azure.storage.AccountQueuePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param minuteMetrics A `minuteMetrics` block as defined below.
     * @return builder
     */
    def minuteMetrics(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesMinuteMetricsArgs.Builder]):
        com.pulumi.azure.storage.AccountQueuePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesMinuteMetricsArgs.builder
      builder.minuteMetrics(args(argsBuilder).build)

  /**
   * Manages a File Share within Azure Storage.
   * 
   *  &gt; **Note:** The storage share supports two storage tiers: premium and standard. Standard file shares are created in general purpose (GPv1 or GPv2) storage accounts and premium file shares are created in FileStorage storage accounts. For further information, refer to the section &#34;What storage tiers are supported in Azure Files?&#34; of [documentation](https://docs.microsoft.com/azure/storage/files/storage-files-faq#general).
   * 
   *  &gt; **Note:** Shared Key authentication will always be used for this resource, as AzureAD authentication is not supported by the Storage API for files.
   */
  def Share(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.ShareArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.ShareArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.Share(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Storage Account Management Policy. */
  def ManagementPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.ManagementPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.storage.ManagementPolicyArgs.builder
    com.pulumi.azure.storage.ManagementPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsArgs.Builder)
    /**
     * @param baseBlob A `baseBlob` block as documented below.
     * @return builder
     */
    def baseBlob(args: Endofunction[com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsBaseBlobArgs.Builder]):
        com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsBaseBlobArgs.builder
      builder.baseBlob(args(argsBuilder).build)

    /**
     * @param snapshot A `snapshot` block as documented below.
     * @return builder
     */
    def snapshot(args: Endofunction[com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsSnapshotArgs.Builder]):
        com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsSnapshotArgs.builder
      builder.snapshot(args(argsBuilder).build)

    /**
     * @param version A `version` block as documented below.
     * @return builder
     */
    def version(args: Endofunction[com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsVersionArgs.Builder]):
        com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsVersionArgs.builder
      builder.version(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.DataLakeGen2PathState.Builder)
    /**
     * @param aces One or more `ace` blocks as defined below to specify the entries for the ACL for the path.
     * @return builder
     */
    def aces(args: Endofunction[com.pulumi.azure.storage.inputs.DataLakeGen2PathAceArgs.Builder]*):
        com.pulumi.azure.storage.inputs.DataLakeGen2PathState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.DataLakeGen2PathAceArgs.builder
      builder.aces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.BlobInventoryPolicyState.Builder)
    /**
     * @param rules One or more `rules` blocks as defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.storage.inputs.BlobInventoryPolicyRuleArgs.Builder]*):
        com.pulumi.azure.storage.inputs.BlobInventoryPolicyState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.BlobInventoryPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASArgs.Builder)
    /**
     * @param permissions Should Permissions permissions be enabled for this SAS?
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASPermissionsArgs.Builder]):
        com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASPermissionsArgs.builder
      builder.permissions(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.GetAccountSASArgs.Builder)
    /**
     * @param permissions A `permissions` block as defined below.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountSASPermissionsArgs.Builder]):
        com.pulumi.azure.storage.inputs.GetAccountSASArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountSASPermissionsArgs.builder
      builder.permissions(args(argsBuilder).build)

    /**
     * @param resourceTypes A `resourceTypes` block as defined below.
     * @return builder
     */
    def resourceTypes(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountSASResourceTypesArgs.Builder]):
        com.pulumi.azure.storage.inputs.GetAccountSASArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountSASResourceTypesArgs.builder
      builder.resourceTypes(args(argsBuilder).build)

    /**
     * @param services A `services` block as defined below.
     * @return builder
     */
    def services(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountSASServicesArgs.Builder]):
        com.pulumi.azure.storage.inputs.GetAccountSASArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountSASServicesArgs.builder
      builder.services(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.LocalUserPermissionScopeArgs.Builder)
    /**
     * @param permissions A `permissions` block as defined below.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.azure.storage.inputs.LocalUserPermissionScopePermissionsArgs.Builder]):
        com.pulumi.azure.storage.inputs.LocalUserPermissionScopeArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.LocalUserPermissionScopePermissionsArgs.builder
      builder.permissions(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.TableState.Builder)
    /**
     * @param acls One or more `acl` blocks as defined below.
     * @return builder
     */
    def acls(args: Endofunction[com.pulumi.azure.storage.inputs.TableAclArgs.Builder]*):
        com.pulumi.azure.storage.inputs.TableState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.TableAclArgs.builder
      builder.acls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.GetShareAclArgs.Builder)
    /**
     * @param accessPolicies An `accessPolicy` block as defined below.
     * @return builder
     */
    def accessPolicies(args: Endofunction[com.pulumi.azure.storage.inputs.GetShareAclAccessPolicyArgs.Builder]*):
        com.pulumi.azure.storage.inputs.GetShareAclArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.GetShareAclAccessPolicyArgs.builder
      builder.accessPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.AccountAzureFilesAuthenticationArgs.Builder)
    /**
     * @param activeDirectory A `activeDirectory` block as defined below. Required when `directoryType` is `AD`.
     * @return builder
     */
    def activeDirectory(args: Endofunction[com.pulumi.azure.storage.inputs.AccountAzureFilesAuthenticationActiveDirectoryArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountAzureFilesAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountAzureFilesAuthenticationActiveDirectoryArgs.builder
      builder.activeDirectory(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.AccountState.Builder)
    /**
     * @param azureFilesAuthentication A `azureFilesAuthentication` block as defined below.
     * @return builder
     */
    def azureFilesAuthentication(args: Endofunction[com.pulumi.azure.storage.inputs.AccountAzureFilesAuthenticationArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountAzureFilesAuthenticationArgs.builder
      builder.azureFilesAuthentication(args(argsBuilder).build)

    /**
     * @param blobProperties A `blobProperties` block as defined below.
     * @return builder
     */
    def blobProperties(args: Endofunction[com.pulumi.azure.storage.inputs.AccountBlobPropertiesArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountBlobPropertiesArgs.builder
      builder.blobProperties(args(argsBuilder).build)

    /**
     * @param customDomain A `customDomain` block as documented below.
     * @return builder
     */
    def customDomain(args: Endofunction[com.pulumi.azure.storage.inputs.AccountCustomDomainArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountCustomDomainArgs.builder
      builder.customDomain(args(argsBuilder).build)

    /**
     * @param customerManagedKey A `customerManagedKey` block as documented below.
     * 
     *  &gt; **Note:** It&#39;s possible to define a Customer Managed Key both within either the `customerManagedKey` block or by using the `azure.storage.CustomerManagedKey` resource. However, it&#39;s not possible to use both methods to manage a Customer Managed Key for a Storage Account, since these will conflict. When using the `azure.storage.CustomerManagedKey` resource, you will need to use `ignoreChanges` on the `customerManagedKey` block.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.storage.inputs.AccountCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.storage.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param immutabilityPolicy An `immutabilityPolicy` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def immutabilityPolicy(args: Endofunction[com.pulumi.azure.storage.inputs.AccountImmutabilityPolicyArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountImmutabilityPolicyArgs.builder
      builder.immutabilityPolicy(args(argsBuilder).build)

    /**
     * @param networkRules A `networkRules` block as documented below.
     * @return builder
     */
    def networkRules(args: Endofunction[com.pulumi.azure.storage.inputs.AccountNetworkRulesArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountNetworkRulesArgs.builder
      builder.networkRules(args(argsBuilder).build)

    /**
     * @param queueProperties A `queueProperties` block as defined below.
     * 
     *  &gt; **Note:** `queueProperties` can only be configured when `accountTier` is set to `Standard` and `accountKind` is set to either `Storage` or `StorageV2`.
     * @return builder
     * @deprecated this block has been deprecated and superseded by the `azure.storage.AccountQueueProperties` resource and will be removed in v5.0 of the AzureRM provider
     */
    @deprecated def queueProperties(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesArgs.builder
      builder.queueProperties(args(argsBuilder).build)

    /**
     * @param routing A `routing` block as defined below.
     * @return builder
     */
    def routing(args: Endofunction[com.pulumi.azure.storage.inputs.AccountRoutingArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountRoutingArgs.builder
      builder.routing(args(argsBuilder).build)

    /**
     * @param sasPolicy A `sasPolicy` block as defined below.
     * @return builder
     */
    def sasPolicy(args: Endofunction[com.pulumi.azure.storage.inputs.AccountSasPolicyArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountSasPolicyArgs.builder
      builder.sasPolicy(args(argsBuilder).build)

    /**
     * @param shareProperties A `shareProperties` block as defined below.
     * 
     *  &gt; **Note:** `shareProperties` can only be configured when either `accountTier` is `Standard` and `accountKind` is either `Storage` or `StorageV2` - or when `accountTier` is `Premium` and `accountKind` is `FileStorage`.
     * @return builder
     */
    def shareProperties(args: Endofunction[com.pulumi.azure.storage.inputs.AccountSharePropertiesArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountSharePropertiesArgs.builder
      builder.shareProperties(args(argsBuilder).build)

    /**
     * @param staticWebsite A `staticWebsite` block as defined below.
     * 
     *  &gt; **Note:** `staticWebsite` can only be set when the `accountKind` is set to `StorageV2` or `BlockBlobStorage`.
     * 
     *  &gt; **Note:** If `staticWebsite` is specified, the service will automatically create a `azure.storage.Container` named `$web`.
     * @return builder
     * @deprecated this block has been deprecated and superseded by the `azure.storage.AccountStaticWebsite` resource and will be removed in v5.0 of the AzureRM provider
     */
    @deprecated def staticWebsite(args: Endofunction[com.pulumi.azure.storage.inputs.AccountStaticWebsiteArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountStaticWebsiteArgs.builder
      builder.staticWebsite(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.storage.inputs.ManagementPolicyRuleFiltersArgs.Builder)
    /**
     * @param matchBlobIndexTags A `matchBlobIndexTag` block as defined below. The block defines the blob index tag based filtering for blob objects.
     * 
     *  &gt; **Note:** The `matchBlobIndexTag` property requires enabling the `blobIndex` feature with [PSH or CLI commands](https://azure.microsoft.com/en-us/blog/manage-and-find-data-with-blob-index-for-azure-storage-now-in-preview/).
     * @return builder
     */
    def matchBlobIndexTags(args: Endofunction[com.pulumi.azure.storage.inputs.ManagementPolicyRuleFiltersMatchBlobIndexTagArgs.Builder]*):
        com.pulumi.azure.storage.inputs.ManagementPolicyRuleFiltersArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.ManagementPolicyRuleFiltersMatchBlobIndexTagArgs.builder
      builder.matchBlobIndexTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.BlobInventoryPolicyRuleArgs.Builder)
    /**
     * @param filter A `filter` block as defined above.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.azure.storage.inputs.BlobInventoryPolicyRuleFilterArgs.Builder]):
        com.pulumi.azure.storage.inputs.BlobInventoryPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.BlobInventoryPolicyRuleFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.TableAclArgs.Builder)
    /**
     * @param accessPolicies An `accessPolicy` block as defined below.
     * @return builder
     */
    def accessPolicies(args: Endofunction[com.pulumi.azure.storage.inputs.TableAclAccessPolicyArgs.Builder]*):
        com.pulumi.azure.storage.inputs.TableAclArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.TableAclAccessPolicyArgs.builder
      builder.accessPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.ShareAclArgs.Builder)
    /**
     * @param accessPolicies An `accessPolicy` block as defined below.
     * @return builder
     */
    def accessPolicies(args: Endofunction[com.pulumi.azure.storage.inputs.ShareAclAccessPolicyArgs.Builder]*):
        com.pulumi.azure.storage.inputs.ShareAclArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.ShareAclAccessPolicyArgs.builder
      builder.accessPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.AccountBlobPropertiesArgs.Builder)
    /**
     * @param containerDeleteRetentionPolicy A `containerDeleteRetentionPolicy` block as defined below.
     * @return builder
     */
    def containerDeleteRetentionPolicy(args: Endofunction[com.pulumi.azure.storage.inputs.AccountBlobPropertiesContainerDeleteRetentionPolicyArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountBlobPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountBlobPropertiesContainerDeleteRetentionPolicyArgs.builder
      builder.containerDeleteRetentionPolicy(args(argsBuilder).build)

    /**
     * @param corsRules A `corsRule` block as defined below.
     * @return builder
     */
    def corsRules(args: Endofunction[com.pulumi.azure.storage.inputs.AccountBlobPropertiesCorsRuleArgs.Builder]*):
        com.pulumi.azure.storage.inputs.AccountBlobPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.AccountBlobPropertiesCorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

    /**
     * @param deleteRetentionPolicy A `deleteRetentionPolicy` block as defined below.
     * @return builder
     */
    def deleteRetentionPolicy(args: Endofunction[com.pulumi.azure.storage.inputs.AccountBlobPropertiesDeleteRetentionPolicyArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountBlobPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountBlobPropertiesDeleteRetentionPolicyArgs.builder
      builder.deleteRetentionPolicy(args(argsBuilder).build)

    /**
     * @param restorePolicy A `restorePolicy` block as defined below. This must be used together with `deleteRetentionPolicy` set, `versioningEnabled` and `changeFeedEnabled` set to `true`.
     * 
     *  &gt; **Note:** This field cannot be configured when `kind` is set to `Storage` (V1).
     * 
     *  &gt; **Note:** `restorePolicy` can not be configured when `dnsEndpointType` is `AzureDnsZone`.
     * @return builder
     */
    def restorePolicy(args: Endofunction[com.pulumi.azure.storage.inputs.AccountBlobPropertiesRestorePolicyArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountBlobPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountBlobPropertiesRestorePolicyArgs.builder
      builder.restorePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.AccountSharePropertiesArgs.Builder)
    /**
     * @param corsRules A `corsRule` block as defined below.
     * @return builder
     */
    def corsRules(args: Endofunction[com.pulumi.azure.storage.inputs.AccountSharePropertiesCorsRuleArgs.Builder]*):
        com.pulumi.azure.storage.inputs.AccountSharePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.AccountSharePropertiesCorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

    /**
     * @param retentionPolicy A `retentionPolicy` block as defined below.
     * @return builder
     */
    def retentionPolicy(args: Endofunction[com.pulumi.azure.storage.inputs.AccountSharePropertiesRetentionPolicyArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountSharePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountSharePropertiesRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

    /**
     * @param smb A `smb` block as defined below.
     * @return builder
     */
    def smb(args: Endofunction[com.pulumi.azure.storage.inputs.AccountSharePropertiesSmbArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountSharePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountSharePropertiesSmbArgs.builder
      builder.smb(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.AccountNetworkRulesArgs.Builder)
    /**
     * @param privateLinkAccesses One or more `privateLinkAccess` block as defined below.
     * 
     *  &gt; **Note:** If specifying `networkRules`, one of either `ipRules` or `virtualNetworkSubnetIds` must be specified and `defaultAction` must be set to `Deny`.
     * 
     *  &gt; **Note:** Network Rules can be defined either directly on the `azure.storage.Account` resource, or using the `azure.storage.AccountNetworkRules` resource - but the two cannot be used together. If both are used against the same Storage Account, spurious changes will occur. When managing Network Rules using this resource, to change from a `defaultAction` of `Deny` to `Allow` requires defining, rather than removing, the block.
     * 
     *  &gt; **Note:** The prefix of `ipRules` must be between 0 and 30 and only supports public IP addresses.
     * @return builder
     */
    def privateLinkAccesses(args: Endofunction[com.pulumi.azure.storage.inputs.AccountNetworkRulesPrivateLinkAccessArgs.Builder]*):
        com.pulumi.azure.storage.inputs.AccountNetworkRulesArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.AccountNetworkRulesPrivateLinkAccessArgs.builder
      builder.privateLinkAccesses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.ObjectReplicationState.Builder)
    /**
     * @param rules One or more `rules` blocks as defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.storage.inputs.ObjectReplicationRuleArgs.Builder]*):
        com.pulumi.azure.storage.inputs.ObjectReplicationState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.ObjectReplicationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.DataLakeGen2FilesystemState.Builder)
    /**
     * @param aces One or more `ace` blocks as defined below to specify the entries for the ACL for the path.
     * @return builder
     */
    def aces(args: Endofunction[com.pulumi.azure.storage.inputs.DataLakeGen2FilesystemAceArgs.Builder]*):
        com.pulumi.azure.storage.inputs.DataLakeGen2FilesystemState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.DataLakeGen2FilesystemAceArgs.builder
      builder.aces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.ShareState.Builder)
    /**
     * @param acls One or more `acl` blocks as defined below.
     * @return builder
     */
    def acls(args: Endofunction[com.pulumi.azure.storage.inputs.ShareAclArgs.Builder]*):
        com.pulumi.azure.storage.inputs.ShareState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.ShareAclArgs.builder
      builder.acls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.AccountQueuePropertiesState.Builder)
    /**
     * @param corsRules A `corsRule` block as defined above.
     * @return builder
     */
    def corsRules(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesCorsRuleArgs.Builder]*):
        com.pulumi.azure.storage.inputs.AccountQueuePropertiesState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesCorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

    /**
     * @param hourMetrics A `hourMetrics` block as defined below.
     * 
     *  &gt; **Note:** At least one of `corsRule`, `logging`, `minuteMetrics`, or `hourMetrics` must be specified.
     * @return builder
     */
    def hourMetrics(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesHourMetricsArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountQueuePropertiesState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesHourMetricsArgs.builder
      builder.hourMetrics(args(argsBuilder).build)

    /**
     * @param logging A `logging` block as defined below.
     * @return builder
     */
    def logging(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesLoggingArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountQueuePropertiesState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param minuteMetrics A `minuteMetrics` block as defined below.
     * @return builder
     */
    def minuteMetrics(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesMinuteMetricsArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountQueuePropertiesState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesMinuteMetricsArgs.builder
      builder.minuteMetrics(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.ManagementPolicyState.Builder)
    /**
     * @param rules A `rule` block as documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.storage.inputs.ManagementPolicyRuleArgs.Builder]*):
        com.pulumi.azure.storage.inputs.ManagementPolicyState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.ManagementPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.AccountNetworkRulesState.Builder)
    /**
     * @param privateLinkAccessRules One or more `privateLinkAccess` block as defined below.
     * @return builder
     */
    def privateLinkAccessRules(args: Endofunction[com.pulumi.azure.storage.inputs.AccountNetworkRulesPrivateLinkAccessRuleArgs.Builder]*):
        com.pulumi.azure.storage.inputs.AccountNetworkRulesState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.AccountNetworkRulesPrivateLinkAccessRuleArgs.builder
      builder.privateLinkAccessRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.ManagementPolicyRuleArgs.Builder)
    /**
     * @param actions An `actions` block as documented below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsArgs.Builder]):
        com.pulumi.azure.storage.inputs.ManagementPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsArgs.builder
      builder.actions(args(argsBuilder).build)

    /**
     * @param filters A `filters` block as documented below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.azure.storage.inputs.ManagementPolicyRuleFiltersArgs.Builder]):
        com.pulumi.azure.storage.inputs.ManagementPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.ManagementPolicyRuleFiltersArgs.builder
      builder.filters(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.GetShareArgs.Builder)
    /**
     * @param acls One or more acl blocks as defined below.
     * @return builder
     */
    def acls(args: Endofunction[com.pulumi.azure.storage.inputs.GetShareAclArgs.Builder]*):
        com.pulumi.azure.storage.inputs.GetShareArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.GetShareAclArgs.builder
      builder.acls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.AccountQueuePropertiesArgs.Builder)
    /**
     * @param corsRules A `corsRule` block as defined above.
     * @return builder
     */
    def corsRules(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesCorsRuleArgs.Builder]*):
        com.pulumi.azure.storage.inputs.AccountQueuePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesCorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

    /**
     * @param hourMetrics A `hourMetrics` block as defined below.
     * @return builder
     */
    def hourMetrics(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesHourMetricsArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountQueuePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesHourMetricsArgs.builder
      builder.hourMetrics(args(argsBuilder).build)

    /**
     * @param logging A `logging` block as defined below.
     * @return builder
     */
    def logging(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesLoggingArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountQueuePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param minuteMetrics A `minuteMetrics` block as defined below.
     * @return builder
     */
    def minuteMetrics(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesMinuteMetricsArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountQueuePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesMinuteMetricsArgs.builder
      builder.minuteMetrics(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.LocalUserState.Builder)
    /**
     * @param permissionScopes One or more `permissionScope` blocks as defined below.
     * @return builder
     */
    def permissionScopes(args: Endofunction[com.pulumi.azure.storage.inputs.LocalUserPermissionScopeArgs.Builder]*):
        com.pulumi.azure.storage.inputs.LocalUserState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.LocalUserPermissionScopeArgs.builder
      builder.permissionScopes(args.map(_(argsBuilder).build)*)

    /**
     * @param sshAuthorizedKeys One or more `sshAuthorizedKey` blocks as defined below.
     * @return builder
     */
    def sshAuthorizedKeys(args: Endofunction[com.pulumi.azure.storage.inputs.LocalUserSshAuthorizedKeyArgs.Builder]*):
        com.pulumi.azure.storage.inputs.LocalUserState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.LocalUserSshAuthorizedKeyArgs.builder
      builder.sshAuthorizedKeys(args.map(_(argsBuilder).build)*)
