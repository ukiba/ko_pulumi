package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object mssql:
  /** Manages a Microsoft SQL Virtual Machine Availability Group Listener. */
  def VirtualMachineAvailabilityGroupListener(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.VirtualMachineAvailabilityGroupListenerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.VirtualMachineAvailabilityGroupListenerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mssql.VirtualMachineAvailabilityGroupListener(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.mssql.ElasticPoolArgs.Builder)
    /**
     * @param perDatabaseSettings A `perDatabaseSettings` block as defined below.
     * @return builder
     */
    def perDatabaseSettings(args: Endofunction[com.pulumi.azure.mssql.inputs.ElasticPoolPerDatabaseSettingsArgs.Builder]):
        com.pulumi.azure.mssql.ElasticPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ElasticPoolPerDatabaseSettingsArgs.builder
      builder.perDatabaseSettings(args(argsBuilder).build)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.mssql.inputs.ElasticPoolSkuArgs.Builder]):
        com.pulumi.azure.mssql.ElasticPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ElasticPoolSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mssql.ElasticPoolArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Microsoft SQL Virtual Machine */
  def VirtualMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.VirtualMachineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.VirtualMachineArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.mssql.VirtualMachine(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Allows you to manage an Azure SQL Firewall Rule. */
  def FirewallRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.FirewallRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.FirewallRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mssql.FirewallRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages Start Stop Schedules for an MS SQL Managed Instance. */
  def ManagedInstanceStartStopSchedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ManagedInstanceStartStopScheduleArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.mssql.ManagedInstanceStartStopScheduleArgs.builder
    com.pulumi.azure.mssql.ManagedInstanceStartStopSchedule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a MS SQL Server DNS Alias. */
  def ServerDnsAlias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ServerDnsAliasArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.ServerDnsAliasArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mssql.ServerDnsAlias(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.mssql.VirtualMachineAvailabilityGroupListenerArgs.Builder)
    /**
     * @param loadBalancerConfiguration A `loadBalancerConfiguration` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** Either one of `loadBalancerConfiguration` or `multiSubnetIpConfiguration` must be specified.
     * @return builder
     */
    def loadBalancerConfiguration(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerLoadBalancerConfigurationArgs.Builder]):
        com.pulumi.azure.mssql.VirtualMachineAvailabilityGroupListenerArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerLoadBalancerConfigurationArgs.builder
      builder.loadBalancerConfiguration(args(argsBuilder).build)

    /**
     * @param multiSubnetIpConfigurations One or more `multiSubnetIpConfiguration` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def multiSubnetIpConfigurations(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerMultiSubnetIpConfigurationArgs.Builder]*):
        com.pulumi.azure.mssql.VirtualMachineAvailabilityGroupListenerArgs.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerMultiSubnetIpConfigurationArgs.builder
      builder.multiSubnetIpConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param replicas One or more `replica` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerReplicaArgs.Builder]*):
        com.pulumi.azure.mssql.VirtualMachineAvailabilityGroupListenerArgs.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  /**
   * Manages the Vulnerability Assessment for an MS SQL Server.
   * 
   *  &gt; **Note:** Vulnerability Assessment is currently only available for MS SQL databases.
   * 
   *  &gt; **Note:** This resource cannot be used to enable the Express SQL Vulnerability Assessment configuration, to enable the express configuration, use `expressVulnerabilityAssessmentEnabled` in the `azure.mssql.Server` resource.
   */
  def ServerVulnerabilityAssessment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ServerVulnerabilityAssessmentArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.mssql.ServerVulnerabilityAssessmentArgs.builder
    com.pulumi.azure.mssql.ServerVulnerabilityAssessment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.mssql.DatabaseVulnerabilityAssessmentRuleBaselineArgs.Builder)
    /**
     * @param baselineResults A `baselineResult` block as documented below. Multiple blocks can be defined.
     * @return builder
     */
    def baselineResults(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseVulnerabilityAssessmentRuleBaselineBaselineResultArgs.Builder]*):
        com.pulumi.azure.mssql.DatabaseVulnerabilityAssessmentRuleBaselineArgs.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseVulnerabilityAssessmentRuleBaselineBaselineResultArgs.builder
      builder.baselineResults(args.map(_(argsBuilder).build)*)

  /** Manages an Elastic Job Credential. */
  def JobCredential(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.JobCredentialArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.JobCredentialArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mssql.JobCredential(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Elastic Job Schedule. */
  def JobSchedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.JobScheduleArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.mssql.JobScheduleArgs.builder
    com.pulumi.azure.mssql.JobSchedule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the Vulnerability Assessment for an MS Managed Instance. */
  def ManagedInstanceVulnerabilityAssessment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ManagedInstanceVulnerabilityAssessmentArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.mssql.ManagedInstanceVulnerabilityAssessmentArgs.builder
    com.pulumi.azure.mssql.ManagedInstanceVulnerabilityAssessment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Elastic Job. */
  def Job(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.JobArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.JobArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mssql.Job(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.mssql.ManagedInstanceStartStopScheduleArgs.Builder)
    /**
     * @param schedules A `schedule` block as defined below.
     * @return builder
     */
    def schedules(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceStartStopScheduleScheduleArgs.Builder]*):
        com.pulumi.azure.mssql.ManagedInstanceStartStopScheduleArgs.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceStartStopScheduleScheduleArgs.builder
      builder.schedules(args.map(_(argsBuilder).build)*)

  /**
   * Manages a MS SQL Database.
   * 
   *  !&gt; **Note:** To mitigate the possibility of accidental data loss it is highly recommended that you use the `preventDestroy` lifecycle argument in your configuration file for this resource. For more information on the `preventDestroy` lifecycle argument please see the terraform documentation.
   */
  def Database(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.DatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.DatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.mssql.Database(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure SQL Managed Instance Failover Group. */
  def ManagedInstanceFailoverGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ManagedInstanceFailoverGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.ManagedInstanceFailoverGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mssql.ManagedInstanceFailoverGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.mssql.DatabaseArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseIdentityArgs.Builder]):
        com.pulumi.azure.mssql.DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param import_ A `import` block as documented below. Mutually exclusive with `createMode`.
     * @return builder
     */
    def import_(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseImportArgs.Builder]):
        com.pulumi.azure.mssql.DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseImportArgs.builder
      builder.import_(args(argsBuilder).build)

    /**
     * @param longTermRetentionPolicy A `longTermRetentionPolicy` block as defined below.
     * @return builder
     */
    def longTermRetentionPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseLongTermRetentionPolicyArgs.Builder]):
        com.pulumi.azure.mssql.DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseLongTermRetentionPolicyArgs.builder
      builder.longTermRetentionPolicy(args(argsBuilder).build)

    /**
     * @param shortTermRetentionPolicy A `shortTermRetentionPolicy` block as defined below.
     * @return builder
     */
    def shortTermRetentionPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseShortTermRetentionPolicyArgs.Builder]):
        com.pulumi.azure.mssql.DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseShortTermRetentionPolicyArgs.builder
      builder.shortTermRetentionPolicy(args(argsBuilder).build)

    /**
     * @param threatDetectionPolicy Threat detection policy configuration. The `threatDetectionPolicy` block supports fields documented below.
     * @return builder
     */
    def threatDetectionPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseThreatDetectionPolicyArgs.Builder]):
        com.pulumi.azure.mssql.DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseThreatDetectionPolicyArgs.builder
      builder.threatDetectionPolicy(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mssql.DatabaseArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Allows you to set a user, group or service principal as the AAD Administrator for an Azure SQL Managed Instance. */
  def ManagedInstanceActiveDirectoryAdministrator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ManagedInstanceActiveDirectoryAdministratorArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.mssql.ManagedInstanceActiveDirectoryAdministratorArgs.builder
    com.pulumi.azure.mssql.ManagedInstanceActiveDirectoryAdministrator(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Security Alert Policy for a MSSQL Server.
   * 
   *  &gt; **Note:** Security Alert Policy is currently only available for MS SQL databases.
   */
  def ServerSecurityAlertPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ServerSecurityAlertPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.mssql.ServerSecurityAlertPolicyArgs.builder
    com.pulumi.azure.mssql.ServerSecurityAlertPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a MS SQL Server Microsoft Support Auditing Policy. */
  def ServerMicrosoftSupportAuditingPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ServerMicrosoftSupportAuditingPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.mssql.ServerMicrosoftSupportAuditingPolicyArgs.builder
    com.pulumi.azure.mssql.ServerMicrosoftSupportAuditingPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Microsoft SQL Azure Managed Instance.
   * 
   *  &gt; **Note:** All arguments including the administrator login and password will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
   * 
   *  &gt; **Note:** SQL Managed Instance needs permission to read Azure Active Directory when configuring the AAD administrator. [Read more about provisioning AAD administrators](https://learn.microsoft.com/en-us/azure/azure-sql/database/authentication-aad-configure?view=azuresql#provision-azure-ad-admin-sql-managed-instance).
   */
  def ManagedInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ManagedInstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.ManagedInstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.mssql.ManagedInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Job Target Group. */
  def JobTargetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.JobTargetGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.JobTargetGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mssql.JobTargetGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Elastic Job Step. */
  def JobStep(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.JobStepArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.JobStepArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mssql.JobStep(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.mssql.ServerVulnerabilityAssessmentArgs.Builder)
    /**
     * @param recurringScans A `recurringScans` block as defined below.
     * 
     *  &gt; **Note:** To reset the `recurringScans` code block to it&#39;s default values you must explicitly define an empty `recurringScans` code block (e.g., `recurringScans {}`) in your configuration file.
     * @return builder
     */
    def recurringScans(args: Endofunction[com.pulumi.azure.mssql.inputs.ServerVulnerabilityAssessmentRecurringScansArgs.Builder]):
        com.pulumi.azure.mssql.ServerVulnerabilityAssessmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ServerVulnerabilityAssessmentRecurringScansArgs.builder
      builder.recurringScans(args(argsBuilder).build)

  /**
   * Manages an Azure SQL Azure Managed Database for a SQL Managed Instance.
   * 
   *  !&gt; **Note:** To mitigate the possibility of accidental data loss it is highly recommended that you use the `preventDestroy` lifecycle argument in your configuration file for this resource. For more information on the `preventDestroy` lifecycle argument please see the terraform documentation.
   */
  def ManagedDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ManagedDatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.ManagedDatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.mssql.ManagedDatabase(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Database Vulnerability Assessment Rule Baseline.
   * 
   *  &gt; **Note:** Database Vulnerability Assessment is currently only available for MS SQL databases.
   */
  def DatabaseVulnerabilityAssessmentRuleBaseline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.DatabaseVulnerabilityAssessmentRuleBaselineArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.mssql.DatabaseVulnerabilityAssessmentRuleBaselineArgs.builder
    com.pulumi.azure.mssql.DatabaseVulnerabilityAssessmentRuleBaseline(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.mssql.ServerArgs.Builder)
    /**
     * @param azureadAdministrator An `azureadAdministrator` block as defined below.
     * @return builder
     */
    def azureadAdministrator(args: Endofunction[com.pulumi.azure.mssql.inputs.ServerAzureadAdministratorArgs.Builder]):
        com.pulumi.azure.mssql.ServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ServerAzureadAdministratorArgs.builder
      builder.azureadAdministrator(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.mssql.inputs.ServerIdentityArgs.Builder]):
        com.pulumi.azure.mssql.ServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ServerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mssql.ServerArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages the transparent data encryption configuration for a MSSQL Server
   * 
   *  !&gt; **Note:** This resource can be used to configure Transparent Data Encryption for MS SQL instances with Customer Managed Keys. For MS SQL instances that are System Managed, it should only be used with pre-existing MS SQL Instances that are over 3 years old. For new System Managed MS SQL Instances that will be created through the use of the `azure.mssql.Server` resource, please enable Transparent Data Encryption through `azure.mssql.Server` resource itself by configuring an identity block. By default, all new MS SQL Instances are deployed with System Managed Transparent Data Encryption enabled.
   * 
   *  &gt; **Note:** Once transparent data encryption is enabled on a MS SQL instance, it is not possible to remove TDE. You will be able to switch between &#39;ServiceManaged&#39; and &#39;CustomerManaged&#39; keys, but will not be able to remove encryption. For safety when this resource is deleted, the TDE mode will automatically be set to &#39;ServiceManaged&#39;. As SQL Server only supports a single configuration for encryption settings, this resource will replace the current encryption settings on the server.
   * 
   *  &gt; **Note:** See [documentation](https://docs.microsoft.com/azure/azure-sql/database/transparent-data-encryption-byok-overview) for important information on how handle lifecycle management of the keys to prevent data lockout.
   */
  def ServerTransparentDataEncryption(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ServerTransparentDataEncryptionArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.mssql.ServerTransparentDataEncryptionArgs.builder
    com.pulumi.azure.mssql.ServerTransparentDataEncryption(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a MS SQL Database Extended Auditing Policy. */
  def DatabaseExtendedAuditingPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.DatabaseExtendedAuditingPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.mssql.DatabaseExtendedAuditingPolicyArgs.builder
    com.pulumi.azure.mssql.DatabaseExtendedAuditingPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Allows you to manage rules for allowing traffic between an Azure SQL server and a subnet of a virtual network. */
  def VirtualNetworkRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.VirtualNetworkRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.VirtualNetworkRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mssql.VirtualNetworkRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Elastic Job Agent. */
  def JobAgent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.JobAgentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.JobAgentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.mssql.JobAgent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.mssql.VirtualMachineGroupArgs.Builder)
    /**
     * @param wsfcDomainProfile A `wsfcDomainProfile` block as defined below.
     * @return builder
     */
    def wsfcDomainProfile(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineGroupWsfcDomainProfileArgs.Builder]):
        com.pulumi.azure.mssql.VirtualMachineGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineGroupWsfcDomainProfileArgs.builder
      builder.wsfcDomainProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mssql.VirtualMachineGroupArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Security Alert Policy for an MS SQL Managed Instance. */
  def ManagedInstanceSecurityAlertPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ManagedInstanceSecurityAlertPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.mssql.ManagedInstanceSecurityAlertPolicyArgs.builder
    com.pulumi.azure.mssql.ManagedInstanceSecurityAlertPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.mssql.ManagedInstanceArgs.Builder)
    /**
     * @param azureActiveDirectoryAdministrator An `azureActiveDirectoryAdministrator` block as defined below.
     * @return builder
     */
    def azureActiveDirectoryAdministrator(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceAzureActiveDirectoryAdministratorArgs.Builder]):
        com.pulumi.azure.mssql.ManagedInstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceAzureActiveDirectoryAdministratorArgs.builder
      builder.azureActiveDirectoryAdministrator(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceIdentityArgs.Builder]):
        com.pulumi.azure.mssql.ManagedInstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mssql.ManagedInstanceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.mssql.JobStepArgs.Builder)
    /**
     * @param outputTarget An `outputTarget` block as defined below.
     * @return builder
     */
    def outputTarget(args: Endofunction[com.pulumi.azure.mssql.inputs.JobStepOutputTargetArgs.Builder]):
        com.pulumi.azure.mssql.JobStepArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.JobStepOutputTargetArgs.builder
      builder.outputTarget(args(argsBuilder).build)

  /** Manages a Microsoft Azure SQL Failover Group. */
  def FailoverGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.FailoverGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.FailoverGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.mssql.FailoverGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.mssql.JobAgentArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.mssql.inputs.JobAgentIdentityArgs.Builder]):
        com.pulumi.azure.mssql.JobAgentArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.JobAgentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mssql.JobAgentArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Allows you to manage an Azure SQL Outbound Firewall Rule. */
  def OutboundFirewallRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.OutboundFirewallRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.OutboundFirewallRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mssql.OutboundFirewallRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Microsoft SQL Azure Database Server. */
  def Server(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ServerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.ServerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.mssql.Server(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a MS SQL Server Extended Auditing Policy. */
  def ServerExtendedAuditingPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ServerExtendedAuditingPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.mssql.ServerExtendedAuditingPolicyArgs.builder
    com.pulumi.azure.mssql.ServerExtendedAuditingPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages the transparent data encryption configuration for a MSSQL Managed Instance
   * 
   *  &gt; **Note:** Once transparent data encryption(TDE) is enabled on a MS SQL instance, it is not possible to remove TDE. You will be able to switch between &#39;ServiceManaged&#39; and &#39;CustomerManaged&#39; keys, but will not be able to remove encryption. For safety when this resource is deleted, the TDE mode will automatically be set to &#39;ServiceManaged&#39;. As SQL Managed Instance only supports a single configuration for encryption settings, this resource will replace the current encryption settings on the server.
   * 
   *  &gt; **Note:** See [documentation](https://docs.microsoft.com/azure/azure-sql/database/transparent-data-encryption-byok-overview) for important information on how handle lifecycle management of the keys to prevent data lockout.
   */
  def ManagedInstanceTransparentDataEncryption(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ManagedInstanceTransparentDataEncryptionArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.mssql.ManagedInstanceTransparentDataEncryptionArgs.builder
    com.pulumi.azure.mssql.ManagedInstanceTransparentDataEncryption(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.mssql.ManagedInstanceVulnerabilityAssessmentArgs.Builder)
    /**
     * @param recurringScans The recurring scans settings. The `recurringScans` block supports fields documented below.
     * @return builder
     */
    def recurringScans(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceVulnerabilityAssessmentRecurringScansArgs.Builder]):
        com.pulumi.azure.mssql.ManagedInstanceVulnerabilityAssessmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceVulnerabilityAssessmentRecurringScansArgs.builder
      builder.recurringScans(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.ManagedDatabaseArgs.Builder)
    /**
     * @param longTermRetentionPolicy A `longTermRetentionPolicy` block as defined below.
     * @return builder
     */
    def longTermRetentionPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedDatabaseLongTermRetentionPolicyArgs.Builder]):
        com.pulumi.azure.mssql.ManagedDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedDatabaseLongTermRetentionPolicyArgs.builder
      builder.longTermRetentionPolicy(args(argsBuilder).build)

    /**
     * @param pointInTimeRestore A `pointInTimeRestore` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def pointInTimeRestore(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedDatabasePointInTimeRestoreArgs.Builder]):
        com.pulumi.azure.mssql.ManagedDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedDatabasePointInTimeRestoreArgs.builder
      builder.pointInTimeRestore(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mssql.ManagedDatabaseArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Microsoft SQL Virtual Machine Group. */
  def VirtualMachineGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.VirtualMachineGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.VirtualMachineGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.mssql.VirtualMachineGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.mssql.VirtualMachineArgs.Builder)
    /**
     * @param assessment An `assessment` block as defined below.
     * @return builder
     */
    def assessment(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAssessmentArgs.Builder]):
        com.pulumi.azure.mssql.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAssessmentArgs.builder
      builder.assessment(args(argsBuilder).build)

    /**
     * @param autoBackup An `autoBackup` block as defined below. This block can be added to an existing resource, but removing this block forces a new resource to be created.
     * @return builder
     */
    def autoBackup(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAutoBackupArgs.Builder]):
        com.pulumi.azure.mssql.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAutoBackupArgs.builder
      builder.autoBackup(args(argsBuilder).build)

    /**
     * @param autoPatching An `autoPatching` block as defined below.
     * @return builder
     */
    def autoPatching(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAutoPatchingArgs.Builder]):
        com.pulumi.azure.mssql.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAutoPatchingArgs.builder
      builder.autoPatching(args(argsBuilder).build)

    /**
     * @param keyVaultCredential An `keyVaultCredential` block as defined below.
     * @return builder
     */
    def keyVaultCredential(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineKeyVaultCredentialArgs.Builder]):
        com.pulumi.azure.mssql.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineKeyVaultCredentialArgs.builder
      builder.keyVaultCredential(args(argsBuilder).build)

    /**
     * @param sqlInstance A `sqlInstance` block as defined below.
     * @return builder
     */
    def sqlInstance(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineSqlInstanceArgs.Builder]):
        com.pulumi.azure.mssql.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineSqlInstanceArgs.builder
      builder.sqlInstance(args(argsBuilder).build)

    /**
     * @param storageConfiguration An `storageConfiguration` block as defined below.
     * @return builder
     */
    def storageConfiguration(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationArgs.Builder]):
        com.pulumi.azure.mssql.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationArgs.builder
      builder.storageConfiguration(args(argsBuilder).build)

    /**
     * @param wsfcDomainCredential A `wsfcDomainCredential` block as defined below
     * @return builder
     */
    def wsfcDomainCredential(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineWsfcDomainCredentialArgs.Builder]):
        com.pulumi.azure.mssql.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineWsfcDomainCredentialArgs.builder
      builder.wsfcDomainCredential(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mssql.VirtualMachineArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.mssql.ManagedInstanceFailoverGroupArgs.Builder)
    /**
     * @param readWriteEndpointFailoverPolicy A `readWriteEndpointFailoverPolicy` block as defined below.
     * @return builder
     */
    def readWriteEndpointFailoverPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs.Builder]):
        com.pulumi.azure.mssql.ManagedInstanceFailoverGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs.builder
      builder.readWriteEndpointFailoverPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.JobTargetGroupArgs.Builder)
    /**
     * @param jobTargets One or more `jobTarget` blocks as defined below.
     * @return builder
     */
    def jobTargets(args: Endofunction[com.pulumi.azure.mssql.inputs.JobTargetGroupJobTargetArgs.Builder]*):
        com.pulumi.azure.mssql.JobTargetGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.JobTargetGroupJobTargetArgs.builder
      builder.jobTargets(args.map(_(argsBuilder).build)*)

  object MssqlFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing SQL database. */
    inline def getDatabase(args: Endofunction[com.pulumi.azure.mssql.inputs.GetDatabaseArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.mssql.outputs.GetDatabaseResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetDatabaseArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getDatabase(args(argsBuilder).build)

    /** Use this data source to access information about an existing SQL database. */
    inline def getDatabasePlain(args: Endofunction[com.pulumi.azure.mssql.inputs.GetDatabasePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.mssql.outputs.GetDatabaseResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetDatabasePlainArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getDatabasePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing SQL elastic pool. */
    inline def getElasticPool(args: Endofunction[com.pulumi.azure.mssql.inputs.GetElasticPoolArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.mssql.outputs.GetElasticPoolResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetElasticPoolArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getElasticPool(args(argsBuilder).build)

    /** Use this data source to access information about an existing SQL elastic pool. */
    inline def getElasticPoolPlain(args: Endofunction[com.pulumi.azure.mssql.inputs.GetElasticPoolPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.mssql.outputs.GetElasticPoolResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetElasticPoolPlainArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getElasticPoolPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Microsoft Azure SQL Failover Group. */
    inline def getFailoverGroup(args: Endofunction[com.pulumi.azure.mssql.inputs.GetFailoverGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.mssql.outputs.GetFailoverGroupResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetFailoverGroupArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getFailoverGroup(args(argsBuilder).build)

    /** Use this data source to access information about an existing Microsoft Azure SQL Failover Group. */
    inline def getFailoverGroupPlain(args: Endofunction[com.pulumi.azure.mssql.inputs.GetFailoverGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.mssql.outputs.GetFailoverGroupResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetFailoverGroupPlainArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getFailoverGroupPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Azure SQL Azure Managed Database. */
    inline def getManagedDatabase(args: Endofunction[com.pulumi.azure.mssql.inputs.GetManagedDatabaseArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.mssql.outputs.GetManagedDatabaseResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetManagedDatabaseArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getManagedDatabase(args(argsBuilder).build)

    /** Use this data source to access information about an existing Azure SQL Azure Managed Database. */
    inline def getManagedDatabasePlain(args: Endofunction[com.pulumi.azure.mssql.inputs.GetManagedDatabasePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.mssql.outputs.GetManagedDatabaseResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetManagedDatabasePlainArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getManagedDatabasePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Microsoft SQL Azure Managed Instance. */
    inline def getManagedInstance(args: Endofunction[com.pulumi.azure.mssql.inputs.GetManagedInstanceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.mssql.outputs.GetManagedInstanceResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetManagedInstanceArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getManagedInstance(args(argsBuilder).build)

    /** Use this data source to access information about an existing Microsoft SQL Azure Managed Instance. */
    inline def getManagedInstancePlain(args: Endofunction[com.pulumi.azure.mssql.inputs.GetManagedInstancePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.mssql.outputs.GetManagedInstanceResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetManagedInstancePlainArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getManagedInstancePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Microsoft SQL Server. */
    inline def getServer(args: Endofunction[com.pulumi.azure.mssql.inputs.GetServerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.mssql.outputs.GetServerResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetServerArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getServer(args(argsBuilder).build)

    /** Use this data source to access information about an existing Microsoft SQL Server. */
    inline def getServerPlain(args: Endofunction[com.pulumi.azure.mssql.inputs.GetServerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.mssql.outputs.GetServerResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetServerPlainArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getServerPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.VirtualMachineState.Builder)
    /**
     * @param assessment An `assessment` block as defined below.
     * @return builder
     */
    def assessment(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAssessmentArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAssessmentArgs.builder
      builder.assessment(args(argsBuilder).build)

    /**
     * @param autoBackup An `autoBackup` block as defined below. This block can be added to an existing resource, but removing this block forces a new resource to be created.
     * @return builder
     */
    def autoBackup(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAutoBackupArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAutoBackupArgs.builder
      builder.autoBackup(args(argsBuilder).build)

    /**
     * @param autoPatching An `autoPatching` block as defined below.
     * @return builder
     */
    def autoPatching(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAutoPatchingArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAutoPatchingArgs.builder
      builder.autoPatching(args(argsBuilder).build)

    /**
     * @param keyVaultCredential An `keyVaultCredential` block as defined below.
     * @return builder
     */
    def keyVaultCredential(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineKeyVaultCredentialArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineKeyVaultCredentialArgs.builder
      builder.keyVaultCredential(args(argsBuilder).build)

    /**
     * @param sqlInstance A `sqlInstance` block as defined below.
     * @return builder
     */
    def sqlInstance(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineSqlInstanceArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineSqlInstanceArgs.builder
      builder.sqlInstance(args(argsBuilder).build)

    /**
     * @param storageConfiguration An `storageConfiguration` block as defined below.
     * @return builder
     */
    def storageConfiguration(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationArgs.builder
      builder.storageConfiguration(args(argsBuilder).build)

    /**
     * @param wsfcDomainCredential A `wsfcDomainCredential` block as defined below
     * @return builder
     */
    def wsfcDomainCredential(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineWsfcDomainCredentialArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineWsfcDomainCredentialArgs.builder
      builder.wsfcDomainCredential(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mssql.inputs.VirtualMachineState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.mssql.inputs.ManagedInstanceFailoverGroupState.Builder)
    /**
     * @param partnerRegions A `partnerRegion` block as defined below.
     * @return builder
     */
    def partnerRegions(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceFailoverGroupPartnerRegionArgs.Builder]*):
        com.pulumi.azure.mssql.inputs.ManagedInstanceFailoverGroupState.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceFailoverGroupPartnerRegionArgs.builder
      builder.partnerRegions(args.map(_(argsBuilder).build)*)

    /**
     * @param readWriteEndpointFailoverPolicy A `readWriteEndpointFailoverPolicy` block as defined below.
     * @return builder
     */
    def readWriteEndpointFailoverPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ManagedInstanceFailoverGroupState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs.builder
      builder.readWriteEndpointFailoverPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.ManagedDatabaseState.Builder)
    /**
     * @param longTermRetentionPolicy A `longTermRetentionPolicy` block as defined below.
     * @return builder
     */
    def longTermRetentionPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedDatabaseLongTermRetentionPolicyArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ManagedDatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedDatabaseLongTermRetentionPolicyArgs.builder
      builder.longTermRetentionPolicy(args(argsBuilder).build)

    /**
     * @param pointInTimeRestore A `pointInTimeRestore` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def pointInTimeRestore(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedDatabasePointInTimeRestoreArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ManagedDatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedDatabasePointInTimeRestoreArgs.builder
      builder.pointInTimeRestore(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mssql.inputs.ManagedDatabaseState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.mssql.inputs.VirtualMachineAutoBackupArgs.Builder)
    /**
     * @param manualSchedule A `manualSchedule` block as documented below. When this block is present, the schedule type is set to `Manual`. Without this block, the schedule type is set to `Automated`.
     * @return builder
     */
    def manualSchedule(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAutoBackupManualScheduleArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineAutoBackupArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAutoBackupManualScheduleArgs.builder
      builder.manualSchedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.DatabaseState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseIdentityArgs.Builder]):
        com.pulumi.azure.mssql.inputs.DatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param import_ A `import` block as documented below. Mutually exclusive with `createMode`.
     * @return builder
     */
    def import_(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseImportArgs.Builder]):
        com.pulumi.azure.mssql.inputs.DatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseImportArgs.builder
      builder.import_(args(argsBuilder).build)

    /**
     * @param longTermRetentionPolicy A `longTermRetentionPolicy` block as defined below.
     * @return builder
     */
    def longTermRetentionPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseLongTermRetentionPolicyArgs.Builder]):
        com.pulumi.azure.mssql.inputs.DatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseLongTermRetentionPolicyArgs.builder
      builder.longTermRetentionPolicy(args(argsBuilder).build)

    /**
     * @param shortTermRetentionPolicy A `shortTermRetentionPolicy` block as defined below.
     * @return builder
     */
    def shortTermRetentionPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseShortTermRetentionPolicyArgs.Builder]):
        com.pulumi.azure.mssql.inputs.DatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseShortTermRetentionPolicyArgs.builder
      builder.shortTermRetentionPolicy(args(argsBuilder).build)

    /**
     * @param threatDetectionPolicy Threat detection policy configuration. The `threatDetectionPolicy` block supports fields documented below.
     * @return builder
     */
    def threatDetectionPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseThreatDetectionPolicyArgs.Builder]):
        com.pulumi.azure.mssql.inputs.DatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseThreatDetectionPolicyArgs.builder
      builder.threatDetectionPolicy(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mssql.inputs.DatabaseState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.mssql.inputs.JobStepState.Builder)
    /**
     * @param outputTarget An `outputTarget` block as defined below.
     * @return builder
     */
    def outputTarget(args: Endofunction[com.pulumi.azure.mssql.inputs.JobStepOutputTargetArgs.Builder]):
        com.pulumi.azure.mssql.inputs.JobStepState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.JobStepOutputTargetArgs.builder
      builder.outputTarget(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.ServerState.Builder)
    /**
     * @param azureadAdministrator An `azureadAdministrator` block as defined below.
     * @return builder
     */
    def azureadAdministrator(args: Endofunction[com.pulumi.azure.mssql.inputs.ServerAzureadAdministratorArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ServerState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ServerAzureadAdministratorArgs.builder
      builder.azureadAdministrator(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.mssql.inputs.ServerIdentityArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ServerState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ServerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mssql.inputs.ServerState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.mssql.inputs.ManagedInstanceVulnerabilityAssessmentState.Builder)
    /**
     * @param recurringScans The recurring scans settings. The `recurringScans` block supports fields documented below.
     * @return builder
     */
    def recurringScans(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceVulnerabilityAssessmentRecurringScansArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ManagedInstanceVulnerabilityAssessmentState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceVulnerabilityAssessmentRecurringScansArgs.builder
      builder.recurringScans(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.JobTargetGroupState.Builder)
    /**
     * @param jobTargets One or more `jobTarget` blocks as defined below.
     * @return builder
     */
    def jobTargets(args: Endofunction[com.pulumi.azure.mssql.inputs.JobTargetGroupJobTargetArgs.Builder]*):
        com.pulumi.azure.mssql.inputs.JobTargetGroupState.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.JobTargetGroupJobTargetArgs.builder
      builder.jobTargets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.mssql.inputs.JobAgentState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.mssql.inputs.JobAgentIdentityArgs.Builder]):
        com.pulumi.azure.mssql.inputs.JobAgentState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.JobAgentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mssql.inputs.JobAgentState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationArgs.Builder)
    /**
     * @param dataSettings A `storageSettings` block as defined below.
     * @return builder
     */
    def dataSettings(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationDataSettingsArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationDataSettingsArgs.builder
      builder.dataSettings(args(argsBuilder).build)

    /**
     * @param logSettings A `storageSettings` block as defined below.
     * @return builder
     */
    def logSettings(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationLogSettingsArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationLogSettingsArgs.builder
      builder.logSettings(args(argsBuilder).build)

    /**
     * @param tempDbSettings An `tempDbSettings` block as defined below.
     * @return builder
     */
    def tempDbSettings(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationTempDbSettingsArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationTempDbSettingsArgs.builder
      builder.tempDbSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.ServerVulnerabilityAssessmentState.Builder)
    /**
     * @param recurringScans A `recurringScans` block as defined below.
     * 
     *  &gt; **Note:** To reset the `recurringScans` code block to it&#39;s default values you must explicitly define an empty `recurringScans` code block (e.g., `recurringScans {}`) in your configuration file.
     * @return builder
     */
    def recurringScans(args: Endofunction[com.pulumi.azure.mssql.inputs.ServerVulnerabilityAssessmentRecurringScansArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ServerVulnerabilityAssessmentState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ServerVulnerabilityAssessmentRecurringScansArgs.builder
      builder.recurringScans(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.VirtualMachineAssessmentArgs.Builder)
    /**
     * @param schedule An `schedule` block as defined below.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAssessmentScheduleArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineAssessmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAssessmentScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.DatabaseVulnerabilityAssessmentRuleBaselineState.Builder)
    /**
     * @param baselineResults A `baselineResult` block as documented below. Multiple blocks can be defined.
     * @return builder
     */
    def baselineResults(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseVulnerabilityAssessmentRuleBaselineBaselineResultArgs.Builder]*):
        com.pulumi.azure.mssql.inputs.DatabaseVulnerabilityAssessmentRuleBaselineState.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseVulnerabilityAssessmentRuleBaselineBaselineResultArgs.builder
      builder.baselineResults(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerState.Builder)
    /**
     * @param loadBalancerConfiguration A `loadBalancerConfiguration` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** Either one of `loadBalancerConfiguration` or `multiSubnetIpConfiguration` must be specified.
     * @return builder
     */
    def loadBalancerConfiguration(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerLoadBalancerConfigurationArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerLoadBalancerConfigurationArgs.builder
      builder.loadBalancerConfiguration(args(argsBuilder).build)

    /**
     * @param multiSubnetIpConfigurations One or more `multiSubnetIpConfiguration` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def multiSubnetIpConfigurations(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerMultiSubnetIpConfigurationArgs.Builder]*):
        com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerState.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerMultiSubnetIpConfigurationArgs.builder
      builder.multiSubnetIpConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param replicas One or more `replica` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerReplicaArgs.Builder]*):
        com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerState.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.mssql.inputs.FailoverGroupState.Builder)
    /**
     * @param partnerServers A `partnerServer` block as defined below.
     * @return builder
     */
    def partnerServers(args: Endofunction[com.pulumi.azure.mssql.inputs.FailoverGroupPartnerServerArgs.Builder]*):
        com.pulumi.azure.mssql.inputs.FailoverGroupState.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.FailoverGroupPartnerServerArgs.builder
      builder.partnerServers(args.map(_(argsBuilder).build)*)

    /**
     * @param readWriteEndpointFailoverPolicy A `readWriteEndpointFailoverPolicy` block as defined below.
     * @return builder
     */
    def readWriteEndpointFailoverPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.FailoverGroupReadWriteEndpointFailoverPolicyArgs.Builder]):
        com.pulumi.azure.mssql.inputs.FailoverGroupState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.FailoverGroupReadWriteEndpointFailoverPolicyArgs.builder
      builder.readWriteEndpointFailoverPolicy(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mssql.inputs.FailoverGroupState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.mssql.inputs.ManagedInstanceStartStopScheduleState.Builder)
    /**
     * @param schedules A `schedule` block as defined below.
     * @return builder
     */
    def schedules(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceStartStopScheduleScheduleArgs.Builder]*):
        com.pulumi.azure.mssql.inputs.ManagedInstanceStartStopScheduleState.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceStartStopScheduleScheduleArgs.builder
      builder.schedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.mssql.inputs.ElasticPoolState.Builder)
    /**
     * @param perDatabaseSettings A `perDatabaseSettings` block as defined below.
     * @return builder
     */
    def perDatabaseSettings(args: Endofunction[com.pulumi.azure.mssql.inputs.ElasticPoolPerDatabaseSettingsArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ElasticPoolState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ElasticPoolPerDatabaseSettingsArgs.builder
      builder.perDatabaseSettings(args(argsBuilder).build)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.mssql.inputs.ElasticPoolSkuArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ElasticPoolState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ElasticPoolSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mssql.inputs.ElasticPoolState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.mssql.inputs.VirtualMachineGroupState.Builder)
    /**
     * @param wsfcDomainProfile A `wsfcDomainProfile` block as defined below.
     * @return builder
     */
    def wsfcDomainProfile(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineGroupWsfcDomainProfileArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineGroupState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineGroupWsfcDomainProfileArgs.builder
      builder.wsfcDomainProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mssql.inputs.VirtualMachineGroupState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.mssql.inputs.ManagedInstanceState.Builder)
    /**
     * @param azureActiveDirectoryAdministrator An `azureActiveDirectoryAdministrator` block as defined below.
     * @return builder
     */
    def azureActiveDirectoryAdministrator(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceAzureActiveDirectoryAdministratorArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ManagedInstanceState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceAzureActiveDirectoryAdministratorArgs.builder
      builder.azureActiveDirectoryAdministrator(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceIdentityArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ManagedInstanceState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mssql.inputs.ManagedInstanceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.mssql.FailoverGroupArgs.Builder)
    /**
     * @param partnerServers A `partnerServer` block as defined below.
     * @return builder
     */
    def partnerServers(args: Endofunction[com.pulumi.azure.mssql.inputs.FailoverGroupPartnerServerArgs.Builder]*):
        com.pulumi.azure.mssql.FailoverGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.FailoverGroupPartnerServerArgs.builder
      builder.partnerServers(args.map(_(argsBuilder).build)*)

    /**
     * @param readWriteEndpointFailoverPolicy A `readWriteEndpointFailoverPolicy` block as defined below.
     * @return builder
     */
    def readWriteEndpointFailoverPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.FailoverGroupReadWriteEndpointFailoverPolicyArgs.Builder]):
        com.pulumi.azure.mssql.FailoverGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.FailoverGroupReadWriteEndpointFailoverPolicyArgs.builder
      builder.readWriteEndpointFailoverPolicy(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mssql.FailoverGroupArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Allows you to manage an Azure SQL Elastic Pool. */
  def ElasticPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ElasticPoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.ElasticPoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.mssql.ElasticPool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
