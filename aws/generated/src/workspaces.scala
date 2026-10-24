package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object workspaces:
  /** Resource for managing an AWS WorkSpaces Connection Alias. */
  inline def ConnectionAlias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspaces.ConnectionAliasArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workspaces.ConnectionAliasArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.workspaces.ConnectionAlias(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a WorkSpaces directory in AWS WorkSpaces Service.
   * 
   * &gt; **NOTE:** AWS WorkSpaces service requires [`workspaces_DefaultRole`](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspaces-access-control.html#create-default-role) IAM role to operate normally.
   */
  inline def Directory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspaces.DirectoryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workspaces.DirectoryArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.workspaces.Directory(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an IP access control group in AWS WorkSpaces Service */
  inline def IpGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspaces.IpGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workspaces.IpGroupArgs.builder
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
    com.pulumi.aws.workspaces.IpGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a WorkSpaces Pool in the AWS WorkSpaces service. */
  inline def Pool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspaces.PoolArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workspaces.PoolArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.workspaces.Pool(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a workspace in [AWS WorkSpaces](https://docs.aws.amazon.com/workspaces/latest/adminguide/amazon-workspaces.html) Service
   * 
   * &gt; **NOTE:** AWS WorkSpaces service requires [`workspaces_DefaultRole`](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspaces-access-control.html#create-default-role) IAM role to operate normally.
   */
  inline def Workspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspaces.WorkspaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workspaces.WorkspaceArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.workspaces.Workspace(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object WorkspacesFunctions:
    /** Retrieve information about an AWS WorkSpaces bundle. */
    inline def getBundle(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetBundleArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.workspaces.outputs.GetBundleResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetBundleArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getBundle(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieve information about an AWS WorkSpaces bundle. */
    inline def getBundlePlain(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetBundlePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.workspaces.outputs.GetBundleResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetBundlePlainArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getBundlePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieve information about an AWS WorkSpaces directory. */
    inline def getDirectory(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetDirectoryArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.workspaces.outputs.GetDirectoryResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetDirectoryArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getDirectory(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieve information about an AWS WorkSpaces directory. */
    inline def getDirectoryPlain(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetDirectoryPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.workspaces.outputs.GetDirectoryResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetDirectoryPlainArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getDirectoryPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information about a WorkSpaces image. */
    inline def getImage(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetImageArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.workspaces.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetImageArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getImage(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information about a WorkSpaces image. */
    inline def getImagePlain(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetImagePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.workspaces.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetImagePlainArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getImagePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information about a workspace in [AWS WorkSpaces](https://docs.aws.amazon.com/workspaces/latest/adminguide/amazon-workspaces.html) Service. */
    inline def getWorkspace(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetWorkspaceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.workspaces.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetWorkspaceArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getWorkspace(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information about a workspace in [AWS WorkSpaces](https://docs.aws.amazon.com/workspaces/latest/adminguide/amazon-workspaces.html) Service. */
    inline def getWorkspacePlain(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetWorkspacePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.workspaces.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetWorkspacePlainArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getWorkspacePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
