package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object mysql:
  extension (builder: com.pulumi.azure.mysql.FlexibleServerArgs.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below.
     * 
     *  &gt; **Note:** `identity` is required when `customerManagedKey` is specified.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.mysql.inputs.FlexibleServerCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.mysql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.mysql.inputs.FlexibleServerCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param highAvailability A `highAvailability` block as defined below.
     * @return builder
     */
    def highAvailability(args: Endofunction[com.pulumi.azure.mysql.inputs.FlexibleServerHighAvailabilityArgs.Builder]):
        com.pulumi.azure.mysql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.mysql.inputs.FlexibleServerHighAvailabilityArgs.builder
      builder.highAvailability(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.mysql.inputs.FlexibleServerIdentityArgs.Builder]):
        com.pulumi.azure.mysql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.mysql.inputs.FlexibleServerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param maintenanceWindow A `maintenanceWindow` block as defined below.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.azure.mysql.inputs.FlexibleServerMaintenanceWindowArgs.Builder]):
        com.pulumi.azure.mysql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.mysql.inputs.FlexibleServerMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    /**
     * @param storage A `storage` block as defined below.
     * @return builder
     */
    def storage(args: Endofunction[com.pulumi.azure.mysql.inputs.FlexibleServerStorageArgs.Builder]):
        com.pulumi.azure.mysql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.mysql.inputs.FlexibleServerStorageArgs.builder
      builder.storage(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mysql.FlexibleServerArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a MySQL Database within a MySQL Flexible Server */
  def FlexibleDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mysql.FlexibleDatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mysql.FlexibleDatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mysql.FlexibleDatabase(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Active Directory administrator on a MySQL Flexible Server */
  def FlexibleServerActiveDirectoryAdministratory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mysql.FlexibleServerActiveDirectoryAdministratoryArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.mysql.FlexibleServerActiveDirectoryAdministratoryArgs.builder
    com.pulumi.azure.mysql.FlexibleServerActiveDirectoryAdministratory(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type MysqlFunctions = com.pulumi.azure.mysql.MysqlFunctions
  object MysqlFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.mysql.MysqlFunctions.*
  extension (self: MysqlFunctions.type)
    /** Use this data source to access information about an existing MySQL Flexible Server. */
    def getFlexibleServer(args: Endofunction[com.pulumi.azure.mysql.inputs.GetFlexibleServerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.mysql.outputs.GetFlexibleServerResult] =
      val argsBuilder = com.pulumi.azure.mysql.inputs.GetFlexibleServerArgs.builder
      com.pulumi.azure.mysql.MysqlFunctions.getFlexibleServer(args(argsBuilder).build)

    /** Use this data source to access information about an existing MySQL Flexible Server. */
    def getFlexibleServerPlain(args: Endofunction[com.pulumi.azure.mysql.inputs.GetFlexibleServerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.mysql.outputs.GetFlexibleServerResult] =
      val argsBuilder = com.pulumi.azure.mysql.inputs.GetFlexibleServerPlainArgs.builder
      com.pulumi.azure.mysql.MysqlFunctions.getFlexibleServerPlain(args(argsBuilder).build)

  /** Manages a Firewall Rule for a MySQL Flexible Server. */
  def FlexibleServerFirewallRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mysql.FlexibleServerFirewallRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mysql.FlexibleServerFirewallRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mysql.FlexibleServerFirewallRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Sets a MySQL Flexible Server Configuration value on a MySQL Flexible Server.
   * 
   *  ## Disclaimers
   * 
   *  &gt; **Note:** Since this resource is provisioned by default, the Azure Provider will not check for the presence of an existing resource prior to attempting to create it.
   */
  def FlexibleServerConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mysql.FlexibleServerConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mysql.FlexibleServerConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mysql.FlexibleServerConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a MySQL Flexible Server. */
  def FlexibleServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mysql.FlexibleServerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mysql.FlexibleServerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.mysql.FlexibleServer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.mysql.inputs.FlexibleServerState.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below.
     * 
     *  &gt; **Note:** `identity` is required when `customerManagedKey` is specified.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.mysql.inputs.FlexibleServerCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.mysql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.mysql.inputs.FlexibleServerCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param highAvailability A `highAvailability` block as defined below.
     * @return builder
     */
    def highAvailability(args: Endofunction[com.pulumi.azure.mysql.inputs.FlexibleServerHighAvailabilityArgs.Builder]):
        com.pulumi.azure.mysql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.mysql.inputs.FlexibleServerHighAvailabilityArgs.builder
      builder.highAvailability(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.mysql.inputs.FlexibleServerIdentityArgs.Builder]):
        com.pulumi.azure.mysql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.mysql.inputs.FlexibleServerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param maintenanceWindow A `maintenanceWindow` block as defined below.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.azure.mysql.inputs.FlexibleServerMaintenanceWindowArgs.Builder]):
        com.pulumi.azure.mysql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.mysql.inputs.FlexibleServerMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    /**
     * @param storage A `storage` block as defined below.
     * @return builder
     */
    def storage(args: Endofunction[com.pulumi.azure.mysql.inputs.FlexibleServerStorageArgs.Builder]):
        com.pulumi.azure.mysql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.mysql.inputs.FlexibleServerStorageArgs.builder
      builder.storage(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mysql.inputs.FlexibleServerState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
