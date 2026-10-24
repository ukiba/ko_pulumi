package jp.ukiba.ko_pulumi
package aws

object lakeformation_ext:
  extension (builder: com.pulumi.aws.lakeformation.DataCellsFilterArgs.Builder)
    /**
     * @param tableData Information about the data cells filter. See Table Data below for details.
     * @return builder
     */
    def tableData(args: Endofunction[com.pulumi.aws.lakeformation.inputs.DataCellsFilterTableDataArgs.Builder]):
        com.pulumi.aws.lakeformation.DataCellsFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.DataCellsFilterTableDataArgs.builder
      builder.tableData(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.lakeformation.inputs.DataCellsFilterTimeoutsArgs.Builder]):
        com.pulumi.aws.lakeformation.DataCellsFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.DataCellsFilterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lakeformation.DataLakeSettingsArgs.Builder)
    /**
     * @param createDatabaseDefaultPermissions Up to three configuration blocks of principal permissions for default create database permissions. Detailed below.
     * @return builder
     */
    def createDatabaseDefaultPermissions(args: Endofunction[com.pulumi.aws.lakeformation.inputs.DataLakeSettingsCreateDatabaseDefaultPermissionArgs.Builder]*):
        com.pulumi.aws.lakeformation.DataLakeSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.DataLakeSettingsCreateDatabaseDefaultPermissionArgs.builder
      builder.createDatabaseDefaultPermissions(args.map(_(argsBuilder).build)*)

    /**
     * @param createTableDefaultPermissions Up to three configuration blocks of principal permissions for default create table permissions. Detailed below.
     * @return builder
     */
    def createTableDefaultPermissions(args: Endofunction[com.pulumi.aws.lakeformation.inputs.DataLakeSettingsCreateTableDefaultPermissionArgs.Builder]*):
        com.pulumi.aws.lakeformation.DataLakeSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.DataLakeSettingsCreateTableDefaultPermissionArgs.builder
      builder.createTableDefaultPermissions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lakeformation.LfTagExpressionArgs.Builder)
    /**
     * @param expressions A list of LF-Tag conditions (key-value pairs). See expression for more details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def expressions(args: Endofunction[com.pulumi.aws.lakeformation.inputs.LfTagExpressionExpressionArgs.Builder]*):
        com.pulumi.aws.lakeformation.LfTagExpressionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.LfTagExpressionExpressionArgs.builder
      builder.expressions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lakeformation.OptInArgs.Builder)
    /**
     * @param conditions Lake Formation condition, which applies to permissions and opt-ins that contain an expression. See `condition` Block for more details.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.lakeformation.inputs.OptInConditionArgs.Builder]*):
        com.pulumi.aws.lakeformation.OptInArgs.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.OptInConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param principals Lake Formation principal. Supported principals are IAM users or IAM roles. See `principal` Block for more details.
     * @return builder
     */
    def principals(args: Endofunction[com.pulumi.aws.lakeformation.inputs.OptInPrincipalArgs.Builder]*):
        com.pulumi.aws.lakeformation.OptInArgs.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.OptInPrincipalArgs.builder
      builder.principals(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceDatas Structure for the resource. See `resourceData` Block for more details.
     * @return builder
     */
    def resourceDatas(args: Endofunction[com.pulumi.aws.lakeformation.inputs.OptInResourceDataArgs.Builder]*):
        com.pulumi.aws.lakeformation.OptInArgs.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.OptInResourceDataArgs.builder
      builder.resourceDatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lakeformation.PermissionsArgs.Builder)
    /**
     * @param dataCellsFilter Configuration block for a data cells filter resource. Detailed below.
     * @return builder
     */
    def dataCellsFilter(args: Endofunction[com.pulumi.aws.lakeformation.inputs.PermissionsDataCellsFilterArgs.Builder]):
        com.pulumi.aws.lakeformation.PermissionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.PermissionsDataCellsFilterArgs.builder
      builder.dataCellsFilter(args(argsBuilder).build)

    /**
     * @param dataLocation Configuration block for a data location resource. Detailed below.
     * @return builder
     */
    def dataLocation(args: Endofunction[com.pulumi.aws.lakeformation.inputs.PermissionsDataLocationArgs.Builder]):
        com.pulumi.aws.lakeformation.PermissionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.PermissionsDataLocationArgs.builder
      builder.dataLocation(args(argsBuilder).build)

    /**
     * @param database Configuration block for a database resource. Detailed below.
     * @return builder
     */
    def database(args: Endofunction[com.pulumi.aws.lakeformation.inputs.PermissionsDatabaseArgs.Builder]):
        com.pulumi.aws.lakeformation.PermissionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.PermissionsDatabaseArgs.builder
      builder.database(args(argsBuilder).build)

    /**
     * @param lfTag Configuration block for an LF-tag resource. Detailed below.
     * @return builder
     */
    def lfTag(args: Endofunction[com.pulumi.aws.lakeformation.inputs.PermissionsLfTagArgs.Builder]):
        com.pulumi.aws.lakeformation.PermissionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.PermissionsLfTagArgs.builder
      builder.lfTag(args(argsBuilder).build)

    /**
     * @param lfTagPolicy Configuration block for an LF-tag policy resource. Detailed below.
     * @return builder
     */
    def lfTagPolicy(args: Endofunction[com.pulumi.aws.lakeformation.inputs.PermissionsLfTagPolicyArgs.Builder]):
        com.pulumi.aws.lakeformation.PermissionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.PermissionsLfTagPolicyArgs.builder
      builder.lfTagPolicy(args(argsBuilder).build)

    /**
     * @param table Configuration block for a table resource. Detailed below.
     * @return builder
     */
    def table(args: Endofunction[com.pulumi.aws.lakeformation.inputs.PermissionsTableArgs.Builder]):
        com.pulumi.aws.lakeformation.PermissionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.PermissionsTableArgs.builder
      builder.table(args(argsBuilder).build)

    /**
     * @param tableWithColumns Configuration block for a table with columns resource. Detailed below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def tableWithColumns(args: Endofunction[com.pulumi.aws.lakeformation.inputs.PermissionsTableWithColumnsArgs.Builder]):
        com.pulumi.aws.lakeformation.PermissionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.PermissionsTableWithColumnsArgs.builder
      builder.tableWithColumns(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lakeformation.ResourceLfTagArgs.Builder)
    /**
     * @param database Configuration block for a database resource. See Database for more details.
     * @return builder
     */
    def database(args: Endofunction[com.pulumi.aws.lakeformation.inputs.ResourceLfTagDatabaseArgs.Builder]):
        com.pulumi.aws.lakeformation.ResourceLfTagArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.ResourceLfTagDatabaseArgs.builder
      builder.database(args(argsBuilder).build)

    /**
     * @param lfTag Set of LF-tags to attach to the resource. See LF Tag for more details.
     * 
     * Exactly one of the following is required:
     * @return builder
     */
    def lfTag(args: Endofunction[com.pulumi.aws.lakeformation.inputs.ResourceLfTagLfTagArgs.Builder]):
        com.pulumi.aws.lakeformation.ResourceLfTagArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.ResourceLfTagLfTagArgs.builder
      builder.lfTag(args(argsBuilder).build)

    /**
     * @param table Configuration block for a table resource. See Table for more details.
     * @return builder
     */
    def table(args: Endofunction[com.pulumi.aws.lakeformation.inputs.ResourceLfTagTableArgs.Builder]):
        com.pulumi.aws.lakeformation.ResourceLfTagArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.ResourceLfTagTableArgs.builder
      builder.table(args(argsBuilder).build)

    /**
     * @param tableWithColumns Configuration block for a table with columns resource. See Table With Columns for more details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def tableWithColumns(args: Endofunction[com.pulumi.aws.lakeformation.inputs.ResourceLfTagTableWithColumnsArgs.Builder]):
        com.pulumi.aws.lakeformation.ResourceLfTagArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.ResourceLfTagTableWithColumnsArgs.builder
      builder.tableWithColumns(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.lakeformation.inputs.ResourceLfTagTimeoutsArgs.Builder]):
        com.pulumi.aws.lakeformation.ResourceLfTagArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.ResourceLfTagTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lakeformation.ResourceLfTagsArgs.Builder)
    /**
     * @param database Configuration block for a database resource. See below.
     * @return builder
     */
    def database(args: Endofunction[com.pulumi.aws.lakeformation.inputs.ResourceLfTagsDatabaseArgs.Builder]):
        com.pulumi.aws.lakeformation.ResourceLfTagsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.ResourceLfTagsDatabaseArgs.builder
      builder.database(args(argsBuilder).build)

    /**
     * @param lfTags Set of LF-tags to attach to the resource. See below.
     * 
     * Exactly one of the following is required:
     * @return builder
     */
    def lfTags(args: Endofunction[com.pulumi.aws.lakeformation.inputs.ResourceLfTagsLfTagArgs.Builder]*):
        com.pulumi.aws.lakeformation.ResourceLfTagsArgs.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.ResourceLfTagsLfTagArgs.builder
      builder.lfTags(args.map(_(argsBuilder).build)*)

    /**
     * @param table Configuration block for a table resource. See below.
     * @return builder
     */
    def table(args: Endofunction[com.pulumi.aws.lakeformation.inputs.ResourceLfTagsTableArgs.Builder]):
        com.pulumi.aws.lakeformation.ResourceLfTagsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.ResourceLfTagsTableArgs.builder
      builder.table(args(argsBuilder).build)

    /**
     * @param tableWithColumns Configuration block for a table with columns resource. See below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def tableWithColumns(args: Endofunction[com.pulumi.aws.lakeformation.inputs.ResourceLfTagsTableWithColumnsArgs.Builder]):
        com.pulumi.aws.lakeformation.ResourceLfTagsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.ResourceLfTagsTableWithColumnsArgs.builder
      builder.tableWithColumns(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lakeformation.inputs.DataCellsFilterState.Builder)
    /**
     * @param tableData Information about the data cells filter. See Table Data below for details.
     * @return builder
     */
    def tableData(args: Endofunction[com.pulumi.aws.lakeformation.inputs.DataCellsFilterTableDataArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.DataCellsFilterState.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.DataCellsFilterTableDataArgs.builder
      builder.tableData(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.lakeformation.inputs.DataCellsFilterTimeoutsArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.DataCellsFilterState.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.DataCellsFilterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lakeformation.inputs.DataCellsFilterTableDataArgs.Builder)
    /**
     * @param columnWildcard A wildcard with exclusions. See Column Wildcard below for details.
     * @return builder
     */
    def columnWildcard(args: Endofunction[com.pulumi.aws.lakeformation.inputs.DataCellsFilterTableDataColumnWildcardArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.DataCellsFilterTableDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.DataCellsFilterTableDataColumnWildcardArgs.builder
      builder.columnWildcard(args(argsBuilder).build)

    /**
     * @param rowFilter A PartiQL predicate. See Row Filter below for details.
     * @return builder
     */
    def rowFilter(args: Endofunction[com.pulumi.aws.lakeformation.inputs.DataCellsFilterTableDataRowFilterArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.DataCellsFilterTableDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.DataCellsFilterTableDataRowFilterArgs.builder
      builder.rowFilter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lakeformation.inputs.DataCellsFilterTableDataRowFilterArgs.Builder)
    /**
     * @param allRowsWildcard (Optional) A wildcard that matches all rows. Required when applying column-level filtering without row-level filtering. Use an empty block: `allRowsWildcard {}`.
     * @return builder
     */
    def allRowsWildcard(args: Endofunction[com.pulumi.aws.lakeformation.inputs.DataCellsFilterTableDataRowFilterAllRowsWildcardArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.DataCellsFilterTableDataRowFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.DataCellsFilterTableDataRowFilterAllRowsWildcardArgs.builder
      builder.allRowsWildcard(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lakeformation.inputs.DataLakeSettingsState.Builder)
    /**
     * @param createDatabaseDefaultPermissions Up to three configuration blocks of principal permissions for default create database permissions. Detailed below.
     * @return builder
     */
    def createDatabaseDefaultPermissions(args: Endofunction[com.pulumi.aws.lakeformation.inputs.DataLakeSettingsCreateDatabaseDefaultPermissionArgs.Builder]*):
        com.pulumi.aws.lakeformation.inputs.DataLakeSettingsState.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.DataLakeSettingsCreateDatabaseDefaultPermissionArgs.builder
      builder.createDatabaseDefaultPermissions(args.map(_(argsBuilder).build)*)

    /**
     * @param createTableDefaultPermissions Up to three configuration blocks of principal permissions for default create table permissions. Detailed below.
     * @return builder
     */
    def createTableDefaultPermissions(args: Endofunction[com.pulumi.aws.lakeformation.inputs.DataLakeSettingsCreateTableDefaultPermissionArgs.Builder]*):
        com.pulumi.aws.lakeformation.inputs.DataLakeSettingsState.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.DataLakeSettingsCreateTableDefaultPermissionArgs.builder
      builder.createTableDefaultPermissions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs.Builder)
    /**
     * @param dataCellsFilter Configuration block for a data cells filter resource. Detailed below.
     * @return builder
     */
    def dataCellsFilter(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetPermissionsDataCellsFilterArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetPermissionsDataCellsFilterArgs.builder
      builder.dataCellsFilter(args(argsBuilder).build)

    /**
     * @param dataLocation Configuration block for a data location resource. Detailed below.
     * @return builder
     */
    def dataLocation(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetPermissionsDataLocationArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetPermissionsDataLocationArgs.builder
      builder.dataLocation(args(argsBuilder).build)

    /**
     * @param database Configuration block for a database resource. Detailed below.
     * @return builder
     */
    def database(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetPermissionsDatabaseArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetPermissionsDatabaseArgs.builder
      builder.database(args(argsBuilder).build)

    /**
     * @param lfTag Configuration block for an LF-tag resource. Detailed below.
     * @return builder
     */
    def lfTag(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTagArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTagArgs.builder
      builder.lfTag(args(argsBuilder).build)

    /**
     * @param lfTagPolicy Configuration block for an LF-tag policy resource. Detailed below.
     * @return builder
     */
    def lfTagPolicy(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTagPolicyArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTagPolicyArgs.builder
      builder.lfTagPolicy(args(argsBuilder).build)

    /**
     * @param table Configuration block for a table resource. Detailed below.
     * @return builder
     */
    def table(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetPermissionsTableArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetPermissionsTableArgs.builder
      builder.table(args(argsBuilder).build)

    /**
     * @param tableWithColumns Configuration block for a table with columns resource. Detailed below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def tableWithColumns(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetPermissionsTableWithColumnsArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetPermissionsTableWithColumnsArgs.builder
      builder.tableWithColumns(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTagPolicy.Builder)
    /**
     * @param expressions List of tag conditions that apply to the resource&#39;s tag policy. Configuration block for tag conditions that apply to the policy. See `expression` below.
     * 
     * The following argument is optional:
     * @return builder
     */
    def expressions(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTagPolicyExpression.Builder]*):
        com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTagPolicy.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTagPolicyExpression.builder
      builder.expressions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTagPolicyArgs.Builder)
    /**
     * @param expressions List of tag conditions that apply to the resource&#39;s tag policy. Configuration block for tag conditions that apply to the policy. See `expression` below.
     * 
     * The following argument is optional:
     * @return builder
     */
    def expressions(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTagPolicyExpressionArgs.Builder]*):
        com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTagPolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTagPolicyExpressionArgs.builder
      builder.expressions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lakeformation.inputs.GetPermissionsPlainArgs.Builder)
    /**
     * @param dataCellsFilter Configuration block for a data cells filter resource. Detailed below.
     * @return builder
     */
    def dataCellsFilter(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetPermissionsDataCellsFilter.Builder]):
        com.pulumi.aws.lakeformation.inputs.GetPermissionsPlainArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetPermissionsDataCellsFilter.builder
      builder.dataCellsFilter(args(argsBuilder).build)

    /**
     * @param dataLocation Configuration block for a data location resource. Detailed below.
     * @return builder
     */
    def dataLocation(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetPermissionsDataLocation.Builder]):
        com.pulumi.aws.lakeformation.inputs.GetPermissionsPlainArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetPermissionsDataLocation.builder
      builder.dataLocation(args(argsBuilder).build)

    /**
     * @param database Configuration block for a database resource. Detailed below.
     * @return builder
     */
    def database(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetPermissionsDatabase.Builder]):
        com.pulumi.aws.lakeformation.inputs.GetPermissionsPlainArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetPermissionsDatabase.builder
      builder.database(args(argsBuilder).build)

    /**
     * @param lfTag Configuration block for an LF-tag resource. Detailed below.
     * @return builder
     */
    def lfTag(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTag.Builder]):
        com.pulumi.aws.lakeformation.inputs.GetPermissionsPlainArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTag.builder
      builder.lfTag(args(argsBuilder).build)

    /**
     * @param lfTagPolicy Configuration block for an LF-tag policy resource. Detailed below.
     * @return builder
     */
    def lfTagPolicy(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTagPolicy.Builder]):
        com.pulumi.aws.lakeformation.inputs.GetPermissionsPlainArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTagPolicy.builder
      builder.lfTagPolicy(args(argsBuilder).build)

    /**
     * @param table Configuration block for a table resource. Detailed below.
     * @return builder
     */
    def table(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetPermissionsTable.Builder]):
        com.pulumi.aws.lakeformation.inputs.GetPermissionsPlainArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetPermissionsTable.builder
      builder.table(args(argsBuilder).build)

    /**
     * @param tableWithColumns Configuration block for a table with columns resource. Detailed below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def tableWithColumns(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetPermissionsTableWithColumns.Builder]):
        com.pulumi.aws.lakeformation.inputs.GetPermissionsPlainArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetPermissionsTableWithColumns.builder
      builder.tableWithColumns(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lakeformation.inputs.LfTagExpressionState.Builder)
    /**
     * @param expressions A list of LF-Tag conditions (key-value pairs). See expression for more details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def expressions(args: Endofunction[com.pulumi.aws.lakeformation.inputs.LfTagExpressionExpressionArgs.Builder]*):
        com.pulumi.aws.lakeformation.inputs.LfTagExpressionState.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.LfTagExpressionExpressionArgs.builder
      builder.expressions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lakeformation.inputs.OptInResourceDataArgs.Builder)
    /**
     * @param catalogs Identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your Lake Formation environment. See `catalog` Block for more details.
     * @return builder
     */
    def catalogs(args: Endofunction[com.pulumi.aws.lakeformation.inputs.OptInResourceDataCatalogArgs.Builder]*):
        com.pulumi.aws.lakeformation.inputs.OptInResourceDataArgs.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.OptInResourceDataCatalogArgs.builder
      builder.catalogs(args.map(_(argsBuilder).build)*)

    /**
     * @param dataCellsFilters Data cell filter. See `dataCellsFilter` Block for more details.
     * @return builder
     */
    def dataCellsFilters(args: Endofunction[com.pulumi.aws.lakeformation.inputs.OptInResourceDataDataCellsFilterArgs.Builder]*):
        com.pulumi.aws.lakeformation.inputs.OptInResourceDataArgs.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.OptInResourceDataDataCellsFilterArgs.builder
      builder.dataCellsFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param dataLocations Location of an Amazon S3 path where permissions are granted or revoked. See `dataLocation` Block for more details.
     * @return builder
     */
    def dataLocations(args: Endofunction[com.pulumi.aws.lakeformation.inputs.OptInResourceDataDataLocationArgs.Builder]*):
        com.pulumi.aws.lakeformation.inputs.OptInResourceDataArgs.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.OptInResourceDataDataLocationArgs.builder
      builder.dataLocations(args.map(_(argsBuilder).build)*)

    /**
     * @param database Database for the resource. Unique to the Data Catalog. A database is a set of associated table definitions organized into a logical group. You can Grant and Revoke database permissions to a principal. See `database` Block for more details.
     * @return builder
     */
    def database(args: Endofunction[com.pulumi.aws.lakeformation.inputs.OptInResourceDataDatabaseArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.OptInResourceDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.OptInResourceDataDatabaseArgs.builder
      builder.database(args(argsBuilder).build)

    /**
     * @param lfTag LF-tag key and values attached to a resource.
     * @return builder
     */
    def lfTag(args: Endofunction[com.pulumi.aws.lakeformation.inputs.OptInResourceDataLfTagArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.OptInResourceDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.OptInResourceDataLfTagArgs.builder
      builder.lfTag(args(argsBuilder).build)

    /**
     * @param lfTagExpressions Logical expression composed of one or more LF-Tag key:value pairs. See `lfTagExpression` Block for more details.
     * @return builder
     */
    def lfTagExpressions(args: Endofunction[com.pulumi.aws.lakeformation.inputs.OptInResourceDataLfTagExpressionArgs.Builder]*):
        com.pulumi.aws.lakeformation.inputs.OptInResourceDataArgs.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.OptInResourceDataLfTagExpressionArgs.builder
      builder.lfTagExpressions(args.map(_(argsBuilder).build)*)

    /**
     * @param lfTagPolicies List of LF-Tag conditions or saved LF-Tag expressions that define a resource&#39;s LF-Tag policy. See `lfTagPolicy` Block for more details.
     * @return builder
     */
    def lfTagPolicies(args: Endofunction[com.pulumi.aws.lakeformation.inputs.OptInResourceDataLfTagPolicyArgs.Builder]*):
        com.pulumi.aws.lakeformation.inputs.OptInResourceDataArgs.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.OptInResourceDataLfTagPolicyArgs.builder
      builder.lfTagPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param table Table for the resource. A table is a metadata definition that represents your data. You can Grant and Revoke table privileges to a principal. See `table` Block for more details.
     * @return builder
     */
    def table(args: Endofunction[com.pulumi.aws.lakeformation.inputs.OptInResourceDataTableArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.OptInResourceDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.OptInResourceDataTableArgs.builder
      builder.table(args(argsBuilder).build)

    /**
     * @param tableWithColumns Table with columns for the resource. A principal with permissions to this resource can select metadata from the columns of a table in the Data Catalog and the underlying data in Amazon S3. See `tableWithColumns` Block for more details.
     * @return builder
     */
    def tableWithColumns(args: Endofunction[com.pulumi.aws.lakeformation.inputs.OptInResourceDataTableWithColumnsArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.OptInResourceDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.OptInResourceDataTableWithColumnsArgs.builder
      builder.tableWithColumns(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lakeformation.inputs.OptInResourceDataTableWithColumnsArgs.Builder)
    /**
     * @param columnWildcard Wildcard specified by a ColumnWildcard object. At least one of ColumnNames or ColumnWildcard is required. See `columnWildcard` Block for more details.
     * @return builder
     */
    def columnWildcard(args: Endofunction[com.pulumi.aws.lakeformation.inputs.OptInResourceDataTableWithColumnsColumnWildcardArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.OptInResourceDataTableWithColumnsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.OptInResourceDataTableWithColumnsColumnWildcardArgs.builder
      builder.columnWildcard(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lakeformation.inputs.OptInState.Builder)
    /**
     * @param conditions Lake Formation condition, which applies to permissions and opt-ins that contain an expression. See `condition` Block for more details.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.lakeformation.inputs.OptInConditionArgs.Builder]*):
        com.pulumi.aws.lakeformation.inputs.OptInState.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.OptInConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param principals Lake Formation principal. Supported principals are IAM users or IAM roles. See `principal` Block for more details.
     * @return builder
     */
    def principals(args: Endofunction[com.pulumi.aws.lakeformation.inputs.OptInPrincipalArgs.Builder]*):
        com.pulumi.aws.lakeformation.inputs.OptInState.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.OptInPrincipalArgs.builder
      builder.principals(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceDatas Structure for the resource. See `resourceData` Block for more details.
     * @return builder
     */
    def resourceDatas(args: Endofunction[com.pulumi.aws.lakeformation.inputs.OptInResourceDataArgs.Builder]*):
        com.pulumi.aws.lakeformation.inputs.OptInState.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.OptInResourceDataArgs.builder
      builder.resourceDatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lakeformation.inputs.PermissionsLfTagPolicyArgs.Builder)
    /**
     * @param expressions A list of tag conditions that apply to the resource&#39;s tag policy. Configuration block for tag conditions that apply to the policy. See `expression` below.
     * 
     * The following argument is optional:
     * @return builder
     */
    def expressions(args: Endofunction[com.pulumi.aws.lakeformation.inputs.PermissionsLfTagPolicyExpressionArgs.Builder]*):
        com.pulumi.aws.lakeformation.inputs.PermissionsLfTagPolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.PermissionsLfTagPolicyExpressionArgs.builder
      builder.expressions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lakeformation.inputs.PermissionsState.Builder)
    /**
     * @param dataCellsFilter Configuration block for a data cells filter resource. Detailed below.
     * @return builder
     */
    def dataCellsFilter(args: Endofunction[com.pulumi.aws.lakeformation.inputs.PermissionsDataCellsFilterArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.PermissionsState.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.PermissionsDataCellsFilterArgs.builder
      builder.dataCellsFilter(args(argsBuilder).build)

    /**
     * @param dataLocation Configuration block for a data location resource. Detailed below.
     * @return builder
     */
    def dataLocation(args: Endofunction[com.pulumi.aws.lakeformation.inputs.PermissionsDataLocationArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.PermissionsState.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.PermissionsDataLocationArgs.builder
      builder.dataLocation(args(argsBuilder).build)

    /**
     * @param database Configuration block for a database resource. Detailed below.
     * @return builder
     */
    def database(args: Endofunction[com.pulumi.aws.lakeformation.inputs.PermissionsDatabaseArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.PermissionsState.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.PermissionsDatabaseArgs.builder
      builder.database(args(argsBuilder).build)

    /**
     * @param lfTag Configuration block for an LF-tag resource. Detailed below.
     * @return builder
     */
    def lfTag(args: Endofunction[com.pulumi.aws.lakeformation.inputs.PermissionsLfTagArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.PermissionsState.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.PermissionsLfTagArgs.builder
      builder.lfTag(args(argsBuilder).build)

    /**
     * @param lfTagPolicy Configuration block for an LF-tag policy resource. Detailed below.
     * @return builder
     */
    def lfTagPolicy(args: Endofunction[com.pulumi.aws.lakeformation.inputs.PermissionsLfTagPolicyArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.PermissionsState.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.PermissionsLfTagPolicyArgs.builder
      builder.lfTagPolicy(args(argsBuilder).build)

    /**
     * @param table Configuration block for a table resource. Detailed below.
     * @return builder
     */
    def table(args: Endofunction[com.pulumi.aws.lakeformation.inputs.PermissionsTableArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.PermissionsState.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.PermissionsTableArgs.builder
      builder.table(args(argsBuilder).build)

    /**
     * @param tableWithColumns Configuration block for a table with columns resource. Detailed below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def tableWithColumns(args: Endofunction[com.pulumi.aws.lakeformation.inputs.PermissionsTableWithColumnsArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.PermissionsState.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.PermissionsTableWithColumnsArgs.builder
      builder.tableWithColumns(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lakeformation.inputs.ResourceLfTagState.Builder)
    /**
     * @param database Configuration block for a database resource. See Database for more details.
     * @return builder
     */
    def database(args: Endofunction[com.pulumi.aws.lakeformation.inputs.ResourceLfTagDatabaseArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.ResourceLfTagState.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.ResourceLfTagDatabaseArgs.builder
      builder.database(args(argsBuilder).build)

    /**
     * @param lfTag Set of LF-tags to attach to the resource. See LF Tag for more details.
     * 
     * Exactly one of the following is required:
     * @return builder
     */
    def lfTag(args: Endofunction[com.pulumi.aws.lakeformation.inputs.ResourceLfTagLfTagArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.ResourceLfTagState.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.ResourceLfTagLfTagArgs.builder
      builder.lfTag(args(argsBuilder).build)

    /**
     * @param table Configuration block for a table resource. See Table for more details.
     * @return builder
     */
    def table(args: Endofunction[com.pulumi.aws.lakeformation.inputs.ResourceLfTagTableArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.ResourceLfTagState.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.ResourceLfTagTableArgs.builder
      builder.table(args(argsBuilder).build)

    /**
     * @param tableWithColumns Configuration block for a table with columns resource. See Table With Columns for more details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def tableWithColumns(args: Endofunction[com.pulumi.aws.lakeformation.inputs.ResourceLfTagTableWithColumnsArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.ResourceLfTagState.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.ResourceLfTagTableWithColumnsArgs.builder
      builder.tableWithColumns(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.lakeformation.inputs.ResourceLfTagTimeoutsArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.ResourceLfTagState.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.ResourceLfTagTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lakeformation.inputs.ResourceLfTagTableWithColumnsArgs.Builder)
    /**
     * @param columnWildcard Option to add column wildcard. See Column Wildcard for more details.
     * @return builder
     */
    def columnWildcard(args: Endofunction[com.pulumi.aws.lakeformation.inputs.ResourceLfTagTableWithColumnsColumnWildcardArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.ResourceLfTagTableWithColumnsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.ResourceLfTagTableWithColumnsColumnWildcardArgs.builder
      builder.columnWildcard(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lakeformation.inputs.ResourceLfTagsState.Builder)
    /**
     * @param database Configuration block for a database resource. See below.
     * @return builder
     */
    def database(args: Endofunction[com.pulumi.aws.lakeformation.inputs.ResourceLfTagsDatabaseArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.ResourceLfTagsState.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.ResourceLfTagsDatabaseArgs.builder
      builder.database(args(argsBuilder).build)

    /**
     * @param lfTags Set of LF-tags to attach to the resource. See below.
     * 
     * Exactly one of the following is required:
     * @return builder
     */
    def lfTags(args: Endofunction[com.pulumi.aws.lakeformation.inputs.ResourceLfTagsLfTagArgs.Builder]*):
        com.pulumi.aws.lakeformation.inputs.ResourceLfTagsState.Builder =
      def argsBuilder = com.pulumi.aws.lakeformation.inputs.ResourceLfTagsLfTagArgs.builder
      builder.lfTags(args.map(_(argsBuilder).build)*)

    /**
     * @param table Configuration block for a table resource. See below.
     * @return builder
     */
    def table(args: Endofunction[com.pulumi.aws.lakeformation.inputs.ResourceLfTagsTableArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.ResourceLfTagsState.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.ResourceLfTagsTableArgs.builder
      builder.table(args(argsBuilder).build)

    /**
     * @param tableWithColumns Configuration block for a table with columns resource. See below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def tableWithColumns(args: Endofunction[com.pulumi.aws.lakeformation.inputs.ResourceLfTagsTableWithColumnsArgs.Builder]):
        com.pulumi.aws.lakeformation.inputs.ResourceLfTagsState.Builder =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.ResourceLfTagsTableWithColumnsArgs.builder
      builder.tableWithColumns(args(argsBuilder).build)
