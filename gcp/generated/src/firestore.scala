package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object firestore:
  /**
   * Cloud Firestore indexes enable simple and complex queries against documents in a database.
   *   Firestore Native, Firestore with MongoDB compatibility and Datastore Mode indexes are all supported.
   *   This resource manages composite indexes and not single field indexes.
   *   To manage single field indexes, use the `gcp.firestore.Field` resource instead.
   * 
   *  To get more information about Index, see:
   * 
   *  * [API documentation](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.collectionGroups.indexes)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/firestore/docs/query-data/indexing)
   * 
   *  &gt; **Warning:** This resource creates a Firestore Index on a project that already has
   *  a Firestore database. If you haven&#39;t already created it, you may
   *  create a `gcp.firestore.Database` resource and `locationId` set
   *  to your chosen location. If you wish to use App Engine, you may
   *  instead create a `gcp.appengine.Application` resource.
   *  Your Firestore location will be the same as the App Engine location specified.
   */
  def Index(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firestore.IndexArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firestore.IndexArgs.builder
    com.pulumi.gcp.firestore.Index(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.firestore.IndexArgs.Builder)
    /**
     * @param fields The fields supported by this index. The last non-stored field entry is
     *  always for the field path `__name__`. If, on creation, `__name__` was not
     *  specified as the last field, it will be added automatically with the same
     *  direction as that of the last field defined. If the final field in a
     *  composite index is not directional, the `__name__` will be ordered
     *  `&#34;ASCENDING&#34;` (unless explicitly specified otherwise).
     *  Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.firestore.inputs.IndexFieldArgs.Builder]*):
        com.pulumi.gcp.firestore.IndexArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firestore.inputs.IndexFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  /**
   * A Cloud Firestore Database.
   * 
   *  If you wish to use Firestore with App Engine, use the
   *  `gcp.appengine.Application`
   *  resource instead. If you were previously using the `gcp.appengine.Application` resource exclusively for managing a Firestore database
   *  and would like to use the `gcp.firestore.Database` resource instead, please follow the instructions
   *  [here](https://cloud.google.com/firestore/docs/app-engine-requirement).
   * 
   *  To get more information about Database, see:
   * 
   *  * [API documentation](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/firestore/docs/)
   */
  def Database(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firestore.DatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.firestore.DatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.gcp.firestore.Database(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.firestore.DatabaseArgs.Builder)
    /**
     * @param cmekConfig The CMEK (Customer Managed Encryption Key) configuration for a Firestore
     *  database. If not present, the database is secured by the default Google
     *  encryption key.
     *  Structure is documented below.
     * @return builder
     */
    def cmekConfig(args: Endofunction[com.pulumi.gcp.firestore.inputs.DatabaseCmekConfigArgs.Builder]):
        com.pulumi.gcp.firestore.DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.DatabaseCmekConfigArgs.builder
      builder.cmekConfig(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.firestore.DatabaseArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * In Cloud Firestore, the unit of storage is the document. A document is a lightweight record
   *  that contains fields, which map to values. Each document is identified by a name.
   * 
   *  To get more information about Document, see:
   * 
   *  * [API documentation](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.documents)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/firestore/docs/manage-data/add-data)
   * 
   *  &gt; **Warning:** This resource creates a Firestore Document on a project that already has
   *  a Firestore database. If you haven&#39;t already created it, you may
   *  create a `gcp.firestore.Database` resource with `type` set to
   *  `&#34;FIRESTORE_NATIVE&#34;` and `locationId` set to your chosen location.
   *  If you wish to use App Engine, you may instead create a
   *  `gcp.appengine.Application` resource with `databaseType` set to
   *  `&#34;CLOUD_FIRESTORE&#34;`. Your Firestore location will be the same as
   *  the App Engine location specified.
   */
  def Document(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firestore.DocumentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firestore.DocumentArgs.builder
    com.pulumi.gcp.firestore.Document(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A backup schedule for a Cloud Firestore Database.
   *  This resource is owned by the database it is backing up, and is deleted along with the database.
   *  The actual backups are not though.
   * 
   *  To get more information about BackupSchedule, see:
   * 
   *  * [API documentation](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.backupSchedules)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/firestore/docs/backups)
   * 
   *  &gt; **Warning:** This resource creates a Firestore Backup Schedule on a project that already has
   *  a Firestore database.
   *  This resource is owned by the database it is backing up, and is deleted along
   *  with the database. The actual backups are not though.
   */
  def BackupSchedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firestore.BackupScheduleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firestore.BackupScheduleArgs.builder
    com.pulumi.gcp.firestore.BackupSchedule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.firestore.FieldArgs.Builder)
    /**
     * @param indexConfig The single field index configuration for this field.
     *  Creating an index configuration for this field will override any inherited configuration with the
     *  indexes specified. Configuring the index configuration with an empty block disables all indexes on
     *  the field.
     *  Structure is documented below.
     * @return builder
     */
    def indexConfig(args: Endofunction[com.pulumi.gcp.firestore.inputs.FieldIndexConfigArgs.Builder]):
        com.pulumi.gcp.firestore.FieldArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.FieldIndexConfigArgs.builder
      builder.indexConfig(args(argsBuilder).build)

    /**
     * @param ttlConfig The TTL configuration for this Field. If set to an empty block (i.e. `ttlConfig {}`), a TTL policy is configured based on the field. If unset, a TTL policy is not configured (or will be disabled upon updating the resource).
     *  Structure is documented below.
     * @return builder
     */
    def ttlConfig(args: Endofunction[com.pulumi.gcp.firestore.inputs.FieldTtlConfigArgs.Builder]):
        com.pulumi.gcp.firestore.FieldArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.FieldTtlConfigArgs.builder
      builder.ttlConfig(args(argsBuilder).build)

  /**
   * Represents a single field in the database.
   *  Fields are grouped by their &#34;Collection Group&#34;, which represent all collections
   *  in the database with the same id.
   * 
   *  To get more information about Field, see:
   * 
   *  * [API documentation](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.collectionGroups.fields)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/firestore/docs/query-data/indexing)
   * 
   *  &gt; **Warning:** This resource creates a Firestore Single Field override on a project that
   *   already has a Firestore database. If you haven&#39;t already created it, you may
   *  create a `gcp.firestore.Database` resource with `locationId` set to your
   *  chosen location.
   */
  def Field(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firestore.FieldArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firestore.FieldArgs.builder
    com.pulumi.gcp.firestore.Field(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object FirestoreFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Reads a document from a Firestore database.
     *  See [the official documentation](https://cloud.google.com/firestore/native/docs/)
     *  and
     *  [API](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.documents/get/).
     */
    inline def getDocument(args: Endofunction[com.pulumi.gcp.firestore.inputs.GetDocumentArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.firestore.outputs.GetDocumentResult] =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.GetDocumentArgs.builder
      com.pulumi.gcp.firestore.FirestoreFunctions.getDocument(args(argsBuilder).build)

    /**
     * Reads a document from a Firestore database.
     *  See [the official documentation](https://cloud.google.com/firestore/native/docs/)
     *  and
     *  [API](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.documents/get/).
     */
    inline def getDocumentPlain(args: Endofunction[com.pulumi.gcp.firestore.inputs.GetDocumentPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.firestore.outputs.GetDocumentResult] =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.GetDocumentPlainArgs.builder
      com.pulumi.gcp.firestore.FirestoreFunctions.getDocumentPlain(args(argsBuilder).build)

  /**
   * User credentials for a Cloud Firestore with MongoDB compatibility database.
   *  The resource is owned by the database and is deleted along with the database.
   * 
   *  To get more information about UserCreds, see:
   * 
   *  * [API documentation](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.userCreds)
   *  * How-to Guides
   *      * [Authenticate and connect to a database](https://cloud.google.com/firestore/mongodb-compatibility/docs/connect)
   */
  def UserCreds(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firestore.UserCredsArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.firestore.UserCredsArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.firestore.UserCreds(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.firestore.BackupScheduleArgs.Builder)
    /**
     * @param dailyRecurrence For a schedule that runs daily.
     * @return builder
     */
    def dailyRecurrence(args: Endofunction[com.pulumi.gcp.firestore.inputs.BackupScheduleDailyRecurrenceArgs.Builder]):
        com.pulumi.gcp.firestore.BackupScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.BackupScheduleDailyRecurrenceArgs.builder
      builder.dailyRecurrence(args(argsBuilder).build)

    /**
     * @param weeklyRecurrence For a schedule that runs weekly on a specific day.
     *  Structure is documented below.
     * @return builder
     */
    def weeklyRecurrence(args: Endofunction[com.pulumi.gcp.firestore.inputs.BackupScheduleWeeklyRecurrenceArgs.Builder]):
        com.pulumi.gcp.firestore.BackupScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.BackupScheduleWeeklyRecurrenceArgs.builder
      builder.weeklyRecurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firestore.inputs.IndexFieldArgs.Builder)
    /**
     * @param searchConfig Indicates that this field supports text or geo-search operations. Only one of `order`, `arrayConfig`, `searchConfig` and
     *  `vectorConfig` can be specified.
     *  Structure is documented below.
     * @return builder
     */
    def searchConfig(args: Endofunction[com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigArgs.Builder]):
        com.pulumi.gcp.firestore.inputs.IndexFieldArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigArgs.builder
      builder.searchConfig(args(argsBuilder).build)

    /**
     * @param vectorConfig Indicates that this field supports vector search operations. Only one of `order`, `arrayConfig`, `searchConfig` and
     *  `vectorConfig` can be specified. Vector Fields should come after the field path `__name__`.
     *  Structure is documented below.
     * @return builder
     */
    def vectorConfig(args: Endofunction[com.pulumi.gcp.firestore.inputs.IndexFieldVectorConfigArgs.Builder]):
        com.pulumi.gcp.firestore.inputs.IndexFieldArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.IndexFieldVectorConfigArgs.builder
      builder.vectorConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firestore.inputs.DatabaseState.Builder)
    /**
     * @param cmekConfig The CMEK (Customer Managed Encryption Key) configuration for a Firestore
     *  database. If not present, the database is secured by the default Google
     *  encryption key.
     *  Structure is documented below.
     * @return builder
     */
    def cmekConfig(args: Endofunction[com.pulumi.gcp.firestore.inputs.DatabaseCmekConfigArgs.Builder]):
        com.pulumi.gcp.firestore.inputs.DatabaseState.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.DatabaseCmekConfigArgs.builder
      builder.cmekConfig(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.firestore.inputs.DatabaseState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.gcp.firestore.inputs.FieldState.Builder)
    /**
     * @param indexConfig The single field index configuration for this field.
     *  Creating an index configuration for this field will override any inherited configuration with the
     *  indexes specified. Configuring the index configuration with an empty block disables all indexes on
     *  the field.
     *  Structure is documented below.
     * @return builder
     */
    def indexConfig(args: Endofunction[com.pulumi.gcp.firestore.inputs.FieldIndexConfigArgs.Builder]):
        com.pulumi.gcp.firestore.inputs.FieldState.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.FieldIndexConfigArgs.builder
      builder.indexConfig(args(argsBuilder).build)

    /**
     * @param ttlConfig The TTL configuration for this Field. If set to an empty block (i.e. `ttlConfig {}`), a TTL policy is configured based on the field. If unset, a TTL policy is not configured (or will be disabled upon updating the resource).
     *  Structure is documented below.
     * @return builder
     */
    def ttlConfig(args: Endofunction[com.pulumi.gcp.firestore.inputs.FieldTtlConfigArgs.Builder]):
        com.pulumi.gcp.firestore.inputs.FieldState.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.FieldTtlConfigArgs.builder
      builder.ttlConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firestore.inputs.FieldIndexConfigArgs.Builder)
    /**
     * @param indexes The indexes to configure on the field. Order or array contains must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def indexes(args: Endofunction[com.pulumi.gcp.firestore.inputs.FieldIndexConfigIndexArgs.Builder]*):
        com.pulumi.gcp.firestore.inputs.FieldIndexConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firestore.inputs.FieldIndexConfigIndexArgs.builder
      builder.indexes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firestore.inputs.IndexState.Builder)
    /**
     * @param fields The fields supported by this index. The last non-stored field entry is
     *  always for the field path `__name__`. If, on creation, `__name__` was not
     *  specified as the last field, it will be added automatically with the same
     *  direction as that of the last field defined. If the final field in a
     *  composite index is not directional, the `__name__` will be ordered
     *  `&#34;ASCENDING&#34;` (unless explicitly specified otherwise).
     *  Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.firestore.inputs.IndexFieldArgs.Builder]*):
        com.pulumi.gcp.firestore.inputs.IndexState.Builder =
      def argsBuilder = com.pulumi.gcp.firestore.inputs.IndexFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigArgs.Builder)
    /**
     * @param geoSpec The specification for building a geo search index for a field.
     *  Structure is documented below.
     * @return builder
     */
    def geoSpec(args: Endofunction[com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigGeoSpecArgs.Builder]):
        com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigGeoSpecArgs.builder
      builder.geoSpec(args(argsBuilder).build)

    /**
     * @param textSpec The specification for building a text search index for a field.
     *  Structure is documented below.
     * @return builder
     */
    def textSpec(args: Endofunction[com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigTextSpecArgs.Builder]):
        com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigTextSpecArgs.builder
      builder.textSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firestore.inputs.BackupScheduleState.Builder)
    /**
     * @param dailyRecurrence For a schedule that runs daily.
     * @return builder
     */
    def dailyRecurrence(args: Endofunction[com.pulumi.gcp.firestore.inputs.BackupScheduleDailyRecurrenceArgs.Builder]):
        com.pulumi.gcp.firestore.inputs.BackupScheduleState.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.BackupScheduleDailyRecurrenceArgs.builder
      builder.dailyRecurrence(args(argsBuilder).build)

    /**
     * @param weeklyRecurrence For a schedule that runs weekly on a specific day.
     *  Structure is documented below.
     * @return builder
     */
    def weeklyRecurrence(args: Endofunction[com.pulumi.gcp.firestore.inputs.BackupScheduleWeeklyRecurrenceArgs.Builder]):
        com.pulumi.gcp.firestore.inputs.BackupScheduleState.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.BackupScheduleWeeklyRecurrenceArgs.builder
      builder.weeklyRecurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigTextSpecArgs.Builder)
    /**
     * @param indexSpecs Specifications for how the field should be indexed. Repeated so that the field can be indexed in multiple ways.
     *  Structure is documented below.
     * @return builder
     */
    def indexSpecs(args: Endofunction[com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigTextSpecIndexSpecArgs.Builder]*):
        com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigTextSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigTextSpecIndexSpecArgs.builder
      builder.indexSpecs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firestore.inputs.UserCredsState.Builder)
    /**
     * @param resourceIdentities Describes the Resource Identity principal.
     *  Structure is documented below.
     * @return builder
     */
    def resourceIdentities(args: Endofunction[com.pulumi.gcp.firestore.inputs.UserCredsResourceIdentityArgs.Builder]*):
        com.pulumi.gcp.firestore.inputs.UserCredsState.Builder =
      def argsBuilder = com.pulumi.gcp.firestore.inputs.UserCredsResourceIdentityArgs.builder
      builder.resourceIdentities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firestore.inputs.IndexFieldVectorConfigArgs.Builder)
    /**
     * @param flat Indicates the vector index is a flat index.
     * @return builder
     */
    def flat(args: Endofunction[com.pulumi.gcp.firestore.inputs.IndexFieldVectorConfigFlatArgs.Builder]):
        com.pulumi.gcp.firestore.inputs.IndexFieldVectorConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.IndexFieldVectorConfigFlatArgs.builder
      builder.flat(args(argsBuilder).build)
