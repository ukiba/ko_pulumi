package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object quicksight:
  /**
   * Resource for managing an AWS QuickSight Account Settings.
   * 
   * &gt; Deletion of this resource will not modify any settings, only remove the resource from state.
   */
  def AccountSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.AccountSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.quicksight.AccountSettingsArgs.builder
    com.pulumi.aws.quicksight.AccountSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for managing an AWS QuickSight Account Subscription.
   * 
   * &gt; Due to the absence of the `adminGroup`, `authorGroup`, `readerGroup`, `adminProGroup`, `authorProGroup`, and `readerProGroup` fields in the [`DescribeAccountSettings`](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_DescribeAccountSettings.html) API response, changes made to these groups post-subscription will not be detected by this resource.
   */
  def AccountSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.AccountSubscriptionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.quicksight.AccountSubscriptionArgs.builder
    com.pulumi.aws.quicksight.AccountSubscription(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing a QuickSight Analysis. */
  def Analysis(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.AnalysisArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.quicksight.AnalysisArgs.builder
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
    com.pulumi.aws.quicksight.Analysis(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a QuickSight custom permissions profile. */
  def CustomPermissions(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.CustomPermissionsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.quicksight.CustomPermissionsArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.quicksight.CustomPermissions(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing a QuickSight Dashboard. */
  def Dashboard(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.DashboardArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.quicksight.DashboardArgs.builder
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
    com.pulumi.aws.quicksight.Dashboard(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing a QuickSight Data Set. */
  def DataSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.DataSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.quicksight.DataSetArgs.builder
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
    com.pulumi.aws.quicksight.DataSet(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing QuickSight Data Source */
  def DataSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.DataSourceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.quicksight.DataSourceArgs.builder
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
    com.pulumi.aws.quicksight.DataSource(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing a QuickSight Folder. */
  def Folder(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.FolderArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.quicksight.FolderArgs.builder
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
    com.pulumi.aws.quicksight.Folder(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS QuickSight Folder Membership. */
  def FolderMembership(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.FolderMembershipArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.quicksight.FolderMembershipArgs.builder
    com.pulumi.aws.quicksight.FolderMembership(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing QuickSight Group */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.GroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.quicksight.GroupArgs.builder
    com.pulumi.aws.quicksight.Group(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing QuickSight Group Membership */
  def GroupMembership(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.GroupMembershipArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.quicksight.GroupMembershipArgs.builder
    com.pulumi.aws.quicksight.GroupMembership(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS QuickSight IAM Policy Assignment. */
  def IamPolicyAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.IamPolicyAssignmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.quicksight.IamPolicyAssignmentArgs.builder
    com.pulumi.aws.quicksight.IamPolicyAssignment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS QuickSight Ingestion. */
  def Ingestion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.IngestionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.quicksight.IngestionArgs.builder
    com.pulumi.aws.quicksight.Ingestion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages the content and status of IP rules.
   * 
   * &gt; Deletion of this resource clears all IP restrictions from a QuickSight account.
   */
  def IpRestriction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.IpRestrictionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.quicksight.IpRestrictionArgs.builder
    com.pulumi.aws.quicksight.IpRestriction(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Registers customer managed keys in a Amazon QuickSight account.
   * 
   * &gt; Deletion of this resource clears all CMK registrations from a QuickSight account. QuickSight then uses AWS owned keys to encrypt your resources.
   */
  def KeyRegistration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.KeyRegistrationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.quicksight.KeyRegistrationArgs.builder
    com.pulumi.aws.quicksight.KeyRegistration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS QuickSight Namespace. */
  def Namespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.NamespaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.quicksight.NamespaceArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.quicksight.Namespace(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object QuicksightFunctions:
    /** Data source for managing a QuickSight Data Set. */
    inline def getDataSet(args: Endofunction[com.pulumi.aws.quicksight.inputs.GetDataSetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.quicksight.outputs.GetDataSetResult] =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.GetDataSetArgs.builder
      com.pulumi.aws.quicksight.QuicksightFunctions.getDataSet(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing a QuickSight Data Set. */
    inline def getDataSetPlain(args: Endofunction[com.pulumi.aws.quicksight.inputs.GetDataSetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.quicksight.outputs.GetDataSetResult] =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.GetDataSetPlainArgs.builder
      com.pulumi.aws.quicksight.QuicksightFunctions.getDataSetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS QuickSight Analysis. */
    inline def getQuicksightAnalysis(args: Endofunction[com.pulumi.aws.quicksight.inputs.GetQuicksightAnalysisArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.quicksight.outputs.GetQuicksightAnalysisResult] =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.GetQuicksightAnalysisArgs.builder
      com.pulumi.aws.quicksight.QuicksightFunctions.getQuicksightAnalysis(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS QuickSight Analysis. */
    inline def getQuicksightAnalysisPlain(args: Endofunction[com.pulumi.aws.quicksight.inputs.GetQuicksightAnalysisPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.quicksight.outputs.GetQuicksightAnalysisResult] =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.GetQuicksightAnalysisPlainArgs.builder
      com.pulumi.aws.quicksight.QuicksightFunctions.getQuicksightAnalysisPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * This data source can be used to fetch information about a specific
     * QuickSight group. By using this data source, you can reference QuickSight group
     * properties without having to hard code ARNs or unique IDs as input.
     */
    inline def getQuicksightGroup(args: Endofunction[com.pulumi.aws.quicksight.inputs.GetQuicksightGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.quicksight.outputs.GetQuicksightGroupResult] =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.GetQuicksightGroupArgs.builder
      com.pulumi.aws.quicksight.QuicksightFunctions.getQuicksightGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * This data source can be used to fetch information about a specific
     * QuickSight group. By using this data source, you can reference QuickSight group
     * properties without having to hard code ARNs or unique IDs as input.
     */
    inline def getQuicksightGroupPlain(args: Endofunction[com.pulumi.aws.quicksight.inputs.GetQuicksightGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.quicksight.outputs.GetQuicksightGroupResult] =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.GetQuicksightGroupPlainArgs.builder
      com.pulumi.aws.quicksight.QuicksightFunctions.getQuicksightGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * This data source can be used to fetch information about a specific
     * QuickSight user. By using this data source, you can reference QuickSight user
     * properties without having to hard code ARNs or unique IDs as input.
     */
    inline def getQuicksightUser(args: Endofunction[com.pulumi.aws.quicksight.inputs.GetQuicksightUserArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.quicksight.outputs.GetQuicksightUserResult] =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.GetQuicksightUserArgs.builder
      com.pulumi.aws.quicksight.QuicksightFunctions.getQuicksightUser(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * This data source can be used to fetch information about a specific
     * QuickSight user. By using this data source, you can reference QuickSight user
     * properties without having to hard code ARNs or unique IDs as input.
     */
    inline def getQuicksightUserPlain(args: Endofunction[com.pulumi.aws.quicksight.inputs.GetQuicksightUserPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.quicksight.outputs.GetQuicksightUserResult] =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.GetQuicksightUserPlainArgs.builder
      com.pulumi.aws.quicksight.QuicksightFunctions.getQuicksightUserPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS QuickSight Theme. */
    inline def getTheme(args: Endofunction[com.pulumi.aws.quicksight.inputs.GetThemeArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.quicksight.outputs.GetThemeResult] =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.GetThemeArgs.builder
      com.pulumi.aws.quicksight.QuicksightFunctions.getTheme(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS QuickSight Theme. */
    inline def getThemePlain(args: Endofunction[com.pulumi.aws.quicksight.inputs.GetThemePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.quicksight.outputs.GetThemeResult] =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.GetThemePlainArgs.builder
      com.pulumi.aws.quicksight.QuicksightFunctions.getThemePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Resource for managing a QuickSight Refresh Schedule. */
  def RefreshSchedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.RefreshScheduleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.quicksight.RefreshScheduleArgs.builder
    com.pulumi.aws.quicksight.RefreshSchedule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages the custom permissions that are associated with a role. */
  def RoleCustomPermission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.RoleCustomPermissionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.quicksight.RoleCustomPermissionArgs.builder
    com.pulumi.aws.quicksight.RoleCustomPermission(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for managing an AWS QuickSight Role Membership.
   * 
   * &gt; The role membership APIs are disabled for identities managed by QuickSight. This resource can only be used when the QuickSight account subscription uses the Active Directory or IAM Identity Center authentication method.
   */
  def RoleMembership(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.RoleMembershipArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.quicksight.RoleMembershipArgs.builder
    com.pulumi.aws.quicksight.RoleMembership(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing a QuickSight Template. */
  def Template(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.TemplateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.quicksight.TemplateArgs.builder
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
    com.pulumi.aws.quicksight.Template(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS QuickSight Template Alias. */
  def TemplateAlias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.TemplateAliasArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.quicksight.TemplateAliasArgs.builder
    com.pulumi.aws.quicksight.TemplateAlias(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing a QuickSight Theme. */
  def Theme(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.ThemeArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.quicksight.ThemeArgs.builder
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
    com.pulumi.aws.quicksight.Theme(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing QuickSight User */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.UserArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.quicksight.UserArgs.builder
    com.pulumi.aws.quicksight.User(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages the custom permissions profile for a user. */
  def UserCustomPermission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.UserCustomPermissionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.quicksight.UserCustomPermissionArgs.builder
    com.pulumi.aws.quicksight.UserCustomPermission(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS QuickSight VPC Connection. */
  def VpcConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.VpcConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.quicksight.VpcConnectionArgs.builder
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
    com.pulumi.aws.quicksight.VpcConnection(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
