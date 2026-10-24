package jp.ukiba.ko_pulumi
package aws

object workspaces_ext:
  extension (builder: com.pulumi.aws.workspaces.ConnectionAliasArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.workspaces.inputs.ConnectionAliasTimeoutsArgs.Builder]):
        com.pulumi.aws.workspaces.ConnectionAliasArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.ConnectionAliasTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspaces.DirectoryArgs.Builder)
    /**
     * @param activeDirectoryConfig Configuration for Active Directory integration when `workspaceType` is set to `POOLS`. Defined below.
     * @return builder
     */
    def activeDirectoryConfig(args: Endofunction[com.pulumi.aws.workspaces.inputs.DirectoryActiveDirectoryConfigArgs.Builder]):
        com.pulumi.aws.workspaces.DirectoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.DirectoryActiveDirectoryConfigArgs.builder
      builder.activeDirectoryConfig(args(argsBuilder).build)

    /**
     * @param certificateBasedAuthProperties Configuration of certificate-based authentication (CBA) integration. Requires SAML authentication to be enabled. Defined below.
     * @return builder
     */
    def certificateBasedAuthProperties(args: Endofunction[com.pulumi.aws.workspaces.inputs.DirectoryCertificateBasedAuthPropertiesArgs.Builder]):
        com.pulumi.aws.workspaces.DirectoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.DirectoryCertificateBasedAuthPropertiesArgs.builder
      builder.certificateBasedAuthProperties(args(argsBuilder).build)

    /**
     * @param samlProperties Configuration of SAML authentication integration. Defined below.
     * @return builder
     */
    def samlProperties(args: Endofunction[com.pulumi.aws.workspaces.inputs.DirectorySamlPropertiesArgs.Builder]):
        com.pulumi.aws.workspaces.DirectoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.DirectorySamlPropertiesArgs.builder
      builder.samlProperties(args(argsBuilder).build)

    /**
     * @param selfServicePermissions Permissions to enable or disable self-service capabilities when `workspaceType` is set to `PERSONAL`.. Defined below.
     * @return builder
     */
    def selfServicePermissions(args: Endofunction[com.pulumi.aws.workspaces.inputs.DirectorySelfServicePermissionsArgs.Builder]):
        com.pulumi.aws.workspaces.DirectoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.DirectorySelfServicePermissionsArgs.builder
      builder.selfServicePermissions(args(argsBuilder).build)

    /**
     * @param workspaceAccessProperties Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
     * @return builder
     */
    def workspaceAccessProperties(args: Endofunction[com.pulumi.aws.workspaces.inputs.DirectoryWorkspaceAccessPropertiesArgs.Builder]):
        com.pulumi.aws.workspaces.DirectoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.DirectoryWorkspaceAccessPropertiesArgs.builder
      builder.workspaceAccessProperties(args(argsBuilder).build)

    /**
     * @param workspaceCreationProperties Default properties that are used for creating WorkSpaces. Defined below.
     * @return builder
     */
    def workspaceCreationProperties(args: Endofunction[com.pulumi.aws.workspaces.inputs.DirectoryWorkspaceCreationPropertiesArgs.Builder]):
        com.pulumi.aws.workspaces.DirectoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.DirectoryWorkspaceCreationPropertiesArgs.builder
      builder.workspaceCreationProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspaces.IpGroupArgs.Builder)
    /**
     * @param rules One or more pairs specifying the IP group rule (in CIDR format) from which web requests originate.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.workspaces.inputs.IpGroupRuleArgs.Builder]*):
        com.pulumi.aws.workspaces.IpGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.workspaces.inputs.IpGroupRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.workspaces.PoolArgs.Builder)
    /**
     * @param applicationSettings Application settings configuration for the WorkSpaces Pool. See `applicationSettings` Block below.
     * @return builder
     */
    def applicationSettings(args: Endofunction[com.pulumi.aws.workspaces.inputs.PoolApplicationSettingArgs.Builder]*):
        com.pulumi.aws.workspaces.PoolArgs.Builder =
      def argsBuilder = com.pulumi.aws.workspaces.inputs.PoolApplicationSettingArgs.builder
      builder.applicationSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param capacity Capacity configuration for the WorkSpaces Pool. See `capacity` below.
     * @return builder
     */
    def capacity(args: Endofunction[com.pulumi.aws.workspaces.inputs.PoolCapacityArgs.Builder]):
        com.pulumi.aws.workspaces.PoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.PoolCapacityArgs.builder
      builder.capacity(args(argsBuilder).build)

    /**
     * @param timeoutSettings Timeout settings configuration for the WorkSpaces Pool. See `timeoutSettings` Block below.
     * @return builder
     */
    def timeoutSettings(args: Endofunction[com.pulumi.aws.workspaces.inputs.PoolTimeoutSettingArgs.Builder]*):
        com.pulumi.aws.workspaces.PoolArgs.Builder =
      def argsBuilder = com.pulumi.aws.workspaces.inputs.PoolTimeoutSettingArgs.builder
      builder.timeoutSettings(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.workspaces.inputs.PoolTimeoutsArgs.Builder]):
        com.pulumi.aws.workspaces.PoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.PoolTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspaces.WorkspaceArgs.Builder)
    /**
     * @param workspaceProperties The WorkSpace properties.
     * @return builder
     */
    def workspaceProperties(args: Endofunction[com.pulumi.aws.workspaces.inputs.WorkspaceWorkspacePropertiesArgs.Builder]):
        com.pulumi.aws.workspaces.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.WorkspaceWorkspacePropertiesArgs.builder
      builder.workspaceProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspaces.inputs.ConnectionAliasState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.workspaces.inputs.ConnectionAliasTimeoutsArgs.Builder]):
        com.pulumi.aws.workspaces.inputs.ConnectionAliasState.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.ConnectionAliasTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspaces.inputs.DirectoryState.Builder)
    /**
     * @param activeDirectoryConfig Configuration for Active Directory integration when `workspaceType` is set to `POOLS`. Defined below.
     * @return builder
     */
    def activeDirectoryConfig(args: Endofunction[com.pulumi.aws.workspaces.inputs.DirectoryActiveDirectoryConfigArgs.Builder]):
        com.pulumi.aws.workspaces.inputs.DirectoryState.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.DirectoryActiveDirectoryConfigArgs.builder
      builder.activeDirectoryConfig(args(argsBuilder).build)

    /**
     * @param certificateBasedAuthProperties Configuration of certificate-based authentication (CBA) integration. Requires SAML authentication to be enabled. Defined below.
     * @return builder
     */
    def certificateBasedAuthProperties(args: Endofunction[com.pulumi.aws.workspaces.inputs.DirectoryCertificateBasedAuthPropertiesArgs.Builder]):
        com.pulumi.aws.workspaces.inputs.DirectoryState.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.DirectoryCertificateBasedAuthPropertiesArgs.builder
      builder.certificateBasedAuthProperties(args(argsBuilder).build)

    /**
     * @param samlProperties Configuration of SAML authentication integration. Defined below.
     * @return builder
     */
    def samlProperties(args: Endofunction[com.pulumi.aws.workspaces.inputs.DirectorySamlPropertiesArgs.Builder]):
        com.pulumi.aws.workspaces.inputs.DirectoryState.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.DirectorySamlPropertiesArgs.builder
      builder.samlProperties(args(argsBuilder).build)

    /**
     * @param selfServicePermissions Permissions to enable or disable self-service capabilities when `workspaceType` is set to `PERSONAL`.. Defined below.
     * @return builder
     */
    def selfServicePermissions(args: Endofunction[com.pulumi.aws.workspaces.inputs.DirectorySelfServicePermissionsArgs.Builder]):
        com.pulumi.aws.workspaces.inputs.DirectoryState.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.DirectorySelfServicePermissionsArgs.builder
      builder.selfServicePermissions(args(argsBuilder).build)

    /**
     * @param workspaceAccessProperties Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
     * @return builder
     */
    def workspaceAccessProperties(args: Endofunction[com.pulumi.aws.workspaces.inputs.DirectoryWorkspaceAccessPropertiesArgs.Builder]):
        com.pulumi.aws.workspaces.inputs.DirectoryState.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.DirectoryWorkspaceAccessPropertiesArgs.builder
      builder.workspaceAccessProperties(args(argsBuilder).build)

    /**
     * @param workspaceCreationProperties Default properties that are used for creating WorkSpaces. Defined below.
     * @return builder
     */
    def workspaceCreationProperties(args: Endofunction[com.pulumi.aws.workspaces.inputs.DirectoryWorkspaceCreationPropertiesArgs.Builder]):
        com.pulumi.aws.workspaces.inputs.DirectoryState.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.DirectoryWorkspaceCreationPropertiesArgs.builder
      builder.workspaceCreationProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspaces.inputs.DirectoryWorkspaceAccessPropertiesAccessEndpointConfigArgs.Builder)
    /**
     * @param accessEndpoints Set of access endpoints used to control the network paths that users use to access their WorkSpaces. Defined below.
     * @return builder
     */
    def accessEndpoints(args: Endofunction[com.pulumi.aws.workspaces.inputs.DirectoryWorkspaceAccessPropertiesAccessEndpointConfigAccessEndpointArgs.Builder]*):
        com.pulumi.aws.workspaces.inputs.DirectoryWorkspaceAccessPropertiesAccessEndpointConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.workspaces.inputs.DirectoryWorkspaceAccessPropertiesAccessEndpointConfigAccessEndpointArgs.builder
      builder.accessEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.workspaces.inputs.DirectoryWorkspaceAccessPropertiesArgs.Builder)
    /**
     * @param accessEndpointConfig Configuration for accessing WorkSpaces through VPC endpoints instead of the public internet. Defined below.
     * @return builder
     */
    def accessEndpointConfig(args: Endofunction[com.pulumi.aws.workspaces.inputs.DirectoryWorkspaceAccessPropertiesAccessEndpointConfigArgs.Builder]):
        com.pulumi.aws.workspaces.inputs.DirectoryWorkspaceAccessPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.DirectoryWorkspaceAccessPropertiesAccessEndpointConfigArgs.builder
      builder.accessEndpointConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspaces.inputs.IpGroupState.Builder)
    /**
     * @param rules One or more pairs specifying the IP group rule (in CIDR format) from which web requests originate.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.workspaces.inputs.IpGroupRuleArgs.Builder]*):
        com.pulumi.aws.workspaces.inputs.IpGroupState.Builder =
      def argsBuilder = com.pulumi.aws.workspaces.inputs.IpGroupRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.workspaces.inputs.PoolState.Builder)
    /**
     * @param applicationSettings Application settings configuration for the WorkSpaces Pool. See `applicationSettings` Block below.
     * @return builder
     */
    def applicationSettings(args: Endofunction[com.pulumi.aws.workspaces.inputs.PoolApplicationSettingArgs.Builder]*):
        com.pulumi.aws.workspaces.inputs.PoolState.Builder =
      def argsBuilder = com.pulumi.aws.workspaces.inputs.PoolApplicationSettingArgs.builder
      builder.applicationSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param capacity Capacity configuration for the WorkSpaces Pool. See `capacity` below.
     * @return builder
     */
    def capacity(args: Endofunction[com.pulumi.aws.workspaces.inputs.PoolCapacityArgs.Builder]):
        com.pulumi.aws.workspaces.inputs.PoolState.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.PoolCapacityArgs.builder
      builder.capacity(args(argsBuilder).build)

    /**
     * @param capacityStatuses Capacity status of the WorkSpaces Pool. See `capacityStatus` Block below.
     * @return builder
     */
    def capacityStatuses(args: Endofunction[com.pulumi.aws.workspaces.inputs.PoolCapacityStatusArgs.Builder]*):
        com.pulumi.aws.workspaces.inputs.PoolState.Builder =
      def argsBuilder = com.pulumi.aws.workspaces.inputs.PoolCapacityStatusArgs.builder
      builder.capacityStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param timeoutSettings Timeout settings configuration for the WorkSpaces Pool. See `timeoutSettings` Block below.
     * @return builder
     */
    def timeoutSettings(args: Endofunction[com.pulumi.aws.workspaces.inputs.PoolTimeoutSettingArgs.Builder]*):
        com.pulumi.aws.workspaces.inputs.PoolState.Builder =
      def argsBuilder = com.pulumi.aws.workspaces.inputs.PoolTimeoutSettingArgs.builder
      builder.timeoutSettings(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.workspaces.inputs.PoolTimeoutsArgs.Builder]):
        com.pulumi.aws.workspaces.inputs.PoolState.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.PoolTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspaces.inputs.WorkspaceState.Builder)
    /**
     * @param workspaceProperties The WorkSpace properties.
     * @return builder
     */
    def workspaceProperties(args: Endofunction[com.pulumi.aws.workspaces.inputs.WorkspaceWorkspacePropertiesArgs.Builder]):
        com.pulumi.aws.workspaces.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.WorkspaceWorkspacePropertiesArgs.builder
      builder.workspaceProperties(args(argsBuilder).build)
