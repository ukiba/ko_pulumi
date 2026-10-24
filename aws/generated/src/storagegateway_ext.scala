package jp.ukiba.ko_pulumi
package aws

object storagegateway_ext:
  extension (builder: com.pulumi.aws.storagegateway.FileSystemAssociationArgs.Builder)
    /**
     * @param cacheAttributes Refresh cache information. see Cache Attributes for more details.
     * @return builder
     */
    inline def cacheAttributes(args: Endofunction[com.pulumi.aws.storagegateway.inputs.FileSystemAssociationCacheAttributesArgs.Builder]):
        com.pulumi.aws.storagegateway.FileSystemAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.FileSystemAssociationCacheAttributesArgs.builder
      builder.cacheAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.storagegateway.GatewayArgs.Builder)
    /**
     * @param maintenanceStartTime The gateway&#39;s weekly maintenance start time information, including day and time of the week. The maintenance time is the time in your gateway&#39;s time zone. More details below.
     * @return builder
     */
    inline def maintenanceStartTime(args: Endofunction[com.pulumi.aws.storagegateway.inputs.GatewayMaintenanceStartTimeArgs.Builder]):
        com.pulumi.aws.storagegateway.GatewayArgs.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.GatewayMaintenanceStartTimeArgs.builder
      builder.maintenanceStartTime(args(argsBuilder).build)

    /**
     * @param smbActiveDirectorySettings Nested argument with Active Directory domain join information for Server Message Block (SMB) file shares. Only valid for `FILE_S3` and `FILE_FSX_SMB` gateway types. Must be set before creating `ActiveDirectory` authentication SMB file shares. More details below.
     * @return builder
     */
    inline def smbActiveDirectorySettings(args: Endofunction[com.pulumi.aws.storagegateway.inputs.GatewaySmbActiveDirectorySettingsArgs.Builder]):
        com.pulumi.aws.storagegateway.GatewayArgs.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.GatewaySmbActiveDirectorySettingsArgs.builder
      builder.smbActiveDirectorySettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.storagegateway.NfsFileShareArgs.Builder)
    /**
     * @param cacheAttributes Refresh cache information. see Cache Attributes for more details.
     * @return builder
     */
    inline def cacheAttributes(args: Endofunction[com.pulumi.aws.storagegateway.inputs.NfsFileShareCacheAttributesArgs.Builder]):
        com.pulumi.aws.storagegateway.NfsFileShareArgs.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.NfsFileShareCacheAttributesArgs.builder
      builder.cacheAttributes(args(argsBuilder).build)

    /**
     * @param nfsFileShareDefaults Nested argument with file share default values. More information below. see NFS File Share Defaults for more details.
     * @return builder
     */
    inline def nfsFileShareDefaults(args: Endofunction[com.pulumi.aws.storagegateway.inputs.NfsFileShareNfsFileShareDefaultsArgs.Builder]):
        com.pulumi.aws.storagegateway.NfsFileShareArgs.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.NfsFileShareNfsFileShareDefaultsArgs.builder
      builder.nfsFileShareDefaults(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.storagegateway.SmbFileShareArgs.Builder)
    /**
     * @param cacheAttributes Refresh cache information. see `cacheAttributes` Block for more details.
     * @return builder
     */
    inline def cacheAttributes(args: Endofunction[com.pulumi.aws.storagegateway.inputs.SmbFileShareCacheAttributesArgs.Builder]):
        com.pulumi.aws.storagegateway.SmbFileShareArgs.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.SmbFileShareCacheAttributesArgs.builder
      builder.cacheAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.storagegateway.inputs.FileSystemAssociationState.Builder)
    /**
     * @param cacheAttributes Refresh cache information. see Cache Attributes for more details.
     * @return builder
     */
    inline def cacheAttributes(args: Endofunction[com.pulumi.aws.storagegateway.inputs.FileSystemAssociationCacheAttributesArgs.Builder]):
        com.pulumi.aws.storagegateway.inputs.FileSystemAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.FileSystemAssociationCacheAttributesArgs.builder
      builder.cacheAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.storagegateway.inputs.GatewayState.Builder)
    /**
     * @param gatewayNetworkInterfaces An array that contains descriptions of the gateway network interfaces. See Gateway Network Interface.
     * @return builder
     */
    inline def gatewayNetworkInterfaces(args: Endofunction[com.pulumi.aws.storagegateway.inputs.GatewayGatewayNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.storagegateway.inputs.GatewayState.Builder =
      def argsBuilder = com.pulumi.aws.storagegateway.inputs.GatewayGatewayNetworkInterfaceArgs.builder
      builder.gatewayNetworkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param maintenanceStartTime The gateway&#39;s weekly maintenance start time information, including day and time of the week. The maintenance time is the time in your gateway&#39;s time zone. More details below.
     * @return builder
     */
    inline def maintenanceStartTime(args: Endofunction[com.pulumi.aws.storagegateway.inputs.GatewayMaintenanceStartTimeArgs.Builder]):
        com.pulumi.aws.storagegateway.inputs.GatewayState.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.GatewayMaintenanceStartTimeArgs.builder
      builder.maintenanceStartTime(args(argsBuilder).build)

    /**
     * @param smbActiveDirectorySettings Nested argument with Active Directory domain join information for Server Message Block (SMB) file shares. Only valid for `FILE_S3` and `FILE_FSX_SMB` gateway types. Must be set before creating `ActiveDirectory` authentication SMB file shares. More details below.
     * @return builder
     */
    inline def smbActiveDirectorySettings(args: Endofunction[com.pulumi.aws.storagegateway.inputs.GatewaySmbActiveDirectorySettingsArgs.Builder]):
        com.pulumi.aws.storagegateway.inputs.GatewayState.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.GatewaySmbActiveDirectorySettingsArgs.builder
      builder.smbActiveDirectorySettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.storagegateway.inputs.NfsFileShareState.Builder)
    /**
     * @param cacheAttributes Refresh cache information. see Cache Attributes for more details.
     * @return builder
     */
    inline def cacheAttributes(args: Endofunction[com.pulumi.aws.storagegateway.inputs.NfsFileShareCacheAttributesArgs.Builder]):
        com.pulumi.aws.storagegateway.inputs.NfsFileShareState.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.NfsFileShareCacheAttributesArgs.builder
      builder.cacheAttributes(args(argsBuilder).build)

    /**
     * @param nfsFileShareDefaults Nested argument with file share default values. More information below. see NFS File Share Defaults for more details.
     * @return builder
     */
    inline def nfsFileShareDefaults(args: Endofunction[com.pulumi.aws.storagegateway.inputs.NfsFileShareNfsFileShareDefaultsArgs.Builder]):
        com.pulumi.aws.storagegateway.inputs.NfsFileShareState.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.NfsFileShareNfsFileShareDefaultsArgs.builder
      builder.nfsFileShareDefaults(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.storagegateway.inputs.SmbFileShareState.Builder)
    /**
     * @param cacheAttributes Refresh cache information. see `cacheAttributes` Block for more details.
     * @return builder
     */
    inline def cacheAttributes(args: Endofunction[com.pulumi.aws.storagegateway.inputs.SmbFileShareCacheAttributesArgs.Builder]):
        com.pulumi.aws.storagegateway.inputs.SmbFileShareState.Builder =
      val argsBuilder = com.pulumi.aws.storagegateway.inputs.SmbFileShareCacheAttributesArgs.builder
      builder.cacheAttributes(args(argsBuilder).build)
