package jp.ukiba.ko_pulumi
package aws

object appstream_ext:
  extension (builder: com.pulumi.aws.appstream.DirectoryConfigArgs.Builder)
    /**
     * @param certificateBasedAuthProperties Configuration block for the certificate-based authentication properties used to authenticate SAML 2.0 Identity Provider (IdP) user identities to Active Directory domain-joined streaming instances. See `certificateBasedAuthProperties` below.
     * @return builder
     */
    def certificateBasedAuthProperties(args: Endofunction[com.pulumi.aws.appstream.inputs.DirectoryConfigCertificateBasedAuthPropertiesArgs.Builder]):
        com.pulumi.aws.appstream.DirectoryConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.DirectoryConfigCertificateBasedAuthPropertiesArgs.builder
      builder.certificateBasedAuthProperties(args(argsBuilder).build)

    /**
     * @param serviceAccountCredentials Configuration block for the name of the directory and organizational unit (OU) to use to join the directory config to a Microsoft Active Directory domain. See `serviceAccountCredentials` below.
     * @return builder
     */
    def serviceAccountCredentials(args: Endofunction[com.pulumi.aws.appstream.inputs.DirectoryConfigServiceAccountCredentialsArgs.Builder]):
        com.pulumi.aws.appstream.DirectoryConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.DirectoryConfigServiceAccountCredentialsArgs.builder
      builder.serviceAccountCredentials(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appstream.FleetArgs.Builder)
    /**
     * @param computeCapacity Configuration block for the desired capacity of the fleet. See below.
     * @return builder
     */
    def computeCapacity(args: Endofunction[com.pulumi.aws.appstream.inputs.FleetComputeCapacityArgs.Builder]):
        com.pulumi.aws.appstream.FleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.FleetComputeCapacityArgs.builder
      builder.computeCapacity(args(argsBuilder).build)

    /**
     * @param domainJoinInfo Configuration block for the name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory domain. See below.
     * @return builder
     */
    def domainJoinInfo(args: Endofunction[com.pulumi.aws.appstream.inputs.FleetDomainJoinInfoArgs.Builder]):
        com.pulumi.aws.appstream.FleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.FleetDomainJoinInfoArgs.builder
      builder.domainJoinInfo(args(argsBuilder).build)

    /**
     * @param vpcConfig Configuration block for the VPC configuration for the image builder. See below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.appstream.inputs.FleetVpcConfigArgs.Builder]):
        com.pulumi.aws.appstream.FleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.FleetVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appstream.ImageBuilderArgs.Builder)
    /**
     * @param accessEndpoints Set of interface VPC endpoint (interface endpoint) objects. Maximum of 4. See below.
     * @return builder
     */
    def accessEndpoints(args: Endofunction[com.pulumi.aws.appstream.inputs.ImageBuilderAccessEndpointArgs.Builder]*):
        com.pulumi.aws.appstream.ImageBuilderArgs.Builder =
      def argsBuilder = com.pulumi.aws.appstream.inputs.ImageBuilderAccessEndpointArgs.builder
      builder.accessEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param domainJoinInfo Configuration block for the name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active Directory domain. See below.
     * @return builder
     */
    def domainJoinInfo(args: Endofunction[com.pulumi.aws.appstream.inputs.ImageBuilderDomainJoinInfoArgs.Builder]):
        com.pulumi.aws.appstream.ImageBuilderArgs.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.ImageBuilderDomainJoinInfoArgs.builder
      builder.domainJoinInfo(args(argsBuilder).build)

    /**
     * @param vpcConfig Configuration block for the VPC configuration for the image builder. See below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.appstream.inputs.ImageBuilderVpcConfigArgs.Builder]):
        com.pulumi.aws.appstream.ImageBuilderArgs.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.ImageBuilderVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appstream.StackArgs.Builder)
    /**
     * @param accessEndpoints Set of configuration blocks defining the interface VPC endpoints. Users of the stack can connect to AppStream 2.0 only through the specified endpoints. See `accessEndpoints` below.
     * @return builder
     */
    def accessEndpoints(args: Endofunction[com.pulumi.aws.appstream.inputs.StackAccessEndpointArgs.Builder]*):
        com.pulumi.aws.appstream.StackArgs.Builder =
      def argsBuilder = com.pulumi.aws.appstream.inputs.StackAccessEndpointArgs.builder
      builder.accessEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param applicationSettings Settings for application settings persistence. See `applicationSettings` below.
     * @return builder
     */
    def applicationSettings(args: Endofunction[com.pulumi.aws.appstream.inputs.StackApplicationSettingsArgs.Builder]):
        com.pulumi.aws.appstream.StackArgs.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.StackApplicationSettingsArgs.builder
      builder.applicationSettings(args(argsBuilder).build)

    /**
     * @param storageConnectors Configuration block for the storage connectors to enable. See `storageConnectors` below.
     * @return builder
     */
    def storageConnectors(args: Endofunction[com.pulumi.aws.appstream.inputs.StackStorageConnectorArgs.Builder]*):
        com.pulumi.aws.appstream.StackArgs.Builder =
      def argsBuilder = com.pulumi.aws.appstream.inputs.StackStorageConnectorArgs.builder
      builder.storageConnectors(args.map(_(argsBuilder).build)*)

    /**
     * @param streamingExperienceSettings Streaming protocol you want your stack to prefer. This can be UDP or TCP. Currently, UDP is only supported in the Windows native client. See `streamingExperienceSettings` below.
     * @return builder
     */
    def streamingExperienceSettings(args: Endofunction[com.pulumi.aws.appstream.inputs.StackStreamingExperienceSettingsArgs.Builder]):
        com.pulumi.aws.appstream.StackArgs.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.StackStreamingExperienceSettingsArgs.builder
      builder.streamingExperienceSettings(args(argsBuilder).build)

    /**
     * @param userSettings Configuration block for the actions that are enabled or disabled for users during their streaming sessions. If not provided, these settings are configured automatically by AWS. If provided, the configuration should include a block for each configurable action. See `userSettings` below.
     * @return builder
     */
    def userSettings(args: Endofunction[com.pulumi.aws.appstream.inputs.StackUserSettingArgs.Builder]*):
        com.pulumi.aws.appstream.StackArgs.Builder =
      def argsBuilder = com.pulumi.aws.appstream.inputs.StackUserSettingArgs.builder
      builder.userSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appstream.inputs.DirectoryConfigState.Builder)
    /**
     * @param certificateBasedAuthProperties Configuration block for the certificate-based authentication properties used to authenticate SAML 2.0 Identity Provider (IdP) user identities to Active Directory domain-joined streaming instances. See `certificateBasedAuthProperties` below.
     * @return builder
     */
    def certificateBasedAuthProperties(args: Endofunction[com.pulumi.aws.appstream.inputs.DirectoryConfigCertificateBasedAuthPropertiesArgs.Builder]):
        com.pulumi.aws.appstream.inputs.DirectoryConfigState.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.DirectoryConfigCertificateBasedAuthPropertiesArgs.builder
      builder.certificateBasedAuthProperties(args(argsBuilder).build)

    /**
     * @param serviceAccountCredentials Configuration block for the name of the directory and organizational unit (OU) to use to join the directory config to a Microsoft Active Directory domain. See `serviceAccountCredentials` below.
     * @return builder
     */
    def serviceAccountCredentials(args: Endofunction[com.pulumi.aws.appstream.inputs.DirectoryConfigServiceAccountCredentialsArgs.Builder]):
        com.pulumi.aws.appstream.inputs.DirectoryConfigState.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.DirectoryConfigServiceAccountCredentialsArgs.builder
      builder.serviceAccountCredentials(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appstream.inputs.FleetState.Builder)
    /**
     * @param computeCapacity Configuration block for the desired capacity of the fleet. See below.
     * @return builder
     */
    def computeCapacity(args: Endofunction[com.pulumi.aws.appstream.inputs.FleetComputeCapacityArgs.Builder]):
        com.pulumi.aws.appstream.inputs.FleetState.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.FleetComputeCapacityArgs.builder
      builder.computeCapacity(args(argsBuilder).build)

    /**
     * @param domainJoinInfo Configuration block for the name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory domain. See below.
     * @return builder
     */
    def domainJoinInfo(args: Endofunction[com.pulumi.aws.appstream.inputs.FleetDomainJoinInfoArgs.Builder]):
        com.pulumi.aws.appstream.inputs.FleetState.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.FleetDomainJoinInfoArgs.builder
      builder.domainJoinInfo(args(argsBuilder).build)

    /**
     * @param vpcConfig Configuration block for the VPC configuration for the image builder. See below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.appstream.inputs.FleetVpcConfigArgs.Builder]):
        com.pulumi.aws.appstream.inputs.FleetState.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.FleetVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appstream.inputs.ImageBuilderState.Builder)
    /**
     * @param accessEndpoints Set of interface VPC endpoint (interface endpoint) objects. Maximum of 4. See below.
     * @return builder
     */
    def accessEndpoints(args: Endofunction[com.pulumi.aws.appstream.inputs.ImageBuilderAccessEndpointArgs.Builder]*):
        com.pulumi.aws.appstream.inputs.ImageBuilderState.Builder =
      def argsBuilder = com.pulumi.aws.appstream.inputs.ImageBuilderAccessEndpointArgs.builder
      builder.accessEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param domainJoinInfo Configuration block for the name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active Directory domain. See below.
     * @return builder
     */
    def domainJoinInfo(args: Endofunction[com.pulumi.aws.appstream.inputs.ImageBuilderDomainJoinInfoArgs.Builder]):
        com.pulumi.aws.appstream.inputs.ImageBuilderState.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.ImageBuilderDomainJoinInfoArgs.builder
      builder.domainJoinInfo(args(argsBuilder).build)

    /**
     * @param vpcConfig Configuration block for the VPC configuration for the image builder. See below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.appstream.inputs.ImageBuilderVpcConfigArgs.Builder]):
        com.pulumi.aws.appstream.inputs.ImageBuilderState.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.ImageBuilderVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appstream.inputs.StackState.Builder)
    /**
     * @param accessEndpoints Set of configuration blocks defining the interface VPC endpoints. Users of the stack can connect to AppStream 2.0 only through the specified endpoints. See `accessEndpoints` below.
     * @return builder
     */
    def accessEndpoints(args: Endofunction[com.pulumi.aws.appstream.inputs.StackAccessEndpointArgs.Builder]*):
        com.pulumi.aws.appstream.inputs.StackState.Builder =
      def argsBuilder = com.pulumi.aws.appstream.inputs.StackAccessEndpointArgs.builder
      builder.accessEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param applicationSettings Settings for application settings persistence. See `applicationSettings` below.
     * @return builder
     */
    def applicationSettings(args: Endofunction[com.pulumi.aws.appstream.inputs.StackApplicationSettingsArgs.Builder]):
        com.pulumi.aws.appstream.inputs.StackState.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.StackApplicationSettingsArgs.builder
      builder.applicationSettings(args(argsBuilder).build)

    /**
     * @param storageConnectors Configuration block for the storage connectors to enable. See `storageConnectors` below.
     * @return builder
     */
    def storageConnectors(args: Endofunction[com.pulumi.aws.appstream.inputs.StackStorageConnectorArgs.Builder]*):
        com.pulumi.aws.appstream.inputs.StackState.Builder =
      def argsBuilder = com.pulumi.aws.appstream.inputs.StackStorageConnectorArgs.builder
      builder.storageConnectors(args.map(_(argsBuilder).build)*)

    /**
     * @param streamingExperienceSettings Streaming protocol you want your stack to prefer. This can be UDP or TCP. Currently, UDP is only supported in the Windows native client. See `streamingExperienceSettings` below.
     * @return builder
     */
    def streamingExperienceSettings(args: Endofunction[com.pulumi.aws.appstream.inputs.StackStreamingExperienceSettingsArgs.Builder]):
        com.pulumi.aws.appstream.inputs.StackState.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.StackStreamingExperienceSettingsArgs.builder
      builder.streamingExperienceSettings(args(argsBuilder).build)

    /**
     * @param userSettings Configuration block for the actions that are enabled or disabled for users during their streaming sessions. If not provided, these settings are configured automatically by AWS. If provided, the configuration should include a block for each configurable action. See `userSettings` below.
     * @return builder
     */
    def userSettings(args: Endofunction[com.pulumi.aws.appstream.inputs.StackUserSettingArgs.Builder]*):
        com.pulumi.aws.appstream.inputs.StackState.Builder =
      def argsBuilder = com.pulumi.aws.appstream.inputs.StackUserSettingArgs.builder
      builder.userSettings(args.map(_(argsBuilder).build)*)
