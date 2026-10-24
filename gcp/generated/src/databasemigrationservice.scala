package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object databasemigrationservice:
  /**
   * A connection profile definition.
   * 
   * To get more information about ConnectionProfile, see:
   * 
   * * [API documentation](https://cloud.google.com/database-migration/docs/reference/rest/v1/projects.locations.connectionProfiles/create)
   * * How-to Guides
   *     * [Database Migration](https://cloud.google.com/database-migration/docs/)
   */
  def ConnectionProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.databasemigrationservice.ConnectionProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.databasemigrationservice.ConnectionProfileArgs.builder
    com.pulumi.gcp.databasemigrationservice.ConnectionProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A migration job definition.
   * 
   * To get more information about MigrationJob, see:
   * 
   * * [API documentation](https://cloud.google.com/database-migration/docs/reference/rest/v1/projects.locations.migrationJobs/create)
   * * How-to Guides
   *     * [Database Migration](https://cloud.google.com/database-migration/docs/)
   */
  def MigrationJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.databasemigrationservice.MigrationJobArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.databasemigrationservice.MigrationJobArgs.builder
    com.pulumi.gcp.databasemigrationservice.MigrationJob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * The PrivateConnection resource is used to establish private connectivity between Database Migration Service and a customer&#39;s network.
   * 
   * To get more information about PrivateConnection, see:
   * 
   * * [API documentation](https://cloud.google.com/database-migration/docs/reference/rest/v1/projects.locations.privateConnections)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/database-migration/docs/oracle-to-postgresql/create-private-connectivity-configuration)
   */
  def PrivateConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.databasemigrationservice.PrivateConnectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.databasemigrationservice.PrivateConnectionArgs.builder
    com.pulumi.gcp.databasemigrationservice.PrivateConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
