package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object datastream:
  extension (builder: com.pulumi.gcp.datastream.ConnectionProfileArgs.Builder)
    /**
     * @param bigqueryProfile BigQuery warehouse profile.
     * @return builder
     */
    def bigqueryProfile(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileBigqueryProfileArgs.Builder]):
        com.pulumi.gcp.datastream.ConnectionProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileBigqueryProfileArgs.builder
      builder.bigqueryProfile(args(argsBuilder).build)

    /**
     * @param forwardSshConnectivity Forward SSH tunnel connectivity.
     *  Structure is documented below.
     * @return builder
     */
    def forwardSshConnectivity(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileForwardSshConnectivityArgs.Builder]):
        com.pulumi.gcp.datastream.ConnectionProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileForwardSshConnectivityArgs.builder
      builder.forwardSshConnectivity(args(argsBuilder).build)

    /**
     * @param gcsProfile Cloud Storage bucket profile.
     *  Structure is documented below.
     * @return builder
     */
    def gcsProfile(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileGcsProfileArgs.Builder]):
        com.pulumi.gcp.datastream.ConnectionProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileGcsProfileArgs.builder
      builder.gcsProfile(args(argsBuilder).build)

    /**
     * @param mongodbProfile Configuration for connecting to a MongoDB database.
     *  Structure is documented below.
     * @return builder
     */
    def mongodbProfile(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileMongodbProfileArgs.Builder]):
        com.pulumi.gcp.datastream.ConnectionProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileMongodbProfileArgs.builder
      builder.mongodbProfile(args(argsBuilder).build)

    /**
     * @param mysqlProfile MySQL database profile.
     *  Structure is documented below.
     * @return builder
     */
    def mysqlProfile(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileMysqlProfileArgs.Builder]):
        com.pulumi.gcp.datastream.ConnectionProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileMysqlProfileArgs.builder
      builder.mysqlProfile(args(argsBuilder).build)

    /**
     * @param oracleProfile Oracle database profile.
     *  Structure is documented below.
     * @return builder
     */
    def oracleProfile(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileOracleProfileArgs.Builder]):
        com.pulumi.gcp.datastream.ConnectionProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileOracleProfileArgs.builder
      builder.oracleProfile(args(argsBuilder).build)

    /**
     * @param postgresqlProfile PostgreSQL database profile.
     *  Structure is documented below.
     * @return builder
     */
    def postgresqlProfile(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfilePostgresqlProfileArgs.Builder]):
        com.pulumi.gcp.datastream.ConnectionProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfilePostgresqlProfileArgs.builder
      builder.postgresqlProfile(args(argsBuilder).build)

    /**
     * @param privateConnectivity Private connectivity.
     *  Structure is documented below.
     * @return builder
     */
    def privateConnectivity(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfilePrivateConnectivityArgs.Builder]):
        com.pulumi.gcp.datastream.ConnectionProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfilePrivateConnectivityArgs.builder
      builder.privateConnectivity(args(argsBuilder).build)

    /**
     * @param salesforceProfile (Optional, Beta)
     *  Salesforce profile.
     *  Structure is documented below.
     * @return builder
     */
    def salesforceProfile(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileSalesforceProfileArgs.Builder]):
        com.pulumi.gcp.datastream.ConnectionProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileSalesforceProfileArgs.builder
      builder.salesforceProfile(args(argsBuilder).build)

    /**
     * @param spannerProfile (Optional, Beta)
     *  Spanner profile.
     *  Structure is documented below.
     * @return builder
     */
    def spannerProfile(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileSpannerProfileArgs.Builder]):
        com.pulumi.gcp.datastream.ConnectionProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileSpannerProfileArgs.builder
      builder.spannerProfile(args(argsBuilder).build)

    /**
     * @param sqlServerProfile SQL Server database profile.
     *  Structure is documented below.
     * @return builder
     */
    def sqlServerProfile(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileSqlServerProfileArgs.Builder]):
        com.pulumi.gcp.datastream.ConnectionProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileSqlServerProfileArgs.builder
      builder.sqlServerProfile(args(argsBuilder).build)

  /**
   * A resource representing streaming data from a source to a destination.
   * 
   *  To get more information about Stream, see:
   * 
   *  * [API documentation](https://cloud.google.com/datastream/docs/reference/rest/v1/projects.locations.streams)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/datastream/docs/create-a-stream)
   */
  def Stream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datastream.StreamArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datastream.StreamArgs.builder
    com.pulumi.gcp.datastream.Stream(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.datastream.StreamArgs.Builder)
    /**
     * @param backfillAll Backfill strategy to automatically backfill the Stream&#39;s objects. Specific objects can be excluded.
     *  Structure is documented below.
     * @return builder
     */
    def backfillAll(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllArgs.Builder]):
        com.pulumi.gcp.datastream.StreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllArgs.builder
      builder.backfillAll(args(argsBuilder).build)

    /**
     * @param backfillNone Backfill strategy to disable automatic backfill for the Stream&#39;s objects.
     * @return builder
     */
    def backfillNone(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillNoneArgs.Builder]):
        com.pulumi.gcp.datastream.StreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillNoneArgs.builder
      builder.backfillNone(args(argsBuilder).build)

    /**
     * @param destinationConfig Destination connection profile configuration.
     *  Structure is documented below.
     * @return builder
     */
    def destinationConfig(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamDestinationConfigArgs.Builder]):
        com.pulumi.gcp.datastream.StreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamDestinationConfigArgs.builder
      builder.destinationConfig(args(argsBuilder).build)

    /**
     * @param ruleSets Rule sets to apply to the stream.
     *  Structure is documented below.
     * @return builder
     */
    def ruleSets(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamRuleSetArgs.Builder]*):
        com.pulumi.gcp.datastream.StreamArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamRuleSetArgs.builder
      builder.ruleSets(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceConfig Source connection profile configuration.
     *  Structure is documented below.
     * @return builder
     */
    def sourceConfig(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigArgs.Builder]):
        com.pulumi.gcp.datastream.StreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigArgs.builder
      builder.sourceConfig(args(argsBuilder).build)

  /**
   * A set of reusable connection configurations to be used as a source or destination for a stream.
   * 
   *  To get more information about ConnectionProfile, see:
   * 
   *  * [API documentation](https://cloud.google.com/datastream/docs/reference/rest/v1/projects.locations.connectionProfiles)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/datastream/docs/create-connection-profiles)
   */
  def ConnectionProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datastream.ConnectionProfileArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datastream.ConnectionProfileArgs.builder
    com.pulumi.gcp.datastream.ConnectionProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.datastream.PrivateConnectionArgs.Builder)
    /**
     * @param pscInterfaceConfig The PSC Interface configuration is used to create PSC Interface
     *  between Datastream and the consumer&#39;s PSC.
     *  Structure is documented below.
     * @return builder
     */
    def pscInterfaceConfig(args: Endofunction[com.pulumi.gcp.datastream.inputs.PrivateConnectionPscInterfaceConfigArgs.Builder]):
        com.pulumi.gcp.datastream.PrivateConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.PrivateConnectionPscInterfaceConfigArgs.builder
      builder.pscInterfaceConfig(args(argsBuilder).build)

    /**
     * @param vpcPeeringConfig The VPC Peering configuration is used to create VPC peering
     *  between Datastream and the consumer&#39;s VPC.
     *  Structure is documented below.
     * @return builder
     */
    def vpcPeeringConfig(args: Endofunction[com.pulumi.gcp.datastream.inputs.PrivateConnectionVpcPeeringConfigArgs.Builder]):
        com.pulumi.gcp.datastream.PrivateConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.PrivateConnectionVpcPeeringConfigArgs.builder
      builder.vpcPeeringConfig(args(argsBuilder).build)

  object DatastreamFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Returns the list of IP addresses that Datastream connects from. For more information see
     *  the [official documentation](https://cloud.google.com/datastream/docs/ip-allowlists-and-regions).
     */
    inline def getStaticIps(args: Endofunction[com.pulumi.gcp.datastream.inputs.GetStaticIpsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.datastream.outputs.GetStaticIpsResult] =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.GetStaticIpsArgs.builder
      com.pulumi.gcp.datastream.DatastreamFunctions.getStaticIps(args(argsBuilder).build)

    /**
     * Returns the list of IP addresses that Datastream connects from. For more information see
     *  the [official documentation](https://cloud.google.com/datastream/docs/ip-allowlists-and-regions).
     */
    inline def getStaticIpsPlain(args: Endofunction[com.pulumi.gcp.datastream.inputs.GetStaticIpsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.datastream.outputs.GetStaticIpsResult] =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.GetStaticIpsPlainArgs.builder
      com.pulumi.gcp.datastream.DatastreamFunctions.getStaticIpsPlain(args(argsBuilder).build)

  /**
   * The PrivateConnection resource is used to establish private connectivity between Datastream and a customer&#39;s network.
   * 
   *  To get more information about PrivateConnection, see:
   * 
   *  * [API documentation](https://cloud.google.com/datastream/docs/reference/rest/v1/projects.locations.privateConnections)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/datastream/docs/create-a-private-connectivity-configuration)
   */
  def PrivateConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datastream.PrivateConnectionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datastream.PrivateConnectionArgs.builder
    com.pulumi.gcp.datastream.PrivateConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigIncludeObjectsArgs.Builder)
    /**
     * @param objects Salesforce objects in Salesforce Org.
     *  Structure is documented below.
     * @return builder
     */
    def objects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigIncludeObjectsObjectArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigIncludeObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigIncludeObjectsObjectArgs.builder
      builder.objects(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigExcludeObjectsArgs.Builder)
    /**
     * @param schemas Spanner schemas in the database
     *  Structure is documented below.
     * @return builder
     */
    def schemas(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigExcludeObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaArgs.builder
      builder.schemas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamBackfillAllPostgresqlExcludedObjectsPostgresqlSchemaPostgresqlTableArgs.Builder)
    /**
     * @param postgresqlColumns PostgreSQL columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     *  Structure is documented below.
     * @return builder
     */
    def postgresqlColumns(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllPostgresqlExcludedObjectsPostgresqlSchemaPostgresqlTablePostgresqlColumnArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllPostgresqlExcludedObjectsPostgresqlSchemaPostgresqlTableArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllPostgresqlExcludedObjectsPostgresqlSchemaPostgresqlTablePostgresqlColumnArgs.builder
      builder.postgresqlColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamBackfillAllSpannerExcludedObjectsSchemaArgs.Builder)
    /**
     * @param tables Tables in the schema.
     *  Structure is documented below.
     * @return builder
     */
    def tables(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllSpannerExcludedObjectsSchemaTableArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllSpannerExcludedObjectsSchemaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllSpannerExcludedObjectsSchemaTableArgs.builder
      builder.tables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaArgs.Builder)
    /**
     * @param oracleTables Tables in the database.
     *  Structure is documented below.
     * @return builder
     */
    def oracleTables(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableArgs.builder
      builder.oracleTables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamBackfillAllOracleExcludedObjectsOracleSchemaOracleTableArgs.Builder)
    /**
     * @param oracleColumns Oracle columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     *  Structure is documented below.
     * @return builder
     */
    def oracleColumns(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllOracleExcludedObjectsOracleSchemaOracleTableOracleColumnArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllOracleExcludedObjectsOracleSchemaOracleTableArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllOracleExcludedObjectsOracleSchemaOracleTableOracleColumnArgs.builder
      builder.oracleColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigIncludeObjectsArgs.Builder)
    /**
     * @param postgresqlSchemas PostgreSQL schemas on the server
     *  Structure is documented below.
     * @return builder
     */
    def postgresqlSchemas(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigIncludeObjectsPostgresqlSchemaArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigIncludeObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigIncludeObjectsPostgresqlSchemaArgs.builder
      builder.postgresqlSchemas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigArgs.Builder)
    /**
     * @param excludeObjects MongoDB collections to include in the stream.
     *  Structure is documented below.
     * @return builder
     */
    def excludeObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigExcludeObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigExcludeObjectsArgs.builder
      builder.excludeObjects(args(argsBuilder).build)

    /**
     * @param includeObjects MongoDB collections to include in the stream.
     *  Structure is documented below.
     * @return builder
     */
    def includeObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigIncludeObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigIncludeObjectsArgs.builder
      builder.includeObjects(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaArgs.Builder)
    /**
     * @param postgresqlTables Tables in the schema.
     *  Structure is documented below.
     * @return builder
     */
    def postgresqlTables(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaPostgresqlTableArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaPostgresqlTableArgs.builder
      builder.postgresqlTables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamBackfillAllMysqlExcludedObjectsArgs.Builder)
    /**
     * @param mysqlDatabases MySQL databases on the server
     *  Structure is documented below.
     * @return builder
     */
    def mysqlDatabases(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllMysqlExcludedObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseArgs.builder
      builder.mysqlDatabases(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.ConnectionProfilePostgresqlProfileArgs.Builder)
    /**
     * @param sslConfig SSL configuration for the PostgreSQL connection.
     *  Structure is documented below.
     * @return builder
     */
    def sslConfig(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfilePostgresqlProfileSslConfigArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.ConnectionProfilePostgresqlProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfilePostgresqlProfileSslConfigArgs.builder
      builder.sslConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamBackfillAllPostgresqlExcludedObjectsArgs.Builder)
    /**
     * @param postgresqlSchemas PostgreSQL schemas on the server
     *  Structure is documented below.
     * @return builder
     */
    def postgresqlSchemas(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllPostgresqlExcludedObjectsPostgresqlSchemaArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllPostgresqlExcludedObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllPostgresqlExcludedObjectsPostgresqlSchemaArgs.builder
      builder.postgresqlSchemas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigExcludeObjectsArgs.Builder)
    /**
     * @param mysqlDatabases MySQL databases on the server
     *  Structure is documented below.
     * @return builder
     */
    def mysqlDatabases(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigExcludeObjectsMysqlDatabaseArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigExcludeObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigExcludeObjectsMysqlDatabaseArgs.builder
      builder.mysqlDatabases(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasetsArgs.Builder)
    /**
     * @param datasetTemplate Dataset template used for dynamic dataset creation.
     *  Structure is documented below.
     * @return builder
     */
    def datasetTemplate(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasetsDatasetTemplateArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasetsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasetsDatasetTemplateArgs.builder
      builder.datasetTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamBackfillAllSqlServerExcludedObjectsSchemaArgs.Builder)
    /**
     * @param tables Tables in the schema.
     *  Structure is documented below.
     * @return builder
     */
    def tables(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllSqlServerExcludedObjectsSchemaTableArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllSqlServerExcludedObjectsSchemaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllSqlServerExcludedObjectsSchemaTableArgs.builder
      builder.tables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigIncludeObjectsPostgresqlSchemaPostgresqlTableArgs.Builder)
    /**
     * @param postgresqlColumns PostgreSQL columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     *  Structure is documented below.
     * @return builder
     */
    def postgresqlColumns(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigIncludeObjectsPostgresqlSchemaPostgresqlTablePostgresqlColumnArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigIncludeObjectsPostgresqlSchemaPostgresqlTableArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigIncludeObjectsPostgresqlSchemaPostgresqlTablePostgresqlColumnArgs.builder
      builder.postgresqlColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterArgs.Builder)
    /**
     * @param sourceObjectIdentifier Specific source object identifier.
     *  Structure is documented below.
     * @return builder
     */
    def sourceObjectIdentifier(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierArgs.builder
      builder.sourceObjectIdentifier(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.ConnectionProfileState.Builder)
    /**
     * @param bigqueryProfile BigQuery warehouse profile.
     * @return builder
     */
    def bigqueryProfile(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileBigqueryProfileArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.ConnectionProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileBigqueryProfileArgs.builder
      builder.bigqueryProfile(args(argsBuilder).build)

    /**
     * @param forwardSshConnectivity Forward SSH tunnel connectivity.
     *  Structure is documented below.
     * @return builder
     */
    def forwardSshConnectivity(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileForwardSshConnectivityArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.ConnectionProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileForwardSshConnectivityArgs.builder
      builder.forwardSshConnectivity(args(argsBuilder).build)

    /**
     * @param gcsProfile Cloud Storage bucket profile.
     *  Structure is documented below.
     * @return builder
     */
    def gcsProfile(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileGcsProfileArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.ConnectionProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileGcsProfileArgs.builder
      builder.gcsProfile(args(argsBuilder).build)

    /**
     * @param mongodbProfile Configuration for connecting to a MongoDB database.
     *  Structure is documented below.
     * @return builder
     */
    def mongodbProfile(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileMongodbProfileArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.ConnectionProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileMongodbProfileArgs.builder
      builder.mongodbProfile(args(argsBuilder).build)

    /**
     * @param mysqlProfile MySQL database profile.
     *  Structure is documented below.
     * @return builder
     */
    def mysqlProfile(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileMysqlProfileArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.ConnectionProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileMysqlProfileArgs.builder
      builder.mysqlProfile(args(argsBuilder).build)

    /**
     * @param oracleProfile Oracle database profile.
     *  Structure is documented below.
     * @return builder
     */
    def oracleProfile(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileOracleProfileArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.ConnectionProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileOracleProfileArgs.builder
      builder.oracleProfile(args(argsBuilder).build)

    /**
     * @param postgresqlProfile PostgreSQL database profile.
     *  Structure is documented below.
     * @return builder
     */
    def postgresqlProfile(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfilePostgresqlProfileArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.ConnectionProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfilePostgresqlProfileArgs.builder
      builder.postgresqlProfile(args(argsBuilder).build)

    /**
     * @param privateConnectivity Private connectivity.
     *  Structure is documented below.
     * @return builder
     */
    def privateConnectivity(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfilePrivateConnectivityArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.ConnectionProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfilePrivateConnectivityArgs.builder
      builder.privateConnectivity(args(argsBuilder).build)

    /**
     * @param salesforceProfile (Optional, Beta)
     *  Salesforce profile.
     *  Structure is documented below.
     * @return builder
     */
    def salesforceProfile(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileSalesforceProfileArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.ConnectionProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileSalesforceProfileArgs.builder
      builder.salesforceProfile(args(argsBuilder).build)

    /**
     * @param spannerProfile (Optional, Beta)
     *  Spanner profile.
     *  Structure is documented below.
     * @return builder
     */
    def spannerProfile(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileSpannerProfileArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.ConnectionProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileSpannerProfileArgs.builder
      builder.spannerProfile(args(argsBuilder).build)

    /**
     * @param sqlServerProfile SQL Server database profile.
     *  Structure is documented below.
     * @return builder
     */
    def sqlServerProfile(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileSqlServerProfileArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.ConnectionProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileSqlServerProfileArgs.builder
      builder.sqlServerProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamDestinationConfigArgs.Builder)
    /**
     * @param bigqueryDestinationConfig A configuration for how data should be loaded to Google BigQuery.
     *  Structure is documented below.
     * @return builder
     */
    def bigqueryDestinationConfig(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamDestinationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigArgs.builder
      builder.bigqueryDestinationConfig(args(argsBuilder).build)

    /**
     * @param gcsDestinationConfig A configuration for how data should be loaded to Cloud Storage.
     *  Structure is documented below.
     * @return builder
     */
    def gcsDestinationConfig(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamDestinationConfigGcsDestinationConfigArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamDestinationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamDestinationConfigGcsDestinationConfigArgs.builder
      builder.gcsDestinationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigExcludeObjectsDatabaseArgs.Builder)
    /**
     * @param collections Collections in the database.
     *  Structure is documented below.
     * @return builder
     */
    def collections(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigExcludeObjectsDatabaseCollectionArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigExcludeObjectsDatabaseArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigExcludeObjectsDatabaseCollectionArgs.builder
      builder.collections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigIncludeObjectsArgs.Builder)
    /**
     * @param oracleSchemas Oracle schemas/databases in the database server
     *  Structure is documented below.
     * @return builder
     */
    def oracleSchemas(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigIncludeObjectsOracleSchemaArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigIncludeObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigIncludeObjectsOracleSchemaArgs.builder
      builder.oracleSchemas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigArgs.Builder)
    /**
     * @param excludeObjects PostgreSQL objects to exclude from the stream.
     *  Structure is documented below.
     * @return builder
     */
    def excludeObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigExcludeObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigExcludeObjectsArgs.builder
      builder.excludeObjects(args(argsBuilder).build)

    /**
     * @param includeObjects PostgreSQL objects to retrieve from the source.
     *  Structure is documented below.
     * @return builder
     */
    def includeObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigIncludeObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigIncludeObjectsArgs.builder
      builder.includeObjects(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamBackfillAllOracleExcludedObjectsArgs.Builder)
    /**
     * @param oracleSchemas Oracle schemas/databases in the database server
     *  Structure is documented below.
     * @return builder
     */
    def oracleSchemas(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllOracleExcludedObjectsOracleSchemaArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllOracleExcludedObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllOracleExcludedObjectsOracleSchemaArgs.builder
      builder.oracleSchemas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigExcludeObjectsArgs.Builder)
    /**
     * @param schemas Spanner schemas in the database
     *  Structure is documented below.
     * @return builder
     */
    def schemas(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigExcludeObjectsSchemaArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigExcludeObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigExcludeObjectsSchemaArgs.builder
      builder.schemas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.ConnectionProfileMysqlProfileArgs.Builder)
    /**
     * @param sslConfig SSL configuration for the MySQL connection.
     *  Structure is documented below.
     * @return builder
     */
    def sslConfig(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileMysqlProfileSslConfigArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.ConnectionProfileMysqlProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileMysqlProfileSslConfigArgs.builder
      builder.sslConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigIncludeObjectsObjectArgs.Builder)
    /**
     * @param fields Fields in the Salesforce object. When unspecified as part of include/exclude objects, includes/excludes everything/nothing.
     *  Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigIncludeObjectsObjectFieldArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigIncludeObjectsObjectArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigIncludeObjectsObjectFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamBackfillAllSpannerExcludedObjectsArgs.Builder)
    /**
     * @param schemas Spanner schemas in the database
     *  Structure is documented below.
     * @return builder
     */
    def schemas(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllSpannerExcludedObjectsSchemaArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllSpannerExcludedObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllSpannerExcludedObjectsSchemaArgs.builder
      builder.schemas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamBackfillAllArgs.Builder)
    /**
     * @param mongodbExcludedObjects MongoDB data source objects to avoid backfilling.
     *  Structure is documented below.
     * @return builder
     */
    def mongodbExcludedObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllMongodbExcludedObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllMongodbExcludedObjectsArgs.builder
      builder.mongodbExcludedObjects(args(argsBuilder).build)

    /**
     * @param mysqlExcludedObjects MySQL data source objects to avoid backfilling.
     *  Structure is documented below.
     * @return builder
     */
    def mysqlExcludedObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllMysqlExcludedObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllMysqlExcludedObjectsArgs.builder
      builder.mysqlExcludedObjects(args(argsBuilder).build)

    /**
     * @param oracleExcludedObjects PostgreSQL data source objects to avoid backfilling.
     *  Structure is documented below.
     * @return builder
     */
    def oracleExcludedObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllOracleExcludedObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllOracleExcludedObjectsArgs.builder
      builder.oracleExcludedObjects(args(argsBuilder).build)

    /**
     * @param postgresqlExcludedObjects PostgreSQL data source objects to avoid backfilling.
     *  Structure is documented below.
     * @return builder
     */
    def postgresqlExcludedObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllPostgresqlExcludedObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllPostgresqlExcludedObjectsArgs.builder
      builder.postgresqlExcludedObjects(args(argsBuilder).build)

    /**
     * @param salesforceExcludedObjects Salesforce objects to avoid backfilling.
     *  Structure is documented below.
     * @return builder
     */
    def salesforceExcludedObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllSalesforceExcludedObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllSalesforceExcludedObjectsArgs.builder
      builder.salesforceExcludedObjects(args(argsBuilder).build)

    /**
     * @param spannerExcludedObjects Spanner objects to avoid backfilling.
     *  Structure is documented below.
     * @return builder
     */
    def spannerExcludedObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllSpannerExcludedObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllSpannerExcludedObjectsArgs.builder
      builder.spannerExcludedObjects(args(argsBuilder).build)

    /**
     * @param sqlServerExcludedObjects SQL Server data source objects to avoid backfilling.
     *  Structure is documented below.
     * @return builder
     */
    def sqlServerExcludedObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllSqlServerExcludedObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllSqlServerExcludedObjectsArgs.builder
      builder.sqlServerExcludedObjects(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigExcludeObjectsArgs.Builder)
    /**
     * @param databases MongoDB databases in the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def databases(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigExcludeObjectsDatabaseArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigExcludeObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigExcludeObjectsDatabaseArgs.builder
      builder.databases(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamBackfillAllSpannerExcludedObjectsSchemaTableArgs.Builder)
    /**
     * @param columns Spanner columns in the table. When unspecified as part of include/exclude objects, includes/excludes everything.
     *  Structure is documented below.
     * @return builder
     */
    def columns(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllSpannerExcludedObjectsSchemaTableColumnArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllSpannerExcludedObjectsSchemaTableArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllSpannerExcludedObjectsSchemaTableColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamBackfillAllSqlServerExcludedObjectsSchemaTableArgs.Builder)
    /**
     * @param columns Spanner columns in the table. When unspecified as part of include/exclude objects, includes/excludes everything.
     *  Structure is documented below.
     * @return builder
     */
    def columns(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllSqlServerExcludedObjectsSchemaTableColumnArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllSqlServerExcludedObjectsSchemaTableArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllSqlServerExcludedObjectsSchemaTableColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigIncludeObjectsSchemaArgs.Builder)
    /**
     * @param tables Tables in the schema.
     *  Structure is documented below.
     * @return builder
     */
    def tables(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigIncludeObjectsSchemaTableArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigIncludeObjectsSchemaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigIncludeObjectsSchemaTableArgs.builder
      builder.tables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaArgs.Builder)
    /**
     * @param tables Tables in the schema.
     *  Structure is documented below.
     * @return builder
     */
    def tables(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTableArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTableArgs.builder
      builder.tables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigArgs.Builder)
    /**
     * @param binaryLogPosition CDC reader reads from binary logs replication cdc method.
     * @return builder
     */
    def binaryLogPosition(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigBinaryLogPositionArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigBinaryLogPositionArgs.builder
      builder.binaryLogPosition(args(argsBuilder).build)

    /**
     * @param excludeObjects MySQL objects to exclude from the stream.
     *  Structure is documented below.
     * @return builder
     */
    def excludeObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigExcludeObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigExcludeObjectsArgs.builder
      builder.excludeObjects(args(argsBuilder).build)

    /**
     * @param gtid CDC reader reads from gtid based replication.
     * @return builder
     */
    def gtid(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigGtidArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigGtidArgs.builder
      builder.gtid(args(argsBuilder).build)

    /**
     * @param includeObjects MySQL objects to retrieve from the source.
     *  Structure is documented below.
     * @return builder
     */
    def includeObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigIncludeObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigIncludeObjectsArgs.builder
      builder.includeObjects(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamBackfillAllMongodbExcludedObjectsArgs.Builder)
    /**
     * @param databases MongoDB databases in the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def databases(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllMongodbExcludedObjectsDatabaseArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllMongodbExcludedObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllMongodbExcludedObjectsDatabaseArgs.builder
      builder.databases(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamBackfillAllSalesforceExcludedObjectsObjectArgs.Builder)
    /**
     * @param fields Fields in the Salesforce object. When unspecified as part of include/exclude objects, includes/excludes everything/nothing.
     *  Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllSalesforceExcludedObjectsObjectFieldArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllSalesforceExcludedObjectsObjectArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllSalesforceExcludedObjectsObjectFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseArgs.Builder)
    /**
     * @param mysqlTables Tables in the database.
     *  Structure is documented below.
     * @return builder
     */
    def mysqlTables(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseMysqlTableArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseMysqlTableArgs.builder
      builder.mysqlTables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamBackfillAllSalesforceExcludedObjectsArgs.Builder)
    /**
     * @param objects Salesforce objects in Salesforce Org.
     *  Structure is documented below.
     * @return builder
     */
    def objects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllSalesforceExcludedObjectsObjectArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllSalesforceExcludedObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllSalesforceExcludedObjectsObjectArgs.builder
      builder.objects(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigExcludeObjectsDatabaseCollectionArgs.Builder)
    /**
     * @param fields Fields in the collection.
     *  Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigExcludeObjectsDatabaseCollectionFieldArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigExcludeObjectsDatabaseCollectionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigExcludeObjectsDatabaseCollectionFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigArgs.Builder)
    /**
     * @param appendOnly AppendOnly mode defines that the stream of changes (INSERT, UPDATE-INSERT, UPDATE-DELETE and DELETE
     *  events) to a source table will be written to the destination Google BigQuery table, retaining the
     *  historical state of the data.
     * @return builder
     */
    def appendOnly(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigAppendOnlyArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigAppendOnlyArgs.builder
      builder.appendOnly(args(argsBuilder).build)

    /**
     * @param blmtConfig BigLake Managed Tables configuration for BigQuery streams.
     *  Structure is documented below.
     * @return builder
     */
    def blmtConfig(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigBlmtConfigArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigBlmtConfigArgs.builder
      builder.blmtConfig(args(argsBuilder).build)

    /**
     * @param merge Merge mode defines that all changes to a table will be merged at the destination Google BigQuery
     *  table. This is the default write mode. When selected, BigQuery reflects the way the data is stored
     *  in the source database. With Merge mode, no historical record of the change events is kept.
     * @return builder
     */
    def merge(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigMergeArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigMergeArgs.builder
      builder.merge(args(argsBuilder).build)

    /**
     * @param singleTargetDataset A single target dataset to which all data will be streamed.
     *  Structure is documented below.
     * @return builder
     */
    def singleTargetDataset(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigSingleTargetDatasetArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigSingleTargetDatasetArgs.builder
      builder.singleTargetDataset(args(argsBuilder).build)

    /**
     * @param sourceHierarchyDatasets Destination datasets are created so that hierarchy of the destination data objects matches the source hierarchy.
     *  Structure is documented below.
     * @return builder
     */
    def sourceHierarchyDatasets(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasetsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasetsArgs.builder
      builder.sourceHierarchyDatasets(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigIncludeObjectsDatabaseArgs.Builder)
    /**
     * @param collections Collections in the database.
     *  Structure is documented below.
     * @return builder
     */
    def collections(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigIncludeObjectsDatabaseCollectionArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigIncludeObjectsDatabaseArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigIncludeObjectsDatabaseCollectionArgs.builder
      builder.collections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierArgs.Builder)
    /**
     * @param mongodbIdentifier A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def mongodbIdentifier(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierMongodbIdentifierArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierMongodbIdentifierArgs.builder
      builder.mongodbIdentifier(args(argsBuilder).build)

    /**
     * @param mysqlIdentifier A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def mysqlIdentifier(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierMysqlIdentifierArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierMysqlIdentifierArgs.builder
      builder.mysqlIdentifier(args(argsBuilder).build)

    /**
     * @param oracleIdentifier A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def oracleIdentifier(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierOracleIdentifierArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierOracleIdentifierArgs.builder
      builder.oracleIdentifier(args(argsBuilder).build)

    /**
     * @param postgresqlIdentifier A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def postgresqlIdentifier(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierPostgresqlIdentifierArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierPostgresqlIdentifierArgs.builder
      builder.postgresqlIdentifier(args(argsBuilder).build)

    /**
     * @param salesforceIdentifier A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def salesforceIdentifier(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierSalesforceIdentifierArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierSalesforceIdentifierArgs.builder
      builder.salesforceIdentifier(args(argsBuilder).build)

    /**
     * @param spannerIdentifier A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def spannerIdentifier(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierSpannerIdentifierArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierSpannerIdentifierArgs.builder
      builder.spannerIdentifier(args(argsBuilder).build)

    /**
     * @param sqlServerIdentifier A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def sqlServerIdentifier(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierSqlServerIdentifierArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterSourceObjectIdentifierSqlServerIdentifierArgs.builder
      builder.sqlServerIdentifier(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamBackfillAllSqlServerExcludedObjectsArgs.Builder)
    /**
     * @param schemas SQL Server schemas/databases in the database server
     *  Structure is documented below.
     * @return builder
     */
    def schemas(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllSqlServerExcludedObjectsSchemaArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllSqlServerExcludedObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllSqlServerExcludedObjectsSchemaArgs.builder
      builder.schemas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaPostgresqlTableArgs.Builder)
    /**
     * @param postgresqlColumns PostgreSQL columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     *  Structure is documented below.
     * @return builder
     */
    def postgresqlColumns(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaPostgresqlTablePostgresqlColumnArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaPostgresqlTableArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaPostgresqlTablePostgresqlColumnArgs.builder
      builder.postgresqlColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigIncludeObjectsSchemaTableArgs.Builder)
    /**
     * @param columns Spanner columns in the table. When unspecified as part of include/exclude objects, includes/excludes everything.
     *  Structure is documented below.
     * @return builder
     */
    def columns(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigIncludeObjectsSchemaTableColumnArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigIncludeObjectsSchemaTableArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigIncludeObjectsSchemaTableColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigExcludeObjectsObjectArgs.Builder)
    /**
     * @param fields Fields in the Salesforce object. When unspecified as part of include/exclude objects, includes/excludes everything/nothing.
     *  Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigExcludeObjectsObjectFieldArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigExcludeObjectsObjectArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigExcludeObjectsObjectFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.ConnectionProfileSalesforceProfileArgs.Builder)
    /**
     * @param oauth2ClientCredentials OAuth credentials to use for Salesforce authentication.
     *  Structure is documented below.
     * @return builder
     */
    def oauth2ClientCredentials(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileSalesforceProfileOauth2ClientCredentialsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.ConnectionProfileSalesforceProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileSalesforceProfileOauth2ClientCredentialsArgs.builder
      builder.oauth2ClientCredentials(args(argsBuilder).build)

    /**
     * @param userCredentials User credentials to use for Salesforce authentication.
     *  Structure is documented below.
     * @return builder
     */
    def userCredentials(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileSalesforceProfileUserCredentialsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.ConnectionProfileSalesforceProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileSalesforceProfileUserCredentialsArgs.builder
      builder.userCredentials(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigExcludeObjectsMysqlDatabaseMysqlTableArgs.Builder)
    /**
     * @param mysqlColumns MySQL columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     *  Structure is documented below.
     * @return builder
     */
    def mysqlColumns(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigExcludeObjectsMysqlDatabaseMysqlTableMysqlColumnArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigExcludeObjectsMysqlDatabaseMysqlTableArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigExcludeObjectsMysqlDatabaseMysqlTableMysqlColumnArgs.builder
      builder.mysqlColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigIncludeObjectsOracleSchemaOracleTableArgs.Builder)
    /**
     * @param oracleColumns Oracle columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     *  Structure is documented below.
     * @return builder
     */
    def oracleColumns(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigIncludeObjectsOracleSchemaOracleTableOracleColumnArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigIncludeObjectsOracleSchemaOracleTableArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigIncludeObjectsOracleSchemaOracleTableOracleColumnArgs.builder
      builder.oracleColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableArgs.Builder)
    /**
     * @param mysqlColumns MySQL columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     *  Structure is documented below.
     * @return builder
     */
    def mysqlColumns(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableMysqlColumnArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableMysqlColumnArgs.builder
      builder.mysqlColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigIncludeObjectsArgs.Builder)
    /**
     * @param databases MongoDB databases in the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def databases(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigIncludeObjectsDatabaseArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigIncludeObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigIncludeObjectsDatabaseArgs.builder
      builder.databases(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamBackfillAllMongodbExcludedObjectsDatabaseCollectionArgs.Builder)
    /**
     * @param fields Fields in the collection.
     *  Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllMongodbExcludedObjectsDatabaseCollectionFieldArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllMongodbExcludedObjectsDatabaseCollectionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllMongodbExcludedObjectsDatabaseCollectionFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigIncludeObjectsPostgresqlSchemaArgs.Builder)
    /**
     * @param postgresqlTables Tables in the schema.
     *  Structure is documented below.
     * @return builder
     */
    def postgresqlTables(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigIncludeObjectsPostgresqlSchemaPostgresqlTableArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigIncludeObjectsPostgresqlSchemaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigIncludeObjectsPostgresqlSchemaPostgresqlTableArgs.builder
      builder.postgresqlTables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigExcludeObjectsSchemaTableArgs.Builder)
    /**
     * @param columns Spanner columns in the table. When unspecified as part of include/exclude objects, includes/excludes everything.
     *  Structure is documented below.
     * @return builder
     */
    def columns(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigExcludeObjectsSchemaTableColumnArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigExcludeObjectsSchemaTableArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigExcludeObjectsSchemaTableColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamRuleSetArgs.Builder)
    /**
     * @param customizationRules List of customization rules to apply.
     *  Structure is documented below.
     * @return builder
     */
    def customizationRules(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamRuleSetCustomizationRuleArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamRuleSetCustomizationRuleArgs.builder
      builder.customizationRules(args.map(_(argsBuilder).build)*)

    /**
     * @param objectFilter Object filter to apply the customization rules to.
     *  Structure is documented below.
     * @return builder
     */
    def objectFilter(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamRuleSetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamRuleSetObjectFilterArgs.builder
      builder.objectFilter(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigArgs.Builder)
    /**
     * @param excludeObjects Spanner objects to retrieve from the source.
     *  Structure is documented below.
     * @return builder
     */
    def excludeObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigExcludeObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigExcludeObjectsArgs.builder
      builder.excludeObjects(args(argsBuilder).build)

    /**
     * @param includeObjects Spanner objects to retrieve from the source.
     *  Structure is documented below.
     * @return builder
     */
    def includeObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigIncludeObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigIncludeObjectsArgs.builder
      builder.includeObjects(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamBackfillAllPostgresqlExcludedObjectsPostgresqlSchemaArgs.Builder)
    /**
     * @param postgresqlTables Tables in the schema.
     *  Structure is documented below.
     * @return builder
     */
    def postgresqlTables(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllPostgresqlExcludedObjectsPostgresqlSchemaPostgresqlTableArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllPostgresqlExcludedObjectsPostgresqlSchemaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllPostgresqlExcludedObjectsPostgresqlSchemaPostgresqlTableArgs.builder
      builder.postgresqlTables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamState.Builder)
    /**
     * @param backfillAll Backfill strategy to automatically backfill the Stream&#39;s objects. Specific objects can be excluded.
     *  Structure is documented below.
     * @return builder
     */
    def backfillAll(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamState.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllArgs.builder
      builder.backfillAll(args(argsBuilder).build)

    /**
     * @param backfillNone Backfill strategy to disable automatic backfill for the Stream&#39;s objects.
     * @return builder
     */
    def backfillNone(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillNoneArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamState.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillNoneArgs.builder
      builder.backfillNone(args(argsBuilder).build)

    /**
     * @param destinationConfig Destination connection profile configuration.
     *  Structure is documented below.
     * @return builder
     */
    def destinationConfig(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamDestinationConfigArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamState.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamDestinationConfigArgs.builder
      builder.destinationConfig(args(argsBuilder).build)

    /**
     * @param ruleSets Rule sets to apply to the stream.
     *  Structure is documented below.
     * @return builder
     */
    def ruleSets(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamRuleSetArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamState.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamRuleSetArgs.builder
      builder.ruleSets(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceConfig Source connection profile configuration.
     *  Structure is documented below.
     * @return builder
     */
    def sourceConfig(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamState.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigArgs.builder
      builder.sourceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigIncludeObjectsDatabaseCollectionArgs.Builder)
    /**
     * @param fields Fields in the collection.
     *  Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigIncludeObjectsDatabaseCollectionFieldArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigIncludeObjectsDatabaseCollectionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigIncludeObjectsDatabaseCollectionFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigArgs.Builder)
    /**
     * @param changeTables CDC reader reads from change tables.
     * @return builder
     */
    def changeTables(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigChangeTablesArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigChangeTablesArgs.builder
      builder.changeTables(args(argsBuilder).build)

    /**
     * @param excludeObjects SQL Server objects to exclude from the stream.
     *  Structure is documented below.
     * @return builder
     */
    def excludeObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigExcludeObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigExcludeObjectsArgs.builder
      builder.excludeObjects(args(argsBuilder).build)

    /**
     * @param includeObjects SQL Server objects to retrieve from the source.
     *  Structure is documented below.
     * @return builder
     */
    def includeObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigIncludeObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigIncludeObjectsArgs.builder
      builder.includeObjects(args(argsBuilder).build)

    /**
     * @param transactionLogs CDC reader reads from transaction logs.
     * @return builder
     */
    def transactionLogs(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigTransactionLogsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigTransactionLogsArgs.builder
      builder.transactionLogs(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigArgs.Builder)
    /**
     * @param excludeObjects Salesforce objects to exclude from the stream.
     *  Structure is documented below.
     * @return builder
     */
    def excludeObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigExcludeObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigExcludeObjectsArgs.builder
      builder.excludeObjects(args(argsBuilder).build)

    /**
     * @param includeObjects Salesforce objects to retrieve from the source.
     *  Structure is documented below.
     * @return builder
     */
    def includeObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigIncludeObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigIncludeObjectsArgs.builder
      builder.includeObjects(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamRuleSetCustomizationRuleArgs.Builder)
    /**
     * @param bigqueryClustering BigQuery clustering rule.
     *  Structure is documented below.
     * @return builder
     */
    def bigqueryClustering(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamRuleSetCustomizationRuleBigqueryClusteringArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamRuleSetCustomizationRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamRuleSetCustomizationRuleBigqueryClusteringArgs.builder
      builder.bigqueryClustering(args(argsBuilder).build)

    /**
     * @param bigqueryPartitioning BigQuery partitioning rule.
     *  Structure is documented below.
     * @return builder
     */
    def bigqueryPartitioning(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamRuleSetCustomizationRuleBigqueryPartitioningArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamRuleSetCustomizationRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamRuleSetCustomizationRuleBigqueryPartitioningArgs.builder
      builder.bigqueryPartitioning(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTableArgs.Builder)
    /**
     * @param columns Spanner columns in the table. When unspecified as part of include/exclude objects, includes/excludes everything.
     *  Structure is documented below.
     * @return builder
     */
    def columns(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTableColumnArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTableArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTableColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseMysqlTableArgs.Builder)
    /**
     * @param mysqlColumns MySQL columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     *  Structure is documented below.
     * @return builder
     */
    def mysqlColumns(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseMysqlTableMysqlColumnArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseMysqlTableArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseMysqlTableMysqlColumnArgs.builder
      builder.mysqlColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableArgs.Builder)
    /**
     * @param oracleColumns Oracle columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     *  Structure is documented below.
     * @return builder
     */
    def oracleColumns(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableOracleColumnArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableOracleColumnArgs.builder
      builder.oracleColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.ConnectionProfilePostgresqlProfileSslConfigArgs.Builder)
    /**
     * @param serverAndClientVerification If this field is set, the communication will be encrypted with TLS encryption
     *  and both the server identity and the client identity will be authenticated.
     *  Structure is documented below.
     * @return builder
     */
    def serverAndClientVerification(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfilePostgresqlProfileSslConfigServerAndClientVerificationArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.ConnectionProfilePostgresqlProfileSslConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfilePostgresqlProfileSslConfigServerAndClientVerificationArgs.builder
      builder.serverAndClientVerification(args(argsBuilder).build)

    /**
     * @param serverVerification If this field is set, the communication will be encrypted with TLS encryption
     *  and the server identity will be authenticated.
     *  Structure is documented below.
     * @return builder
     */
    def serverVerification(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfilePostgresqlProfileSslConfigServerVerificationArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.ConnectionProfilePostgresqlProfileSslConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfilePostgresqlProfileSslConfigServerVerificationArgs.builder
      builder.serverVerification(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigArgs.Builder)
    /**
     * @param dropLargeObjects Configuration to drop large object values.
     * @return builder
     */
    def dropLargeObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigDropLargeObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigDropLargeObjectsArgs.builder
      builder.dropLargeObjects(args(argsBuilder).build)

    /**
     * @param excludeObjects Oracle objects to exclude from the stream.
     *  Structure is documented below.
     * @return builder
     */
    def excludeObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsArgs.builder
      builder.excludeObjects(args(argsBuilder).build)

    /**
     * @param includeObjects Oracle objects to retrieve from the source.
     *  Structure is documented below.
     * @return builder
     */
    def includeObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigIncludeObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigIncludeObjectsArgs.builder
      builder.includeObjects(args(argsBuilder).build)

    /**
     * @param streamLargeObjects Configuration to drop large object values.
     * @return builder
     */
    def streamLargeObjects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigStreamLargeObjectsArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigStreamLargeObjectsArgs.builder
      builder.streamLargeObjects(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigExcludeObjectsArgs.Builder)
    /**
     * @param objects Salesforce objects in data source.
     *  Structure is documented below.
     * @return builder
     */
    def objects(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigExcludeObjectsObjectArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigExcludeObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigExcludeObjectsObjectArgs.builder
      builder.objects(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigIncludeObjectsArgs.Builder)
    /**
     * @param schemas Spanner schemas in the database
     *  Structure is documented below.
     * @return builder
     */
    def schemas(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigIncludeObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaArgs.builder
      builder.schemas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigExcludeObjectsArgs.Builder)
    /**
     * @param postgresqlSchemas PostgreSQL schemas on the server
     *  Structure is documented below.
     * @return builder
     */
    def postgresqlSchemas(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigExcludeObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaArgs.builder
      builder.postgresqlSchemas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigExcludeObjectsMysqlDatabaseArgs.Builder)
    /**
     * @param mysqlTables Tables in the database.
     *  Structure is documented below.
     * @return builder
     */
    def mysqlTables(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigExcludeObjectsMysqlDatabaseMysqlTableArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigExcludeObjectsMysqlDatabaseArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigExcludeObjectsMysqlDatabaseMysqlTableArgs.builder
      builder.mysqlTables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.ConnectionProfileMongodbProfileArgs.Builder)
    /**
     * @param hostAddresses List of host addresses for a MongoDB cluster.
     *  Structure is documented below.
     * @return builder
     */
    def hostAddresses(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileMongodbProfileHostAddressArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.ConnectionProfileMongodbProfileArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileMongodbProfileHostAddressArgs.builder
      builder.hostAddresses(args.map(_(argsBuilder).build)*)

    /**
     * @param srvConnectionFormat Srv connection format. Mutually exclusive with
     *  standard_connection_Format.
     * @return builder
     */
    def srvConnectionFormat(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileMongodbProfileSrvConnectionFormatArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.ConnectionProfileMongodbProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileMongodbProfileSrvConnectionFormatArgs.builder
      builder.srvConnectionFormat(args(argsBuilder).build)

    /**
     * @param sslConfig SSL configuration for the MongoDB connection.
     *  Structure is documented below.
     * @return builder
     */
    def sslConfig(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileMongodbProfileSslConfigArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.ConnectionProfileMongodbProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileMongodbProfileSslConfigArgs.builder
      builder.sslConfig(args(argsBuilder).build)

    /**
     * @param standardConnectionFormat Standard connection format. Mutually exclusive with
     *  srv_connection_format.
     *  Structure is documented below.
     * @return builder
     */
    def standardConnectionFormat(args: Endofunction[com.pulumi.gcp.datastream.inputs.ConnectionProfileMongodbProfileStandardConnectionFormatArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.ConnectionProfileMongodbProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.ConnectionProfileMongodbProfileStandardConnectionFormatArgs.builder
      builder.standardConnectionFormat(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.PrivateConnectionState.Builder)
    /**
     * @param errors The PrivateConnection error in case of failure.
     *  Structure is documented below.
     * @return builder
     */
    def errors(args: Endofunction[com.pulumi.gcp.datastream.inputs.PrivateConnectionErrorArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.PrivateConnectionState.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.PrivateConnectionErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

    /**
     * @param pscInterfaceConfig The PSC Interface configuration is used to create PSC Interface
     *  between Datastream and the consumer&#39;s PSC.
     *  Structure is documented below.
     * @return builder
     */
    def pscInterfaceConfig(args: Endofunction[com.pulumi.gcp.datastream.inputs.PrivateConnectionPscInterfaceConfigArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.PrivateConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.PrivateConnectionPscInterfaceConfigArgs.builder
      builder.pscInterfaceConfig(args(argsBuilder).build)

    /**
     * @param vpcPeeringConfig The VPC Peering configuration is used to create VPC peering
     *  between Datastream and the consumer&#39;s VPC.
     *  Structure is documented below.
     * @return builder
     */
    def vpcPeeringConfig(args: Endofunction[com.pulumi.gcp.datastream.inputs.PrivateConnectionVpcPeeringConfigArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.PrivateConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.PrivateConnectionVpcPeeringConfigArgs.builder
      builder.vpcPeeringConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseArgs.Builder)
    /**
     * @param mysqlTables Tables in the database.
     *  Structure is documented below.
     * @return builder
     */
    def mysqlTables(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableArgs.builder
      builder.mysqlTables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamDestinationConfigGcsDestinationConfigArgs.Builder)
    /**
     * @param avroFileFormat AVRO file format configuration.
     * @return builder
     */
    def avroFileFormat(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamDestinationConfigGcsDestinationConfigAvroFileFormatArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamDestinationConfigGcsDestinationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamDestinationConfigGcsDestinationConfigAvroFileFormatArgs.builder
      builder.avroFileFormat(args(argsBuilder).build)

    /**
     * @param jsonFileFormat JSON file format configuration.
     *  Structure is documented below.
     * @return builder
     */
    def jsonFileFormat(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamDestinationConfigGcsDestinationConfigJsonFileFormatArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamDestinationConfigGcsDestinationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamDestinationConfigGcsDestinationConfigJsonFileFormatArgs.builder
      builder.jsonFileFormat(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTableArgs.Builder)
    /**
     * @param columns Spanner columns in the table. When unspecified as part of include/exclude objects, includes/excludes everything.
     *  Structure is documented below.
     * @return builder
     */
    def columns(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTableColumnArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTableArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTableColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigIncludeObjectsArgs.Builder)
    /**
     * @param mysqlDatabases MySQL databases on the server
     *  Structure is documented below.
     * @return builder
     */
    def mysqlDatabases(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigIncludeObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseArgs.builder
      builder.mysqlDatabases(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamBackfillAllOracleExcludedObjectsOracleSchemaArgs.Builder)
    /**
     * @param oracleTables Tables in the database.
     *  Structure is documented below.
     * @return builder
     */
    def oracleTables(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllOracleExcludedObjectsOracleSchemaOracleTableArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllOracleExcludedObjectsOracleSchemaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllOracleExcludedObjectsOracleSchemaOracleTableArgs.builder
      builder.oracleTables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigExcludeObjectsSchemaArgs.Builder)
    /**
     * @param tables Tables in the schema.
     *  Structure is documented below.
     * @return builder
     */
    def tables(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigExcludeObjectsSchemaTableArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigExcludeObjectsSchemaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigExcludeObjectsSchemaTableArgs.builder
      builder.tables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigArgs.Builder)
    /**
     * @param mongodbSourceConfig MongoDB source configuration.
     *  Structure is documented below.
     * @return builder
     */
    def mongodbSourceConfig(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigMongodbSourceConfigArgs.builder
      builder.mongodbSourceConfig(args(argsBuilder).build)

    /**
     * @param mysqlSourceConfig MySQL data source configuration.
     *  Structure is documented below.
     * @return builder
     */
    def mysqlSourceConfig(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigArgs.builder
      builder.mysqlSourceConfig(args(argsBuilder).build)

    /**
     * @param oracleSourceConfig MySQL data source configuration.
     *  Structure is documented below.
     * @return builder
     */
    def oracleSourceConfig(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigArgs.builder
      builder.oracleSourceConfig(args(argsBuilder).build)

    /**
     * @param postgresqlSourceConfig PostgreSQL data source configuration.
     *  Structure is documented below.
     * @return builder
     */
    def postgresqlSourceConfig(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigArgs.builder
      builder.postgresqlSourceConfig(args(argsBuilder).build)

    /**
     * @param salesforceSourceConfig Salesforce data source configuration.
     *  Structure is documented below.
     * @return builder
     */
    def salesforceSourceConfig(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSalesforceSourceConfigArgs.builder
      builder.salesforceSourceConfig(args(argsBuilder).build)

    /**
     * @param spannerSourceConfig Spanner data source configuration.
     *  Structure is documented below.
     * @return builder
     */
    def spannerSourceConfig(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigArgs.builder
      builder.spannerSourceConfig(args(argsBuilder).build)

    /**
     * @param sqlServerSourceConfig SQL Server data source configuration.
     *  Structure is documented below.
     * @return builder
     */
    def sqlServerSourceConfig(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigArgs.builder
      builder.sqlServerSourceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigIncludeObjectsOracleSchemaArgs.Builder)
    /**
     * @param oracleTables Tables in the database.
     *  Structure is documented below.
     * @return builder
     */
    def oracleTables(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigIncludeObjectsOracleSchemaOracleTableArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigIncludeObjectsOracleSchemaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigIncludeObjectsOracleSchemaOracleTableArgs.builder
      builder.oracleTables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamBackfillAllMongodbExcludedObjectsDatabaseArgs.Builder)
    /**
     * @param collections Collections in the database.
     *  Structure is documented below.
     * @return builder
     */
    def collections(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamBackfillAllMongodbExcludedObjectsDatabaseCollectionArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamBackfillAllMongodbExcludedObjectsDatabaseArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamBackfillAllMongodbExcludedObjectsDatabaseCollectionArgs.builder
      builder.collections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaArgs.Builder)
    /**
     * @param tables Tables in the schema.
     *  Structure is documented below.
     * @return builder
     */
    def tables(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTableArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTableArgs.builder
      builder.tables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsArgs.Builder)
    /**
     * @param oracleSchemas Oracle schemas/databases in the database server
     *  Structure is documented below.
     * @return builder
     */
    def oracleSchemas(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaArgs.builder
      builder.oracleSchemas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigIncludeObjectsArgs.Builder)
    /**
     * @param schemas Spanner schemas in the database
     *  Structure is documented below.
     * @return builder
     */
    def schemas(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigIncludeObjectsSchemaArgs.Builder]*):
        com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigIncludeObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datastream.inputs.StreamSourceConfigSpannerSourceConfigIncludeObjectsSchemaArgs.builder
      builder.schemas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datastream.inputs.StreamRuleSetCustomizationRuleBigqueryPartitioningArgs.Builder)
    /**
     * @param ingestionTimePartition A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def ingestionTimePartition(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamRuleSetCustomizationRuleBigqueryPartitioningIngestionTimePartitionArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamRuleSetCustomizationRuleBigqueryPartitioningArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamRuleSetCustomizationRuleBigqueryPartitioningIngestionTimePartitionArgs.builder
      builder.ingestionTimePartition(args(argsBuilder).build)

    /**
     * @param integerRangePartition A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def integerRangePartition(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamRuleSetCustomizationRuleBigqueryPartitioningIntegerRangePartitionArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamRuleSetCustomizationRuleBigqueryPartitioningArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamRuleSetCustomizationRuleBigqueryPartitioningIntegerRangePartitionArgs.builder
      builder.integerRangePartition(args(argsBuilder).build)

    /**
     * @param timeUnitPartition A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def timeUnitPartition(args: Endofunction[com.pulumi.gcp.datastream.inputs.StreamRuleSetCustomizationRuleBigqueryPartitioningTimeUnitPartitionArgs.Builder]):
        com.pulumi.gcp.datastream.inputs.StreamRuleSetCustomizationRuleBigqueryPartitioningArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.StreamRuleSetCustomizationRuleBigqueryPartitioningTimeUnitPartitionArgs.builder
      builder.timeUnitPartition(args(argsBuilder).build)
