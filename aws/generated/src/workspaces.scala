package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object workspaces:
  /** Resource for managing an AWS WorkSpaces Connection Alias. */
  def ConnectionAlias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.workspaces.ConnectionAliasArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def Directory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.workspaces.DirectoryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def IpGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.workspaces.IpGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def Pool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.workspaces.PoolArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def Workspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.workspaces.WorkspaceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieve information about an AWS WorkSpaces bundle. */
    inline def getBundle(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetBundleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.workspaces.outputs.GetBundleResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetBundleArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getBundle(args(argsBuilder).build)

    /** Retrieve information about an AWS WorkSpaces bundle. */
    inline def getBundlePlain(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetBundlePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.workspaces.outputs.GetBundleResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetBundlePlainArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getBundlePlain(args(argsBuilder).build)

    /** Retrieve information about an AWS WorkSpaces directory. */
    inline def getDirectory(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetDirectoryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.workspaces.outputs.GetDirectoryResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetDirectoryArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getDirectory(args(argsBuilder).build)

    /** Retrieve information about an AWS WorkSpaces directory. */
    inline def getDirectoryPlain(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetDirectoryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.workspaces.outputs.GetDirectoryResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetDirectoryPlainArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getDirectoryPlain(args(argsBuilder).build)

    /** Use this data source to get information about a WorkSpaces image. */
    inline def getImage(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetImageArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.workspaces.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetImageArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getImage(args(argsBuilder).build)

    /** Use this data source to get information about a WorkSpaces image. */
    inline def getImagePlain(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetImagePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.workspaces.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetImagePlainArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getImagePlain(args(argsBuilder).build)

    /** Use this data source to get information about a workspace in [AWS WorkSpaces](https://docs.aws.amazon.com/workspaces/latest/adminguide/amazon-workspaces.html) Service. */
    inline def getWorkspace(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetWorkspaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.workspaces.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetWorkspaceArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getWorkspace(args(argsBuilder).build)

    /** Use this data source to get information about a workspace in [AWS WorkSpaces](https://docs.aws.amazon.com/workspaces/latest/adminguide/amazon-workspaces.html) Service. */
    inline def getWorkspacePlain(args: Endofunction[com.pulumi.aws.workspaces.inputs.GetWorkspacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.workspaces.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.aws.workspaces.inputs.GetWorkspacePlainArgs.builder
      com.pulumi.aws.workspaces.WorkspacesFunctions.getWorkspacePlain(args(argsBuilder).build)
