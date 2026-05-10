package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object databasemigrationservice:
  extension (builder: com.pulumi.gcp.databasemigrationservice.MigrationJobArgs.Builder)
    /**
     * @param dumpFlags The initial dump flags.
     *  Structure is documented below.
     * @return builder
     */
    def dumpFlags(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobDumpFlagsArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.MigrationJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobDumpFlagsArgs.builder
      builder.dumpFlags(args(argsBuilder).build)

    /**
     * @param objectsConfig The objects that need to be migrated. If unset, the default is to migrate
     *  all objects available on the source.
     *  Structure is documented below.
     * @return builder
     */
    def objectsConfig(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobObjectsConfigArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.MigrationJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobObjectsConfigArgs.builder
      builder.objectsConfig(args(argsBuilder).build)

    /**
     * @param performanceConfig Data dump parallelism settings used by the migration.
     *  Structure is documented below.
     * @return builder
     */
    def performanceConfig(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobPerformanceConfigArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.MigrationJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobPerformanceConfigArgs.builder
      builder.performanceConfig(args(argsBuilder).build)

    /**
     * @param reverseSshConnectivity The details of the VPC network that the source database is located in.
     *  Structure is documented below.
     * @return builder
     */
    def reverseSshConnectivity(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobReverseSshConnectivityArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.MigrationJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobReverseSshConnectivityArgs.builder
      builder.reverseSshConnectivity(args(argsBuilder).build)

    /**
     * @param staticIpConnectivity If set to an empty object (`{}`), the source database will allow incoming
     *  connections from the public IP of the destination database.
     *  You can retrieve the public IP of the Cloud SQL instance from the
     *  Cloud SQL console or using Cloud SQL APIs.
     * @return builder
     */
    def staticIpConnectivity(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobStaticIpConnectivityArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.MigrationJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobStaticIpConnectivityArgs.builder
      builder.staticIpConnectivity(args(argsBuilder).build)

    /**
     * @param vpcPeeringConnectivity The details of the VPC network that the source database is located in.
     *  Structure is documented below.
     * @return builder
     */
    def vpcPeeringConnectivity(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobVpcPeeringConnectivityArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.MigrationJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobVpcPeeringConnectivityArgs.builder
      builder.vpcPeeringConnectivity(args(argsBuilder).build)

  /**
   * A migration job definition.
   * 
   *  To get more information about MigrationJob, see:
   * 
   *  * [API documentation](https://cloud.google.com/database-migration/docs/reference/rest/v1/projects.locations.migrationJobs/create)
   *  * How-to Guides
   *      * [Database Migration](https://cloud.google.com/database-migration/docs/)
   */
  def MigrationJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.databasemigrationservice.MigrationJobArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.databasemigrationservice.MigrationJobArgs.builder
    com.pulumi.gcp.databasemigrationservice.MigrationJob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.databasemigrationservice.ConnectionProfileArgs.Builder)
    /**
     * @param alloydb Specifies required connection parameters, and the parameters required to create an AlloyDB destination cluster.
     *  Structure is documented below.
     * @return builder
     */
    def alloydb(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileAlloydbArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.ConnectionProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileAlloydbArgs.builder
      builder.alloydb(args(argsBuilder).build)

    /**
     * @param cloudsql Specifies required connection parameters, and, optionally, the parameters required to create a Cloud SQL destination database instance.
     *  Structure is documented below.
     * @return builder
     */
    def cloudsql(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileCloudsqlArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.ConnectionProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileCloudsqlArgs.builder
      builder.cloudsql(args(argsBuilder).build)

    /**
     * @param mysql Specifies connection parameters required specifically for MySQL databases.
     *  Structure is documented below.
     * @return builder
     */
    def mysql(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileMysqlArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.ConnectionProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileMysqlArgs.builder
      builder.mysql(args(argsBuilder).build)

    /**
     * @param oracle Specifies connection parameters required specifically for Oracle databases.
     *  Structure is documented below.
     * @return builder
     */
    def oracle(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileOracleArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.ConnectionProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileOracleArgs.builder
      builder.oracle(args(argsBuilder).build)

    /**
     * @param postgresql Specifies connection parameters required specifically for PostgreSQL databases.
     *  Structure is documented below.
     * @return builder
     */
    def postgresql(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfilePostgresqlArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.ConnectionProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfilePostgresqlArgs.builder
      builder.postgresql(args(argsBuilder).build)

  /**
   * A connection profile definition.
   * 
   *  To get more information about ConnectionProfile, see:
   * 
   *  * [API documentation](https://cloud.google.com/database-migration/docs/reference/rest/v1/projects.locations.connectionProfiles/create)
   *  * How-to Guides
   *      * [Database Migration](https://cloud.google.com/database-migration/docs/)
   */
  def ConnectionProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.databasemigrationservice.ConnectionProfileArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.databasemigrationservice.ConnectionProfileArgs.builder
    com.pulumi.gcp.databasemigrationservice.ConnectionProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.databasemigrationservice.PrivateConnectionArgs.Builder)
    /**
     * @param vpcPeeringConfig The VPC Peering configuration is used to create VPC peering
     *  between databasemigrationservice and the consumer&#39;s VPC.
     *  Structure is documented below.
     * @return builder
     */
    def vpcPeeringConfig(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.PrivateConnectionVpcPeeringConfigArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.PrivateConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.PrivateConnectionVpcPeeringConfigArgs.builder
      builder.vpcPeeringConfig(args(argsBuilder).build)

  /**
   * The PrivateConnection resource is used to establish private connectivity between Database Migration Service and a customer&#39;s network.
   * 
   *  To get more information about PrivateConnection, see:
   * 
   *  * [API documentation](https://cloud.google.com/database-migration/docs/reference/rest/v1/projects.locations.privateConnections)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/database-migration/docs/oracle-to-postgresql/create-private-connectivity-configuration)
   */
  def PrivateConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.databasemigrationservice.PrivateConnectionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.databasemigrationservice.PrivateConnectionArgs.builder
    com.pulumi.gcp.databasemigrationservice.PrivateConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobObjectsConfigSourceObjectsConfigObjectConfigArgs.Builder)
    /**
     * @param objectIdentifier The identifier of the migration job object.
     *  Structure is documented below.
     * @return builder
     */
    def objectIdentifier(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobObjectsConfigSourceObjectsConfigObjectConfigObjectIdentifierArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobObjectsConfigSourceObjectsConfigObjectConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobObjectsConfigSourceObjectsConfigObjectConfigObjectIdentifierArgs.builder
      builder.objectIdentifier(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileCloudsqlArgs.Builder)
    /**
     * @param settings Immutable. Metadata used to create the destination Cloud SQL database.
     *  Structure is documented below.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileCloudsqlSettingsArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileCloudsqlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileCloudsqlSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobState.Builder)
    /**
     * @param dumpFlags The initial dump flags.
     *  Structure is documented below.
     * @return builder
     */
    def dumpFlags(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobDumpFlagsArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobState.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobDumpFlagsArgs.builder
      builder.dumpFlags(args(argsBuilder).build)

    /**
     * @param errors Output only. The error details in case of state FAILED.
     *  Structure is documented below.
     * @return builder
     */
    def errors(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobErrorArgs.Builder]*):
        com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobState.Builder =
      def argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

    /**
     * @param objectsConfig The objects that need to be migrated. If unset, the default is to migrate
     *  all objects available on the source.
     *  Structure is documented below.
     * @return builder
     */
    def objectsConfig(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobObjectsConfigArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobState.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobObjectsConfigArgs.builder
      builder.objectsConfig(args(argsBuilder).build)

    /**
     * @param performanceConfig Data dump parallelism settings used by the migration.
     *  Structure is documented below.
     * @return builder
     */
    def performanceConfig(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobPerformanceConfigArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobState.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobPerformanceConfigArgs.builder
      builder.performanceConfig(args(argsBuilder).build)

    /**
     * @param reverseSshConnectivity The details of the VPC network that the source database is located in.
     *  Structure is documented below.
     * @return builder
     */
    def reverseSshConnectivity(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobReverseSshConnectivityArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobState.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobReverseSshConnectivityArgs.builder
      builder.reverseSshConnectivity(args(argsBuilder).build)

    /**
     * @param staticIpConnectivity If set to an empty object (`{}`), the source database will allow incoming
     *  connections from the public IP of the destination database.
     *  You can retrieve the public IP of the Cloud SQL instance from the
     *  Cloud SQL console or using Cloud SQL APIs.
     * @return builder
     */
    def staticIpConnectivity(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobStaticIpConnectivityArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobState.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobStaticIpConnectivityArgs.builder
      builder.staticIpConnectivity(args(argsBuilder).build)

    /**
     * @param vpcPeeringConnectivity The details of the VPC network that the source database is located in.
     *  Structure is documented below.
     * @return builder
     */
    def vpcPeeringConnectivity(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobVpcPeeringConnectivityArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobState.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobVpcPeeringConnectivityArgs.builder
      builder.vpcPeeringConnectivity(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileState.Builder)
    /**
     * @param alloydb Specifies required connection parameters, and the parameters required to create an AlloyDB destination cluster.
     *  Structure is documented below.
     * @return builder
     */
    def alloydb(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileAlloydbArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileAlloydbArgs.builder
      builder.alloydb(args(argsBuilder).build)

    /**
     * @param cloudsql Specifies required connection parameters, and, optionally, the parameters required to create a Cloud SQL destination database instance.
     *  Structure is documented below.
     * @return builder
     */
    def cloudsql(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileCloudsqlArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileCloudsqlArgs.builder
      builder.cloudsql(args(argsBuilder).build)

    /**
     * @param errors Output only. The error details in case of state FAILED.
     *  Structure is documented below.
     * @return builder
     */
    def errors(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileErrorArgs.Builder]*):
        com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileState.Builder =
      def argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

    /**
     * @param mysql Specifies connection parameters required specifically for MySQL databases.
     *  Structure is documented below.
     * @return builder
     */
    def mysql(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileMysqlArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileMysqlArgs.builder
      builder.mysql(args(argsBuilder).build)

    /**
     * @param oracle Specifies connection parameters required specifically for Oracle databases.
     *  Structure is documented below.
     * @return builder
     */
    def oracle(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileOracleArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileOracleArgs.builder
      builder.oracle(args(argsBuilder).build)

    /**
     * @param postgresql Specifies connection parameters required specifically for PostgreSQL databases.
     *  Structure is documented below.
     * @return builder
     */
    def postgresql(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfilePostgresqlArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfilePostgresqlArgs.builder
      builder.postgresql(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileMysqlArgs.Builder)
    /**
     * @param ssl SSL configuration for the destination to connect to the source database.
     *  Structure is documented below.
     * @return builder
     */
    def ssl(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileMysqlSslArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileMysqlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileMysqlSslArgs.builder
      builder.ssl(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileCloudsqlSettingsIpConfigArgs.Builder)
    /**
     * @param authorizedNetworks The list of external networks that are allowed to connect to the instance using the IP.
     *  Structure is documented below.
     * @return builder
     */
    def authorizedNetworks(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetworkArgs.Builder]*):
        com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileCloudsqlSettingsIpConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetworkArgs.builder
      builder.authorizedNetworks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileAlloydbArgs.Builder)
    /**
     * @param settings Immutable. Metadata used to create the destination AlloyDB cluster.
     *  Structure is documented below.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileAlloydbSettingsArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileAlloydbArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileAlloydbSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileAlloydbSettingsArgs.Builder)
    /**
     * @param initialUser Required. Input only. Initial user to setup during cluster creation.
     *  Structure is documented below.
     * @return builder
     */
    def initialUser(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileAlloydbSettingsInitialUserArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileAlloydbSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileAlloydbSettingsInitialUserArgs.builder
      builder.initialUser(args(argsBuilder).build)

    /**
     * @param primaryInstanceSettings Settings for the cluster&#39;s primary instance
     *  Structure is documented below.
     * @return builder
     */
    def primaryInstanceSettings(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileAlloydbSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsArgs.builder
      builder.primaryInstanceSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsArgs.Builder)
    /**
     * @param machineConfig Configuration for the machines that host the underlying database engine.
     *  Structure is documented below.
     * @return builder
     */
    def machineConfig(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsMachineConfigArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsMachineConfigArgs.builder
      builder.machineConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobObjectsConfigArgs.Builder)
    /**
     * @param sourceObjectsConfig Configuration for the source objects to be migrated.
     *  Structure is documented below.
     * @return builder
     */
    def sourceObjectsConfig(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobObjectsConfigSourceObjectsConfigArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobObjectsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobObjectsConfigSourceObjectsConfigArgs.builder
      builder.sourceObjectsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileOracleArgs.Builder)
    /**
     * @param forwardSshConnectivity SSL configuration for the destination to connect to the source database.
     *  Structure is documented below.
     * @return builder
     */
    def forwardSshConnectivity(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileOracleForwardSshConnectivityArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileOracleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileOracleForwardSshConnectivityArgs.builder
      builder.forwardSshConnectivity(args(argsBuilder).build)

    /**
     * @param privateConnectivity Configuration for using a private network to communicate with the source database
     *  Structure is documented below.
     * @return builder
     */
    def privateConnectivity(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileOraclePrivateConnectivityArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileOracleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileOraclePrivateConnectivityArgs.builder
      builder.privateConnectivity(args(argsBuilder).build)

    /**
     * @param ssl SSL configuration for the destination to connect to the source database.
     *  Structure is documented below.
     * @return builder
     */
    def ssl(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileOracleSslArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileOracleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileOracleSslArgs.builder
      builder.ssl(args(argsBuilder).build)

    /**
     * @param staticServiceIpConnectivity This object has no nested fields.
     *  Static IP address connectivity configured on service project.
     * @return builder
     */
    def staticServiceIpConnectivity(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileOracleStaticServiceIpConnectivityArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileOracleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileOracleStaticServiceIpConnectivityArgs.builder
      builder.staticServiceIpConnectivity(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobDumpFlagsArgs.Builder)
    /**
     * @param dumpFlags A list of dump flags
     *  Structure is documented below.
     * @return builder
     */
    def dumpFlags(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobDumpFlagsDumpFlagArgs.Builder]*):
        com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobDumpFlagsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobDumpFlagsDumpFlagArgs.builder
      builder.dumpFlags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileCloudsqlSettingsArgs.Builder)
    /**
     * @param ipConfig The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled.
     *  Structure is documented below.
     * @return builder
     */
    def ipConfig(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileCloudsqlSettingsIpConfigArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileCloudsqlSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileCloudsqlSettingsIpConfigArgs.builder
      builder.ipConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfilePostgresqlArgs.Builder)
    /**
     * @param ssl SSL configuration for the destination to connect to the source database.
     *  Structure is documented below.
     * @return builder
     */
    def ssl(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfilePostgresqlSslArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfilePostgresqlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfilePostgresqlSslArgs.builder
      builder.ssl(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.databasemigrationservice.inputs.PrivateConnectionState.Builder)
    /**
     * @param errors The PrivateConnection error in case of failure.
     *  Structure is documented below.
     * @return builder
     */
    def errors(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.PrivateConnectionErrorArgs.Builder]*):
        com.pulumi.gcp.databasemigrationservice.inputs.PrivateConnectionState.Builder =
      def argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.PrivateConnectionErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

    /**
     * @param vpcPeeringConfig The VPC Peering configuration is used to create VPC peering
     *  between databasemigrationservice and the consumer&#39;s VPC.
     *  Structure is documented below.
     * @return builder
     */
    def vpcPeeringConfig(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.PrivateConnectionVpcPeeringConfigArgs.Builder]):
        com.pulumi.gcp.databasemigrationservice.inputs.PrivateConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.PrivateConnectionVpcPeeringConfigArgs.builder
      builder.vpcPeeringConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobObjectsConfigSourceObjectsConfigArgs.Builder)
    /**
     * @param objectConfigs The list of objects to migrate. Should only be set when
     *  `objectsSelectionType` is `SPECIFIED_OBJECTS`.
     *  Structure is documented below.
     * @return builder
     */
    def objectConfigs(args: Endofunction[com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobObjectsConfigSourceObjectsConfigObjectConfigArgs.Builder]*):
        com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobObjectsConfigSourceObjectsConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.databasemigrationservice.inputs.MigrationJobObjectsConfigSourceObjectsConfigObjectConfigArgs.builder
      builder.objectConfigs(args.map(_(argsBuilder).build)*)
