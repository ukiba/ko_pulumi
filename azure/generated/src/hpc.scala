package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object hpc:
  /**
   * Manages a NFS Target within a HPC Cache.
   * 
   *  !&gt; **Note:** The `azure.hpc.CacheNfsTarget` resource has been deprecated because the service is retiring on 2025-09-30. This resource will be removed in v5.0 of the AzureRM Provider. See https://aka.ms/hpccacheretirement for more information.
   * 
   *  &gt; **Note:** By request of the service team the provider no longer automatically registering the `Microsoft.StorageCache` Resource Provider for this resource. To register it you can run `az provider register --namespace &#39;Microsoft.StorageCache&#39;`.
   */
  def CacheNfsTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.hpc.CacheNfsTargetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.hpc.CacheNfsTargetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.hpc.CacheNfsTarget(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Blob Target within a HPC Cache.
   * 
   *  !&gt; **Note:** The `azure.hpc.CacheBlobTarget` resource has been deprecated because the service is retiring on 2025-09-30. This resource will be removed in v5.0 of the AzureRM Provider. See https://aka.ms/hpccacheretirement for more information.
   * 
   *  &gt; **Note:** By request of the service team the provider no longer automatically registering the `Microsoft.StorageCache` Resource Provider for this resource. To register it you can run `az provider register --namespace &#39;Microsoft.StorageCache&#39;`.
   * 
   *  ## Import
   * 
   *  Blob Targets within an HPC Cache can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:hpc/cacheBlobTarget:CacheBlobTarget example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.StorageCache/caches/cache1/storageTargets/target1
   *  ```
   */
  def CacheBlobTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.hpc.CacheBlobTargetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.hpc.CacheBlobTargetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.hpc.CacheBlobTarget(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a HPC Cache Access Policy.
   * 
   *  !&gt; **Note:** The `azure.hpc.CacheAccessPolicy` resource has been deprecated because the service is retiring on 2025-09-30. This resource will be removed in v5.0 of the AzureRM Provider. See https://aka.ms/hpccacheretirement for more information.
   */
  def CacheAccessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.hpc.CacheAccessPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.hpc.CacheAccessPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.hpc.CacheAccessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Blob NFSv3 Target within a HPC Cache.
   * 
   *  !&gt; **Note:** The `azure.hpc.CacheBlobNfsTarget` resource has been deprecated because the service is retiring on 2025-09-30. This resource will be removed in v5.0 of the AzureRM Provider. See https://aka.ms/hpccacheretirement for more information.
   * 
   *  &gt; **Note:** By request of the service team the provider no longer automatically registers the `Microsoft.StorageCache` Resource Provider for this resource. To register it you can run `az provider register --namespace &#39;Microsoft.StorageCache&#39;`.
   * 
   *  &gt; **Note:** This resource depends on the NFSv3 enabled Storage Account, which has some prerequisites need to meet. Please checkout: &lt;https://docs.microsoft.com/azure/storage/blobs/network-file-system-protocol-support-how-to?tabs=azure-powershell&gt;.
   * 
   *  ## Import
   * 
   *  HPC Cache Blob NFS Targets can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:hpc/cacheBlobNfsTarget:CacheBlobNfsTarget example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.StorageCache/caches/cache1/storageTargets/target1
   *  ```
   */
  def CacheBlobNfsTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.hpc.CacheBlobNfsTargetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.hpc.CacheBlobNfsTargetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.hpc.CacheBlobNfsTarget(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a HPC Cache.
   * 
   *  !&gt; **Note:** The `azure.hpc.Cache` resource has been deprecated because the service is retiring on 2025-09-30. This resource will be removed in v5.0 of the AzureRM Provider. See https://aka.ms/hpccacheretirement for more information.
   * 
   *  &gt; **Note:** By request of the service team the provider no longer automatically registers the `Microsoft.StorageCache` Resource Provider for this resource. To register it you can run `az provider register --namespace &#39;Microsoft.StorageCache&#39;`.
   */
  def Cache(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.hpc.CacheArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.hpc.CacheArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.hpc.Cache(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.hpc.CacheNfsTargetArgs.Builder)
    /**
     * @param namespaceJunctions Can be specified multiple times to define multiple `namespaceJunction`. Each `namespaceJunction` block supports fields documented below.
     * @return builder
     */
    def namespaceJunctions(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheNfsTargetNamespaceJunctionArgs.Builder]*):
        com.pulumi.azure.hpc.CacheNfsTargetArgs.Builder =
      def argsBuilder = com.pulumi.azure.hpc.inputs.CacheNfsTargetNamespaceJunctionArgs.builder
      builder.namespaceJunctions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hpc.CacheArgs.Builder)
    /**
     * @param defaultAccessPolicy A `defaultAccessPolicy` block as defined below.
     * @return builder
     */
    def defaultAccessPolicy(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDefaultAccessPolicyArgs.Builder]):
        com.pulumi.azure.hpc.CacheArgs.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDefaultAccessPolicyArgs.builder
      builder.defaultAccessPolicy(args(argsBuilder).build)

    /**
     * @param directoryActiveDirectory A `directoryActiveDirectory` block as defined below.
     * @return builder
     */
    def directoryActiveDirectory(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDirectoryActiveDirectoryArgs.Builder]):
        com.pulumi.azure.hpc.CacheArgs.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDirectoryActiveDirectoryArgs.builder
      builder.directoryActiveDirectory(args(argsBuilder).build)

    /**
     * @param directoryFlatFile A `directoryFlatFile` block as defined below.
     * @return builder
     */
    def directoryFlatFile(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDirectoryFlatFileArgs.Builder]):
        com.pulumi.azure.hpc.CacheArgs.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDirectoryFlatFileArgs.builder
      builder.directoryFlatFile(args(argsBuilder).build)

    /**
     * @param directoryLdap A `directoryLdap` block as defined below.
     * 
     *  &gt; **Note:** Only one of `directoryActiveDirectory`, `directoryFlatFile` and `directoryLdap` can be set.
     * @return builder
     */
    def directoryLdap(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDirectoryLdapArgs.Builder]):
        com.pulumi.azure.hpc.CacheArgs.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDirectoryLdapArgs.builder
      builder.directoryLdap(args(argsBuilder).build)

    /**
     * @param dns A `dns` block as defined below.
     * @return builder
     */
    def dns(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDnsArgs.Builder]):
        com.pulumi.azure.hpc.CacheArgs.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDnsArgs.builder
      builder.dns(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheIdentityArgs.Builder]):
        com.pulumi.azure.hpc.CacheArgs.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.hpc.CacheArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.hpc.CacheAccessPolicyArgs.Builder)
    /**
     * @param accessRules One or more `accessRule` blocks (up to three) as defined below.
     * @return builder
     */
    def accessRules(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheAccessPolicyAccessRuleArgs.Builder]*):
        com.pulumi.azure.hpc.CacheAccessPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.hpc.inputs.CacheAccessPolicyAccessRuleArgs.builder
      builder.accessRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hpc.inputs.CacheAccessPolicyState.Builder)
    /**
     * @param accessRules One or more `accessRule` blocks (up to three) as defined below.
     * @return builder
     */
    def accessRules(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheAccessPolicyAccessRuleArgs.Builder]*):
        com.pulumi.azure.hpc.inputs.CacheAccessPolicyState.Builder =
      def argsBuilder = com.pulumi.azure.hpc.inputs.CacheAccessPolicyAccessRuleArgs.builder
      builder.accessRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hpc.inputs.CacheNfsTargetState.Builder)
    /**
     * @param namespaceJunctions Can be specified multiple times to define multiple `namespaceJunction`. Each `namespaceJunction` block supports fields documented below.
     * @return builder
     */
    def namespaceJunctions(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheNfsTargetNamespaceJunctionArgs.Builder]*):
        com.pulumi.azure.hpc.inputs.CacheNfsTargetState.Builder =
      def argsBuilder = com.pulumi.azure.hpc.inputs.CacheNfsTargetNamespaceJunctionArgs.builder
      builder.namespaceJunctions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hpc.inputs.CacheDefaultAccessPolicyArgs.Builder)
    /**
     * @param accessRules One or more `accessRule` blocks (up to three) as defined above.
     * @return builder
     */
    def accessRules(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDefaultAccessPolicyAccessRuleArgs.Builder]*):
        com.pulumi.azure.hpc.inputs.CacheDefaultAccessPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.hpc.inputs.CacheDefaultAccessPolicyAccessRuleArgs.builder
      builder.accessRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hpc.inputs.CacheDirectoryLdapArgs.Builder)
    /**
     * @param bind A `bind` block as defined above.
     * @return builder
     */
    def bind(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDirectoryLdapBindArgs.Builder]):
        com.pulumi.azure.hpc.inputs.CacheDirectoryLdapArgs.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDirectoryLdapBindArgs.builder
      builder.bind(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hpc.inputs.CacheState.Builder)
    /**
     * @param defaultAccessPolicy A `defaultAccessPolicy` block as defined below.
     * @return builder
     */
    def defaultAccessPolicy(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDefaultAccessPolicyArgs.Builder]):
        com.pulumi.azure.hpc.inputs.CacheState.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDefaultAccessPolicyArgs.builder
      builder.defaultAccessPolicy(args(argsBuilder).build)

    /**
     * @param directoryActiveDirectory A `directoryActiveDirectory` block as defined below.
     * @return builder
     */
    def directoryActiveDirectory(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDirectoryActiveDirectoryArgs.Builder]):
        com.pulumi.azure.hpc.inputs.CacheState.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDirectoryActiveDirectoryArgs.builder
      builder.directoryActiveDirectory(args(argsBuilder).build)

    /**
     * @param directoryFlatFile A `directoryFlatFile` block as defined below.
     * @return builder
     */
    def directoryFlatFile(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDirectoryFlatFileArgs.Builder]):
        com.pulumi.azure.hpc.inputs.CacheState.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDirectoryFlatFileArgs.builder
      builder.directoryFlatFile(args(argsBuilder).build)

    /**
     * @param directoryLdap A `directoryLdap` block as defined below.
     * 
     *  &gt; **Note:** Only one of `directoryActiveDirectory`, `directoryFlatFile` and `directoryLdap` can be set.
     * @return builder
     */
    def directoryLdap(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDirectoryLdapArgs.Builder]):
        com.pulumi.azure.hpc.inputs.CacheState.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDirectoryLdapArgs.builder
      builder.directoryLdap(args(argsBuilder).build)

    /**
     * @param dns A `dns` block as defined below.
     * @return builder
     */
    def dns(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDnsArgs.Builder]):
        com.pulumi.azure.hpc.inputs.CacheState.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDnsArgs.builder
      builder.dns(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheIdentityArgs.Builder]):
        com.pulumi.azure.hpc.inputs.CacheState.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.hpc.inputs.CacheState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
