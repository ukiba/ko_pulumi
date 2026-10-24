package jp.ukiba.ko_pulumi
package aws

object directoryservice_ext:
  extension (builder: com.pulumi.aws.directoryservice.DirectoryArgs.Builder)
    /**
     * @param connectSettings Connector related information about the directory. Fields documented below.
     * @return builder
     */
    inline def connectSettings(args: Endofunction[com.pulumi.aws.directoryservice.inputs.DirectoryConnectSettingsArgs.Builder]):
        com.pulumi.aws.directoryservice.DirectoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.DirectoryConnectSettingsArgs.builder
      builder.connectSettings(args(argsBuilder).build)

    /**
     * @param vpcSettings VPC related information about the directory. Fields documented below.
     * @return builder
     */
    inline def vpcSettings(args: Endofunction[com.pulumi.aws.directoryservice.inputs.DirectoryVpcSettingsArgs.Builder]):
        com.pulumi.aws.directoryservice.DirectoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.DirectoryVpcSettingsArgs.builder
      builder.vpcSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.directoryservice.IpRouteArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.directoryservice.inputs.IpRouteTimeoutsArgs.Builder]):
        com.pulumi.aws.directoryservice.IpRouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.IpRouteTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.directoryservice.IpRoutesExclusiveArgs.Builder)
    /**
     * @param ipRoutes Set of IP routes the directory should have. Omit all `ipRoute` blocks to remove every IP route from the directory. See `ipRoute` Block below.
     * @return builder
     */
    inline def ipRoutes(args: Endofunction[com.pulumi.aws.directoryservice.inputs.IpRoutesExclusiveIpRouteArgs.Builder]*):
        com.pulumi.aws.directoryservice.IpRoutesExclusiveArgs.Builder =
      def argsBuilder = com.pulumi.aws.directoryservice.inputs.IpRoutesExclusiveIpRouteArgs.builder
      builder.ipRoutes(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.directoryservice.inputs.IpRoutesExclusiveTimeoutsArgs.Builder]):
        com.pulumi.aws.directoryservice.IpRoutesExclusiveArgs.Builder =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.IpRoutesExclusiveTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.directoryservice.ServiceRegionArgs.Builder)
    /**
     * @param vpcSettings VPC information in the replicated Region. Detailed below.
     * @return builder
     */
    inline def vpcSettings(args: Endofunction[com.pulumi.aws.directoryservice.inputs.ServiceRegionVpcSettingsArgs.Builder]):
        com.pulumi.aws.directoryservice.ServiceRegionArgs.Builder =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.ServiceRegionVpcSettingsArgs.builder
      builder.vpcSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.directoryservice.SharedDirectoryArgs.Builder)
    /**
     * @param target Identifier for the directory consumer account with whom the directory is to be shared. See below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def target(args: Endofunction[com.pulumi.aws.directoryservice.inputs.SharedDirectoryTargetArgs.Builder]):
        com.pulumi.aws.directoryservice.SharedDirectoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.SharedDirectoryTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.directoryservice.inputs.DirectoryState.Builder)
    /**
     * @param connectSettings Connector related information about the directory. Fields documented below.
     * @return builder
     */
    inline def connectSettings(args: Endofunction[com.pulumi.aws.directoryservice.inputs.DirectoryConnectSettingsArgs.Builder]):
        com.pulumi.aws.directoryservice.inputs.DirectoryState.Builder =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.DirectoryConnectSettingsArgs.builder
      builder.connectSettings(args(argsBuilder).build)

    /**
     * @param vpcSettings VPC related information about the directory. Fields documented below.
     * @return builder
     */
    inline def vpcSettings(args: Endofunction[com.pulumi.aws.directoryservice.inputs.DirectoryVpcSettingsArgs.Builder]):
        com.pulumi.aws.directoryservice.inputs.DirectoryState.Builder =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.DirectoryVpcSettingsArgs.builder
      builder.vpcSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.directoryservice.inputs.IpRouteState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.directoryservice.inputs.IpRouteTimeoutsArgs.Builder]):
        com.pulumi.aws.directoryservice.inputs.IpRouteState.Builder =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.IpRouteTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.directoryservice.inputs.IpRoutesExclusiveState.Builder)
    /**
     * @param ipRoutes Set of IP routes the directory should have. Omit all `ipRoute` blocks to remove every IP route from the directory. See `ipRoute` Block below.
     * @return builder
     */
    inline def ipRoutes(args: Endofunction[com.pulumi.aws.directoryservice.inputs.IpRoutesExclusiveIpRouteArgs.Builder]*):
        com.pulumi.aws.directoryservice.inputs.IpRoutesExclusiveState.Builder =
      def argsBuilder = com.pulumi.aws.directoryservice.inputs.IpRoutesExclusiveIpRouteArgs.builder
      builder.ipRoutes(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.directoryservice.inputs.IpRoutesExclusiveTimeoutsArgs.Builder]):
        com.pulumi.aws.directoryservice.inputs.IpRoutesExclusiveState.Builder =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.IpRoutesExclusiveTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.directoryservice.inputs.ServiceRegionState.Builder)
    /**
     * @param vpcSettings VPC information in the replicated Region. Detailed below.
     * @return builder
     */
    inline def vpcSettings(args: Endofunction[com.pulumi.aws.directoryservice.inputs.ServiceRegionVpcSettingsArgs.Builder]):
        com.pulumi.aws.directoryservice.inputs.ServiceRegionState.Builder =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.ServiceRegionVpcSettingsArgs.builder
      builder.vpcSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.directoryservice.inputs.SharedDirectoryState.Builder)
    /**
     * @param target Identifier for the directory consumer account with whom the directory is to be shared. See below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def target(args: Endofunction[com.pulumi.aws.directoryservice.inputs.SharedDirectoryTargetArgs.Builder]):
        com.pulumi.aws.directoryservice.inputs.SharedDirectoryState.Builder =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.SharedDirectoryTargetArgs.builder
      builder.target(args(argsBuilder).build)
