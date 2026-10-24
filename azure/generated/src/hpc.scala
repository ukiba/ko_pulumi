package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object hpc:
  /**
   * Manages a HPC Cache.
   * 
   * &gt; **Note:** The `azure.hpc.Cache` resource has been deprecated because the service is retiring on 2025-09-30. This resource will be removed in v5.0 of the AzureRM Provider. See https://aka.ms/hpccacheretirement for more information.
   * 
   * &gt; **Note:** By request of the service team the provider no longer automatically registers the `Microsoft.StorageCache` Resource Provider for this resource. To register it you can run `az provider register --namespace &#39;Microsoft.StorageCache&#39;`.
   */
  inline def Cache(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.hpc.CacheArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.hpc.CacheArgs.builder
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
    com.pulumi.azure.hpc.Cache(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a HPC Cache Access Policy.
   * 
   * &gt; **Note:** The `azure.hpc.CacheAccessPolicy` resource has been deprecated because the service is retiring on 2025-09-30. This resource will be removed in v5.0 of the AzureRM Provider. See https://aka.ms/hpccacheretirement for more information.
   */
  inline def CacheAccessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.hpc.CacheAccessPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.hpc.CacheAccessPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.hpc.CacheAccessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Blob NFSv3 Target within a HPC Cache.
   * 
   * &gt; **Note:** The `azure.hpc.CacheBlobNfsTarget` resource has been deprecated because the service is retiring on 2025-09-30. This resource will be removed in v5.0 of the AzureRM Provider. See https://aka.ms/hpccacheretirement for more information.
   * 
   * &gt; **Note:** By request of the service team the provider no longer automatically registers the `Microsoft.StorageCache` Resource Provider for this resource. To register it you can run `az provider register --namespace &#39;Microsoft.StorageCache&#39;`.
   * 
   * &gt; **Note:** This resource depends on the NFSv3 enabled Storage Account, which has some prerequisites need to meet. Please checkout: &lt;https://docs.microsoft.com/azure/storage/blobs/network-file-system-protocol-support-how-to?tabs=azure-powershell&gt;.
   * 
   * ## Import
   * 
   * HPC Cache Blob NFS Targets can be imported using the `resource id`, e.g.
   * 
   * ```sh
   * \$ pulumi import azure:hpc/cacheBlobNfsTarget:CacheBlobNfsTarget example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.StorageCache/caches/cache1/storageTargets/target1
   * ```
   */
  inline def CacheBlobNfsTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.hpc.CacheBlobNfsTargetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.hpc.CacheBlobNfsTargetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.hpc.CacheBlobNfsTarget(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Blob Target within a HPC Cache.
   * 
   * &gt; **Note:** The `azure.hpc.CacheBlobTarget` resource has been deprecated because the service is retiring on 2025-09-30. This resource will be removed in v5.0 of the AzureRM Provider. See https://aka.ms/hpccacheretirement for more information.
   * 
   * &gt; **Note:** By request of the service team the provider no longer automatically registering the `Microsoft.StorageCache` Resource Provider for this resource. To register it you can run `az provider register --namespace &#39;Microsoft.StorageCache&#39;`.
   * 
   * ## Import
   * 
   * Blob Targets within an HPC Cache can be imported using the `resource id`, e.g.
   * 
   * ```sh
   * \$ pulumi import azure:hpc/cacheBlobTarget:CacheBlobTarget example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.StorageCache/caches/cache1/storageTargets/target1
   * ```
   */
  inline def CacheBlobTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.hpc.CacheBlobTargetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.hpc.CacheBlobTargetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.hpc.CacheBlobTarget(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a NFS Target within a HPC Cache.
   * 
   * &gt; **Note:** The `azure.hpc.CacheNfsTarget` resource has been deprecated because the service is retiring on 2025-09-30. This resource will be removed in v5.0 of the AzureRM Provider. See https://aka.ms/hpccacheretirement for more information.
   * 
   * &gt; **Note:** By request of the service team the provider no longer automatically registering the `Microsoft.StorageCache` Resource Provider for this resource. To register it you can run `az provider register --namespace &#39;Microsoft.StorageCache&#39;`.
   */
  inline def CacheNfsTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.hpc.CacheNfsTargetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.hpc.CacheNfsTargetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.hpc.CacheNfsTarget(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
