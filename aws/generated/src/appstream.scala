package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object appstream:
  type AppstreamFunctions = com.pulumi.aws.appstream.AppstreamFunctions
  object AppstreamFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.appstream.AppstreamFunctions.*
  extension (self: AppstreamFunctions.type)
    /** Data source for managing an AWS AppStream 2.0 Image. */
    def getImage(args: Endofunction[com.pulumi.aws.appstream.inputs.GetImageArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.appstream.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.aws.appstream.inputs.GetImageArgs.builder
      com.pulumi.aws.appstream.AppstreamFunctions.getImage(args(argsBuilder).build)

    /** Data source for managing an AWS AppStream 2.0 Image. */
    def getImagePlain(args: Endofunction[com.pulumi.aws.appstream.inputs.GetImagePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appstream.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.aws.appstream.inputs.GetImagePlainArgs.builder
      com.pulumi.aws.appstream.AppstreamFunctions.getImagePlain(args(argsBuilder).build)

  /** Provides an AppStream fleet. */
  def Fleet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appstream.FleetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appstream.FleetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appstream.Fleet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AppStream User Stack association. */
  def UserStackAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appstream.UserStackAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.appstream.UserStackAssociationArgs.builder
    
    com.pulumi.aws.appstream.UserStackAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AppStream Fleet Stack association. */
  def FleetStackAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appstream.FleetStackAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.appstream.FleetStackAssociationArgs.builder
    
    com.pulumi.aws.appstream.FleetStackAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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

  /** Provides an AppStream image builder. */
  def ImageBuilder(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appstream.ImageBuilderArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appstream.ImageBuilderArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appstream.ImageBuilder(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AppStream user. */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appstream.UserArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.appstream.UserArgs.builder
    
    com.pulumi.aws.appstream.User(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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

  /** Provides an AppStream Directory Config. */
  def DirectoryConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appstream.DirectoryConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.appstream.DirectoryConfigArgs.builder
    
    com.pulumi.aws.appstream.DirectoryConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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

  extension (builder: com.pulumi.aws.appstream.StackArgs.Builder)
    /**
     * @param accessEndpoints Set of configuration blocks defining the interface VPC endpoints. Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
     *  See `accessEndpoints` below.
     * @return builder
     */
    def accessEndpoints(args: Endofunction[com.pulumi.aws.appstream.inputs.StackAccessEndpointArgs.Builder]*):
        com.pulumi.aws.appstream.StackArgs.Builder =
      def argsBuilder = com.pulumi.aws.appstream.inputs.StackAccessEndpointArgs.builder
      builder.accessEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param applicationSettings Settings for application settings persistence.
     *  See `applicationSettings` below.
     * @return builder
     */
    def applicationSettings(args: Endofunction[com.pulumi.aws.appstream.inputs.StackApplicationSettingsArgs.Builder]):
        com.pulumi.aws.appstream.StackArgs.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.StackApplicationSettingsArgs.builder
      builder.applicationSettings(args(argsBuilder).build)

    /**
     * @param storageConnectors Configuration block for the storage connectors to enable.
     *  See `storageConnectors` below.
     * @return builder
     */
    def storageConnectors(args: Endofunction[com.pulumi.aws.appstream.inputs.StackStorageConnectorArgs.Builder]*):
        com.pulumi.aws.appstream.StackArgs.Builder =
      def argsBuilder = com.pulumi.aws.appstream.inputs.StackStorageConnectorArgs.builder
      builder.storageConnectors(args.map(_(argsBuilder).build)*)

    /**
     * @param streamingExperienceSettings The streaming protocol you want your stack to prefer. This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
     *  See `streamingExperienceSettings` below.
     * @return builder
     */
    def streamingExperienceSettings(args: Endofunction[com.pulumi.aws.appstream.inputs.StackStreamingExperienceSettingsArgs.Builder]):
        com.pulumi.aws.appstream.StackArgs.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.StackStreamingExperienceSettingsArgs.builder
      builder.streamingExperienceSettings(args(argsBuilder).build)

    /**
     * @param userSettings Configuration block for the actions that are enabled or disabled for users during their streaming sessions. If not provided, these settings are configured automatically by AWS. If provided, the configuration should include a block for each configurable action.
     *  See `userSettings` below.
     * @return builder
     */
    def userSettings(args: Endofunction[com.pulumi.aws.appstream.inputs.StackUserSettingArgs.Builder]*):
        com.pulumi.aws.appstream.StackArgs.Builder =
      def argsBuilder = com.pulumi.aws.appstream.inputs.StackUserSettingArgs.builder
      builder.userSettings(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.appstream.inputs.StackState.Builder)
    /**
     * @param accessEndpoints Set of configuration blocks defining the interface VPC endpoints. Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
     *  See `accessEndpoints` below.
     * @return builder
     */
    def accessEndpoints(args: Endofunction[com.pulumi.aws.appstream.inputs.StackAccessEndpointArgs.Builder]*):
        com.pulumi.aws.appstream.inputs.StackState.Builder =
      def argsBuilder = com.pulumi.aws.appstream.inputs.StackAccessEndpointArgs.builder
      builder.accessEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param applicationSettings Settings for application settings persistence.
     *  See `applicationSettings` below.
     * @return builder
     */
    def applicationSettings(args: Endofunction[com.pulumi.aws.appstream.inputs.StackApplicationSettingsArgs.Builder]):
        com.pulumi.aws.appstream.inputs.StackState.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.StackApplicationSettingsArgs.builder
      builder.applicationSettings(args(argsBuilder).build)

    /**
     * @param storageConnectors Configuration block for the storage connectors to enable.
     *  See `storageConnectors` below.
     * @return builder
     */
    def storageConnectors(args: Endofunction[com.pulumi.aws.appstream.inputs.StackStorageConnectorArgs.Builder]*):
        com.pulumi.aws.appstream.inputs.StackState.Builder =
      def argsBuilder = com.pulumi.aws.appstream.inputs.StackStorageConnectorArgs.builder
      builder.storageConnectors(args.map(_(argsBuilder).build)*)

    /**
     * @param streamingExperienceSettings The streaming protocol you want your stack to prefer. This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
     *  See `streamingExperienceSettings` below.
     * @return builder
     */
    def streamingExperienceSettings(args: Endofunction[com.pulumi.aws.appstream.inputs.StackStreamingExperienceSettingsArgs.Builder]):
        com.pulumi.aws.appstream.inputs.StackState.Builder =
      val argsBuilder = com.pulumi.aws.appstream.inputs.StackStreamingExperienceSettingsArgs.builder
      builder.streamingExperienceSettings(args(argsBuilder).build)

    /**
     * @param userSettings Configuration block for the actions that are enabled or disabled for users during their streaming sessions. If not provided, these settings are configured automatically by AWS. If provided, the configuration should include a block for each configurable action.
     *  See `userSettings` below.
     * @return builder
     */
    def userSettings(args: Endofunction[com.pulumi.aws.appstream.inputs.StackUserSettingArgs.Builder]*):
        com.pulumi.aws.appstream.inputs.StackState.Builder =
      def argsBuilder = com.pulumi.aws.appstream.inputs.StackUserSettingArgs.builder
      builder.userSettings(args.map(_(argsBuilder).build)*)

  /** Provides an AppStream stack. */
  def Stack(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appstream.StackArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appstream.StackArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appstream.Stack(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
