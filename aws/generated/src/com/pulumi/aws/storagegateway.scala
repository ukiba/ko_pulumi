package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object storagegateway:
  /**
   * Manages an AWS Storage Gateway working storage.
   *  
   *  &gt; **NOTE:** The Storage Gateway API provides no method to remove a working storage disk. Destroying this resource does not perform any Storage Gateway actions.
   */
  def WorkingStorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.storagegateway.WorkingStorageArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.storagegateway.WorkingStorageArgs.builder
    
    com.pulumi.aws.storagegateway.WorkingStorage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AWS Storage Gateway Tape Pool. */
  def TapePool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.storagegateway.TapePoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.storagegateway.TapePoolArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.storagegateway.TapePool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.storagegateway.SmbFileShareArgs.Builder)
    /**
     * @param cacheAttributes Refresh cache information. see `cacheAttributes` Block for more details.
     * @return builder
     */
    def cacheAttributes(args: Endofunction[com.pulumi.aws.storagegateway.inputs.SmbFileShareCacheAttributesArgs.Builder]):
        com.pulumi.aws.storagegateway.SmbFileShareArgs.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.SmbFileShareCacheAttributesArgs.builder
      builder.cacheAttributes(args(argsBuilder).build)

  /**
   * Manages an AWS Storage Gateway upload buffer.
   *  
   *  &gt; **NOTE:** The Storage Gateway API provides no method to remove an upload buffer disk. Destroying this resource does not perform any Storage Gateway actions.
   */
  def UploadBuffer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.storagegateway.UploadBufferArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.storagegateway.UploadBufferArgs.builder
    
    com.pulumi.aws.storagegateway.UploadBuffer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an AWS Storage Gateway cached iSCSI volume.
   *  
   *  &gt; **NOTE:** The gateway must have cache added (e.g., via the `aws.storagegateway.Cache` resource) before creating volumes otherwise the Storage Gateway API will return an error.
   *  
   *  &gt; **NOTE:** The gateway must have an upload buffer added (e.g., via the `aws.storagegateway.UploadBuffer` resource) before the volume is operational to clients, however the Storage Gateway API will allow volume creation without error in that case and return volume status as `UPLOAD BUFFER NOT CONFIGURED`.
   */
  def CachesIscsiVolume(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.storagegateway.CachesIscsiVolumeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.storagegateway.CachesIscsiVolumeArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.storagegateway.CachesIscsiVolume(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an AWS Storage Gateway file, tape, or volume gateway in the provider region.
   *  
   *  &gt; **NOTE:** The Storage Gateway API requires the gateway to be connected to properly return information after activation. If you are receiving `The specified gateway is not connected` errors during resource creation (gateway activation), ensure your gateway instance meets the [Storage Gateway requirements](https://docs.aws.amazon.com/storagegateway/latest/userguide/Requirements.html).
   */
  def Gateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.storagegateway.GatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.storagegateway.GatewayArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.storagegateway.Gateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an AWS Storage Gateway cache.
   *  
   *  &gt; **NOTE:** The Storage Gateway API provides no method to remove a cache disk. Destroying this resource does not perform any Storage Gateway actions.
   */
  def Cache(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.storagegateway.CacheArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.storagegateway.CacheArgs.builder
    
    com.pulumi.aws.storagegateway.Cache(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an AWS Storage Gateway stored iSCSI volume.
   *  
   *  &gt; **NOTE:** The gateway must have a working storage added (e.g., via the `aws.storagegateway.WorkingStorage` resource) before the volume is operational to clients, however the Storage Gateway API will allow volume creation without error in that case and return volume status as `WORKING STORAGE NOT CONFIGURED`.
   */
  def StoredIscsiVolume(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.storagegateway.StoredIscsiVolumeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.storagegateway.StoredIscsiVolumeArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.storagegateway.StoredIscsiVolume(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AWS Storage Gateway SMB File Share. */
  def SmbFileShare(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.storagegateway.SmbFileShareArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.storagegateway.SmbFileShareArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.storagegateway.SmbFileShare(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.storagegateway.NfsFileShareArgs.Builder)
    /**
     * @param cacheAttributes Refresh cache information. see Cache Attributes for more details.
     * @return builder
     */
    def cacheAttributes(args: Endofunction[com.pulumi.aws.storagegateway.inputs.NfsFileShareCacheAttributesArgs.Builder]):
        com.pulumi.aws.storagegateway.NfsFileShareArgs.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.NfsFileShareCacheAttributesArgs.builder
      builder.cacheAttributes(args(argsBuilder).build)

    /**
     * @param nfsFileShareDefaults Nested argument with file share default values. More information below. see NFS File Share Defaults for more details.
     * @return builder
     */
    def nfsFileShareDefaults(args: Endofunction[com.pulumi.aws.storagegateway.inputs.NfsFileShareNfsFileShareDefaultsArgs.Builder]):
        com.pulumi.aws.storagegateway.NfsFileShareArgs.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.NfsFileShareNfsFileShareDefaultsArgs.builder
      builder.nfsFileShareDefaults(args(argsBuilder).build)

  /**
   * Associate an Amazon FSx file system with the FSx File Gateway. After the association process is complete, the file shares on the Amazon FSx file system are available for access through the gateway. This operation only supports the FSx File Gateway type.
   *  
   *  [FSx File Gateway requirements](https://docs.aws.amazon.com/filegateway/latest/filefsxw/Requirements.html).
   */
  def FileSystemAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.storagegateway.FileSystemAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.storagegateway.FileSystemAssociationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.storagegateway.FileSystemAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.storagegateway.GatewayArgs.Builder)
    /**
     * @param maintenanceStartTime The gateway&#39;s weekly maintenance start time information, including day and time of the week. The maintenance time is the time in your gateway&#39;s time zone. More details below.
     * @return builder
     */
    def maintenanceStartTime(args: Endofunction[com.pulumi.aws.storagegateway.inputs.GatewayMaintenanceStartTimeArgs.Builder]):
        com.pulumi.aws.storagegateway.GatewayArgs.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.GatewayMaintenanceStartTimeArgs.builder
      builder.maintenanceStartTime(args(argsBuilder).build)

    /**
     * @param smbActiveDirectorySettings Nested argument with Active Directory domain join information for Server Message Block (SMB) file shares. Only valid for `FILE_S3` and `FILE_FSX_SMB` gateway types. Must be set before creating `ActiveDirectory` authentication SMB file shares. More details below.
     * @return builder
     */
    def smbActiveDirectorySettings(args: Endofunction[com.pulumi.aws.storagegateway.inputs.GatewaySmbActiveDirectorySettingsArgs.Builder]):
        com.pulumi.aws.storagegateway.GatewayArgs.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.GatewaySmbActiveDirectorySettingsArgs.builder
      builder.smbActiveDirectorySettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.storagegateway.FileSystemAssociationArgs.Builder)
    /**
     * @param cacheAttributes Refresh cache information. see Cache Attributes for more details.
     * @return builder
     */
    def cacheAttributes(args: Endofunction[com.pulumi.aws.storagegateway.inputs.FileSystemAssociationCacheAttributesArgs.Builder]):
        com.pulumi.aws.storagegateway.FileSystemAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.FileSystemAssociationCacheAttributesArgs.builder
      builder.cacheAttributes(args(argsBuilder).build)

  /** Manages an AWS Storage Gateway NFS File Share. */
  def NfsFileShare(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.storagegateway.NfsFileShareArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.storagegateway.NfsFileShareArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.storagegateway.NfsFileShare(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.storagegateway.inputs.NfsFileShareState.Builder)
    /**
     * @param cacheAttributes Refresh cache information. see Cache Attributes for more details.
     * @return builder
     */
    def cacheAttributes(args: Endofunction[com.pulumi.aws.storagegateway.inputs.NfsFileShareCacheAttributesArgs.Builder]):
        com.pulumi.aws.storagegateway.inputs.NfsFileShareState.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.NfsFileShareCacheAttributesArgs.builder
      builder.cacheAttributes(args(argsBuilder).build)

    /**
     * @param nfsFileShareDefaults Nested argument with file share default values. More information below. see NFS File Share Defaults for more details.
     * @return builder
     */
    def nfsFileShareDefaults(args: Endofunction[com.pulumi.aws.storagegateway.inputs.NfsFileShareNfsFileShareDefaultsArgs.Builder]):
        com.pulumi.aws.storagegateway.inputs.NfsFileShareState.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.NfsFileShareNfsFileShareDefaultsArgs.builder
      builder.nfsFileShareDefaults(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.storagegateway.inputs.GatewayState.Builder)
    /**
     * @param gatewayNetworkInterfaces An array that contains descriptions of the gateway network interfaces. See Gateway Network Interface.
     * @return builder
     */
    def gatewayNetworkInterfaces(args: Endofunction[com.pulumi.aws.storagegateway.inputs.GatewayGatewayNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.storagegateway.inputs.GatewayState.Builder =
      def argsBuilder = com.pulumi.aws.storagegateway.inputs.GatewayGatewayNetworkInterfaceArgs.builder
      builder.gatewayNetworkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param maintenanceStartTime The gateway&#39;s weekly maintenance start time information, including day and time of the week. The maintenance time is the time in your gateway&#39;s time zone. More details below.
     * @return builder
     */
    def maintenanceStartTime(args: Endofunction[com.pulumi.aws.storagegateway.inputs.GatewayMaintenanceStartTimeArgs.Builder]):
        com.pulumi.aws.storagegateway.inputs.GatewayState.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.GatewayMaintenanceStartTimeArgs.builder
      builder.maintenanceStartTime(args(argsBuilder).build)

    /**
     * @param smbActiveDirectorySettings Nested argument with Active Directory domain join information for Server Message Block (SMB) file shares. Only valid for `FILE_S3` and `FILE_FSX_SMB` gateway types. Must be set before creating `ActiveDirectory` authentication SMB file shares. More details below.
     * @return builder
     */
    def smbActiveDirectorySettings(args: Endofunction[com.pulumi.aws.storagegateway.inputs.GatewaySmbActiveDirectorySettingsArgs.Builder]):
        com.pulumi.aws.storagegateway.inputs.GatewayState.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.GatewaySmbActiveDirectorySettingsArgs.builder
      builder.smbActiveDirectorySettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.storagegateway.inputs.FileSystemAssociationState.Builder)
    /**
     * @param cacheAttributes Refresh cache information. see Cache Attributes for more details.
     * @return builder
     */
    def cacheAttributes(args: Endofunction[com.pulumi.aws.storagegateway.inputs.FileSystemAssociationCacheAttributesArgs.Builder]):
        com.pulumi.aws.storagegateway.inputs.FileSystemAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.FileSystemAssociationCacheAttributesArgs.builder
      builder.cacheAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.storagegateway.inputs.SmbFileShareState.Builder)
    /**
     * @param cacheAttributes Refresh cache information. see `cacheAttributes` Block for more details.
     * @return builder
     */
    def cacheAttributes(args: Endofunction[com.pulumi.aws.storagegateway.inputs.SmbFileShareCacheAttributesArgs.Builder]):
        com.pulumi.aws.storagegateway.inputs.SmbFileShareState.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.SmbFileShareCacheAttributesArgs.builder
      builder.cacheAttributes(args(argsBuilder).build)

  type StoragegatewayFunctions = com.pulumi.aws.storagegateway.StoragegatewayFunctions
  object StoragegatewayFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.storagegateway.StoragegatewayFunctions.*
  extension (self: StoragegatewayFunctions.type)
    /** Retrieve information about a Storage Gateway local disk. The disk identifier is useful for adding the disk as a cache or upload buffer to a gateway. */
    def getLocalDisk(args: Endofunction[com.pulumi.aws.storagegateway.inputs.GetLocalDiskArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.storagegateway.outputs.GetLocalDiskResult] =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.GetLocalDiskArgs.builder
      com.pulumi.aws.storagegateway.StoragegatewayFunctions.getLocalDisk(args(argsBuilder).build)

    /** Retrieve information about a Storage Gateway local disk. The disk identifier is useful for adding the disk as a cache or upload buffer to a gateway. */
    def getLocalDiskPlain(args: Endofunction[com.pulumi.aws.storagegateway.inputs.GetLocalDiskPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.storagegateway.outputs.GetLocalDiskResult] =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.GetLocalDiskPlainArgs.builder
      com.pulumi.aws.storagegateway.StoragegatewayFunctions.getLocalDiskPlain(args(argsBuilder).build)
