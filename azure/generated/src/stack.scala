package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object stack:
  /**
   * Manages an Azure Stack HCI Cluster.
   * 
   * ## Import
   * 
   * Azure Stack HCI Clusters can be imported using the `resource id`, e.g.
   * 
   * ```sh
   * \$ pulumi import azure:stack/hciCluster:HciCluster example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.AzureStackHCI/clusters/cluster1
   * ```
   */
  def HciCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.stack.HciClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.stack.HciClusterArgs.builder
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
    com.pulumi.azure.stack.HciCluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Stack HCI Deployment Setting.
   * 
   * &gt; **Note:** Completion of the prerequisites of deploying the Azure Stack HCI in your environment is outside the scope of this document. For more details refer to the [Azure Stack HCI deployment sequence](https://learn.microsoft.com/en-us/azure-stack/hci/deploy/deployment-introduction#deployment-sequence). If you encounter issues completing the prerequisites, we&#39;d recommend opening a ticket with Microsoft Support.
   * 
   * &gt; **Note:** During the deployment process, the service will generate additional resources, including a new Arc Bridge Appliance and a Custom Location containing several Stack HCI Storage Paths. The provider will attempt to remove these resources on the deletion or recreation of `azure.stack.HciDeploymentSetting`.
   * 
   * ## Import
   * 
   * Stack HCI Deployment Settings can be imported using the `resource id`, e.g.
   * 
   * ```sh
   * \$ pulumi import azure:stack/hciDeploymentSetting:HciDeploymentSetting example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.AzureStackHCI/clusters/clus1/deploymentSettings/default
   * ```
   */
  def HciDeploymentSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.stack.HciDeploymentSettingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.stack.HciDeploymentSettingArgs.builder
    com.pulumi.azure.stack.HciDeploymentSetting(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Stack HCI Extension. */
  def HciExtension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.stack.HciExtensionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.stack.HciExtensionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.stack.HciExtension(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Stack HCI Logical Network. */
  def HciLogicalNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.stack.HciLogicalNetworkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.stack.HciLogicalNetworkArgs.builder
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
    com.pulumi.azure.stack.HciLogicalNetwork(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Azure Stack HCI Marketplace Gallery Image.
   * 
   * ## Import
   * 
   * Azure Stack HCI Marketplace Gallery Images can be imported using the `resource id`, e.g.
   * 
   * ```sh
   * \$ pulumi import azure:stack/hciMarketplaceGalleryImage:HciMarketplaceGalleryImage example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.AzureStackHCI/marketplaceGalleryImages/image1
   * ```
   */
  def HciMarketplaceGalleryImage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.stack.HciMarketplaceGalleryImageArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.stack.HciMarketplaceGalleryImageArgs.builder
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
    com.pulumi.azure.stack.HciMarketplaceGalleryImage(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Stack HCI Network Interface. */
  def HciNetworkInterface(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.stack.HciNetworkInterfaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.stack.HciNetworkInterfaceArgs.builder
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
    com.pulumi.azure.stack.HciNetworkInterface(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Stack HCI Storage Path. */
  def HciStoragePath(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.stack.HciStoragePathArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.stack.HciStoragePathArgs.builder
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
    com.pulumi.azure.stack.HciStoragePath(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Stack HCI Virtual Hard Disk. */
  def HciVirtualHardDisk(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.stack.HciVirtualHardDiskArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.stack.HciVirtualHardDiskArgs.builder
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
    com.pulumi.azure.stack.HciVirtualHardDisk(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object StackFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Azure Stack HCI Cluster instance. */
    inline def getHciCluster(args: Endofunction[com.pulumi.azure.stack.inputs.GetHciClusterArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.stack.outputs.GetHciClusterResult] =
      val argsBuilder = com.pulumi.azure.stack.inputs.GetHciClusterArgs.builder
      com.pulumi.azure.stack.StackFunctions.getHciCluster(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Azure Stack HCI Cluster instance. */
    inline def getHciClusterPlain(args: Endofunction[com.pulumi.azure.stack.inputs.GetHciClusterPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.stack.outputs.GetHciClusterResult] =
      val argsBuilder = com.pulumi.azure.stack.inputs.GetHciClusterPlainArgs.builder
      com.pulumi.azure.stack.StackFunctions.getHciClusterPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Stack HCI Storage Path. */
    inline def getHciStoragePath(args: Endofunction[com.pulumi.azure.stack.inputs.GetHciStoragePathArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.stack.outputs.GetHciStoragePathResult] =
      val argsBuilder = com.pulumi.azure.stack.inputs.GetHciStoragePathArgs.builder
      com.pulumi.azure.stack.StackFunctions.getHciStoragePath(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Stack HCI Storage Path. */
    inline def getHciStoragePathPlain(args: Endofunction[com.pulumi.azure.stack.inputs.GetHciStoragePathPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.stack.outputs.GetHciStoragePathResult] =
      val argsBuilder = com.pulumi.azure.stack.inputs.GetHciStoragePathPlainArgs.builder
      com.pulumi.azure.stack.StackFunctions.getHciStoragePathPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
