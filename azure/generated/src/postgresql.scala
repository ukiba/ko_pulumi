package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object postgresql:
  extension (builder: com.pulumi.azure.postgresql.FlexibleServerArgs.Builder)
    /**
     * @param authentication An `authentication` block as defined below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerAuthenticationArgs.Builder]):
        com.pulumi.azure.postgresql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    /**
     * @param cluster A `cluster` block as defined below.
     * @return builder
     */
    def cluster(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerClusterArgs.Builder]):
        com.pulumi.azure.postgresql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerClusterArgs.builder
      builder.cluster(args(argsBuilder).build)

    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.postgresql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param highAvailability A `highAvailability` block as defined below.
     * @return builder
     */
    def highAvailability(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerHighAvailabilityArgs.Builder]):
        com.pulumi.azure.postgresql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerHighAvailabilityArgs.builder
      builder.highAvailability(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerIdentityArgs.Builder]):
        com.pulumi.azure.postgresql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param maintenanceWindow A `maintenanceWindow` block as defined below.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerMaintenanceWindowArgs.Builder]):
        com.pulumi.azure.postgresql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.postgresql.FlexibleServerArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a PostgreSQL Flexible Server Backup. */
  def FlexibleServerBackup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.postgresql.FlexibleServerBackupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.postgresql.FlexibleServerBackupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.postgresql.FlexibleServerBackup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Firewall Rule for a PostgreSQL Server
   * 
   *  &gt; **Note:** The `azure.postgresql.FirewallRule` resource is deprecated and will be removed in v5.0 of the AzureRM Provider. Azure Database for PostgreSQL Single Server and its sub resources have been retired as of 2025-03-28, please use the `azure.postgresql.FlexibleServerFirewallRule` resource instead. For more information, see https://techcommunity.microsoft.com/blog/adforpostgresql/retiring-azure-database-for-postgresql-single-server-in-2025/3783783.
   */
  def FirewallRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.postgresql.FirewallRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.postgresql.FirewallRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.postgresql.FirewallRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Allows you to create a Virtual Endpoint associated with a Postgres Flexible Replica. */
  def FlexibleServerVirtualEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.postgresql.FlexibleServerVirtualEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.postgresql.FlexibleServerVirtualEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.postgresql.FlexibleServerVirtualEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a PostgreSQL Flexible Server Database.
   * 
   *  !&gt; **Note:** To mitigate the possibility of accidental data loss it is highly recommended that you use the `preventDestroy` lifecycle argument in your configuration file for this resource. For more information on the `preventDestroy` lifecycle argument please see the terraform documentation.
   */
  def FlexibleServerDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.postgresql.FlexibleServerDatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.postgresql.FlexibleServerDatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.postgresql.FlexibleServerDatabase(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Allows you to set a user or group as the AD administrator for a PostgreSQL Flexible Server.
   * 
   *  ## Import
   * 
   *  A PostgreSQL Flexible Server Active Directory Administrator can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:postgresql/flexibleServerActiveDirectoryAdministrator:FlexibleServerActiveDirectoryAdministrator example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.DBforPostgreSQL/flexibleServers/myserver/administrators/objectId
   *  ```
   */
  def FlexibleServerActiveDirectoryAdministrator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.postgresql.FlexibleServerActiveDirectoryAdministratorArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.postgresql.FlexibleServerActiveDirectoryAdministratorArgs.builder
    com.pulumi.azure.postgresql.FlexibleServerActiveDirectoryAdministrator(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a PostgreSQL Database within a PostgreSQL Server
   * 
   *  &gt; **Note:** The `azure.postgresql.Database` resource is deprecated and will be removed in v5.0 of the AzureRM Provider. Azure Database for PostgreSQL Single Server and its sub resources have been retired as of 2025-03-28, please use the `azure.postgresql.FlexibleServerDatabase` resource instead. For more information, see https://techcommunity.microsoft.com/blog/adforpostgresql/retiring-azure-database-for-postgresql-single-server-in-2025/3783783.
   * 
   *  !&gt; **Note:** To mitigate the possibility of accidental data loss it is highly recommended that you use the `preventDestroy` lifecycle argument in your configuration file for this resource. For more information on the `preventDestroy` lifecycle argument please see the terraform documentation.
   */
  def Database(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.postgresql.DatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.postgresql.DatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.postgresql.Database(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Sets a PostgreSQL Configuration value on a PostgreSQL Server.
   * 
   *  &gt; **Note:** The `azure.postgresql.Configuration` resource is deprecated and will be removed in v5.0 of the AzureRM Provider. Azure Database for PostgreSQL Single Server and its sub resources have been retired as of 2025-03-28, please use the `azure.postgresql.FlexibleServerConfiguration` resource instead. For more information, see https://techcommunity.microsoft.com/blog/adforpostgresql/retiring-azure-database-for-postgresql-single-server-in-2025/3783783.
   * 
   *  ## Disclaimers
   * 
   *  &gt; **Note:** Since this resource is provisioned by default, the Azure Provider will not check for the presence of an existing resource prior to attempting to create it.
   */
  def Configuration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.postgresql.ConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.postgresql.ConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.postgresql.Configuration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Customer Managed Key for a PostgreSQL Server.
   * 
   *  &gt; **Note:** The `azure.postgresql.ServerKey` resource is deprecated and will be removed in v5.0 of the AzureRM Provider. Azure Database for PostgreSQL Single Server and its sub resources have been retired as of 2025-03-28. For more information, see https://techcommunity.microsoft.com/blog/adforpostgresql/retiring-azure-database-for-postgresql-single-server-in-2025/3783783.
   */
  def ServerKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.postgresql.ServerKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.postgresql.ServerKeyArgs.builder
    com.pulumi.azure.postgresql.ServerKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.postgresql.ServerArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.postgresql.inputs.ServerIdentityArgs.Builder]):
        com.pulumi.azure.postgresql.ServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.ServerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param threatDetectionPolicy Threat detection policy configuration, known in the API as Server Security Alerts Policy. The `threatDetectionPolicy` block supports fields documented below.
     * @return builder
     */
    def threatDetectionPolicy(args: Endofunction[com.pulumi.azure.postgresql.inputs.ServerThreatDetectionPolicyArgs.Builder]):
        com.pulumi.azure.postgresql.ServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.ServerThreatDetectionPolicyArgs.builder
      builder.threatDetectionPolicy(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.postgresql.ServerArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages a PostgreSQL Virtual Network Rule.
   * 
   *  &gt; **Note:** The `azure.postgresql.VirtualNetworkRule` resource is deprecated and will be removed in v5.0 of the AzureRM Provider. Azure Database for PostgreSQL Single Server and its sub resources have been retired as of 2025-03-28. For more information, see https://techcommunity.microsoft.com/blog/adforpostgresql/retiring-azure-database-for-postgresql-single-server-in-2025/3783783.
   * 
   *  &gt; **Note:** PostgreSQL Virtual Network Rules [can only be used with SKU Tiers of `GeneralPurpose` or `MemoryOptimized`](https://docs.microsoft.com/azure/postgresql/concepts-data-access-and-security-vnet)
   */
  def VirtualNetworkRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.postgresql.VirtualNetworkRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.postgresql.VirtualNetworkRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.postgresql.VirtualNetworkRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a PostgreSQL Flexible Server Firewall Rule. */
  def FlexibleServerFirewallRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.postgresql.FlexibleServerFirewallRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.postgresql.FlexibleServerFirewallRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.postgresql.FlexibleServerFirewallRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Sets a PostgreSQL Configuration value on a Azure PostgreSQL Flexible Server.
   * 
   *  &gt; **Note:** Changes to static server parameters will automatically trigger Azure Flex Server restart. This behavior can be disabled in the provider `features` block by setting the `restartServerOnConfigurationValueChange` field to `false` within the `postgresqlFlexibleServer` block.
   */
  def FlexibleServerConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.postgresql.FlexibleServerConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.postgresql.FlexibleServerConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.postgresql.FlexibleServerConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object PostgresqlFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing PostgreSQL Flexible Server. */
    inline def getFlexibleServer(args: Endofunction[com.pulumi.azure.postgresql.inputs.GetFlexibleServerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.postgresql.outputs.GetFlexibleServerResult] =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.GetFlexibleServerArgs.builder
      com.pulumi.azure.postgresql.PostgresqlFunctions.getFlexibleServer(args(argsBuilder).build)

    /** Use this data source to access information about an existing PostgreSQL Flexible Server. */
    inline def getFlexibleServerPlain(args: Endofunction[com.pulumi.azure.postgresql.inputs.GetFlexibleServerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.postgresql.outputs.GetFlexibleServerResult] =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.GetFlexibleServerPlainArgs.builder
      com.pulumi.azure.postgresql.PostgresqlFunctions.getFlexibleServerPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing PostgreSQL Azure Database Server.
     * 
     *  &gt; **Note:** The `azure.postgresql.Server` data source is deprecated and will be removed in v5.0 of the AzureRM Provider. Azure Database for PostgreSQL Single Server and its sub resources have been retired as of 2025-03-28, please use the `azure.postgresql.FlexibleServer` data source instead. For more information, see https://techcommunity.microsoft.com/blog/adforpostgresql/retiring-azure-database-for-postgresql-single-server-in-2025/3783783.
     */
    inline def getServer(args: Endofunction[com.pulumi.azure.postgresql.inputs.GetServerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.postgresql.outputs.GetServerResult] =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.GetServerArgs.builder
      com.pulumi.azure.postgresql.PostgresqlFunctions.getServer(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing PostgreSQL Azure Database Server.
     * 
     *  &gt; **Note:** The `azure.postgresql.Server` data source is deprecated and will be removed in v5.0 of the AzureRM Provider. Azure Database for PostgreSQL Single Server and its sub resources have been retired as of 2025-03-28, please use the `azure.postgresql.FlexibleServer` data source instead. For more information, see https://techcommunity.microsoft.com/blog/adforpostgresql/retiring-azure-database-for-postgresql-single-server-in-2025/3783783.
     */
    inline def getServerPlain(args: Endofunction[com.pulumi.azure.postgresql.inputs.GetServerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.postgresql.outputs.GetServerResult] =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.GetServerPlainArgs.builder
      com.pulumi.azure.postgresql.PostgresqlFunctions.getServerPlain(args(argsBuilder).build)

  /**
   * Manages a PostgreSQL Server.
   * 
   *  &gt; **Note:** The `azure.postgresql.Server` resource is deprecated and will be removed in v5.0 of the AzureRM Provider. Azure Database for PostgreSQL Single Server and its sub resources have been retired as of 2025-03-28, please use the `azure.postgresql.FlexibleServer` resource instead. For more information, see https://techcommunity.microsoft.com/blog/adforpostgresql/retiring-azure-database-for-postgresql-single-server-in-2025/3783783.
   */
  def Server(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.postgresql.ServerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.postgresql.ServerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.postgresql.Server(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a PostgreSQL Flexible Server. */
  def FlexibleServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.postgresql.FlexibleServerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.postgresql.FlexibleServerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.postgresql.FlexibleServer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Allows you to set a user or group as the AD administrator for an PostgreSQL server in Azure
   * 
   *  &gt; **Note:** The `azure.postgresql.ActiveDirectoryAdministrator` resource is deprecated and will be removed in v5.0 of the AzureRM Provider. Azure Database for PostgreSQL Single Server and its sub resources have been retired as of 2025-03-28, please use the `azure.postgresql.FlexibleServerActiveDirectoryAdministrator` resource instead. For more information, see https://techcommunity.microsoft.com/blog/adforpostgresql/retiring-azure-database-for-postgresql-single-server-in-2025/3783783.
   */
  def ActiveDirectoryAdministrator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.postgresql.ActiveDirectoryAdministratorArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.postgresql.ActiveDirectoryAdministratorArgs.builder
    com.pulumi.azure.postgresql.ActiveDirectoryAdministrator(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.postgresql.inputs.ServerState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.postgresql.inputs.ServerIdentityArgs.Builder]):
        com.pulumi.azure.postgresql.inputs.ServerState.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.ServerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param threatDetectionPolicy Threat detection policy configuration, known in the API as Server Security Alerts Policy. The `threatDetectionPolicy` block supports fields documented below.
     * @return builder
     */
    def threatDetectionPolicy(args: Endofunction[com.pulumi.azure.postgresql.inputs.ServerThreatDetectionPolicyArgs.Builder]):
        com.pulumi.azure.postgresql.inputs.ServerState.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.ServerThreatDetectionPolicyArgs.builder
      builder.threatDetectionPolicy(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.postgresql.inputs.ServerState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.postgresql.inputs.FlexibleServerState.Builder)
    /**
     * @param authentication An `authentication` block as defined below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerAuthenticationArgs.Builder]):
        com.pulumi.azure.postgresql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    /**
     * @param cluster A `cluster` block as defined below.
     * @return builder
     */
    def cluster(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerClusterArgs.Builder]):
        com.pulumi.azure.postgresql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerClusterArgs.builder
      builder.cluster(args(argsBuilder).build)

    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.postgresql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param highAvailability A `highAvailability` block as defined below.
     * @return builder
     */
    def highAvailability(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerHighAvailabilityArgs.Builder]):
        com.pulumi.azure.postgresql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerHighAvailabilityArgs.builder
      builder.highAvailability(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerIdentityArgs.Builder]):
        com.pulumi.azure.postgresql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param maintenanceWindow A `maintenanceWindow` block as defined below.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerMaintenanceWindowArgs.Builder]):
        com.pulumi.azure.postgresql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.postgresql.inputs.FlexibleServerState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
