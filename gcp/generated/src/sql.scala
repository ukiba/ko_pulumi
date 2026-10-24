package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object sql:
  /**
   * Represents a SQL database inside the Cloud SQL instance, hosted in
   * Google&#39;s cloud.
   */
  def Database(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.sql.DatabaseArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.sql.DatabaseArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.sql.Database(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Creates a new Google SQL Database Instance. For more information, see the [official documentation](https://cloud.google.com/sql/docs/mysql/create-instance),
   * or the [JSON API](https://cloud.google.com/sql/docs/admin-api/v1beta4/instances).
   * 
   * &gt; **NOTE on `gcp.sql.DatabaseInstance`:** - Second-generation instances include a
   * default &#39;root&#39;{@literal @}&#39;%&#39; user with no password. This user will be deleted by the provider on
   * instance creation. You should use `gcp.sql.User` to define a custom user with
   * a restricted host and strong password.
   * 
   * &gt; **Note**: On newer versions of the provider, you must explicitly set `deletion_protection=false`
   * (and run `pulumi update` to write the field to state) in order to destroy an instance.
   * It is recommended to not set this field (or set it to true) until you&#39;re ready to destroy the instance and its databases.
   */
  def DatabaseInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.sql.DatabaseInstanceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.sql.DatabaseInstanceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.sql.DatabaseInstance(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Executes a SQL script to provision in-database resources on a Cloud SQL Instance. Before executing a SQL script, you may need to configure your database user and permissions. For more information, see the [Cloud SQL official documentation](https://cloud.google.com/sql/docs/postgres/executesql-instance), or the [JSON API](https://cloud.google.com/sql/docs/admin-api/v1beta4/instances/executeSql).
   * 
   * &gt; **Note:** The SQL script and its execution response might transit through intermediate locations between your client and the location of the target instance.
   * 
   * &gt; **Note:** If you let Terraform connect to the instance via [IAM database authentication](https://cloud.google.com/sql/docs/mysql/authentication) to execute the script, the identity account used to apply your Terraform config must exist as an IAM user, IAM service account, or IAM group in the instance. You also need to grant roles or privileges to this IAM account so it has permission to execute statements in your provision scripts. See the example below.
   */
  def ProvisionScript(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.sql.ProvisionScriptArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.sql.ProvisionScriptArgs.builder
    com.pulumi.gcp.sql.ProvisionScript(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A source representation instance is a Cloud SQL instance that represents
   * the source database server to the Cloud SQL replica. It is visible in the
   * Cloud Console and appears the same as a regular Cloud SQL instance, but it
   * contains no data, requires no configuration or maintenance, and does not
   * affect billing. You cannot update the source representation instance.
   */
  def SourceRepresentationInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.sql.SourceRepresentationInstanceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.sql.SourceRepresentationInstanceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.sql.SourceRepresentationInstance(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object SqlFunctions:
    /** Use this data source to get information about a Cloud SQL instance backup run. */
    inline def getBackupRun(args: Endofunction[com.pulumi.gcp.sql.inputs.GetBackupRunArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.sql.outputs.GetBackupRunResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetBackupRunArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getBackupRun(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information about a Cloud SQL instance backup run. */
    inline def getBackupRunPlain(args: Endofunction[com.pulumi.gcp.sql.inputs.GetBackupRunPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.sql.outputs.GetBackupRunResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetBackupRunPlainArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getBackupRunPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Get all of the trusted Certificate Authorities (CAs) for the specified SQL database instance. For more information see the
     * [official documentation](https://cloud.google.com/sql/)
     * and
     * [API](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/instances/listServerCas).
     */
    inline def getCaCerts(args: Endofunction[com.pulumi.gcp.sql.inputs.GetCaCertsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.sql.outputs.GetCaCertsResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetCaCertsArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getCaCerts(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get all of the trusted Certificate Authorities (CAs) for the specified SQL database instance. For more information see the
     * [official documentation](https://cloud.google.com/sql/)
     * and
     * [API](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/instances/listServerCas).
     */
    inline def getCaCertsPlain(args: Endofunction[com.pulumi.gcp.sql.inputs.GetCaCertsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.sql.outputs.GetCaCertsResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetCaCertsPlainArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getCaCertsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information about a database in a Cloud SQL instance. */
    inline def getDatabase(args: Endofunction[com.pulumi.gcp.sql.inputs.GetDatabaseArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.sql.outputs.GetDatabaseResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetDatabaseArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getDatabase(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information about a database in a Cloud SQL instance. */
    inline def getDatabasePlain(args: Endofunction[com.pulumi.gcp.sql.inputs.GetDatabasePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.sql.outputs.GetDatabaseResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetDatabasePlainArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getDatabasePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information about a Cloud SQL instance. */
    inline def getDatabaseInstance(args: Endofunction[com.pulumi.gcp.sql.inputs.GetDatabaseInstanceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.sql.outputs.GetDatabaseInstanceResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetDatabaseInstanceArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getDatabaseInstance(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information about a Cloud SQL instance. */
    inline def getDatabaseInstancePlain(args: Endofunction[com.pulumi.gcp.sql.inputs.GetDatabaseInstancePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.sql.outputs.GetDatabaseInstanceResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetDatabaseInstancePlainArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getDatabaseInstancePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Get Latest Recovery Time for a given instance. For more information see the
     * [official documentation](https://cloud.google.com/sql/)
     * and
     * [API](https://cloud.google.com/sql/docs/postgres/backup-recovery/pitr#get-the-latest-recovery-time).
     */
    inline def getDatabaseInstanceLatestRecoveryTime(args: Endofunction[com.pulumi.gcp.sql.inputs.GetDatabaseInstanceLatestRecoveryTimeArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.sql.outputs.GetDatabaseInstanceLatestRecoveryTimeResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetDatabaseInstanceLatestRecoveryTimeArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getDatabaseInstanceLatestRecoveryTime(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get Latest Recovery Time for a given instance. For more information see the
     * [official documentation](https://cloud.google.com/sql/)
     * and
     * [API](https://cloud.google.com/sql/docs/postgres/backup-recovery/pitr#get-the-latest-recovery-time).
     */
    inline def getDatabaseInstanceLatestRecoveryTimePlain(args: Endofunction[com.pulumi.gcp.sql.inputs.GetDatabaseInstanceLatestRecoveryTimePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.sql.outputs.GetDatabaseInstanceLatestRecoveryTimeResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetDatabaseInstanceLatestRecoveryTimePlainArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getDatabaseInstanceLatestRecoveryTimePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information about a list of Cloud SQL instances in a project. You can also apply some filters over this list to get a more filtered list of Cloud SQL instances. */
    inline def getDatabaseInstances(args: Endofunction[com.pulumi.gcp.sql.inputs.GetDatabaseInstancesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.sql.outputs.GetDatabaseInstancesResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetDatabaseInstancesArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getDatabaseInstances(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information about a list of Cloud SQL instances in a project. You can also apply some filters over this list to get a more filtered list of Cloud SQL instances. */
    inline def getDatabaseInstancesPlain(args: Endofunction[com.pulumi.gcp.sql.inputs.GetDatabaseInstancesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.sql.outputs.GetDatabaseInstancesResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetDatabaseInstancesPlainArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getDatabaseInstancesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information about a list of databases in a Cloud SQL instance. */
    inline def getDatabases(args: Endofunction[com.pulumi.gcp.sql.inputs.GetDatabasesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.sql.outputs.GetDatabasesResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetDatabasesArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getDatabases(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information about a list of databases in a Cloud SQL instance. */
    inline def getDatabasesPlain(args: Endofunction[com.pulumi.gcp.sql.inputs.GetDatabasesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.sql.outputs.GetDatabasesResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetDatabasesPlainArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getDatabasesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Get all available machine types (tiers) for a project, for example, db-custom-1-3840. For more information see the
     * [official documentation](https://cloud.google.com/sql/)
     * and
     * [API](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/tiers/list).
     */
    inline def getTiers(args: Endofunction[com.pulumi.gcp.sql.inputs.GetTiersArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.sql.outputs.GetTiersResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetTiersArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getTiers(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get all available machine types (tiers) for a project, for example, db-custom-1-3840. For more information see the
     * [official documentation](https://cloud.google.com/sql/)
     * and
     * [API](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/tiers/list).
     */
    inline def getTiersPlain(args: Endofunction[com.pulumi.gcp.sql.inputs.GetTiersPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.sql.outputs.GetTiersResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetTiersPlainArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getTiersPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Creates a new Google SQL SSL Cert on a Google SQL Instance. For more information, see the [official documentation](https://cloud.google.com/sql/), or the [JSON API](https://cloud.google.com/sql/docs/mysql/admin-api/v1beta4/sslCerts).
   * 
   * Read more about sensitive data in state.
   */
  def SslCert(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.sql.SslCertArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.sql.SslCertArgs.builder
    com.pulumi.gcp.sql.SslCert(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Creates a new Google SQL User on a Google SQL User Instance. For more information, see the [official documentation](https://cloud.google.com/sql/), or the [JSON API](https://cloud.google.com/sql/docs/admin-api/v1beta4/users).
   * 
   * Read more about sensitive data in state. Passwords will not be retrieved when running
   * &#34;terraform import&#34;.
   * 
   * &gt; **Note:** Write-Only argument `passwordWo` is available to use in place of `password`. Write-Only arguments are supported in HashiCorp Terraform 1.11.0 and later. Learn more.
   */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.sql.UserArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.sql.UserArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.sql.User(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
