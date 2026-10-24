package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object filestore:
  /**
   * A Google Cloud Filestore backup.
   * 
   * To get more information about Backup, see:
   * 
   * * [API documentation](https://cloud.google.com/filestore/docs/reference/rest/v1/projects.locations.backups)
   * * How-to Guides
   *     * [Creating Backups](https://cloud.google.com/filestore/docs/create-backups)
   *     * [Official Documentation](https://cloud.google.com/filestore/docs/backups)
   */
  inline def Backup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.filestore.BackupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.filestore.BackupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.filestore.Backup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object FilestoreFunctions:
    /** Get info about a Google Cloud Filestore instance. */
    inline def getInstance(args: Endofunction[com.pulumi.gcp.filestore.inputs.GetInstanceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.filestore.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.GetInstanceArgs.builder
      com.pulumi.gcp.filestore.FilestoreFunctions.getInstance(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get info about a Google Cloud Filestore instance. */
    inline def getInstancePlain(args: Endofunction[com.pulumi.gcp.filestore.inputs.GetInstancePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.filestore.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.GetInstancePlainArgs.builder
      com.pulumi.gcp.filestore.FilestoreFunctions.getInstancePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * A Google Cloud Filestore instance.
   * 
   * To get more information about Instance, see:
   * 
   * * [API documentation](https://cloud.google.com/filestore/docs/reference/rest/v1beta1/projects.locations.instances/create)
   * * How-to Guides
   *     * [Copying Data In/Out](https://cloud.google.com/filestore/docs/copying-data)
   *     * [Official Documentation](https://cloud.google.com/filestore/docs/creating-instances)
   *     * [Use with Kubernetes](https://cloud.google.com/filestore/docs/accessing-fileshares)
   */
  inline def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.filestore.InstanceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.filestore.InstanceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.filestore.Instance(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Google Cloud Filestore snapshot.
   * 
   * To get more information about Snapshot, see:
   * 
   * * [API documentation](https://cloud.google.com/filestore/docs/reference/rest/v1/projects.locations.instances.snapshots)
   * * How-to Guides
   *     * [Creating Snapshots](https://cloud.google.com/filestore/docs/create-snapshots)
   *     * [Official Documentation](https://cloud.google.com/filestore/docs/snapshots)
   */
  inline def Snapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.filestore.SnapshotArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.filestore.SnapshotArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.filestore.Snapshot(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
