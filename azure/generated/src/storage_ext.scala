package jp.ukiba.ko_pulumi
package azure

object storage_ext:
  extension (builder: com.pulumi.azure.storage.AccountArgs.Builder)
    /**
     * @param azureFilesAuthentication A `azureFilesAuthentication` block as defined below.
     * @return builder
     */
    inline def azureFilesAuthentication(args: Endofunction[com.pulumi.azure.storage.inputs.AccountAzureFilesAuthenticationArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountAzureFilesAuthenticationArgs.builder
      builder.azureFilesAuthentication(args(argsBuilder).build)

    /**
     * @param blobProperties A `blobProperties` block as defined below.
     * @return builder
     */
    inline def blobProperties(args: Endofunction[com.pulumi.azure.storage.inputs.AccountBlobPropertiesArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountBlobPropertiesArgs.builder
      builder.blobProperties(args(argsBuilder).build)

    /**
     * @param customDomain A `customDomain` block as documented below.
     * @return builder
     */
    inline def customDomain(args: Endofunction[com.pulumi.azure.storage.inputs.AccountCustomDomainArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountCustomDomainArgs.builder
      builder.customDomain(args(argsBuilder).build)

    /**
     * @param customerManagedKey A `customerManagedKey` block as documented below.
     * 
     * &gt; **Note:** It&#39;s possible to define a Customer Managed Key both within either the `customerManagedKey` block or by using the `azure.storage.CustomerManagedKey` resource. However, it&#39;s not possible to use both methods to manage a Customer Managed Key for a Storage Account, since these will conflict. When using the `azure.storage.CustomerManagedKey` resource, you will need to use `ignoreChanges` on the `customerManagedKey` block.
     * @return builder
     */
    inline def customerManagedKey(args: Endofunction[com.pulumi.azure.storage.inputs.AccountCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.storage.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param immutabilityPolicy An `immutabilityPolicy` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def immutabilityPolicy(args: Endofunction[com.pulumi.azure.storage.inputs.AccountImmutabilityPolicyArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountImmutabilityPolicyArgs.builder
      builder.immutabilityPolicy(args(argsBuilder).build)

    /**
     * @param networkRules A `networkRules` block as documented below.
     * @return builder
     */
    inline def networkRules(args: Endofunction[com.pulumi.azure.storage.inputs.AccountNetworkRulesArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountNetworkRulesArgs.builder
      builder.networkRules(args(argsBuilder).build)

    /**
     * @param queueProperties A `queueProperties` block as defined below.
     * 
     * &gt; **Note:** `queueProperties` can only be configured when `accountTier` is set to `Standard` and `accountKind` is set to either `Storage` or `StorageV2`.
     * @return builder
     * @deprecated this block has been deprecated and superseded by the `azure.storage.AccountQueueProperties` resource and will be removed in v5.0 of the AzureRM provider
     */
    @deprecated("this block has been deprecated and superseded by the `azure.storage.AccountQueueProperties` resource and will be removed in v5.0 of the AzureRM provider") inline def queueProperties(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesArgs.builder
      builder.queueProperties(args(argsBuilder).build)

    /**
     * @param routing A `routing` block as defined below.
     * @return builder
     */
    inline def routing(args: Endofunction[com.pulumi.azure.storage.inputs.AccountRoutingArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountRoutingArgs.builder
      builder.routing(args(argsBuilder).build)

    /**
     * @param sasPolicy A `sasPolicy` block as defined below.
     * @return builder
     */
    inline def sasPolicy(args: Endofunction[com.pulumi.azure.storage.inputs.AccountSasPolicyArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountSasPolicyArgs.builder
      builder.sasPolicy(args(argsBuilder).build)

    /**
     * @param shareProperties A `shareProperties` block as defined below.
     * 
     * &gt; **Note:** `shareProperties` can only be configured when either `accountTier` is `Standard` and `accountKind` is either `Storage` or `StorageV2` - or when `accountTier` is `Premium` and `accountKind` is `FileStorage`.
     * @return builder
     */
    inline def shareProperties(args: Endofunction[com.pulumi.azure.storage.inputs.AccountSharePropertiesArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountSharePropertiesArgs.builder
      builder.shareProperties(args(argsBuilder).build)

    /**
     * @param staticWebsite A `staticWebsite` block as defined below.
     * 
     * &gt; **Note:** `staticWebsite` can only be set when the `accountKind` is set to `StorageV2` or `BlockBlobStorage`.
     * 
     * &gt; **Note:** If `staticWebsite` is specified, the service will automatically create a `azure.storage.Container` named `\$web`.
     * @return builder
     * @deprecated this block has been deprecated and superseded by the `azure.storage.AccountStaticWebsite` resource and will be removed in v5.0 of the AzureRM provider
     */
    @deprecated("this block has been deprecated and superseded by the `azure.storage.AccountStaticWebsite` resource and will be removed in v5.0 of the AzureRM provider") inline def staticWebsite(args: Endofunction[com.pulumi.azure.storage.inputs.AccountStaticWebsiteArgs.Builder]):
        com.pulumi.azure.storage.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountStaticWebsiteArgs.builder
      builder.staticWebsite(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.AccountNetworkRulesArgs.Builder)
    /**
     * @param privateLinkAccessRules One or more `privateLinkAccess` block as defined below.
     * @return builder
     */
    inline def privateLinkAccessRules(args: Endofunction[com.pulumi.azure.storage.inputs.AccountNetworkRulesPrivateLinkAccessRuleArgs.Builder]*):
        com.pulumi.azure.storage.AccountNetworkRulesArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.AccountNetworkRulesPrivateLinkAccessRuleArgs.builder
      builder.privateLinkAccessRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.AccountQueuePropertiesArgs.Builder)
    /**
     * @param corsRules A `corsRule` block as defined above.
     * @return builder
     */
    inline def corsRules(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesCorsRuleArgs.Builder]*):
        com.pulumi.azure.storage.AccountQueuePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesCorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

    /**
     * @param hourMetrics A `hourMetrics` block as defined below.
     * 
     * &gt; **Note:** At least one of `corsRule`, `logging`, `minuteMetrics`, or `hourMetrics` must be specified.
     * @return builder
     */
    inline def hourMetrics(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesHourMetricsArgs.Builder]):
        com.pulumi.azure.storage.AccountQueuePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesHourMetricsArgs.builder
      builder.hourMetrics(args(argsBuilder).build)

    /**
     * @param logging A `logging` block as defined below.
     * @return builder
     */
    inline def logging(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesLoggingArgs.Builder]):
        com.pulumi.azure.storage.AccountQueuePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param minuteMetrics A `minuteMetrics` block as defined below.
     * @return builder
     */
    inline def minuteMetrics(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesMinuteMetricsArgs.Builder]):
        com.pulumi.azure.storage.AccountQueuePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesMinuteMetricsArgs.builder
      builder.minuteMetrics(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.AccountTablePropertiesArgs.Builder)
    /**
     * @param corsRules A `corsRule` block as defined below.
     * @return builder
     */
    inline def corsRules(args: Endofunction[com.pulumi.azure.storage.inputs.AccountTablePropertiesCorsRuleArgs.Builder]*):
        com.pulumi.azure.storage.AccountTablePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.AccountTablePropertiesCorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

    /**
     * @param hourMetrics A `hourMetrics` block as defined below.
     * 
     * &gt; **Note:** At least one of `corsRule`, `logging`, `minuteMetrics`, or `hourMetrics` must be specified.
     * @return builder
     */
    inline def hourMetrics(args: Endofunction[com.pulumi.azure.storage.inputs.AccountTablePropertiesHourMetricsArgs.Builder]):
        com.pulumi.azure.storage.AccountTablePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountTablePropertiesHourMetricsArgs.builder
      builder.hourMetrics(args(argsBuilder).build)

    /**
     * @param logging A `logging` block as defined below.
     * @return builder
     */
    inline def logging(args: Endofunction[com.pulumi.azure.storage.inputs.AccountTablePropertiesLoggingArgs.Builder]):
        com.pulumi.azure.storage.AccountTablePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountTablePropertiesLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param minuteMetrics A `minuteMetrics` block as defined below.
     * @return builder
     */
    inline def minuteMetrics(args: Endofunction[com.pulumi.azure.storage.inputs.AccountTablePropertiesMinuteMetricsArgs.Builder]):
        com.pulumi.azure.storage.AccountTablePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountTablePropertiesMinuteMetricsArgs.builder
      builder.minuteMetrics(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.BlobInventoryPolicyArgs.Builder)
    /**
     * @param rules One or more `rules` blocks as defined below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.storage.inputs.BlobInventoryPolicyRuleArgs.Builder]*):
        com.pulumi.azure.storage.BlobInventoryPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.BlobInventoryPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.DataLakeGen2FilesystemArgs.Builder)
    /**
     * @param aces One or more `ace` blocks as defined below to specify the entries for the ACL for the path.
     * @return builder
     */
    inline def aces(args: Endofunction[com.pulumi.azure.storage.inputs.DataLakeGen2FilesystemAceArgs.Builder]*):
        com.pulumi.azure.storage.DataLakeGen2FilesystemArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.DataLakeGen2FilesystemAceArgs.builder
      builder.aces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.DataLakeGen2PathArgs.Builder)
    /**
     * @param aces One or more `ace` blocks as defined below to specify the entries for the ACL for the path.
     * @return builder
     */
    inline def aces(args: Endofunction[com.pulumi.azure.storage.inputs.DataLakeGen2PathAceArgs.Builder]*):
        com.pulumi.azure.storage.DataLakeGen2PathArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.DataLakeGen2PathAceArgs.builder
      builder.aces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.LocalUserArgs.Builder)
    /**
     * @param permissionScopes One or more `permissionScope` blocks as defined below.
     * @return builder
     */
    inline def permissionScopes(args: Endofunction[com.pulumi.azure.storage.inputs.LocalUserPermissionScopeArgs.Builder]*):
        com.pulumi.azure.storage.LocalUserArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.LocalUserPermissionScopeArgs.builder
      builder.permissionScopes(args.map(_(argsBuilder).build)*)

    /**
     * @param sshAuthorizedKeys One or more `sshAuthorizedKey` blocks as defined below.
     * @return builder
     */
    inline def sshAuthorizedKeys(args: Endofunction[com.pulumi.azure.storage.inputs.LocalUserSshAuthorizedKeyArgs.Builder]*):
        com.pulumi.azure.storage.LocalUserArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.LocalUserSshAuthorizedKeyArgs.builder
      builder.sshAuthorizedKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.ManagementPolicyArgs.Builder)
    /**
     * @param rules A `rule` block as documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.storage.inputs.ManagementPolicyRuleArgs.Builder]*):
        com.pulumi.azure.storage.ManagementPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.ManagementPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.ObjectReplicationArgs.Builder)
    /**
     * @param rules One or more `rules` blocks as defined below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.storage.inputs.ObjectReplicationRuleArgs.Builder]*):
        com.pulumi.azure.storage.ObjectReplicationArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.ObjectReplicationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.ShareArgs.Builder)
    /**
     * @param acls One or more `acl` blocks as defined below.
     * @return builder
     */
    inline def acls(args: Endofunction[com.pulumi.azure.storage.inputs.ShareAclArgs.Builder]*):
        com.pulumi.azure.storage.ShareArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.ShareAclArgs.builder
      builder.acls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.TableArgs.Builder)
    /**
     * @param acls One or more `acl` blocks as defined below.
     * @return builder
     */
    inline def acls(args: Endofunction[com.pulumi.azure.storage.inputs.TableAclArgs.Builder]*):
        com.pulumi.azure.storage.TableArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.TableAclArgs.builder
      builder.acls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.AccountAzureFilesAuthenticationArgs.Builder)
    /**
     * @param activeDirectory A `activeDirectory` block as defined below. Required when `directoryType` is `AD`.
     * @return builder
     */
    inline def activeDirectory(args: Endofunction[com.pulumi.azure.storage.inputs.AccountAzureFilesAuthenticationActiveDirectoryArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountAzureFilesAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountAzureFilesAuthenticationActiveDirectoryArgs.builder
      builder.activeDirectory(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.AccountBlobPropertiesArgs.Builder)
    /**
     * @param containerDeleteRetentionPolicy A `containerDeleteRetentionPolicy` block as defined below.
     * @return builder
     */
    inline def containerDeleteRetentionPolicy(args: Endofunction[com.pulumi.azure.storage.inputs.AccountBlobPropertiesContainerDeleteRetentionPolicyArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountBlobPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountBlobPropertiesContainerDeleteRetentionPolicyArgs.builder
      builder.containerDeleteRetentionPolicy(args(argsBuilder).build)

    /**
     * @param corsRules A `corsRule` block as defined below.
     * @return builder
     */
    inline def corsRules(args: Endofunction[com.pulumi.azure.storage.inputs.AccountBlobPropertiesCorsRuleArgs.Builder]*):
        com.pulumi.azure.storage.inputs.AccountBlobPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.AccountBlobPropertiesCorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

    /**
     * @param deleteRetentionPolicy A `deleteRetentionPolicy` block as defined below.
     * @return builder
     */
    inline def deleteRetentionPolicy(args: Endofunction[com.pulumi.azure.storage.inputs.AccountBlobPropertiesDeleteRetentionPolicyArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountBlobPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountBlobPropertiesDeleteRetentionPolicyArgs.builder
      builder.deleteRetentionPolicy(args(argsBuilder).build)

    /**
     * @param restorePolicy A `restorePolicy` block as defined below. This must be used together with `deleteRetentionPolicy` set, `versioningEnabled` and `changeFeedEnabled` set to `true`.
     * 
     * &gt; **Note:** This field cannot be configured when `kind` is set to `Storage` (V1).
     * 
     * &gt; **Note:** `restorePolicy` can not be configured when `dnsEndpointType` is `AzureDnsZone`.
     * @return builder
     */
    inline def restorePolicy(args: Endofunction[com.pulumi.azure.storage.inputs.AccountBlobPropertiesRestorePolicyArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountBlobPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountBlobPropertiesRestorePolicyArgs.builder
      builder.restorePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.AccountNetworkRulesArgs.Builder)
    /**
     * @param privateLinkAccesses One or more `privateLinkAccess` block as defined below.
     * 
     * &gt; **Note:** If specifying `networkRules`, one of either `ipRules` or `virtualNetworkSubnetIds` must be specified and `defaultAction` must be set to `Deny`.
     * 
     * &gt; **Note:** Network Rules can be defined either directly on the `azure.storage.Account` resource, or using the `azure.storage.AccountNetworkRules` resource - but the two cannot be used together. If both are used against the same Storage Account, spurious changes will occur. When managing Network Rules using this resource, to change from a `defaultAction` of `Deny` to `Allow` requires defining, rather than removing, the block.
     * 
     * &gt; **Note:** The prefix of `ipRules` must be between 0 and 30 and only supports public IP addresses.
     * @return builder
     */
    inline def privateLinkAccesses(args: Endofunction[com.pulumi.azure.storage.inputs.AccountNetworkRulesPrivateLinkAccessArgs.Builder]*):
        com.pulumi.azure.storage.inputs.AccountNetworkRulesArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.AccountNetworkRulesPrivateLinkAccessArgs.builder
      builder.privateLinkAccesses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.AccountNetworkRulesState.Builder)
    /**
     * @param privateLinkAccessRules One or more `privateLinkAccess` block as defined below.
     * @return builder
     */
    inline def privateLinkAccessRules(args: Endofunction[com.pulumi.azure.storage.inputs.AccountNetworkRulesPrivateLinkAccessRuleArgs.Builder]*):
        com.pulumi.azure.storage.inputs.AccountNetworkRulesState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.AccountNetworkRulesPrivateLinkAccessRuleArgs.builder
      builder.privateLinkAccessRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.AccountQueuePropertiesArgs.Builder)
    /**
     * @param corsRules A `corsRule` block as defined above.
     * @return builder
     */
    inline def corsRules(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesCorsRuleArgs.Builder]*):
        com.pulumi.azure.storage.inputs.AccountQueuePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesCorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

    /**
     * @param hourMetrics A `hourMetrics` block as defined below.
     * @return builder
     */
    inline def hourMetrics(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesHourMetricsArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountQueuePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesHourMetricsArgs.builder
      builder.hourMetrics(args(argsBuilder).build)

    /**
     * @param logging A `logging` block as defined below.
     * @return builder
     */
    inline def logging(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesLoggingArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountQueuePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param minuteMetrics A `minuteMetrics` block as defined below.
     * @return builder
     */
    inline def minuteMetrics(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesMinuteMetricsArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountQueuePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesMinuteMetricsArgs.builder
      builder.minuteMetrics(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.AccountQueuePropertiesState.Builder)
    /**
     * @param corsRules A `corsRule` block as defined above.
     * @return builder
     */
    inline def corsRules(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesCorsRuleArgs.Builder]*):
        com.pulumi.azure.storage.inputs.AccountQueuePropertiesState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesCorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

    /**
     * @param hourMetrics A `hourMetrics` block as defined below.
     * 
     * &gt; **Note:** At least one of `corsRule`, `logging`, `minuteMetrics`, or `hourMetrics` must be specified.
     * @return builder
     */
    inline def hourMetrics(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesHourMetricsArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountQueuePropertiesState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesHourMetricsArgs.builder
      builder.hourMetrics(args(argsBuilder).build)

    /**
     * @param logging A `logging` block as defined below.
     * @return builder
     */
    inline def logging(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesLoggingArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountQueuePropertiesState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param minuteMetrics A `minuteMetrics` block as defined below.
     * @return builder
     */
    inline def minuteMetrics(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesMinuteMetricsArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountQueuePropertiesState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesMinuteMetricsArgs.builder
      builder.minuteMetrics(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.AccountSharePropertiesArgs.Builder)
    /**
     * @param corsRules A `corsRule` block as defined below.
     * @return builder
     */
    inline def corsRules(args: Endofunction[com.pulumi.azure.storage.inputs.AccountSharePropertiesCorsRuleArgs.Builder]*):
        com.pulumi.azure.storage.inputs.AccountSharePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.AccountSharePropertiesCorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

    /**
     * @param retentionPolicy A `retentionPolicy` block as defined below.
     * @return builder
     */
    inline def retentionPolicy(args: Endofunction[com.pulumi.azure.storage.inputs.AccountSharePropertiesRetentionPolicyArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountSharePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountSharePropertiesRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

    /**
     * @param smb A `smb` block as defined below.
     * @return builder
     */
    inline def smb(args: Endofunction[com.pulumi.azure.storage.inputs.AccountSharePropertiesSmbArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountSharePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountSharePropertiesSmbArgs.builder
      builder.smb(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.AccountState.Builder)
    /**
     * @param azureFilesAuthentication A `azureFilesAuthentication` block as defined below.
     * @return builder
     */
    inline def azureFilesAuthentication(args: Endofunction[com.pulumi.azure.storage.inputs.AccountAzureFilesAuthenticationArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountAzureFilesAuthenticationArgs.builder
      builder.azureFilesAuthentication(args(argsBuilder).build)

    /**
     * @param blobProperties A `blobProperties` block as defined below.
     * @return builder
     */
    inline def blobProperties(args: Endofunction[com.pulumi.azure.storage.inputs.AccountBlobPropertiesArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountBlobPropertiesArgs.builder
      builder.blobProperties(args(argsBuilder).build)

    /**
     * @param customDomain A `customDomain` block as documented below.
     * @return builder
     */
    inline def customDomain(args: Endofunction[com.pulumi.azure.storage.inputs.AccountCustomDomainArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountCustomDomainArgs.builder
      builder.customDomain(args(argsBuilder).build)

    /**
     * @param customerManagedKey A `customerManagedKey` block as documented below.
     * 
     * &gt; **Note:** It&#39;s possible to define a Customer Managed Key both within either the `customerManagedKey` block or by using the `azure.storage.CustomerManagedKey` resource. However, it&#39;s not possible to use both methods to manage a Customer Managed Key for a Storage Account, since these will conflict. When using the `azure.storage.CustomerManagedKey` resource, you will need to use `ignoreChanges` on the `customerManagedKey` block.
     * @return builder
     */
    inline def customerManagedKey(args: Endofunction[com.pulumi.azure.storage.inputs.AccountCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.storage.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param immutabilityPolicy An `immutabilityPolicy` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def immutabilityPolicy(args: Endofunction[com.pulumi.azure.storage.inputs.AccountImmutabilityPolicyArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountImmutabilityPolicyArgs.builder
      builder.immutabilityPolicy(args(argsBuilder).build)

    /**
     * @param networkRules A `networkRules` block as documented below.
     * @return builder
     */
    inline def networkRules(args: Endofunction[com.pulumi.azure.storage.inputs.AccountNetworkRulesArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountNetworkRulesArgs.builder
      builder.networkRules(args(argsBuilder).build)

    /**
     * @param queueProperties A `queueProperties` block as defined below.
     * 
     * &gt; **Note:** `queueProperties` can only be configured when `accountTier` is set to `Standard` and `accountKind` is set to either `Storage` or `StorageV2`.
     * @return builder
     * @deprecated this block has been deprecated and superseded by the `azure.storage.AccountQueueProperties` resource and will be removed in v5.0 of the AzureRM provider
     */
    @deprecated("this block has been deprecated and superseded by the `azure.storage.AccountQueueProperties` resource and will be removed in v5.0 of the AzureRM provider") inline def queueProperties(args: Endofunction[com.pulumi.azure.storage.inputs.AccountQueuePropertiesArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountQueuePropertiesArgs.builder
      builder.queueProperties(args(argsBuilder).build)

    /**
     * @param routing A `routing` block as defined below.
     * @return builder
     */
    inline def routing(args: Endofunction[com.pulumi.azure.storage.inputs.AccountRoutingArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountRoutingArgs.builder
      builder.routing(args(argsBuilder).build)

    /**
     * @param sasPolicy A `sasPolicy` block as defined below.
     * @return builder
     */
    inline def sasPolicy(args: Endofunction[com.pulumi.azure.storage.inputs.AccountSasPolicyArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountSasPolicyArgs.builder
      builder.sasPolicy(args(argsBuilder).build)

    /**
     * @param shareProperties A `shareProperties` block as defined below.
     * 
     * &gt; **Note:** `shareProperties` can only be configured when either `accountTier` is `Standard` and `accountKind` is either `Storage` or `StorageV2` - or when `accountTier` is `Premium` and `accountKind` is `FileStorage`.
     * @return builder
     */
    inline def shareProperties(args: Endofunction[com.pulumi.azure.storage.inputs.AccountSharePropertiesArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountSharePropertiesArgs.builder
      builder.shareProperties(args(argsBuilder).build)

    /**
     * @param staticWebsite A `staticWebsite` block as defined below.
     * 
     * &gt; **Note:** `staticWebsite` can only be set when the `accountKind` is set to `StorageV2` or `BlockBlobStorage`.
     * 
     * &gt; **Note:** If `staticWebsite` is specified, the service will automatically create a `azure.storage.Container` named `\$web`.
     * @return builder
     * @deprecated this block has been deprecated and superseded by the `azure.storage.AccountStaticWebsite` resource and will be removed in v5.0 of the AzureRM provider
     */
    @deprecated("this block has been deprecated and superseded by the `azure.storage.AccountStaticWebsite` resource and will be removed in v5.0 of the AzureRM provider") inline def staticWebsite(args: Endofunction[com.pulumi.azure.storage.inputs.AccountStaticWebsiteArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountStaticWebsiteArgs.builder
      builder.staticWebsite(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.AccountTablePropertiesState.Builder)
    /**
     * @param corsRules A `corsRule` block as defined below.
     * @return builder
     */
    inline def corsRules(args: Endofunction[com.pulumi.azure.storage.inputs.AccountTablePropertiesCorsRuleArgs.Builder]*):
        com.pulumi.azure.storage.inputs.AccountTablePropertiesState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.AccountTablePropertiesCorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

    /**
     * @param hourMetrics A `hourMetrics` block as defined below.
     * 
     * &gt; **Note:** At least one of `corsRule`, `logging`, `minuteMetrics`, or `hourMetrics` must be specified.
     * @return builder
     */
    inline def hourMetrics(args: Endofunction[com.pulumi.azure.storage.inputs.AccountTablePropertiesHourMetricsArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountTablePropertiesState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountTablePropertiesHourMetricsArgs.builder
      builder.hourMetrics(args(argsBuilder).build)

    /**
     * @param logging A `logging` block as defined below.
     * @return builder
     */
    inline def logging(args: Endofunction[com.pulumi.azure.storage.inputs.AccountTablePropertiesLoggingArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountTablePropertiesState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountTablePropertiesLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param minuteMetrics A `minuteMetrics` block as defined below.
     * @return builder
     */
    inline def minuteMetrics(args: Endofunction[com.pulumi.azure.storage.inputs.AccountTablePropertiesMinuteMetricsArgs.Builder]):
        com.pulumi.azure.storage.inputs.AccountTablePropertiesState.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.AccountTablePropertiesMinuteMetricsArgs.builder
      builder.minuteMetrics(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.BlobInventoryPolicyRuleArgs.Builder)
    /**
     * @param filter A `filter` block as defined above.
     * @return builder
     */
    inline def filter(args: Endofunction[com.pulumi.azure.storage.inputs.BlobInventoryPolicyRuleFilterArgs.Builder]):
        com.pulumi.azure.storage.inputs.BlobInventoryPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.BlobInventoryPolicyRuleFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.BlobInventoryPolicyState.Builder)
    /**
     * @param rules One or more `rules` blocks as defined below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.storage.inputs.BlobInventoryPolicyRuleArgs.Builder]*):
        com.pulumi.azure.storage.inputs.BlobInventoryPolicyState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.BlobInventoryPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.DataLakeGen2FilesystemState.Builder)
    /**
     * @param aces One or more `ace` blocks as defined below to specify the entries for the ACL for the path.
     * @return builder
     */
    inline def aces(args: Endofunction[com.pulumi.azure.storage.inputs.DataLakeGen2FilesystemAceArgs.Builder]*):
        com.pulumi.azure.storage.inputs.DataLakeGen2FilesystemState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.DataLakeGen2FilesystemAceArgs.builder
      builder.aces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.DataLakeGen2PathState.Builder)
    /**
     * @param aces One or more `ace` blocks as defined below to specify the entries for the ACL for the path.
     * @return builder
     */
    inline def aces(args: Endofunction[com.pulumi.azure.storage.inputs.DataLakeGen2PathAceArgs.Builder]*):
        com.pulumi.azure.storage.inputs.DataLakeGen2PathState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.DataLakeGen2PathAceArgs.builder
      builder.aces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASArgs.Builder)
    /**
     * @param permissions Should Permissions permissions be enabled for this SAS?
     * @return builder
     */
    inline def permissions(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASPermissionsArgs.Builder]):
        com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASPermissionsArgs.builder
      builder.permissions(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASPlainArgs.Builder)
    /**
     * @param permissions Should Permissions permissions be enabled for this SAS?
     * @return builder
     */
    inline def permissions(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASPermissions.Builder]):
        com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASPlainArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASPermissions.builder
      builder.permissions(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.GetAccountSASArgs.Builder)
    /**
     * @param permissions A `permissions` block as defined below.
     * @return builder
     */
    inline def permissions(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountSASPermissionsArgs.Builder]):
        com.pulumi.azure.storage.inputs.GetAccountSASArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountSASPermissionsArgs.builder
      builder.permissions(args(argsBuilder).build)

    /**
     * @param resourceTypes A `resourceTypes` block as defined below.
     * @return builder
     */
    inline def resourceTypes(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountSASResourceTypesArgs.Builder]):
        com.pulumi.azure.storage.inputs.GetAccountSASArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountSASResourceTypesArgs.builder
      builder.resourceTypes(args(argsBuilder).build)

    /**
     * @param services A `services` block as defined below.
     * @return builder
     */
    inline def services(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountSASServicesArgs.Builder]):
        com.pulumi.azure.storage.inputs.GetAccountSASArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountSASServicesArgs.builder
      builder.services(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.GetAccountSASPlainArgs.Builder)
    /**
     * @param permissions A `permissions` block as defined below.
     * @return builder
     */
    inline def permissions(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountSASPermissions.Builder]):
        com.pulumi.azure.storage.inputs.GetAccountSASPlainArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountSASPermissions.builder
      builder.permissions(args(argsBuilder).build)

    /**
     * @param resourceTypes A `resourceTypes` block as defined below.
     * @return builder
     */
    inline def resourceTypes(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountSASResourceTypes.Builder]):
        com.pulumi.azure.storage.inputs.GetAccountSASPlainArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountSASResourceTypes.builder
      builder.resourceTypes(args(argsBuilder).build)

    /**
     * @param services A `services` block as defined below.
     * @return builder
     */
    inline def services(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountSASServices.Builder]):
        com.pulumi.azure.storage.inputs.GetAccountSASPlainArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountSASServices.builder
      builder.services(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.GetShareAcl.Builder)
    /**
     * @param accessPolicies An `accessPolicy` block as defined below.
     * @return builder
     */
    inline def accessPolicies(args: Endofunction[com.pulumi.azure.storage.inputs.GetShareAclAccessPolicy.Builder]*):
        com.pulumi.azure.storage.inputs.GetShareAcl.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.GetShareAclAccessPolicy.builder
      builder.accessPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.GetShareAclArgs.Builder)
    /**
     * @param accessPolicies An `accessPolicy` block as defined below.
     * @return builder
     */
    inline def accessPolicies(args: Endofunction[com.pulumi.azure.storage.inputs.GetShareAclAccessPolicyArgs.Builder]*):
        com.pulumi.azure.storage.inputs.GetShareAclArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.GetShareAclAccessPolicyArgs.builder
      builder.accessPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.GetShareArgs.Builder)
    /**
     * @param acls One or more acl blocks as defined below.
     * @return builder
     */
    inline def acls(args: Endofunction[com.pulumi.azure.storage.inputs.GetShareAclArgs.Builder]*):
        com.pulumi.azure.storage.inputs.GetShareArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.GetShareAclArgs.builder
      builder.acls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.GetSharePlainArgs.Builder)
    /**
     * @param acls One or more acl blocks as defined below.
     * @return builder
     */
    inline def acls(args: Endofunction[com.pulumi.azure.storage.inputs.GetShareAcl.Builder]*):
        com.pulumi.azure.storage.inputs.GetSharePlainArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.GetShareAcl.builder
      builder.acls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.LocalUserPermissionScopeArgs.Builder)
    /**
     * @param permissions A `permissions` block as defined below.
     * @return builder
     */
    inline def permissions(args: Endofunction[com.pulumi.azure.storage.inputs.LocalUserPermissionScopePermissionsArgs.Builder]):
        com.pulumi.azure.storage.inputs.LocalUserPermissionScopeArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.LocalUserPermissionScopePermissionsArgs.builder
      builder.permissions(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.LocalUserState.Builder)
    /**
     * @param permissionScopes One or more `permissionScope` blocks as defined below.
     * @return builder
     */
    inline def permissionScopes(args: Endofunction[com.pulumi.azure.storage.inputs.LocalUserPermissionScopeArgs.Builder]*):
        com.pulumi.azure.storage.inputs.LocalUserState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.LocalUserPermissionScopeArgs.builder
      builder.permissionScopes(args.map(_(argsBuilder).build)*)

    /**
     * @param sshAuthorizedKeys One or more `sshAuthorizedKey` blocks as defined below.
     * @return builder
     */
    inline def sshAuthorizedKeys(args: Endofunction[com.pulumi.azure.storage.inputs.LocalUserSshAuthorizedKeyArgs.Builder]*):
        com.pulumi.azure.storage.inputs.LocalUserState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.LocalUserSshAuthorizedKeyArgs.builder
      builder.sshAuthorizedKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsArgs.Builder)
    /**
     * @param baseBlob A `baseBlob` block as documented below.
     * @return builder
     */
    inline def baseBlob(args: Endofunction[com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsBaseBlobArgs.Builder]):
        com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsBaseBlobArgs.builder
      builder.baseBlob(args(argsBuilder).build)

    /**
     * @param snapshot A `snapshot` block as documented below.
     * @return builder
     */
    inline def snapshot(args: Endofunction[com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsSnapshotArgs.Builder]):
        com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsSnapshotArgs.builder
      builder.snapshot(args(argsBuilder).build)

    /**
     * @param version A `version` block as documented below.
     * @return builder
     */
    inline def version(args: Endofunction[com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsVersionArgs.Builder]):
        com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsVersionArgs.builder
      builder.version(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.ManagementPolicyRuleArgs.Builder)
    /**
     * @param actions An `actions` block as documented below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsArgs.Builder]):
        com.pulumi.azure.storage.inputs.ManagementPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsArgs.builder
      builder.actions(args(argsBuilder).build)

    /**
     * @param filters A `filters` block as documented below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.azure.storage.inputs.ManagementPolicyRuleFiltersArgs.Builder]):
        com.pulumi.azure.storage.inputs.ManagementPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.storage.inputs.ManagementPolicyRuleFiltersArgs.builder
      builder.filters(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.storage.inputs.ManagementPolicyRuleFiltersArgs.Builder)
    /**
     * @param matchBlobIndexTags A `matchBlobIndexTag` block as defined below. The block defines the blob index tag based filtering for blob objects.
     * 
     * &gt; **Note:** The `matchBlobIndexTag` property requires enabling the `blobIndex` feature with [PSH or CLI commands](https://azure.microsoft.com/en-us/blog/manage-and-find-data-with-blob-index-for-azure-storage-now-in-preview/).
     * @return builder
     */
    inline def matchBlobIndexTags(args: Endofunction[com.pulumi.azure.storage.inputs.ManagementPolicyRuleFiltersMatchBlobIndexTagArgs.Builder]*):
        com.pulumi.azure.storage.inputs.ManagementPolicyRuleFiltersArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.ManagementPolicyRuleFiltersMatchBlobIndexTagArgs.builder
      builder.matchBlobIndexTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.ManagementPolicyState.Builder)
    /**
     * @param rules A `rule` block as documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.storage.inputs.ManagementPolicyRuleArgs.Builder]*):
        com.pulumi.azure.storage.inputs.ManagementPolicyState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.ManagementPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.ObjectReplicationState.Builder)
    /**
     * @param rules One or more `rules` blocks as defined below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.storage.inputs.ObjectReplicationRuleArgs.Builder]*):
        com.pulumi.azure.storage.inputs.ObjectReplicationState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.ObjectReplicationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.ShareAclArgs.Builder)
    /**
     * @param accessPolicies An `accessPolicy` block as defined below.
     * @return builder
     */
    inline def accessPolicies(args: Endofunction[com.pulumi.azure.storage.inputs.ShareAclAccessPolicyArgs.Builder]*):
        com.pulumi.azure.storage.inputs.ShareAclArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.ShareAclAccessPolicyArgs.builder
      builder.accessPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.ShareState.Builder)
    /**
     * @param acls One or more `acl` blocks as defined below.
     * @return builder
     */
    inline def acls(args: Endofunction[com.pulumi.azure.storage.inputs.ShareAclArgs.Builder]*):
        com.pulumi.azure.storage.inputs.ShareState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.ShareAclArgs.builder
      builder.acls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.TableAclArgs.Builder)
    /**
     * @param accessPolicies An `accessPolicy` block as defined below.
     * @return builder
     */
    inline def accessPolicies(args: Endofunction[com.pulumi.azure.storage.inputs.TableAclAccessPolicyArgs.Builder]*):
        com.pulumi.azure.storage.inputs.TableAclArgs.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.TableAclAccessPolicyArgs.builder
      builder.accessPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.storage.inputs.TableState.Builder)
    /**
     * @param acls One or more `acl` blocks as defined below.
     * @return builder
     */
    inline def acls(args: Endofunction[com.pulumi.azure.storage.inputs.TableAclArgs.Builder]*):
        com.pulumi.azure.storage.inputs.TableState.Builder =
      def argsBuilder = com.pulumi.azure.storage.inputs.TableAclArgs.builder
      builder.acls(args.map(_(argsBuilder).build)*)
