package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object firestore:
  /**
   * A backup schedule for a Cloud Firestore Database.
   * This resource is owned by the database it is backing up, and is deleted along with the database.
   * The actual backups are not though.
   * 
   * To get more information about BackupSchedule, see:
   * 
   * * [API documentation](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.backupSchedules)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/firestore/docs/backups)
   * 
   * &gt; **Warning:** This resource creates a Firestore Backup Schedule on a project that already has
   * a Firestore database.
   * This resource is owned by the database it is backing up, and is deleted along
   * with the database. The actual backups are not though.
   */
  def BackupSchedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firestore.BackupScheduleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firestore.BackupScheduleArgs.builder
    com.pulumi.gcp.firestore.BackupSchedule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A change stream resource for a Cloud Firestore Database.
   * Change streams enable real-time tracking of document changes (creates, updates, deletes)
   * across collections within a Cloud Firestore database.
   * 
   * To get more information about ChangeStream, see:
   * 
   * * API documentation
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/firestore/docs/)
   * 
   * &gt; **Warning:** This resource creates a Firestore Change Stream on a project that already has
   * a Firestore database.
   */
  def ChangeStream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firestore.ChangeStreamArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.firestore.ChangeStreamArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.firestore.ChangeStream(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A Cloud Firestore Database.
   * 
   * If you wish to use Firestore with App Engine, use the
   * `gcp.appengine.Application`
   * resource instead. If you were previously using the `gcp.appengine.Application` resource exclusively for managing a Firestore database
   * and would like to use the `gcp.firestore.Database` resource instead, please follow the instructions
   * [here](https://cloud.google.com/firestore/docs/app-engine-requirement).
   * 
   * To get more information about Database, see:
   * 
   * * [API documentation](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/firestore/docs/)
   */
  def Database(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firestore.DatabaseArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.firestore.DatabaseArgs.builder
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
    com.pulumi.gcp.firestore.Database(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * In Cloud Firestore, the unit of storage is the document. A document is a lightweight record
   * that contains fields, which map to values. Each document is identified by a name.
   * 
   * To get more information about Document, see:
   * 
   * * [API documentation](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.documents)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/firestore/docs/manage-data/add-data)
   * 
   * &gt; **Warning:** This resource creates a Firestore Document on a project that already has
   * a Firestore database. If you haven&#39;t already created it, you may
   * create a `gcp.firestore.Database` resource with `type` set to
   * `&#34;FIRESTORE_NATIVE&#34;` and `locationId` set to your chosen location.
   * If you wish to use App Engine, you may instead create a
   * `gcp.appengine.Application` resource with `databaseType` set to
   * `&#34;CLOUD_FIRESTORE&#34;`. Your Firestore location will be the same as
   * the App Engine location specified.
   */
  def Document(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firestore.DocumentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firestore.DocumentArgs.builder
    com.pulumi.gcp.firestore.Document(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Represents a single field in the database.
   * Fields are grouped by their &#34;Collection Group&#34;, which represent all collections
   * in the database with the same id.
   * 
   * In Standard edition databases, single field indexes are managed using the `gcp.firestore.Field` resource. In Enterprise edition databases, they are managed using the `gcp.firestore.Index` resource.
   * 
   * To get more information about Field, see:
   * 
   * * [API documentation](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.collectionGroups.fields)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/firestore/docs/query-data/indexing)
   * 
   * &gt; **Warning:** This resource creates a Firestore Single Field override on a project that
   *  already has a Firestore database. If you haven&#39;t already created it, you may
   * create a `gcp.firestore.Database` resource with `locationId` set to your
   * chosen location.
   */
  def Field(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firestore.FieldArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firestore.FieldArgs.builder
    com.pulumi.gcp.firestore.Field(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object FirestoreFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Reads a document from a Firestore database.
     * See [the official documentation](https://cloud.google.com/firestore/native/docs/)
     * and
     * [API](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.documents/get/).
     */
    inline def getDocument(args: Endofunction[com.pulumi.gcp.firestore.inputs.GetDocumentArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.firestore.outputs.GetDocumentResult] =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.GetDocumentArgs.builder
      com.pulumi.gcp.firestore.FirestoreFunctions.getDocument(args(argsBuilder).build)

    /**
     * Reads a document from a Firestore database.
     * See [the official documentation](https://cloud.google.com/firestore/native/docs/)
     * and
     * [API](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.documents/get/).
     */
    inline def getDocumentPlain(args: Endofunction[com.pulumi.gcp.firestore.inputs.GetDocumentPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.firestore.outputs.GetDocumentResult] =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.GetDocumentPlainArgs.builder
      com.pulumi.gcp.firestore.FirestoreFunctions.getDocumentPlain(args(argsBuilder).build)

  /**
   * Cloud Firestore indexes enable simple and complex queries against documents in a database.
   *  Firestore Native, Firestore with MongoDB compatibility and Datastore Mode indexes are all supported.
   *  In Enterprise edition databases, this resource manages both single field and composite indexes.
   *  In Standard edition databases, single field indexes are managed using the `gcp.firestore.Field` resource instead.
   * 
   * To get more information about Index, see:
   * 
   * * [API documentation](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.collectionGroups.indexes)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/firestore/docs/query-data/indexing)
   * 
   * &gt; **Warning:** This resource creates a Firestore Index on a project that already has
   * a Firestore database. If you haven&#39;t already created it, you may
   * create a `gcp.firestore.Database` resource and `locationId` set
   * to your chosen location. If you wish to use App Engine, you may
   * instead create a `gcp.appengine.Application` resource.
   * Your Firestore location will be the same as the App Engine location specified.
   */
  def Index(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firestore.IndexArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firestore.IndexArgs.builder
    com.pulumi.gcp.firestore.Index(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * User credentials for a Cloud Firestore with MongoDB compatibility database.
   * The resource is owned by the database and is deleted along with the database.
   * 
   * To get more information about UserCreds, see:
   * 
   * * [API documentation](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.userCreds)
   * * How-to Guides
   *     * [Authenticate and connect to a database](https://cloud.google.com/firestore/mongodb-compatibility/docs/connect)
   */
  def UserCreds(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firestore.UserCredsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.firestore.UserCredsArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.firestore.UserCreds(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
