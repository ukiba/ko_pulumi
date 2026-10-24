package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object lakeformation:
  /** Resource for managing an AWS Lake Formation Data Cells Filter. */
  def DataCellsFilter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lakeformation.DataCellsFilterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lakeformation.DataCellsFilterArgs.builder
    com.pulumi.aws.lakeformation.DataCellsFilter(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages Lake Formation principals designated as data lake administrators and lists of principal permission entries for default create database and default create table permissions.
   * 
   * &gt; **NOTE:** Lake Formation introduces fine-grained access control for data in your data lake. Part of the changes include the `IAMAllowedPrincipals` principal in order to make Lake Formation backwards compatible with existing IAM and Glue permissions. For more information, see [Changing the Default Security Settings for Your Data Lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html) and [Upgrading AWS Glue Data Permissions to the AWS Lake Formation Model](https://docs.aws.amazon.com/lake-formation/latest/dg/upgrade-glue-lake-formation.html).
   */
  def DataLakeSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lakeformation.DataLakeSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lakeformation.DataLakeSettingsArgs.builder
    com.pulumi.aws.lakeformation.DataLakeSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Lake Formation Identity Center Configuration. */
  def IdentityCenterConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lakeformation.IdentityCenterConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lakeformation.IdentityCenterConfigurationArgs.builder
    com.pulumi.aws.lakeformation.IdentityCenterConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object LakeformationFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Get Lake Formation principals designated as data lake administrators and lists of principal permission entries for default create database and default create table permissions. */
    inline def getDataLakeSettings(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetDataLakeSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lakeformation.outputs.GetDataLakeSettingsResult] =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetDataLakeSettingsArgs.builder
      com.pulumi.aws.lakeformation.LakeformationFunctions.getDataLakeSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get Lake Formation principals designated as data lake administrators and lists of principal permission entries for default create database and default create table permissions. */
    inline def getDataLakeSettingsPlain(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetDataLakeSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lakeformation.outputs.GetDataLakeSettingsResult] =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetDataLakeSettingsPlainArgs.builder
      com.pulumi.aws.lakeformation.LakeformationFunctions.getDataLakeSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Get permissions for a principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3. Permissions are granted to a principal, in a Data Catalog, relative to a Lake Formation resource, which includes the Data Catalog, databases, tables, LF-tags, and LF-tag policies. For more information, see [Security and Access Control to Metadata and Data in Lake Formation](https://docs.aws.amazon.com/lake-formation/latest/dg/security-data-access.html).
     * 
     * &gt; **NOTE:** This data source deals with explicitly granted permissions. Lake Formation grants implicit permissions to data lake administrators, database creators, and table creators. For more information, see [Implicit Lake Formation Permissions](https://docs.aws.amazon.com/lake-formation/latest/dg/implicit-permissions.html).
     */
    inline def getPermissions(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lakeformation.outputs.GetPermissionsResult] =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs.builder
      com.pulumi.aws.lakeformation.LakeformationFunctions.getPermissions(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get permissions for a principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3. Permissions are granted to a principal, in a Data Catalog, relative to a Lake Formation resource, which includes the Data Catalog, databases, tables, LF-tags, and LF-tag policies. For more information, see [Security and Access Control to Metadata and Data in Lake Formation](https://docs.aws.amazon.com/lake-formation/latest/dg/security-data-access.html).
     * 
     * &gt; **NOTE:** This data source deals with explicitly granted permissions. Lake Formation grants implicit permissions to data lake administrators, database creators, and table creators. For more information, see [Implicit Lake Formation Permissions](https://docs.aws.amazon.com/lake-formation/latest/dg/implicit-permissions.html).
     */
    inline def getPermissionsPlain(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetPermissionsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lakeformation.outputs.GetPermissionsResult] =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetPermissionsPlainArgs.builder
      com.pulumi.aws.lakeformation.LakeformationFunctions.getPermissionsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about a Lake Formation resource. */
    inline def getResource(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetResourceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lakeformation.outputs.GetResourceResult] =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetResourceArgs.builder
      com.pulumi.aws.lakeformation.LakeformationFunctions.getResource(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a Lake Formation resource. */
    inline def getResourcePlain(args: Endofunction[com.pulumi.aws.lakeformation.inputs.GetResourcePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lakeformation.outputs.GetResourceResult] =
      val argsBuilder = com.pulumi.aws.lakeformation.inputs.GetResourcePlainArgs.builder
      com.pulumi.aws.lakeformation.LakeformationFunctions.getResourcePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Creates an LF-Tag with the specified name and values. Each key must have at least one value. The maximum number of values permitted is 1000. */
  def LfTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lakeformation.LfTagArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lakeformation.LfTagArgs.builder
    com.pulumi.aws.lakeformation.LfTag(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Lake Formation LF Tag Expression. */
  def LfTagExpression(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lakeformation.LfTagExpressionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lakeformation.LfTagExpressionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.lakeformation.LfTagExpression(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Lake Formation Opt In. */
  def OptIn(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lakeformation.OptInArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lakeformation.OptInArgs.builder
    com.pulumi.aws.lakeformation.OptIn(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Grants permissions to the principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3. Permissions are granted to a principal, in a Data Catalog, relative to a Lake Formation resource, which includes the Data Catalog, databases, tables, LF-tags, and LF-tag policies. For more information, see [Security and Access Control to Metadata and Data in Lake Formation](https://docs.aws.amazon.com/lake-formation/latest/dg/security-data-access.html).
   * 
   * &gt; **WARNING:** Lake Formation permissions are not in effect by default within AWS. Using this resource will not secure your data and will result in errors if you do not change the security settings for existing resources and the default security settings for new resources. See Default Behavior and `IAMAllowedPrincipals` for additional details.
   * 
   * &gt; **NOTE:** In general, the `principal` should _NOT_ be a Lake Formation administrator or the entity (e.g., IAM role) that is running the deployment. Administrators have implicit permissions. These should be managed by granting or not granting administrator rights using `aws.lakeformation.DataLakeSettings`, _not_ with this resource.
   */
  def Permissions(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lakeformation.PermissionsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lakeformation.PermissionsArgs.builder
    com.pulumi.aws.lakeformation.Permissions(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Registers a Lake Formation resource (e.g., S3 bucket) as managed by the Data Catalog. In other words, the S3 path is added to the data lake.
   * 
   * Choose a role that has read/write access to the chosen Amazon S3 path or use the service-linked role.
   * When you register the S3 path, the service-linked role and a new inline policy are created on your behalf.
   * Lake Formation adds the first path to the inline policy and attaches it to the service-linked role.
   * When you register subsequent paths, Lake Formation adds the path to the existing policy.
   */
  def Resource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lakeformation.ResourceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lakeformation.ResourceArgs.builder
    com.pulumi.aws.lakeformation.Resource(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Lake Formation Resource LF Tag. */
  def ResourceLfTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lakeformation.ResourceLfTagArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lakeformation.ResourceLfTagArgs.builder
    com.pulumi.aws.lakeformation.ResourceLfTag(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an attachment between one or more existing LF-tags and an existing Lake Formation resource. */
  def ResourceLfTags(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lakeformation.ResourceLfTagsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lakeformation.ResourceLfTagsArgs.builder
    com.pulumi.aws.lakeformation.ResourceLfTags(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
