package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object efs:
  /** Provides an Elastic File System (EFS) access point. */
  def AccessPoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.efs.AccessPointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.efs.AccessPointArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.efs.AccessPoint(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Elastic File System (EFS) Backup Policy resource.
   * Backup policies turn automatic backups on or off for an existing file system.
   */
  def BackupPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.efs.BackupPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.efs.BackupPolicyArgs.builder
    com.pulumi.aws.efs.BackupPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object EfsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides information about an Elastic File System (EFS) Access Point. */
    inline def getAccessPoint(args: Endofunction[com.pulumi.aws.efs.inputs.GetAccessPointArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.efs.outputs.GetAccessPointResult] =
      val argsBuilder = com.pulumi.aws.efs.inputs.GetAccessPointArgs.builder
      com.pulumi.aws.efs.EfsFunctions.getAccessPoint(args(argsBuilder).build)

    /** Provides information about an Elastic File System (EFS) Access Point. */
    inline def getAccessPointPlain(args: Endofunction[com.pulumi.aws.efs.inputs.GetAccessPointPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.efs.outputs.GetAccessPointResult] =
      val argsBuilder = com.pulumi.aws.efs.inputs.GetAccessPointPlainArgs.builder
      com.pulumi.aws.efs.EfsFunctions.getAccessPointPlain(args(argsBuilder).build)

    /** Provides information about multiple Elastic File System (EFS) Access Points. */
    inline def getAccessPoints(args: Endofunction[com.pulumi.aws.efs.inputs.GetAccessPointsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.efs.outputs.GetAccessPointsResult] =
      val argsBuilder = com.pulumi.aws.efs.inputs.GetAccessPointsArgs.builder
      com.pulumi.aws.efs.EfsFunctions.getAccessPoints(args(argsBuilder).build)

    /** Provides information about multiple Elastic File System (EFS) Access Points. */
    inline def getAccessPointsPlain(args: Endofunction[com.pulumi.aws.efs.inputs.GetAccessPointsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.efs.outputs.GetAccessPointsResult] =
      val argsBuilder = com.pulumi.aws.efs.inputs.GetAccessPointsPlainArgs.builder
      com.pulumi.aws.efs.EfsFunctions.getAccessPointsPlain(args(argsBuilder).build)

    /** Provides information about an Elastic File System (EFS) File System. */
    inline def getFileSystem(args: Endofunction[com.pulumi.aws.efs.inputs.GetFileSystemArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.efs.outputs.GetFileSystemResult] =
      val argsBuilder = com.pulumi.aws.efs.inputs.GetFileSystemArgs.builder
      com.pulumi.aws.efs.EfsFunctions.getFileSystem(args(argsBuilder).build)

    /** Provides information about an Elastic File System (EFS) File System. */
    inline def getFileSystemPlain(args: Endofunction[com.pulumi.aws.efs.inputs.GetFileSystemPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.efs.outputs.GetFileSystemResult] =
      val argsBuilder = com.pulumi.aws.efs.inputs.GetFileSystemPlainArgs.builder
      com.pulumi.aws.efs.EfsFunctions.getFileSystemPlain(args(argsBuilder).build)

    /** Provides information about an Elastic File System Mount Target (EFS). */
    inline def getMountTarget(args: Endofunction[com.pulumi.aws.efs.inputs.GetMountTargetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.efs.outputs.GetMountTargetResult] =
      val argsBuilder = com.pulumi.aws.efs.inputs.GetMountTargetArgs.builder
      com.pulumi.aws.efs.EfsFunctions.getMountTarget(args(argsBuilder).build)

    /** Provides information about an Elastic File System Mount Target (EFS). */
    inline def getMountTargetPlain(args: Endofunction[com.pulumi.aws.efs.inputs.GetMountTargetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.efs.outputs.GetMountTargetResult] =
      val argsBuilder = com.pulumi.aws.efs.inputs.GetMountTargetPlainArgs.builder
      com.pulumi.aws.efs.EfsFunctions.getMountTargetPlain(args(argsBuilder).build)

  /** Provides an Elastic File System (EFS) File System resource. */
  def FileSystem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.efs.FileSystemArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.efs.FileSystemArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.efs.FileSystem(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an Elastic File System (EFS) File System Policy resource. */
  def FileSystemPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.efs.FileSystemPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.efs.FileSystemPolicyArgs.builder
    com.pulumi.aws.efs.FileSystemPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an Elastic File System (EFS) mount target. */
  def MountTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.efs.MountTargetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.efs.MountTargetArgs.builder
    com.pulumi.aws.efs.MountTarget(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Creates a replica of an existing EFS file system in the same or another region. Creating this resource causes the source EFS file system to be replicated to a new read-only destination EFS file system (unless using the `destination.file_system_id` attribute). Deleting this resource will cause the replication from source to destination to stop and the destination file system will no longer be read only.
   * 
   * &gt; **NOTE:** Deleting this resource does **not** delete the destination file system that was created.
   */
  def ReplicationConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.efs.ReplicationConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.efs.ReplicationConfigurationArgs.builder
    com.pulumi.aws.efs.ReplicationConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
