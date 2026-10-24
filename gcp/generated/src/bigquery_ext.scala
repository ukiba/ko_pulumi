package jp.ukiba.ko_pulumi
package gcp

object bigquery_ext:
  extension (builder: com.pulumi.gcp.bigquery.AppProfileArgs.Builder)
    /**
     * @param dataBoostIsolationReadOnly Specifies that this app profile is intended for read-only usage via the Data Boost feature.
     * Structure is documented below.
     * @return builder
     */
    def dataBoostIsolationReadOnly(args: Endofunction[com.pulumi.gcp.bigquery.inputs.AppProfileDataBoostIsolationReadOnlyArgs.Builder]):
        com.pulumi.gcp.bigquery.AppProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.AppProfileDataBoostIsolationReadOnlyArgs.builder
      builder.dataBoostIsolationReadOnly(args(argsBuilder).build)

    /**
     * @param singleClusterRouting Use a single-cluster routing policy.
     * Structure is documented below.
     * @return builder
     */
    def singleClusterRouting(args: Endofunction[com.pulumi.gcp.bigquery.inputs.AppProfileSingleClusterRoutingArgs.Builder]):
        com.pulumi.gcp.bigquery.AppProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.AppProfileSingleClusterRoutingArgs.builder
      builder.singleClusterRouting(args(argsBuilder).build)

    /**
     * @param standardIsolation The standard options used for isolating this app profile&#39;s traffic from other use cases.
     * Structure is documented below.
     * @return builder
     */
    def standardIsolation(args: Endofunction[com.pulumi.gcp.bigquery.inputs.AppProfileStandardIsolationArgs.Builder]):
        com.pulumi.gcp.bigquery.AppProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.AppProfileStandardIsolationArgs.builder
      builder.standardIsolation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.BiReservationArgs.Builder)
    /**
     * @param preferredTables Preferred tables to use BI capacity for.
     * Structure is documented below.
     * @return builder
     */
    def preferredTables(args: Endofunction[com.pulumi.gcp.bigquery.inputs.BiReservationPreferredTableArgs.Builder]*):
        com.pulumi.gcp.bigquery.BiReservationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigquery.inputs.BiReservationPreferredTableArgs.builder
      builder.preferredTables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigquery.ConnectionArgs.Builder)
    /**
     * @param aws Connection properties specific to Amazon Web Services.
     * Structure is documented below.
     * @return builder
     */
    def aws(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionAwsArgs.Builder]):
        com.pulumi.gcp.bigquery.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionAwsArgs.builder
      builder.aws(args(argsBuilder).build)

    /**
     * @param azure Container for connection properties specific to Azure.
     * Structure is documented below.
     * @return builder
     */
    def azure(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionAzureArgs.Builder]):
        com.pulumi.gcp.bigquery.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionAzureArgs.builder
      builder.azure(args(argsBuilder).build)

    /**
     * @param cloudResource Container for connection properties for delegation of access to GCP resources.
     * Structure is documented below.
     * @return builder
     */
    def cloudResource(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionCloudResourceArgs.Builder]):
        com.pulumi.gcp.bigquery.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionCloudResourceArgs.builder
      builder.cloudResource(args(argsBuilder).build)

    /**
     * @param cloudSpanner Connection properties specific to Cloud Spanner
     * Structure is documented below.
     * @return builder
     */
    def cloudSpanner(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionCloudSpannerArgs.Builder]):
        com.pulumi.gcp.bigquery.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionCloudSpannerArgs.builder
      builder.cloudSpanner(args(argsBuilder).build)

    /**
     * @param cloudSql Connection properties specific to the Cloud SQL.
     * Structure is documented below.
     * @return builder
     */
    def cloudSql(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionCloudSqlArgs.Builder]):
        com.pulumi.gcp.bigquery.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionCloudSqlArgs.builder
      builder.cloudSql(args(argsBuilder).build)

    /**
     * @param configuration Connector configuration. This is a generic configuration that is used to connect to
     * external data sources such as AlloyDB, MySQL, and PostgreSQL using the BigQuery
     * Connector framework.
     * Structure is documented below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationArgs.Builder]):
        com.pulumi.gcp.bigquery.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param spark Container for connection properties to execute stored procedures for Apache Spark. resources.
     * Structure is documented below.
     * @return builder
     */
    def spark(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionSparkArgs.Builder]):
        com.pulumi.gcp.bigquery.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionSparkArgs.builder
      builder.spark(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.ConnectionIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.ConnectionIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.ConnectionIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.ConnectionIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.DataTransferConfigArgs.Builder)
    /**
     * @param emailPreferences Email notifications will be sent according to these preferences to the
     * email address of the user who owns this transfer config.
     * Structure is documented below.
     * @return builder
     */
    def emailPreferences(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DataTransferConfigEmailPreferencesArgs.Builder]):
        com.pulumi.gcp.bigquery.DataTransferConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DataTransferConfigEmailPreferencesArgs.builder
      builder.emailPreferences(args(argsBuilder).build)

    /**
     * @param encryptionConfiguration Represents the encryption configuration for a transfer.
     * Structure is documented below.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DataTransferConfigEncryptionConfigurationArgs.Builder]):
        com.pulumi.gcp.bigquery.DataTransferConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DataTransferConfigEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param scheduleOptions Options customizing the data transfer schedule.
     * Structure is documented below.
     * @return builder
     */
    def scheduleOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DataTransferConfigScheduleOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.DataTransferConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DataTransferConfigScheduleOptionsArgs.builder
      builder.scheduleOptions(args(argsBuilder).build)

    /**
     * @param sensitiveParams Different parameters are configured primarily using the the `params` field on this
     * resource. This block contains the parameters which contain secrets or passwords so that they can be marked
     * sensitive and hidden from plan output. The name of the field, eg: secret_access_key, will be the key
     * in the `params` map in the api request.
     * Credentials may not be specified in both locations and will cause an error. Changing from one location
     * to a different credential configuration in the config will require an apply to update state.
     * Structure is documented below.
     * @return builder
     */
    def sensitiveParams(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DataTransferConfigSensitiveParamsArgs.Builder]):
        com.pulumi.gcp.bigquery.DataTransferConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DataTransferConfigSensitiveParamsArgs.builder
      builder.sensitiveParams(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyArgs.Builder)
    /**
     * @param dataGovernanceTag Data Governance tag bound to the Data Policy.
     * Structure is documented below.
     * @return builder
     */
    def dataGovernanceTag(args: Endofunction[com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyDataGovernanceTagArgs.Builder]):
        com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyDataGovernanceTagArgs.builder
      builder.dataGovernanceTag(args(argsBuilder).build)

    /**
     * @param dataMaskingPolicy The policy used to specify data masking rule.
     * Structure is documented below.
     * @return builder
     */
    def dataMaskingPolicy(args: Endofunction[com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyDataMaskingPolicyArgs.Builder]):
        com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyDataMaskingPolicyArgs.builder
      builder.dataMaskingPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.DatasetAccessArgs.Builder)
    /**
     * @param authorizedDataset Grants all resources of particular types in a particular dataset read access to the current dataset.
     * Structure is documented below.
     * @return builder
     */
    def authorizedDataset(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetAccessAuthorizedDatasetArgs.Builder]):
        com.pulumi.gcp.bigquery.DatasetAccessArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetAccessAuthorizedDatasetArgs.builder
      builder.authorizedDataset(args(argsBuilder).build)

    /**
     * @param condition Condition for the binding. If CEL expression in this field is true, this
     * access binding will be considered.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetAccessConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.DatasetAccessArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetAccessConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param routine A routine from a different dataset to grant access to. Queries
     * executed against that routine will have read access to tables in
     * this dataset. The role field is not required when this field is
     * set. If that routine is updated by any user, access to the routine
     * needs to be granted again via an update operation.
     * Structure is documented below.
     * @return builder
     */
    def routine(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetAccessRoutineArgs.Builder]):
        com.pulumi.gcp.bigquery.DatasetAccessArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetAccessRoutineArgs.builder
      builder.routine(args(argsBuilder).build)

    /**
     * @param view A view from a different dataset to grant access to. Queries
     * executed against that view will have read access to tables in
     * this dataset. The role field is not required when this field is
     * set. If that view is updated by any user, access to the view
     * needs to be granted again via an update operation.
     * Structure is documented below.
     * @return builder
     */
    def view(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetAccessViewArgs.Builder]):
        com.pulumi.gcp.bigquery.DatasetAccessArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetAccessViewArgs.builder
      builder.view(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.DatasetArgs.Builder)
    /**
     * @param accesses An array of objects that define dataset access for one or more entities.
     * Structure is documented below.
     * @return builder
     */
    def accesses(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetAccessArgs.Builder]*):
        com.pulumi.gcp.bigquery.DatasetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetAccessArgs.builder
      builder.accesses(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultEncryptionConfiguration The default encryption key for all tables in the dataset. Once this property is set,
     * all newly-created partitioned tables in the dataset will have encryption key set to
     * this value, unless table creation request (or query) overrides the key.
     * Structure is documented below.
     * @return builder
     */
    def defaultEncryptionConfiguration(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetDefaultEncryptionConfigurationArgs.Builder]):
        com.pulumi.gcp.bigquery.DatasetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetDefaultEncryptionConfigurationArgs.builder
      builder.defaultEncryptionConfiguration(args(argsBuilder).build)

    /**
     * @param externalCatalogDatasetOptions Options defining open source compatible datasets living in the BigQuery catalog. Contains
     * metadata of open source database, schema or namespace represented by the current dataset.
     * Structure is documented below.
     * @return builder
     */
    def externalCatalogDatasetOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetExternalCatalogDatasetOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.DatasetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetExternalCatalogDatasetOptionsArgs.builder
      builder.externalCatalogDatasetOptions(args(argsBuilder).build)

    /**
     * @param externalDatasetReference Information about the external metadata storage where the dataset is defined.
     * Structure is documented below.
     * @return builder
     */
    def externalDatasetReference(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetExternalDatasetReferenceArgs.Builder]):
        com.pulumi.gcp.bigquery.DatasetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetExternalDatasetReferenceArgs.builder
      builder.externalDatasetReference(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.DatasetIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.DatasetIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.DatasetIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.DatasetIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.IamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.IamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.IamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.IamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.IamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.IamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.IamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.IamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.JobArgs.Builder)
    /**
     * @param copy Copies a table.
     * Structure is documented below.
     * @return builder
     */
    def copy(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobCopyArgs.Builder]):
        com.pulumi.gcp.bigquery.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.JobCopyArgs.builder
      builder.copy(args(argsBuilder).build)

    /**
     * @param extract Configures an extract job.
     * Structure is documented below.
     * @return builder
     */
    def extract(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobExtractArgs.Builder]):
        com.pulumi.gcp.bigquery.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.JobExtractArgs.builder
      builder.extract(args(argsBuilder).build)

    /**
     * @param load Configures a load job.
     * Structure is documented below.
     * @return builder
     */
    def load(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobLoadArgs.Builder]):
        com.pulumi.gcp.bigquery.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.JobLoadArgs.builder
      builder.load(args(argsBuilder).build)

    /**
     * @param query Configures a query job.
     * Structure is documented below.
     * @return builder
     */
    def query(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobQueryArgs.Builder]):
        com.pulumi.gcp.bigquery.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.JobQueryArgs.builder
      builder.query(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.ReservationArgs.Builder)
    /**
     * @param autoscale The configuration parameters for the auto scaling feature.
     * Structure is documented below.
     * @return builder
     */
    def autoscale(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ReservationAutoscaleArgs.Builder]):
        com.pulumi.gcp.bigquery.ReservationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ReservationAutoscaleArgs.builder
      builder.autoscale(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.RoutineArgs.Builder)
    /**
     * @param arguments Input/output argument of a function or a stored procedure.
     * Structure is documented below.
     * @return builder
     */
    def arguments(args: Endofunction[com.pulumi.gcp.bigquery.inputs.RoutineArgumentArgs.Builder]*):
        com.pulumi.gcp.bigquery.RoutineArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigquery.inputs.RoutineArgumentArgs.builder
      builder.arguments(args.map(_(argsBuilder).build)*)

    /**
     * @param externalRuntimeOptions (Optional, Beta)
     * Options for the runtime of the external system.
     * This field is only applicable for Python UDFs.
     * Structure is documented below.
     * @return builder
     */
    def externalRuntimeOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.RoutineExternalRuntimeOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.RoutineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.RoutineExternalRuntimeOptionsArgs.builder
      builder.externalRuntimeOptions(args(argsBuilder).build)

    /**
     * @param pythonOptions (Optional, Beta)
     * Options for a user-defined Python function.
     * Structure is documented below.
     * @return builder
     */
    def pythonOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.RoutinePythonOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.RoutineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.RoutinePythonOptionsArgs.builder
      builder.pythonOptions(args(argsBuilder).build)

    /**
     * @param remoteFunctionOptions Remote function specific options.
     * Structure is documented below.
     * @return builder
     */
    def remoteFunctionOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.RoutineRemoteFunctionOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.RoutineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.RoutineRemoteFunctionOptionsArgs.builder
      builder.remoteFunctionOptions(args(argsBuilder).build)

    /**
     * @param sparkOptions Optional. If language is one of &#34;PYTHON&#34;, &#34;JAVA&#34;, &#34;SCALA&#34;, this field stores the options for spark stored procedure.
     * Structure is documented below.
     * @return builder
     */
    def sparkOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.RoutineSparkOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.RoutineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.RoutineSparkOptionsArgs.builder
      builder.sparkOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.RoutineIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.RoutineIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.RoutineIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.RoutineIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.RoutineIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.RoutineIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.RoutineIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.RoutineIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.TableArgs.Builder)
    /**
     * @param biglakeConfiguration Specifies the configuration of a BigLake managed table. Structure is documented below
     * @return builder
     */
    def biglakeConfiguration(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableBiglakeConfigurationArgs.Builder]):
        com.pulumi.gcp.bigquery.TableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableBiglakeConfigurationArgs.builder
      builder.biglakeConfiguration(args(argsBuilder).build)

    /**
     * @param encryptionConfiguration Specifies how the table should be encrypted.
     * If left blank, the table will be encrypted with a Google-managed key; that process
     * is transparent to the user.  Structure is documented below.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableEncryptionConfigurationArgs.Builder]):
        com.pulumi.gcp.bigquery.TableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param externalCatalogTableOptions Options defining open source
     * compatible table. Structure is documented below.
     * @return builder
     */
    def externalCatalogTableOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableExternalCatalogTableOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.TableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableExternalCatalogTableOptionsArgs.builder
      builder.externalCatalogTableOptions(args(argsBuilder).build)

    /**
     * @param externalDataConfiguration Describes the data format,
     * location, and other properties of a table stored outside of BigQuery.
     * By defining these properties, the data source can then be queried as
     * if it were a standard BigQuery table. Structure is documented below.
     * @return builder
     */
    def externalDataConfiguration(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationArgs.Builder]):
        com.pulumi.gcp.bigquery.TableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationArgs.builder
      builder.externalDataConfiguration(args(argsBuilder).build)

    /**
     * @param materializedView If specified, configures this table as a materialized view.
     * Structure is documented below.
     * @return builder
     */
    def materializedView(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableMaterializedViewArgs.Builder]):
        com.pulumi.gcp.bigquery.TableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableMaterializedViewArgs.builder
      builder.materializedView(args(argsBuilder).build)

    /**
     * @param rangePartitioning If specified, configures range-based
     * partitioning for this table. Structure is documented below.
     * @return builder
     */
    def rangePartitioning(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableRangePartitioningArgs.Builder]):
        com.pulumi.gcp.bigquery.TableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableRangePartitioningArgs.builder
      builder.rangePartitioning(args(argsBuilder).build)

    /**
     * @param schemaForeignTypeInfo Specifies metadata of the foreign data
     * type definition in field schema. Structure is documented below.
     * @return builder
     */
    def schemaForeignTypeInfo(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableSchemaForeignTypeInfoArgs.Builder]):
        com.pulumi.gcp.bigquery.TableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableSchemaForeignTypeInfoArgs.builder
      builder.schemaForeignTypeInfo(args(argsBuilder).build)

    /**
     * @param tableConstraints Defines the primary key and foreign keys.
     * Structure is documented below.
     * @return builder
     */
    def tableConstraints(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableTableConstraintsArgs.Builder]):
        com.pulumi.gcp.bigquery.TableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableTableConstraintsArgs.builder
      builder.tableConstraints(args(argsBuilder).build)

    /**
     * @param tableReplicationInfo Replication info of a table created
     * using &#34;AS REPLICA&#34; DDL like:
     * `CREATE MATERIALIZED VIEW mv1 AS REPLICA OF srcMv`.
     * Structure is documented below.
     * @return builder
     */
    def tableReplicationInfo(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableTableReplicationInfoArgs.Builder]):
        com.pulumi.gcp.bigquery.TableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableTableReplicationInfoArgs.builder
      builder.tableReplicationInfo(args(argsBuilder).build)

    /**
     * @param timePartitioning If specified, configures time-based
     * partitioning for this table. Structure is documented below.
     * @return builder
     */
    def timePartitioning(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableTimePartitioningArgs.Builder]):
        com.pulumi.gcp.bigquery.TableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableTimePartitioningArgs.builder
      builder.timePartitioning(args(argsBuilder).build)

    /**
     * @param view If specified, configures this table as a view.
     * Structure is documented below.
     * @return builder
     */
    def view(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableViewArgs.Builder]):
        com.pulumi.gcp.bigquery.TableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableViewArgs.builder
      builder.view(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.AppProfileState.Builder)
    /**
     * @param dataBoostIsolationReadOnly Specifies that this app profile is intended for read-only usage via the Data Boost feature.
     * Structure is documented below.
     * @return builder
     */
    def dataBoostIsolationReadOnly(args: Endofunction[com.pulumi.gcp.bigquery.inputs.AppProfileDataBoostIsolationReadOnlyArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.AppProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.AppProfileDataBoostIsolationReadOnlyArgs.builder
      builder.dataBoostIsolationReadOnly(args(argsBuilder).build)

    /**
     * @param singleClusterRouting Use a single-cluster routing policy.
     * Structure is documented below.
     * @return builder
     */
    def singleClusterRouting(args: Endofunction[com.pulumi.gcp.bigquery.inputs.AppProfileSingleClusterRoutingArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.AppProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.AppProfileSingleClusterRoutingArgs.builder
      builder.singleClusterRouting(args(argsBuilder).build)

    /**
     * @param standardIsolation The standard options used for isolating this app profile&#39;s traffic from other use cases.
     * Structure is documented below.
     * @return builder
     */
    def standardIsolation(args: Endofunction[com.pulumi.gcp.bigquery.inputs.AppProfileStandardIsolationArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.AppProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.AppProfileStandardIsolationArgs.builder
      builder.standardIsolation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.BiReservationState.Builder)
    /**
     * @param preferredTables Preferred tables to use BI capacity for.
     * Structure is documented below.
     * @return builder
     */
    def preferredTables(args: Endofunction[com.pulumi.gcp.bigquery.inputs.BiReservationPreferredTableArgs.Builder]*):
        com.pulumi.gcp.bigquery.inputs.BiReservationState.Builder =
      def argsBuilder = com.pulumi.gcp.bigquery.inputs.BiReservationPreferredTableArgs.builder
      builder.preferredTables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigquery.inputs.ConnectionAwsArgs.Builder)
    /**
     * @param accessRole Authentication using Google owned service account to assume into customer&#39;s AWS IAM Role.
     * Structure is documented below.
     * @return builder
     */
    def accessRole(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionAwsAccessRoleArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.ConnectionAwsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionAwsAccessRoleArgs.builder
      builder.accessRole(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.ConnectionCloudSqlArgs.Builder)
    /**
     * @param credential Cloud SQL properties.
     * Structure is documented below.
     * @return builder
     */
    def credential(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionCloudSqlCredentialArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.ConnectionCloudSqlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionCloudSqlCredentialArgs.builder
      builder.credential(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationArgs.Builder)
    /**
     * @param asset Asset configuration for the connector.
     * Structure is documented below.
     * @return builder
     */
    def asset(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationAssetArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationAssetArgs.builder
      builder.asset(args(argsBuilder).build)

    /**
     * @param authentication Authentication configuration for the connector.
     * Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationAuthenticationArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    /**
     * @param endpoint Endpoint configuration for the connector.
     * Structure is documented below.
     * @return builder
     */
    def endpoint(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationEndpointArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationEndpointArgs.builder
      builder.endpoint(args(argsBuilder).build)

    /**
     * @param network Network configuration for the connector.
     * Structure is documented below.
     * @return builder
     */
    def network(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationNetworkArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationNetworkArgs.builder
      builder.network(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationAuthenticationArgs.Builder)
    /**
     * @param usernamePassword Username/password authentication configuration.
     * Structure is documented below.
     * @return builder
     */
    def usernamePassword(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationAuthenticationUsernamePasswordArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationAuthenticationUsernamePasswordArgs.builder
      builder.usernamePassword(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationAuthenticationUsernamePasswordArgs.Builder)
    /**
     * @param password Password configuration for the connector.
     * Structure is documented below.
     * @return builder
     */
    def password(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationAuthenticationUsernamePasswordPasswordArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationAuthenticationUsernamePasswordArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationAuthenticationUsernamePasswordPasswordArgs.builder
      builder.password(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationNetworkArgs.Builder)
    /**
     * @param privateServiceConnect Private Service Connect configuration for the connector.
     * Structure is documented below.
     * @return builder
     */
    def privateServiceConnect(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationNetworkPrivateServiceConnectArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationNetworkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationNetworkPrivateServiceConnectArgs.builder
      builder.privateServiceConnect(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.ConnectionIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.ConnectionIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.ConnectionIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.ConnectionIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.ConnectionSparkArgs.Builder)
    /**
     * @param metastoreServiceConfig Dataproc Metastore Service configuration for the connection.
     * Structure is documented below.
     * @return builder
     */
    def metastoreServiceConfig(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionSparkMetastoreServiceConfigArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.ConnectionSparkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionSparkMetastoreServiceConfigArgs.builder
      builder.metastoreServiceConfig(args(argsBuilder).build)

    /**
     * @param sparkHistoryServerConfig Spark History Server configuration for the connection.
     * Structure is documented below.
     * @return builder
     */
    def sparkHistoryServerConfig(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionSparkSparkHistoryServerConfigArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.ConnectionSparkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionSparkSparkHistoryServerConfigArgs.builder
      builder.sparkHistoryServerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.ConnectionState.Builder)
    /**
     * @param aws Connection properties specific to Amazon Web Services.
     * Structure is documented below.
     * @return builder
     */
    def aws(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionAwsArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionAwsArgs.builder
      builder.aws(args(argsBuilder).build)

    /**
     * @param azure Container for connection properties specific to Azure.
     * Structure is documented below.
     * @return builder
     */
    def azure(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionAzureArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionAzureArgs.builder
      builder.azure(args(argsBuilder).build)

    /**
     * @param cloudResource Container for connection properties for delegation of access to GCP resources.
     * Structure is documented below.
     * @return builder
     */
    def cloudResource(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionCloudResourceArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionCloudResourceArgs.builder
      builder.cloudResource(args(argsBuilder).build)

    /**
     * @param cloudSpanner Connection properties specific to Cloud Spanner
     * Structure is documented below.
     * @return builder
     */
    def cloudSpanner(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionCloudSpannerArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionCloudSpannerArgs.builder
      builder.cloudSpanner(args(argsBuilder).build)

    /**
     * @param cloudSql Connection properties specific to the Cloud SQL.
     * Structure is documented below.
     * @return builder
     */
    def cloudSql(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionCloudSqlArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionCloudSqlArgs.builder
      builder.cloudSql(args(argsBuilder).build)

    /**
     * @param configuration Connector configuration. This is a generic configuration that is used to connect to
     * external data sources such as AlloyDB, MySQL, and PostgreSQL using the BigQuery
     * Connector framework.
     * Structure is documented below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param spark Container for connection properties to execute stored procedures for Apache Spark. resources.
     * Structure is documented below.
     * @return builder
     */
    def spark(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ConnectionSparkArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ConnectionSparkArgs.builder
      builder.spark(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.DataTransferConfigState.Builder)
    /**
     * @param emailPreferences Email notifications will be sent according to these preferences to the
     * email address of the user who owns this transfer config.
     * Structure is documented below.
     * @return builder
     */
    def emailPreferences(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DataTransferConfigEmailPreferencesArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.DataTransferConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DataTransferConfigEmailPreferencesArgs.builder
      builder.emailPreferences(args(argsBuilder).build)

    /**
     * @param encryptionConfiguration Represents the encryption configuration for a transfer.
     * Structure is documented below.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DataTransferConfigEncryptionConfigurationArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.DataTransferConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DataTransferConfigEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param scheduleOptions Options customizing the data transfer schedule.
     * Structure is documented below.
     * @return builder
     */
    def scheduleOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DataTransferConfigScheduleOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.DataTransferConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DataTransferConfigScheduleOptionsArgs.builder
      builder.scheduleOptions(args(argsBuilder).build)

    /**
     * @param sensitiveParams Different parameters are configured primarily using the the `params` field on this
     * resource. This block contains the parameters which contain secrets or passwords so that they can be marked
     * sensitive and hidden from plan output. The name of the field, eg: secret_access_key, will be the key
     * in the `params` map in the api request.
     * Credentials may not be specified in both locations and will cause an error. Changing from one location
     * to a different credential configuration in the config will require an apply to update state.
     * Structure is documented below.
     * @return builder
     */
    def sensitiveParams(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DataTransferConfigSensitiveParamsArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.DataTransferConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DataTransferConfigSensitiveParamsArgs.builder
      builder.sensitiveParams(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.DataTransferDataSourceEnrollmentState.Builder)
    /**
     * @param parameters Data source parameters.
     * Structure is documented below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DataTransferDataSourceEnrollmentParameterArgs.Builder]*):
        com.pulumi.gcp.bigquery.inputs.DataTransferDataSourceEnrollmentState.Builder =
      def argsBuilder = com.pulumi.gcp.bigquery.inputs.DataTransferDataSourceEnrollmentParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyState.Builder)
    /**
     * @param dataGovernanceTag Data Governance tag bound to the Data Policy.
     * Structure is documented below.
     * @return builder
     */
    def dataGovernanceTag(args: Endofunction[com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyDataGovernanceTagArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyDataGovernanceTagArgs.builder
      builder.dataGovernanceTag(args(argsBuilder).build)

    /**
     * @param dataMaskingPolicy The policy used to specify data masking rule.
     * Structure is documented below.
     * @return builder
     */
    def dataMaskingPolicy(args: Endofunction[com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyDataMaskingPolicyArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.Datapolicyv2DataPolicyDataMaskingPolicyArgs.builder
      builder.dataMaskingPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.DatasetAccessArgs.Builder)
    /**
     * @param condition Condition for the binding. If CEL expression in this field is true, this
     * access binding will be considered.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetAccessConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.DatasetAccessArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetAccessConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param dataset Grants all resources of particular types in a particular dataset read access to the current dataset.
     * Structure is documented below.
     * @return builder
     */
    def dataset(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetAccessDatasetArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.DatasetAccessArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetAccessDatasetArgs.builder
      builder.dataset(args(argsBuilder).build)

    /**
     * @param routine A routine from a different dataset to grant access to. Queries
     * executed against that routine will have read access to tables in
     * this dataset. The role field is not required when this field is
     * set. If that routine is updated by any user, access to the routine
     * needs to be granted again via an update operation.
     * Structure is documented below.
     * @return builder
     */
    def routine(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetAccessRoutineArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.DatasetAccessArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetAccessRoutineArgs.builder
      builder.routine(args(argsBuilder).build)

    /**
     * @param view A view from a different dataset to grant access to. Queries
     * executed against that view will have read access to tables in
     * this dataset. The role field is not required when this field is
     * set. If that view is updated by any user, access to the view
     * needs to be granted again via an update operation.
     * Structure is documented below.
     * @return builder
     */
    def view(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetAccessViewArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.DatasetAccessArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetAccessViewArgs.builder
      builder.view(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.DatasetAccessAuthorizedDatasetArgs.Builder)
    /**
     * @param dataset The dataset this entry applies to
     * Structure is documented below.
     * @return builder
     */
    def dataset(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetAccessAuthorizedDatasetDatasetArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.DatasetAccessAuthorizedDatasetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetAccessAuthorizedDatasetDatasetArgs.builder
      builder.dataset(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.DatasetAccessDatasetArgs.Builder)
    /**
     * @param dataset The dataset this entry applies to
     * Structure is documented below.
     * @return builder
     */
    def dataset(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetAccessDatasetDatasetArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.DatasetAccessDatasetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetAccessDatasetDatasetArgs.builder
      builder.dataset(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.DatasetAccessState.Builder)
    /**
     * @param authorizedDataset Grants all resources of particular types in a particular dataset read access to the current dataset.
     * Structure is documented below.
     * @return builder
     */
    def authorizedDataset(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetAccessAuthorizedDatasetArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.DatasetAccessState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetAccessAuthorizedDatasetArgs.builder
      builder.authorizedDataset(args(argsBuilder).build)

    /**
     * @param condition Condition for the binding. If CEL expression in this field is true, this
     * access binding will be considered.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetAccessConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.DatasetAccessState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetAccessConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param routine A routine from a different dataset to grant access to. Queries
     * executed against that routine will have read access to tables in
     * this dataset. The role field is not required when this field is
     * set. If that routine is updated by any user, access to the routine
     * needs to be granted again via an update operation.
     * Structure is documented below.
     * @return builder
     */
    def routine(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetAccessRoutineArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.DatasetAccessState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetAccessRoutineArgs.builder
      builder.routine(args(argsBuilder).build)

    /**
     * @param view A view from a different dataset to grant access to. Queries
     * executed against that view will have read access to tables in
     * this dataset. The role field is not required when this field is
     * set. If that view is updated by any user, access to the view
     * needs to be granted again via an update operation.
     * Structure is documented below.
     * @return builder
     */
    def view(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetAccessViewArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.DatasetAccessState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetAccessViewArgs.builder
      builder.view(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.DatasetIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.DatasetIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.DatasetIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.DatasetIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.DatasetState.Builder)
    /**
     * @param accesses An array of objects that define dataset access for one or more entities.
     * Structure is documented below.
     * @return builder
     */
    def accesses(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetAccessArgs.Builder]*):
        com.pulumi.gcp.bigquery.inputs.DatasetState.Builder =
      def argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetAccessArgs.builder
      builder.accesses(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultEncryptionConfiguration The default encryption key for all tables in the dataset. Once this property is set,
     * all newly-created partitioned tables in the dataset will have encryption key set to
     * this value, unless table creation request (or query) overrides the key.
     * Structure is documented below.
     * @return builder
     */
    def defaultEncryptionConfiguration(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetDefaultEncryptionConfigurationArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.DatasetState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetDefaultEncryptionConfigurationArgs.builder
      builder.defaultEncryptionConfiguration(args(argsBuilder).build)

    /**
     * @param externalCatalogDatasetOptions Options defining open source compatible datasets living in the BigQuery catalog. Contains
     * metadata of open source database, schema or namespace represented by the current dataset.
     * Structure is documented below.
     * @return builder
     */
    def externalCatalogDatasetOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetExternalCatalogDatasetOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.DatasetState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetExternalCatalogDatasetOptionsArgs.builder
      builder.externalCatalogDatasetOptions(args(argsBuilder).build)

    /**
     * @param externalDatasetReference Information about the external metadata storage where the dataset is defined.
     * Structure is documented below.
     * @return builder
     */
    def externalDatasetReference(args: Endofunction[com.pulumi.gcp.bigquery.inputs.DatasetExternalDatasetReferenceArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.DatasetState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.DatasetExternalDatasetReferenceArgs.builder
      builder.externalDatasetReference(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.IamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.IamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.IamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.IamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.IamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.IamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.IamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.IamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.JobCopyArgs.Builder)
    /**
     * @param destinationEncryptionConfiguration Custom encryption configuration (e.g., Cloud KMS keys)
     * Structure is documented below.
     * @return builder
     */
    def destinationEncryptionConfiguration(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobCopyDestinationEncryptionConfigurationArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.JobCopyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.JobCopyDestinationEncryptionConfigurationArgs.builder
      builder.destinationEncryptionConfiguration(args(argsBuilder).build)

    /**
     * @param destinationTable The destination table.
     * Structure is documented below.
     * @return builder
     */
    def destinationTable(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobCopyDestinationTableArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.JobCopyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.JobCopyDestinationTableArgs.builder
      builder.destinationTable(args(argsBuilder).build)

    /**
     * @param sourceTables Source tables to copy.
     * Structure is documented below.
     * @return builder
     */
    def sourceTables(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobCopySourceTableArgs.Builder]*):
        com.pulumi.gcp.bigquery.inputs.JobCopyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigquery.inputs.JobCopySourceTableArgs.builder
      builder.sourceTables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigquery.inputs.JobExtractArgs.Builder)
    /**
     * @param sourceModel A reference to the model being exported.
     * Structure is documented below.
     * @return builder
     */
    def sourceModel(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobExtractSourceModelArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.JobExtractArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.JobExtractSourceModelArgs.builder
      builder.sourceModel(args(argsBuilder).build)

    /**
     * @param sourceTable A reference to the table being exported.
     * Structure is documented below.
     * @return builder
     */
    def sourceTable(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobExtractSourceTableArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.JobExtractArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.JobExtractSourceTableArgs.builder
      builder.sourceTable(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.JobLoadArgs.Builder)
    /**
     * @param destinationEncryptionConfiguration Custom encryption configuration (e.g., Cloud KMS keys)
     * Structure is documented below.
     * @return builder
     */
    def destinationEncryptionConfiguration(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobLoadDestinationEncryptionConfigurationArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.JobLoadArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.JobLoadDestinationEncryptionConfigurationArgs.builder
      builder.destinationEncryptionConfiguration(args(argsBuilder).build)

    /**
     * @param destinationTable The destination table to load the data into.
     * Structure is documented below.
     * @return builder
     */
    def destinationTable(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobLoadDestinationTableArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.JobLoadArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.JobLoadDestinationTableArgs.builder
      builder.destinationTable(args(argsBuilder).build)

    /**
     * @param parquetOptions Parquet Options for load and make external tables.
     * Structure is documented below.
     * @return builder
     */
    def parquetOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobLoadParquetOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.JobLoadArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.JobLoadParquetOptionsArgs.builder
      builder.parquetOptions(args(argsBuilder).build)

    /**
     * @param timePartitioning Time-based partitioning specification for the destination table.
     * Structure is documented below.
     * @return builder
     */
    def timePartitioning(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobLoadTimePartitioningArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.JobLoadArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.JobLoadTimePartitioningArgs.builder
      builder.timePartitioning(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.JobQueryArgs.Builder)
    /**
     * @param connectionProperties Connection properties to customize query behavior. Under JDBC, these correspond
     * directly to connection properties passed to the DriverManager. Under ODBC, these
     * correspond to properties in the connection string.
     * Structure is documented below.
     * @return builder
     */
    def connectionProperties(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobQueryConnectionPropertyArgs.Builder]*):
        com.pulumi.gcp.bigquery.inputs.JobQueryArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigquery.inputs.JobQueryConnectionPropertyArgs.builder
      builder.connectionProperties(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultDataset Specifies the default dataset to use for unqualified table names in the query. Note that this does not alter behavior of unqualified dataset names.
     * Structure is documented below.
     * @return builder
     */
    def defaultDataset(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobQueryDefaultDatasetArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.JobQueryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.JobQueryDefaultDatasetArgs.builder
      builder.defaultDataset(args(argsBuilder).build)

    /**
     * @param destinationEncryptionConfiguration Custom encryption configuration (e.g., Cloud KMS keys)
     * Structure is documented below.
     * @return builder
     */
    def destinationEncryptionConfiguration(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobQueryDestinationEncryptionConfigurationArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.JobQueryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.JobQueryDestinationEncryptionConfigurationArgs.builder
      builder.destinationEncryptionConfiguration(args(argsBuilder).build)

    /**
     * @param destinationTable Describes the table where the query results should be stored.
     * This property must be set for large results that exceed the maximum response size.
     * For queries that produce anonymous (cached) results, this field will be populated by BigQuery.
     * Structure is documented below.
     * @return builder
     */
    def destinationTable(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobQueryDestinationTableArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.JobQueryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.JobQueryDestinationTableArgs.builder
      builder.destinationTable(args(argsBuilder).build)

    /**
     * @param scriptOptions Options controlling the execution of scripts.
     * Structure is documented below.
     * @return builder
     */
    def scriptOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobQueryScriptOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.JobQueryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.JobQueryScriptOptionsArgs.builder
      builder.scriptOptions(args(argsBuilder).build)

    /**
     * @param userDefinedFunctionResources Describes user-defined function resources used in the query.
     * Structure is documented below.
     * @return builder
     */
    def userDefinedFunctionResources(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobQueryUserDefinedFunctionResourceArgs.Builder]*):
        com.pulumi.gcp.bigquery.inputs.JobQueryArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigquery.inputs.JobQueryUserDefinedFunctionResourceArgs.builder
      builder.userDefinedFunctionResources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigquery.inputs.JobState.Builder)
    /**
     * @param copy Copies a table.
     * Structure is documented below.
     * @return builder
     */
    def copy(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobCopyArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.JobCopyArgs.builder
      builder.copy(args(argsBuilder).build)

    /**
     * @param extract Configures an extract job.
     * Structure is documented below.
     * @return builder
     */
    def extract(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobExtractArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.JobExtractArgs.builder
      builder.extract(args(argsBuilder).build)

    /**
     * @param load Configures a load job.
     * Structure is documented below.
     * @return builder
     */
    def load(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobLoadArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.JobLoadArgs.builder
      builder.load(args(argsBuilder).build)

    /**
     * @param query Configures a query job.
     * Structure is documented below.
     * @return builder
     */
    def query(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobQueryArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.JobQueryArgs.builder
      builder.query(args(argsBuilder).build)

    /**
     * @param statuses The status of this job. Examine this value when polling an asynchronous job to see if the job is complete.
     * Structure is documented below.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobStatusArgs.Builder]*):
        com.pulumi.gcp.bigquery.inputs.JobState.Builder =
      def argsBuilder = com.pulumi.gcp.bigquery.inputs.JobStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigquery.inputs.JobStatusArgs.Builder)
    /**
     * @param errorResults (Output)
     * Final error result of the job. If present, indicates that the job has completed and was unsuccessful.
     * Structure is documented below.
     * @return builder
     */
    def errorResults(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobStatusErrorResultArgs.Builder]*):
        com.pulumi.gcp.bigquery.inputs.JobStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigquery.inputs.JobStatusErrorResultArgs.builder
      builder.errorResults(args.map(_(argsBuilder).build)*)

    /**
     * @param errors (Output)
     * The first errors encountered during the running of the job. The final message
     * includes the number of errors that caused the process to stop. Errors here do
     * not necessarily mean that the job has not completed or was unsuccessful.
     * Structure is documented below.
     * @return builder
     */
    def errors(args: Endofunction[com.pulumi.gcp.bigquery.inputs.JobStatusErrorArgs.Builder]*):
        com.pulumi.gcp.bigquery.inputs.JobStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigquery.inputs.JobStatusErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigquery.inputs.ReservationReplicationStatusArgs.Builder)
    /**
     * @param errors (Output)
     * The last error encountered while trying to replicate changes from the primary to the
     * secondary. This field is only available if the replication has not succeeded since.
     * Structure is documented below.
     * @return builder
     */
    def errors(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ReservationReplicationStatusErrorArgs.Builder]*):
        com.pulumi.gcp.bigquery.inputs.ReservationReplicationStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigquery.inputs.ReservationReplicationStatusErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigquery.inputs.ReservationState.Builder)
    /**
     * @param autoscale The configuration parameters for the auto scaling feature.
     * Structure is documented below.
     * @return builder
     */
    def autoscale(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ReservationAutoscaleArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.ReservationState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.ReservationAutoscaleArgs.builder
      builder.autoscale(args(argsBuilder).build)

    /**
     * @param replicationStatuses The Disaster Recovery(DR) replication status of the reservation. This is only available for
     * the primary replicas of DR/failover reservations and provides information about the both the
     * staleness of the secondary and the last error encountered while trying to replicate changes
     * from the primary to the secondary. If this field is blank, it means that the reservation is
     * either not a DR reservation or the reservation is a DR secondary or that any replication
     * operations on the reservation have succeeded.
     * Structure is documented below.
     * @return builder
     */
    def replicationStatuses(args: Endofunction[com.pulumi.gcp.bigquery.inputs.ReservationReplicationStatusArgs.Builder]*):
        com.pulumi.gcp.bigquery.inputs.ReservationState.Builder =
      def argsBuilder = com.pulumi.gcp.bigquery.inputs.ReservationReplicationStatusArgs.builder
      builder.replicationStatuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigquery.inputs.RoutineArgumentArgs.Builder)
    /**
     * @param tableType If argumentKind is FIXED_TABLE, a schema for the table type.
     * Structure is documented below.
     * @return builder
     */
    def tableType(args: Endofunction[com.pulumi.gcp.bigquery.inputs.RoutineArgumentTableTypeArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.RoutineArgumentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.RoutineArgumentTableTypeArgs.builder
      builder.tableType(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.RoutineArgumentTableTypeArgs.Builder)
    /**
     * @param columns The columns in the table type.
     * Structure is documented below.
     * @return builder
     */
    def columns(args: Endofunction[com.pulumi.gcp.bigquery.inputs.RoutineArgumentTableTypeColumnArgs.Builder]*):
        com.pulumi.gcp.bigquery.inputs.RoutineArgumentTableTypeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigquery.inputs.RoutineArgumentTableTypeColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigquery.inputs.RoutineIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.RoutineIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.RoutineIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.RoutineIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.RoutineIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquery.inputs.RoutineIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.RoutineIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.RoutineIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.RoutineState.Builder)
    /**
     * @param arguments Input/output argument of a function or a stored procedure.
     * Structure is documented below.
     * @return builder
     */
    def arguments(args: Endofunction[com.pulumi.gcp.bigquery.inputs.RoutineArgumentArgs.Builder]*):
        com.pulumi.gcp.bigquery.inputs.RoutineState.Builder =
      def argsBuilder = com.pulumi.gcp.bigquery.inputs.RoutineArgumentArgs.builder
      builder.arguments(args.map(_(argsBuilder).build)*)

    /**
     * @param externalRuntimeOptions (Optional, Beta)
     * Options for the runtime of the external system.
     * This field is only applicable for Python UDFs.
     * Structure is documented below.
     * @return builder
     */
    def externalRuntimeOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.RoutineExternalRuntimeOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.RoutineState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.RoutineExternalRuntimeOptionsArgs.builder
      builder.externalRuntimeOptions(args(argsBuilder).build)

    /**
     * @param pythonOptions (Optional, Beta)
     * Options for a user-defined Python function.
     * Structure is documented below.
     * @return builder
     */
    def pythonOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.RoutinePythonOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.RoutineState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.RoutinePythonOptionsArgs.builder
      builder.pythonOptions(args(argsBuilder).build)

    /**
     * @param remoteFunctionOptions Remote function specific options.
     * Structure is documented below.
     * @return builder
     */
    def remoteFunctionOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.RoutineRemoteFunctionOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.RoutineState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.RoutineRemoteFunctionOptionsArgs.builder
      builder.remoteFunctionOptions(args(argsBuilder).build)

    /**
     * @param sparkOptions Optional. If language is one of &#34;PYTHON&#34;, &#34;JAVA&#34;, &#34;SCALA&#34;, this field stores the options for spark stored procedure.
     * Structure is documented below.
     * @return builder
     */
    def sparkOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.RoutineSparkOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.RoutineState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.RoutineSparkOptionsArgs.builder
      builder.sparkOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.TableExternalCatalogTableOptionsArgs.Builder)
    /**
     * @param storageDescriptor A storage descriptor containing information
     * about the physical storage of this table. Structure is documented below.
     * @return builder
     */
    def storageDescriptor(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableExternalCatalogTableOptionsStorageDescriptorArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableExternalCatalogTableOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableExternalCatalogTableOptionsStorageDescriptorArgs.builder
      builder.storageDescriptor(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.TableExternalCatalogTableOptionsStorageDescriptorArgs.Builder)
    /**
     * @param serdeInfo Serializer and deserializer information. Structure
     * is documented below.
     * @return builder
     */
    def serdeInfo(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableExternalCatalogTableOptionsStorageDescriptorSerdeInfoArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableExternalCatalogTableOptionsStorageDescriptorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableExternalCatalogTableOptionsStorageDescriptorSerdeInfoArgs.builder
      builder.serdeInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationArgs.Builder)
    /**
     * @param avroOptions Additional options if `sourceFormat` is set to
     * &#34;AVRO&#34;.  Structure is documented below.
     * @return builder
     */
    def avroOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationAvroOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationAvroOptionsArgs.builder
      builder.avroOptions(args(argsBuilder).build)

    /**
     * @param bigtableOptions Additional properties to set if
     * `sourceFormat` is set to &#34;BIGTABLE&#34;. Structure is documented below.
     * @return builder
     */
    def bigtableOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationBigtableOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationBigtableOptionsArgs.builder
      builder.bigtableOptions(args(argsBuilder).build)

    /**
     * @param csvOptions Additional properties to set if
     * `sourceFormat` is set to &#34;CSV&#34;. Structure is documented below.
     * @return builder
     */
    def csvOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationCsvOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationCsvOptionsArgs.builder
      builder.csvOptions(args(argsBuilder).build)

    /**
     * @param googleSheetsOptions Additional options if
     * `sourceFormat` is set to &#34;GOOGLE_SHEETS&#34;. Structure is
     * documented below.
     * @return builder
     */
    def googleSheetsOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationGoogleSheetsOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationGoogleSheetsOptionsArgs.builder
      builder.googleSheetsOptions(args(argsBuilder).build)

    /**
     * @param hivePartitioningOptions When set, configures hive partitioning
     * support. Not all storage formats support hive partitioning -- requesting hive
     * partitioning on an unsupported format will lead to an error, as will providing
     * an invalid specification. Structure is documented below.
     * @return builder
     */
    def hivePartitioningOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationHivePartitioningOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationHivePartitioningOptionsArgs.builder
      builder.hivePartitioningOptions(args(argsBuilder).build)

    /**
     * @param jsonOptions Additional properties to set if
     * `sourceFormat` is set to &#34;JSON&#34;. Structure is documented below.
     * @return builder
     */
    def jsonOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationJsonOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationJsonOptionsArgs.builder
      builder.jsonOptions(args(argsBuilder).build)

    /**
     * @param parquetOptions Additional properties to set if
     * `sourceFormat` is set to &#34;PARQUET&#34;. Structure is documented below.
     * @return builder
     */
    def parquetOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationParquetOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationParquetOptionsArgs.builder
      builder.parquetOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationBigtableOptionsArgs.Builder)
    /**
     * @param columnFamilies A list of column families to expose in the table schema along with their types. This list restricts the column families that can be referenced in queries and specifies their value types. You can use this list to do type conversions - see the &#39;type&#39; field for more details. If you leave this list empty, all column families are present in the table schema and their values are read as BYTES. During a query only the column families referenced in that query are read from Bigtable.  Structure is documented below.
     * @return builder
     */
    def columnFamilies(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationBigtableOptionsColumnFamilyArgs.Builder]*):
        com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationBigtableOptionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationBigtableOptionsColumnFamilyArgs.builder
      builder.columnFamilies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationBigtableOptionsColumnFamilyArgs.Builder)
    /**
     * @param columns A List of columns that should be exposed as individual fields as opposed to a list of (column name, value) pairs. All columns whose qualifier matches a qualifier in this list can be accessed as Other columns can be accessed as a list through column field.  Structure is documented below.
     * @return builder
     */
    def columns(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationBigtableOptionsColumnFamilyColumnArgs.Builder]*):
        com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationBigtableOptionsColumnFamilyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationBigtableOptionsColumnFamilyColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigquery.inputs.TableRangePartitioningArgs.Builder)
    /**
     * @param range Information required to partition based on ranges.
     * Structure is documented below.
     * @return builder
     */
    def range(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableRangePartitioningRangeArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableRangePartitioningArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableRangePartitioningRangeArgs.builder
      builder.range(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.TableState.Builder)
    /**
     * @param biglakeConfiguration Specifies the configuration of a BigLake managed table. Structure is documented below
     * @return builder
     */
    def biglakeConfiguration(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableBiglakeConfigurationArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableBiglakeConfigurationArgs.builder
      builder.biglakeConfiguration(args(argsBuilder).build)

    /**
     * @param encryptionConfiguration Specifies how the table should be encrypted.
     * If left blank, the table will be encrypted with a Google-managed key; that process
     * is transparent to the user.  Structure is documented below.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableEncryptionConfigurationArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param externalCatalogTableOptions Options defining open source
     * compatible table. Structure is documented below.
     * @return builder
     */
    def externalCatalogTableOptions(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableExternalCatalogTableOptionsArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableExternalCatalogTableOptionsArgs.builder
      builder.externalCatalogTableOptions(args(argsBuilder).build)

    /**
     * @param externalDataConfiguration Describes the data format,
     * location, and other properties of a table stored outside of BigQuery.
     * By defining these properties, the data source can then be queried as
     * if it were a standard BigQuery table. Structure is documented below.
     * @return builder
     */
    def externalDataConfiguration(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationArgs.builder
      builder.externalDataConfiguration(args(argsBuilder).build)

    /**
     * @param materializedView If specified, configures this table as a materialized view.
     * Structure is documented below.
     * @return builder
     */
    def materializedView(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableMaterializedViewArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableMaterializedViewArgs.builder
      builder.materializedView(args(argsBuilder).build)

    /**
     * @param rangePartitioning If specified, configures range-based
     * partitioning for this table. Structure is documented below.
     * @return builder
     */
    def rangePartitioning(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableRangePartitioningArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableRangePartitioningArgs.builder
      builder.rangePartitioning(args(argsBuilder).build)

    /**
     * @param schemaForeignTypeInfo Specifies metadata of the foreign data
     * type definition in field schema. Structure is documented below.
     * @return builder
     */
    def schemaForeignTypeInfo(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableSchemaForeignTypeInfoArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableSchemaForeignTypeInfoArgs.builder
      builder.schemaForeignTypeInfo(args(argsBuilder).build)

    /**
     * @param tableConstraints Defines the primary key and foreign keys.
     * Structure is documented below.
     * @return builder
     */
    def tableConstraints(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableTableConstraintsArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableTableConstraintsArgs.builder
      builder.tableConstraints(args(argsBuilder).build)

    /**
     * @param tableReplicationInfo Replication info of a table created
     * using &#34;AS REPLICA&#34; DDL like:
     * `CREATE MATERIALIZED VIEW mv1 AS REPLICA OF srcMv`.
     * Structure is documented below.
     * @return builder
     */
    def tableReplicationInfo(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableTableReplicationInfoArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableTableReplicationInfoArgs.builder
      builder.tableReplicationInfo(args(argsBuilder).build)

    /**
     * @param timePartitioning If specified, configures time-based
     * partitioning for this table. Structure is documented below.
     * @return builder
     */
    def timePartitioning(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableTimePartitioningArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableTimePartitioningArgs.builder
      builder.timePartitioning(args(argsBuilder).build)

    /**
     * @param view If specified, configures this table as a view.
     * Structure is documented below.
     * @return builder
     */
    def view(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableViewArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableViewArgs.builder
      builder.view(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.TableTableConstraintsArgs.Builder)
    /**
     * @param foreignKeys Present only if the table has a foreign key.
     * The foreign key is not enforced.
     * Structure is documented below.
     * @return builder
     */
    def foreignKeys(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableTableConstraintsForeignKeyArgs.Builder]*):
        com.pulumi.gcp.bigquery.inputs.TableTableConstraintsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigquery.inputs.TableTableConstraintsForeignKeyArgs.builder
      builder.foreignKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param primaryKey Represents the primary key constraint
     * on a table&#39;s columns. Present only if the table has a primary key.
     * The primary key is not enforced.
     * Structure is documented below.
     * @return builder
     */
    def primaryKey(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableTableConstraintsPrimaryKeyArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableTableConstraintsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableTableConstraintsPrimaryKeyArgs.builder
      builder.primaryKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquery.inputs.TableTableConstraintsForeignKeyArgs.Builder)
    /**
     * @param columnReferences The pair of the foreign key column and primary key column.
     * Structure is documented below.
     * @return builder
     */
    def columnReferences(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableTableConstraintsForeignKeyColumnReferencesArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableTableConstraintsForeignKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableTableConstraintsForeignKeyColumnReferencesArgs.builder
      builder.columnReferences(args(argsBuilder).build)

    /**
     * @param referencedTable The table that holds the primary key
     * and is referenced by this foreign key.
     * Structure is documented below.
     * @return builder
     */
    def referencedTable(args: Endofunction[com.pulumi.gcp.bigquery.inputs.TableTableConstraintsForeignKeyReferencedTableArgs.Builder]):
        com.pulumi.gcp.bigquery.inputs.TableTableConstraintsForeignKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.TableTableConstraintsForeignKeyReferencedTableArgs.builder
      builder.referencedTable(args(argsBuilder).build)
