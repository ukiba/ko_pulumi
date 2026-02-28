package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object workspaces:
  extension (builder: com.pulumi.aws.workspaces.ConnectionAliasArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.workspaces.inputs.ConnectionAliasTimeoutsArgs.Builder]):
        com.pulumi.aws.workspaces.ConnectionAliasArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.ConnectionAliasTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspaces.IpGroupArgs.Builder)
    /**
     * @param rules One or more pairs specifying the IP group rule (in CIDR format) from which web requests originate.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.workspaces.inputs.IpGroupRuleArgs.Builder]*):
        com.pulumi.aws.workspaces.IpGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.workspaces.inputs.IpGroupRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  /** Provides an IP access control group in AWS WorkSpaces Service */
  def IpGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspaces.IpGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workspaces.IpGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.workspaces.IpGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.workspaces.WorkspaceArgs.Builder)
    /**
     * @param workspaceProperties The WorkSpace properties.
     * @return builder
     */
    def workspaceProperties(args: Endofunction[com.pulumi.aws.workspaces.inputs.WorkspaceWorkspacePropertiesArgs.Builder]):
        com.pulumi.aws.workspaces.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.WorkspaceWorkspacePropertiesArgs.builder
      builder.workspaceProperties(args(argsBuilder).build)

  /**
   * Provides a WorkSpaces directory in AWS WorkSpaces Service.
   *  
   *  &gt; **NOTE:** AWS WorkSpaces service requires [`workspaces_DefaultRole`](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspaces-access-control.html#create-default-role) IAM role to operate normally.
   */
  def Directory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspaces.DirectoryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workspaces.DirectoryArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.workspaces.Directory(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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

  /** Resource for managing an AWS WorkSpaces Connection Alias. */
  def ConnectionAlias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspaces.ConnectionAliasArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workspaces.ConnectionAliasArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.workspaces.ConnectionAlias(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type WorkspacesFunctions = com.pulumi.aws.workspaces.WorkspacesFunctions
  object WorkspacesFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.workspaces.WorkspacesFunctions.*
  extension (self: WorkspacesFunctions.type)
    /** Retrieve information about an AWS WorkSpaces bundle. */
    def getBundle(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetBundleArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.workspaces.outputs.GetBundleResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetBundleArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getBundle(args(argsBuilder).build)

    /** Retrieve information about an AWS WorkSpaces bundle. */
    def getBundlePlain(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetBundlePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.workspaces.outputs.GetBundleResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetBundlePlainArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getBundlePlain(args(argsBuilder).build)

    /** Retrieve information about an AWS WorkSpaces directory. */
    def getDirectory(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetDirectoryArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.workspaces.outputs.GetDirectoryResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetDirectoryArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getDirectory(args(argsBuilder).build)

    /** Retrieve information about an AWS WorkSpaces directory. */
    def getDirectoryPlain(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetDirectoryPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.workspaces.outputs.GetDirectoryResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetDirectoryPlainArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getDirectoryPlain(args(argsBuilder).build)

    /** Use this data source to get information about a Workspaces image. */
    def getImage(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetImageArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.workspaces.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetImageArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getImage(args(argsBuilder).build)

    /** Use this data source to get information about a Workspaces image. */
    def getImagePlain(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetImagePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.workspaces.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetImagePlainArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getImagePlain(args(argsBuilder).build)

    /** Use this data source to get information about a workspace in [AWS Workspaces](https://docs.aws.amazon.com/workspaces/latest/adminguide/amazon-workspaces.html) Service. */
    def getWorkspace(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetWorkspaceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.workspaces.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetWorkspaceArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getWorkspace(args(argsBuilder).build)

    /** Use this data source to get information about a workspace in [AWS Workspaces](https://docs.aws.amazon.com/workspaces/latest/adminguide/amazon-workspaces.html) Service. */
    def getWorkspacePlain(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetWorkspacePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.workspaces.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetWorkspacePlainArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getWorkspacePlain(args(argsBuilder).build)

  /**
   * Provides a workspace in [AWS Workspaces](https://docs.aws.amazon.com/workspaces/latest/adminguide/amazon-workspaces.html) Service
   *  
   *  &gt; **NOTE:** AWS WorkSpaces service requires [`workspaces_DefaultRole`](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspaces-access-control.html#create-default-role) IAM role to operate normally.
   */
  def Workspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspaces.WorkspaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workspaces.WorkspaceArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.workspaces.Workspace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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

  extension (builder: com.pulumi.aws.workspaces.inputs.WorkspaceState.Builder)
    /**
     * @param workspaceProperties The WorkSpace properties.
     * @return builder
     */
    def workspaceProperties(args: Endofunction[com.pulumi.aws.workspaces.inputs.WorkspaceWorkspacePropertiesArgs.Builder]):
        com.pulumi.aws.workspaces.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.WorkspaceWorkspacePropertiesArgs.builder
      builder.workspaceProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspaces.inputs.IpGroupState.Builder)
    /**
     * @param rules One or more pairs specifying the IP group rule (in CIDR format) from which web requests originate.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.workspaces.inputs.IpGroupRuleArgs.Builder]*):
        com.pulumi.aws.workspaces.inputs.IpGroupState.Builder =
      def argsBuilder = com.pulumi.aws.workspaces.inputs.IpGroupRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)
