package jp.ukiba.ko_pulumi
package gcp

object firestore_ext:
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
     * Structure is documented below.
     * @return builder
     */
    def weeklyRecurrence(args: Endofunction[com.pulumi.gcp.firestore.inputs.BackupScheduleWeeklyRecurrenceArgs.Builder]):
        com.pulumi.gcp.firestore.BackupScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.BackupScheduleWeeklyRecurrenceArgs.builder
      builder.weeklyRecurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firestore.ChangeStreamArgs.Builder)
    /**
     * @param collectionGroupScope Tracks changes for a specific collection group.
     * Structure is documented below.
     * @return builder
     */
    def collectionGroupScope(args: Endofunction[com.pulumi.gcp.firestore.inputs.ChangeStreamCollectionGroupScopeArgs.Builder]):
        com.pulumi.gcp.firestore.ChangeStreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.ChangeStreamCollectionGroupScopeArgs.builder
      builder.collectionGroupScope(args(argsBuilder).build)

    /**
     * @param databaseScope Tracks changes across all collections in the database.
     * @return builder
     */
    def databaseScope(args: Endofunction[com.pulumi.gcp.firestore.inputs.ChangeStreamDatabaseScopeArgs.Builder]):
        com.pulumi.gcp.firestore.ChangeStreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.ChangeStreamDatabaseScopeArgs.builder
      builder.databaseScope(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firestore.DatabaseArgs.Builder)
    /**
     * @param cmekConfig The CMEK (Customer Managed Encryption Key) configuration for a Firestore
     * database. If not present, the database is secured by the default Google
     * encryption key.
     * Structure is documented below.
     * @return builder
     */
    def cmekConfig(args: Endofunction[com.pulumi.gcp.firestore.inputs.DatabaseCmekConfigArgs.Builder]):
        com.pulumi.gcp.firestore.DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.DatabaseCmekConfigArgs.builder
      builder.cmekConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firestore.FieldArgs.Builder)
    /**
     * @param indexConfig The single field index configuration for this field.
     * Creating an index configuration for this field will override any inherited configuration with the
     * indexes specified. Configuring the index configuration with an empty block disables all indexes on
     * the field.
     * Structure is documented below.
     * @return builder
     */
    def indexConfig(args: Endofunction[com.pulumi.gcp.firestore.inputs.FieldIndexConfigArgs.Builder]):
        com.pulumi.gcp.firestore.FieldArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.FieldIndexConfigArgs.builder
      builder.indexConfig(args(argsBuilder).build)

    /**
     * @param ttlConfig The TTL configuration for this Field. If set to an empty (i.e. `ttlConfig {}`) or non-empty block, a TTL policy is configured based on the field. If unset, a TTL policy is not configured (or will be disabled upon updating the resource).
     * Structure is documented below.
     * @return builder
     */
    def ttlConfig(args: Endofunction[com.pulumi.gcp.firestore.inputs.FieldTtlConfigArgs.Builder]):
        com.pulumi.gcp.firestore.FieldArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.FieldTtlConfigArgs.builder
      builder.ttlConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firestore.IndexArgs.Builder)
    /**
     * @param fields The field(s) supported by this index. Indexes with the `ANY_API` `apiScope` in Standard
     * edition databases have special behavior with respect to the `__name__` field. In these
     * indexes, the last non-stored field entry is always for the field path `__name__`. If, on
     * creation, `__name__` was not specified as the last field, it will be added automatically
     * with the same direction as that of the last field defined. If the final field in an
     * index is not directional, the `__name__` will be ordered `&#34;ASCENDING&#34;` (unless explicitly
     * specified otherwise).
     * Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.firestore.inputs.IndexFieldArgs.Builder]*):
        com.pulumi.gcp.firestore.IndexArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firestore.inputs.IndexFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

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
     * Structure is documented below.
     * @return builder
     */
    def weeklyRecurrence(args: Endofunction[com.pulumi.gcp.firestore.inputs.BackupScheduleWeeklyRecurrenceArgs.Builder]):
        com.pulumi.gcp.firestore.inputs.BackupScheduleState.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.BackupScheduleWeeklyRecurrenceArgs.builder
      builder.weeklyRecurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firestore.inputs.ChangeStreamState.Builder)
    /**
     * @param collectionGroupScope Tracks changes for a specific collection group.
     * Structure is documented below.
     * @return builder
     */
    def collectionGroupScope(args: Endofunction[com.pulumi.gcp.firestore.inputs.ChangeStreamCollectionGroupScopeArgs.Builder]):
        com.pulumi.gcp.firestore.inputs.ChangeStreamState.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.ChangeStreamCollectionGroupScopeArgs.builder
      builder.collectionGroupScope(args(argsBuilder).build)

    /**
     * @param databaseScope Tracks changes across all collections in the database.
     * @return builder
     */
    def databaseScope(args: Endofunction[com.pulumi.gcp.firestore.inputs.ChangeStreamDatabaseScopeArgs.Builder]):
        com.pulumi.gcp.firestore.inputs.ChangeStreamState.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.ChangeStreamDatabaseScopeArgs.builder
      builder.databaseScope(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firestore.inputs.DatabaseState.Builder)
    /**
     * @param cmekConfig The CMEK (Customer Managed Encryption Key) configuration for a Firestore
     * database. If not present, the database is secured by the default Google
     * encryption key.
     * Structure is documented below.
     * @return builder
     */
    def cmekConfig(args: Endofunction[com.pulumi.gcp.firestore.inputs.DatabaseCmekConfigArgs.Builder]):
        com.pulumi.gcp.firestore.inputs.DatabaseState.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.DatabaseCmekConfigArgs.builder
      builder.cmekConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firestore.inputs.FieldIndexConfigArgs.Builder)
    /**
     * @param indexes The indexes to configure on the field. Order or array contains must be specified.
     * Structure is documented below.
     * @return builder
     */
    def indexes(args: Endofunction[com.pulumi.gcp.firestore.inputs.FieldIndexConfigIndexArgs.Builder]*):
        com.pulumi.gcp.firestore.inputs.FieldIndexConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firestore.inputs.FieldIndexConfigIndexArgs.builder
      builder.indexes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firestore.inputs.FieldState.Builder)
    /**
     * @param indexConfig The single field index configuration for this field.
     * Creating an index configuration for this field will override any inherited configuration with the
     * indexes specified. Configuring the index configuration with an empty block disables all indexes on
     * the field.
     * Structure is documented below.
     * @return builder
     */
    def indexConfig(args: Endofunction[com.pulumi.gcp.firestore.inputs.FieldIndexConfigArgs.Builder]):
        com.pulumi.gcp.firestore.inputs.FieldState.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.FieldIndexConfigArgs.builder
      builder.indexConfig(args(argsBuilder).build)

    /**
     * @param ttlConfig The TTL configuration for this Field. If set to an empty (i.e. `ttlConfig {}`) or non-empty block, a TTL policy is configured based on the field. If unset, a TTL policy is not configured (or will be disabled upon updating the resource).
     * Structure is documented below.
     * @return builder
     */
    def ttlConfig(args: Endofunction[com.pulumi.gcp.firestore.inputs.FieldTtlConfigArgs.Builder]):
        com.pulumi.gcp.firestore.inputs.FieldState.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.FieldTtlConfigArgs.builder
      builder.ttlConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firestore.inputs.IndexFieldArgs.Builder)
    /**
     * @param searchConfig Indicates that this field supports text or geo-search operations. Only one of `order`, `arrayConfig`, `searchConfig` and
     * `vectorConfig` can be specified.
     * Structure is documented below.
     * @return builder
     */
    def searchConfig(args: Endofunction[com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigArgs.Builder]):
        com.pulumi.gcp.firestore.inputs.IndexFieldArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigArgs.builder
      builder.searchConfig(args(argsBuilder).build)

    /**
     * @param vectorConfig Indicates that this field supports vector search operations. Only one of `order`, `arrayConfig`, `searchConfig` and
     * `vectorConfig` can be specified. Vector Fields should come after the field path `__name__`.
     * Structure is documented below.
     * @return builder
     */
    def vectorConfig(args: Endofunction[com.pulumi.gcp.firestore.inputs.IndexFieldVectorConfigArgs.Builder]):
        com.pulumi.gcp.firestore.inputs.IndexFieldArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.IndexFieldVectorConfigArgs.builder
      builder.vectorConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigArgs.Builder)
    /**
     * @param geoSpec The specification for building a geo search index for a field.
     * Structure is documented below.
     * @return builder
     */
    def geoSpec(args: Endofunction[com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigGeoSpecArgs.Builder]):
        com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigGeoSpecArgs.builder
      builder.geoSpec(args(argsBuilder).build)

    /**
     * @param textSpec The specification for building a text search index for a field.
     * Structure is documented below.
     * @return builder
     */
    def textSpec(args: Endofunction[com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigTextSpecArgs.Builder]):
        com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigTextSpecArgs.builder
      builder.textSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigTextSpecArgs.Builder)
    /**
     * @param indexSpecs Specifications for how the field should be indexed. Repeated so that the field can be indexed in multiple ways.
     * Structure is documented below.
     * @return builder
     */
    def indexSpecs(args: Endofunction[com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigTextSpecIndexSpecArgs.Builder]*):
        com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigTextSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firestore.inputs.IndexFieldSearchConfigTextSpecIndexSpecArgs.builder
      builder.indexSpecs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firestore.inputs.IndexFieldVectorConfigArgs.Builder)
    /**
     * @param flat Indicates the vector index is a flat index.
     * @return builder
     */
    def flat(args: Endofunction[com.pulumi.gcp.firestore.inputs.IndexFieldVectorConfigFlatArgs.Builder]):
        com.pulumi.gcp.firestore.inputs.IndexFieldVectorConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firestore.inputs.IndexFieldVectorConfigFlatArgs.builder
      builder.flat(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firestore.inputs.IndexState.Builder)
    /**
     * @param fields The field(s) supported by this index. Indexes with the `ANY_API` `apiScope` in Standard
     * edition databases have special behavior with respect to the `__name__` field. In these
     * indexes, the last non-stored field entry is always for the field path `__name__`. If, on
     * creation, `__name__` was not specified as the last field, it will be added automatically
     * with the same direction as that of the last field defined. If the final field in an
     * index is not directional, the `__name__` will be ordered `&#34;ASCENDING&#34;` (unless explicitly
     * specified otherwise).
     * Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.firestore.inputs.IndexFieldArgs.Builder]*):
        com.pulumi.gcp.firestore.inputs.IndexState.Builder =
      def argsBuilder = com.pulumi.gcp.firestore.inputs.IndexFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firestore.inputs.UserCredsState.Builder)
    /**
     * @param resourceIdentities Describes the Resource Identity principal.
     * Structure is documented below.
     * @return builder
     */
    def resourceIdentities(args: Endofunction[com.pulumi.gcp.firestore.inputs.UserCredsResourceIdentityArgs.Builder]*):
        com.pulumi.gcp.firestore.inputs.UserCredsState.Builder =
      def argsBuilder = com.pulumi.gcp.firestore.inputs.UserCredsResourceIdentityArgs.builder
      builder.resourceIdentities(args.map(_(argsBuilder).build)*)
