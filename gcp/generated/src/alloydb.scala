package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object alloydb:
  object AlloydbFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to get information about the available cluster. For more details refer the [API docs](https://cloud.google.com/alloydb/docs/reference/rest/v1/projects.locations.clusters). */
    inline def getCluster(args: Endofunction[com.pulumi.gcp.alloydb.inputs.GetClusterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.alloydb.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.GetClusterArgs.builder
      com.pulumi.gcp.alloydb.AlloydbFunctions.getCluster(args(argsBuilder).build)

    /** Use this data source to get information about the available cluster. For more details refer the [API docs](https://cloud.google.com/alloydb/docs/reference/rest/v1/projects.locations.clusters). */
    inline def getClusterPlain(args: Endofunction[com.pulumi.gcp.alloydb.inputs.GetClusterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.alloydb.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.GetClusterPlainArgs.builder
      com.pulumi.gcp.alloydb.AlloydbFunctions.getClusterPlain(args(argsBuilder).build)

    /** Use this data source to get information about the available instance. For more details refer the [API docs](https://cloud.google.com/alloydb/docs/reference/rest/v1/projects.locations.clusters.instances). */
    inline def getInstance(args: Endofunction[com.pulumi.gcp.alloydb.inputs.GetInstanceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.alloydb.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.GetInstanceArgs.builder
      com.pulumi.gcp.alloydb.AlloydbFunctions.getInstance(args(argsBuilder).build)

    /** Use this data source to get information about the available instance. For more details refer the [API docs](https://cloud.google.com/alloydb/docs/reference/rest/v1/projects.locations.clusters.instances). */
    inline def getInstancePlain(args: Endofunction[com.pulumi.gcp.alloydb.inputs.GetInstancePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.alloydb.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.GetInstancePlainArgs.builder
      com.pulumi.gcp.alloydb.AlloydbFunctions.getInstancePlain(args(argsBuilder).build)

    /** Use this data source to get information about the available locations. For more details refer the [API docs](https://cloud.google.com/alloydb/docs/reference/rest/v1/projects.locations). */
    inline def getLocations(args: Endofunction[com.pulumi.gcp.alloydb.inputs.GetLocationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.alloydb.outputs.GetLocationsResult] =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.GetLocationsArgs.builder
      com.pulumi.gcp.alloydb.AlloydbFunctions.getLocations(args(argsBuilder).build)

    /** Use this data source to get information about the available locations. For more details refer the [API docs](https://cloud.google.com/alloydb/docs/reference/rest/v1/projects.locations). */
    inline def getLocationsPlain(args: Endofunction[com.pulumi.gcp.alloydb.inputs.GetLocationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.alloydb.outputs.GetLocationsResult] =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.GetLocationsPlainArgs.builder
      com.pulumi.gcp.alloydb.AlloydbFunctions.getLocationsPlain(args(argsBuilder).build)

    /** Use this data source to get information about the supported alloydb database flags in a location. */
    inline def getSupportedDatabaseFlags(args: Endofunction[com.pulumi.gcp.alloydb.inputs.GetSupportedDatabaseFlagsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.alloydb.outputs.GetSupportedDatabaseFlagsResult] =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.GetSupportedDatabaseFlagsArgs.builder
      com.pulumi.gcp.alloydb.AlloydbFunctions.getSupportedDatabaseFlags(args(argsBuilder).build)

    /** Use this data source to get information about the supported alloydb database flags in a location. */
    inline def getSupportedDatabaseFlagsPlain(args: Endofunction[com.pulumi.gcp.alloydb.inputs.GetSupportedDatabaseFlagsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.alloydb.outputs.GetSupportedDatabaseFlagsResult] =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.GetSupportedDatabaseFlagsPlainArgs.builder
      com.pulumi.gcp.alloydb.AlloydbFunctions.getSupportedDatabaseFlagsPlain(args(argsBuilder).build)

  /**
   * An AlloyDB Backup.
   * 
   * To get more information about Backup, see:
   * 
   * * [API documentation](https://cloud.google.com/alloydb/docs/reference/rest/v1/projects.locations.backups/create)
   * * How-to Guides
   *     * [AlloyDB](https://cloud.google.com/alloydb/docs/)
   */
  def Backup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.alloydb.BackupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.alloydb.BackupArgs.builder
    com.pulumi.gcp.alloydb.Backup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A managed alloydb cluster.
   * 
   * To get more information about Cluster, see:
   * 
   * * [API documentation](https://cloud.google.com/alloydb/docs/reference/rest/v1/projects.locations.clusters/create)
   * * How-to Guides
   *     * [AlloyDB](https://cloud.google.com/alloydb/docs/)
   * 
   * &gt; **Note:** Users can promote a secondary cluster to a primary cluster with the help of `clusterType`.
   * To promote, users have to set the `clusterType` property as `PRIMARY` and remove the `secondaryConfig` field from cluster configuration.
   * See Example.
   * 
   * Switchover is supported in terraform by refreshing the state of the terraform configurations.
   * The switchover operation still needs to be called outside of terraform.
   * After the switchover operation is completed successfully:
   *   1. Refresh the state of the AlloyDB resources by running `pulumi up -refresh-only --auto-approve` .
   *   2. Manually update the terraform configuration file(s) to match the actual state of the resources by modifying the `clusterType` and `secondaryConfig` fields.
   *   3. Verify the sync of terraform state by running `pulumi preview` and ensure that the infrastructure matches the configuration and no changes are required.
   * 
   * &gt; **Note:**  All arguments marked as write-only values will not be stored in the state: `initial_user.password_wo`.
   * Read more about Write-only Arguments.
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.alloydb.ClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.alloydb.ClusterArgs.builder
    com.pulumi.gcp.alloydb.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A managed alloydb cluster instance.
   * 
   * To get more information about Instance, see:
   * 
   * * [API documentation](https://cloud.google.com/alloydb/docs/reference/rest/v1/projects.locations.clusters.instances/create)
   * * How-to Guides
   *     * [AlloyDB](https://cloud.google.com/alloydb/docs/)
   * 
   * &gt; **Warning:** Deleting an instance with instanceType = SECONDARY does not delete the secondary instance, and abandons it instead.
   * Use deletionPolicy = &#34;FORCE&#34; in the associated secondary cluster and delete the cluster forcefully to delete the secondary cluster as well its associated secondary instance.
   * Users can undo the delete secondary instance action by importing the deleted secondary instance by calling terraform import.
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.alloydb.InstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.alloydb.InstanceArgs.builder
    com.pulumi.gcp.alloydb.Instance(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A database user in an AlloyDB cluster.
   * 
   * To get more information about User, see:
   * 
   * * [API documentation](https://cloud.google.com/alloydb/docs/reference/rest/v1/projects.locations.clusters.users/create)
   * * How-to Guides
   *     * [AlloyDB](https://cloud.google.com/alloydb/docs/)
   * 
   * &gt; **Note:**  All arguments marked as write-only values will not be stored in the state: `passwordWo`.
   * Read more about Write-only Arguments.
   */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.alloydb.UserArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.alloydb.UserArgs.builder
    com.pulumi.gcp.alloydb.User(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
