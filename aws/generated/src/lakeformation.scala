package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object lakeformation:
  /** Resource for managing an AWS Lake Formation Data Cells Filter. */
  def DataCellsFilter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.lakeformation.DataCellsFilterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lakeformation.DataCellsFilterArgs.builder
    com.pulumi.aws.lakeformation.DataCellsFilter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /**
   * Manages Lake Formation principals designated as data lake administrators and lists of principal permission entries for default create database and default create table permissions.
   * 
   * &gt; **NOTE:** Lake Formation introduces fine-grained access control for data in your data lake. Part of the changes include the `IAMAllowedPrincipals` principal in order to make Lake Formation backwards compatible with existing IAM and Glue permissions. For more information, see [Changing the Default Security Settings for Your Data Lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html) and [Upgrading AWS Glue Data Permissions to the AWS Lake Formation Model](https://docs.aws.amazon.com/lake-formation/latest/dg/upgrade-glue-lake-formation.html).
   */
  def DataLakeSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.lakeformation.DataLakeSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lakeformation.DataLakeSettingsArgs.builder
    com.pulumi.aws.lakeformation.DataLakeSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /** Manages an AWS Lake Formation Identity Center Configuration. */
  def IdentityCenterConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.lakeformation.IdentityCenterConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lakeformation.IdentityCenterConfigurationArgs.builder
    com.pulumi.aws.lakeformation.IdentityCenterConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object LakeformationFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Get Lake Formation principals designated as data lake administrators and lists of principal permission entries for default create database and default create table permissions. */
    inline def getDataLakeSettings(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetDataLakeSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.lakeformation.outputs.GetDataLakeSettingsResult] =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetDataLakeSettingsArgs.builder
      com.pulumi.aws.lakeformation.LakeformationFunctions.getDataLakeSettings(args(argsBuilder).build)

    /** Get Lake Formation principals designated as data lake administrators and lists of principal permission entries for default create database and default create table permissions. */
    inline def getDataLakeSettingsPlain(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetDataLakeSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lakeformation.outputs.GetDataLakeSettingsResult] =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetDataLakeSettingsPlainArgs.builder
      com.pulumi.aws.lakeformation.LakeformationFunctions.getDataLakeSettingsPlain(args(argsBuilder).build)

    /**
     * Get permissions for a principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3. Permissions are granted to a principal, in a Data Catalog, relative to a Lake Formation resource, which includes the Data Catalog, databases, tables, LF-tags, and LF-tag policies. For more information, see [Security and Access Control to Metadata and Data in Lake Formation](https://docs.aws.amazon.com/lake-formation/latest/dg/security-data-access.html).
     * 
     * &gt; **NOTE:** This data source deals with explicitly granted permissions. Lake Formation grants implicit permissions to data lake administrators, database creators, and table creators. For more information, see [Implicit Lake Formation Permissions](https://docs.aws.amazon.com/lake-formation/latest/dg/implicit-permissions.html).
     */
    inline def getPermissions(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.lakeformation.outputs.GetPermissionsResult] =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs.builder
      com.pulumi.aws.lakeformation.LakeformationFunctions.getPermissions(args(argsBuilder).build)

    /**
     * Get permissions for a principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3. Permissions are granted to a principal, in a Data Catalog, relative to a Lake Formation resource, which includes the Data Catalog, databases, tables, LF-tags, and LF-tag policies. For more information, see [Security and Access Control to Metadata and Data in Lake Formation](https://docs.aws.amazon.com/lake-formation/latest/dg/security-data-access.html).
     * 
     * &gt; **NOTE:** This data source deals with explicitly granted permissions. Lake Formation grants implicit permissions to data lake administrators, database creators, and table creators. For more information, see [Implicit Lake Formation Permissions](https://docs.aws.amazon.com/lake-formation/latest/dg/implicit-permissions.html).
     */
    inline def getPermissionsPlain(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetPermissionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lakeformation.outputs.GetPermissionsResult] =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetPermissionsPlainArgs.builder
      com.pulumi.aws.lakeformation.LakeformationFunctions.getPermissionsPlain(args(argsBuilder).build)

    /** Provides details about a Lake Formation resource. */
    inline def getResource(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetResourceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.lakeformation.outputs.GetResourceResult] =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetResourceArgs.builder
      com.pulumi.aws.lakeformation.LakeformationFunctions.getResource(args(argsBuilder).build)

    /** Provides details about a Lake Formation resource. */
    inline def getResourcePlain(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetResourcePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lakeformation.outputs.GetResourceResult] =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetResourcePlainArgs.builder
      com.pulumi.aws.lakeformation.LakeformationFunctions.getResourcePlain(args(argsBuilder).build)

  /** Creates an LF-Tag with the specified name and values. Each key must have at least one value. The maximum number of values permitted is 1000. */
  def LfTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.lakeformation.LfTagArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lakeformation.LfTagArgs.builder
    com.pulumi.aws.lakeformation.LfTag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS Lake Formation LF Tag Expression. */
  def LfTagExpression(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.lakeformation.LfTagExpressionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lakeformation.LfTagExpressionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.lakeformation.LfTagExpression(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /** Resource for managing an AWS Lake Formation Opt In. */
  def OptIn(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.lakeformation.OptInArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lakeformation.OptInArgs.builder
    com.pulumi.aws.lakeformation.OptIn(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /**
   * Grants permissions to the principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3. Permissions are granted to a principal, in a Data Catalog, relative to a Lake Formation resource, which includes the Data Catalog, databases, tables, LF-tags, and LF-tag policies. For more information, see [Security and Access Control to Metadata and Data in Lake Formation](https://docs.aws.amazon.com/lake-formation/latest/dg/security-data-access.html).
   * 
   * &gt; **WARNING:** Lake Formation permissions are not in effect by default within AWS. Using this resource will not secure your data and will result in errors if you do not change the security settings for existing resources and the default security settings for new resources. See Default Behavior and `IAMAllowedPrincipals` for additional details.
   * 
   * &gt; **NOTE:** In general, the `principal` should _NOT_ be a Lake Formation administrator or the entity (e.g., IAM role) that is running the deployment. Administrators have implicit permissions. These should be managed by granting or not granting administrator rights using `aws.lakeformation.DataLakeSettings`, _not_ with this resource.
   */
  def Permissions(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.lakeformation.PermissionsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lakeformation.PermissionsArgs.builder
    com.pulumi.aws.lakeformation.Permissions(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /**
   * Registers a Lake Formation resource (e.g., S3 bucket) as managed by the Data Catalog. In other words, the S3 path is added to the data lake.
   * 
   * Choose a role that has read/write access to the chosen Amazon S3 path or use the service-linked role.
   * When you register the S3 path, the service-linked role and a new inline policy are created on your behalf.
   * Lake Formation adds the first path to the inline policy and attaches it to the service-linked role.
   * When you register subsequent paths, Lake Formation adds the path to the existing policy.
   */
  def Resource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.lakeformation.ResourceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lakeformation.ResourceArgs.builder
    com.pulumi.aws.lakeformation.Resource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS Lake Formation Resource LF Tag. */
  def ResourceLfTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.lakeformation.ResourceLfTagArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lakeformation.ResourceLfTagArgs.builder
    com.pulumi.aws.lakeformation.ResourceLfTag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /** Manages an attachment between one or more existing LF-tags and an existing Lake Formation resource. */
  def ResourceLfTags(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.lakeformation.ResourceLfTagsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lakeformation.ResourceLfTagsArgs.builder
    com.pulumi.aws.lakeformation.ResourceLfTags(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
