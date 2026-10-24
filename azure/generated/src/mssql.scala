package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object mssql:
  /**
   * Manages a MS SQL Database.
   * 
   * &gt; **Note:** To mitigate the possibility of accidental data loss it is highly recommended that you use the `preventDestroy` lifecycle argument in your configuration file for this resource. For more information on the `preventDestroy` lifecycle argument please see the terraform documentation.
   */
  def Database(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.DatabaseArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.DatabaseArgs.builder
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
    com.pulumi.azure.mssql.Database(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a MS SQL Database Extended Auditing Policy. */
  def DatabaseExtendedAuditingPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.DatabaseExtendedAuditingPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.mssql.DatabaseExtendedAuditingPolicyArgs.builder
    com.pulumi.azure.mssql.DatabaseExtendedAuditingPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Database Vulnerability Assessment Rule Baseline.
   * 
   * &gt; **Note:** Database Vulnerability Assessment is currently only available for MS SQL databases.
   */
  def DatabaseVulnerabilityAssessmentRuleBaseline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.DatabaseVulnerabilityAssessmentRuleBaselineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.mssql.DatabaseVulnerabilityAssessmentRuleBaselineArgs.builder
    com.pulumi.azure.mssql.DatabaseVulnerabilityAssessmentRuleBaseline(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Allows you to manage an Azure SQL Elastic Pool. */
  def ElasticPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ElasticPoolArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.ElasticPoolArgs.builder
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
    com.pulumi.azure.mssql.ElasticPool(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Microsoft Azure SQL Failover Group. */
  def FailoverGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.FailoverGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.FailoverGroupArgs.builder
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
    com.pulumi.azure.mssql.FailoverGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Allows you to manage an Azure SQL Firewall Rule. */
  def FirewallRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.FirewallRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.FirewallRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mssql.FirewallRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Elastic Job. */
  def Job(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.JobArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.JobArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mssql.Job(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Elastic Job Agent. */
  def JobAgent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.JobAgentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.JobAgentArgs.builder
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
    com.pulumi.azure.mssql.JobAgent(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Elastic Job Credential. */
  def JobCredential(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.JobCredentialArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.JobCredentialArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mssql.JobCredential(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Elastic Job Schedule. */
  def JobSchedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.JobScheduleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.mssql.JobScheduleArgs.builder
    com.pulumi.azure.mssql.JobSchedule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Elastic Job Step. */
  def JobStep(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.JobStepArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.JobStepArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mssql.JobStep(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Job Target Group. */
  def JobTargetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.JobTargetGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.JobTargetGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mssql.JobTargetGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Azure SQL Azure Managed Database for a SQL Managed Instance.
   * 
   * &gt; **Note:** To mitigate the possibility of accidental data loss it is highly recommended that you use the `preventDestroy` lifecycle argument in your configuration file for this resource. For more information on the `preventDestroy` lifecycle argument please see the terraform documentation.
   */
  def ManagedDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ManagedDatabaseArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.ManagedDatabaseArgs.builder
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
    com.pulumi.azure.mssql.ManagedDatabase(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Microsoft SQL Azure Managed Instance.
   * 
   * &gt; **Note:** All arguments including the administrator login and password will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
   * 
   * &gt; **Note:** SQL Managed Instance needs permission to read Azure Active Directory when configuring the AAD administrator. [Read more about provisioning AAD administrators](https://learn.microsoft.com/azure/azure-sql/database/authentication-aad-configure?view=azuresql#provision-azure-ad-admin-sql-managed-instance).
   */
  def ManagedInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ManagedInstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.ManagedInstanceArgs.builder
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
    com.pulumi.azure.mssql.ManagedInstance(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Allows you to set a user, group or service principal as the AAD Administrator for an Azure SQL Managed Instance. */
  def ManagedInstanceActiveDirectoryAdministrator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ManagedInstanceActiveDirectoryAdministratorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.mssql.ManagedInstanceActiveDirectoryAdministratorArgs.builder
    com.pulumi.azure.mssql.ManagedInstanceActiveDirectoryAdministrator(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure SQL Managed Instance Failover Group. */
  def ManagedInstanceFailoverGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ManagedInstanceFailoverGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.ManagedInstanceFailoverGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mssql.ManagedInstanceFailoverGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Security Alert Policy for an MS SQL Managed Instance. */
  def ManagedInstanceSecurityAlertPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ManagedInstanceSecurityAlertPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.mssql.ManagedInstanceSecurityAlertPolicyArgs.builder
    com.pulumi.azure.mssql.ManagedInstanceSecurityAlertPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages Start Stop Schedules for an MS SQL Managed Instance. */
  def ManagedInstanceStartStopSchedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ManagedInstanceStartStopScheduleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.mssql.ManagedInstanceStartStopScheduleArgs.builder
    com.pulumi.azure.mssql.ManagedInstanceStartStopSchedule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages the transparent data encryption configuration for a MSSQL Managed Instance
   * 
   * &gt; **Note:** Once transparent data encryption(TDE) is enabled on a MS SQL instance, it is not possible to remove TDE. You will be able to switch between &#39;ServiceManaged&#39; and &#39;CustomerManaged&#39; keys, but will not be able to remove encryption. For safety when this resource is deleted, the TDE mode will automatically be set to &#39;ServiceManaged&#39;. As SQL Managed Instance only supports a single configuration for encryption settings, this resource will replace the current encryption settings on the server.
   * 
   * &gt; **Note:** See [documentation](https://docs.microsoft.com/azure/azure-sql/database/transparent-data-encryption-byok-overview) for important information on how handle lifecycle management of the keys to prevent data lockout.
   */
  def ManagedInstanceTransparentDataEncryption(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ManagedInstanceTransparentDataEncryptionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.mssql.ManagedInstanceTransparentDataEncryptionArgs.builder
    com.pulumi.azure.mssql.ManagedInstanceTransparentDataEncryption(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages the Vulnerability Assessment for an MS Managed Instance. */
  def ManagedInstanceVulnerabilityAssessment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ManagedInstanceVulnerabilityAssessmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.mssql.ManagedInstanceVulnerabilityAssessmentArgs.builder
    com.pulumi.azure.mssql.ManagedInstanceVulnerabilityAssessment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object MssqlFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing SQL database. */
    inline def getDatabase(args: Endofunction[com.pulumi.azure.mssql.inputs.GetDatabaseArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.mssql.outputs.GetDatabaseResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetDatabaseArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getDatabase(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing SQL database. */
    inline def getDatabasePlain(args: Endofunction[com.pulumi.azure.mssql.inputs.GetDatabasePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.mssql.outputs.GetDatabaseResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetDatabasePlainArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getDatabasePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing SQL elastic pool. */
    inline def getElasticPool(args: Endofunction[com.pulumi.azure.mssql.inputs.GetElasticPoolArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.mssql.outputs.GetElasticPoolResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetElasticPoolArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getElasticPool(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing SQL elastic pool. */
    inline def getElasticPoolPlain(args: Endofunction[com.pulumi.azure.mssql.inputs.GetElasticPoolPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.mssql.outputs.GetElasticPoolResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetElasticPoolPlainArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getElasticPoolPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Microsoft Azure SQL Failover Group. */
    inline def getFailoverGroup(args: Endofunction[com.pulumi.azure.mssql.inputs.GetFailoverGroupArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.mssql.outputs.GetFailoverGroupResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetFailoverGroupArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getFailoverGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Microsoft Azure SQL Failover Group. */
    inline def getFailoverGroupPlain(args: Endofunction[com.pulumi.azure.mssql.inputs.GetFailoverGroupPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.mssql.outputs.GetFailoverGroupResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetFailoverGroupPlainArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getFailoverGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Azure SQL Azure Managed Database. */
    inline def getManagedDatabase(args: Endofunction[com.pulumi.azure.mssql.inputs.GetManagedDatabaseArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.mssql.outputs.GetManagedDatabaseResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetManagedDatabaseArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getManagedDatabase(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Azure SQL Azure Managed Database. */
    inline def getManagedDatabasePlain(args: Endofunction[com.pulumi.azure.mssql.inputs.GetManagedDatabasePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.mssql.outputs.GetManagedDatabaseResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetManagedDatabasePlainArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getManagedDatabasePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Microsoft SQL Azure Managed Instance. */
    inline def getManagedInstance(args: Endofunction[com.pulumi.azure.mssql.inputs.GetManagedInstanceArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.mssql.outputs.GetManagedInstanceResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetManagedInstanceArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getManagedInstance(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Microsoft SQL Azure Managed Instance. */
    inline def getManagedInstancePlain(args: Endofunction[com.pulumi.azure.mssql.inputs.GetManagedInstancePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.mssql.outputs.GetManagedInstanceResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetManagedInstancePlainArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getManagedInstancePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Microsoft SQL Server. */
    inline def getServer(args: Endofunction[com.pulumi.azure.mssql.inputs.GetServerArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.mssql.outputs.GetServerResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetServerArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getServer(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Microsoft SQL Server. */
    inline def getServerPlain(args: Endofunction[com.pulumi.azure.mssql.inputs.GetServerPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.mssql.outputs.GetServerResult] =
      val argsBuilder = com.pulumi.azure.mssql.inputs.GetServerPlainArgs.builder
      com.pulumi.azure.mssql.MssqlFunctions.getServerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Allows you to manage an Azure SQL Outbound Firewall Rule. */
  def OutboundFirewallRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.OutboundFirewallRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.OutboundFirewallRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mssql.OutboundFirewallRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Microsoft SQL Azure Database Server. */
  def Server(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ServerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.ServerArgs.builder
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
    com.pulumi.azure.mssql.Server(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a MS SQL Server DNS Alias. */
  def ServerDnsAlias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ServerDnsAliasArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.ServerDnsAliasArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mssql.ServerDnsAlias(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a MS SQL Server Extended Auditing Policy. */
  def ServerExtendedAuditingPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ServerExtendedAuditingPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.mssql.ServerExtendedAuditingPolicyArgs.builder
    com.pulumi.azure.mssql.ServerExtendedAuditingPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a MS SQL Server Microsoft Support Auditing Policy. */
  def ServerMicrosoftSupportAuditingPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ServerMicrosoftSupportAuditingPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.mssql.ServerMicrosoftSupportAuditingPolicyArgs.builder
    com.pulumi.azure.mssql.ServerMicrosoftSupportAuditingPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Security Alert Policy for a MSSQL Server.
   * 
   * &gt; **Note:** Security Alert Policy is currently only available for MS SQL databases.
   */
  def ServerSecurityAlertPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ServerSecurityAlertPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.mssql.ServerSecurityAlertPolicyArgs.builder
    com.pulumi.azure.mssql.ServerSecurityAlertPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages the transparent data encryption configuration for a MSSQL Server
   * 
   * &gt; **Note:** This resource can be used to configure Transparent Data Encryption for MS SQL instances with Customer Managed Keys. For MS SQL instances that are System Managed, it should only be used with pre-existing MS SQL Instances that are over 3 years old. For new System Managed MS SQL Instances that will be created through the use of the `azure.mssql.Server` resource, please enable Transparent Data Encryption through `azure.mssql.Server` resource itself by configuring an identity block. By default, all new MS SQL Instances are deployed with System Managed Transparent Data Encryption enabled.
   * 
   * &gt; **Note:** Once transparent data encryption is enabled on a MS SQL instance, it is not possible to remove TDE. You will be able to switch between &#39;ServiceManaged&#39; and &#39;CustomerManaged&#39; keys, but will not be able to remove encryption. For safety when this resource is deleted, the TDE mode will automatically be set to &#39;ServiceManaged&#39;. As SQL Server only supports a single configuration for encryption settings, this resource will replace the current encryption settings on the server.
   * 
   * &gt; **Note:** See [documentation](https://docs.microsoft.com/azure/azure-sql/database/transparent-data-encryption-byok-overview) for important information on how handle lifecycle management of the keys to prevent data lockout.
   */
  def ServerTransparentDataEncryption(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ServerTransparentDataEncryptionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.mssql.ServerTransparentDataEncryptionArgs.builder
    com.pulumi.azure.mssql.ServerTransparentDataEncryption(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages the Vulnerability Assessment for an MS SQL Server.
   * 
   * &gt; **Note:** Vulnerability Assessment is currently only available for MS SQL databases.
   * 
   * &gt; **Note:** This resource cannot be used to enable the Express SQL Vulnerability Assessment configuration, to enable the express configuration, use `expressVulnerabilityAssessmentEnabled` in the `azure.mssql.Server` resource.
   */
  def ServerVulnerabilityAssessment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.ServerVulnerabilityAssessmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.mssql.ServerVulnerabilityAssessmentArgs.builder
    com.pulumi.azure.mssql.ServerVulnerabilityAssessment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Microsoft SQL Virtual Machine */
  def VirtualMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.VirtualMachineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.VirtualMachineArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.mssql.VirtualMachine(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Microsoft SQL Virtual Machine Availability Group Listener. */
  def VirtualMachineAvailabilityGroupListener(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.VirtualMachineAvailabilityGroupListenerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.VirtualMachineAvailabilityGroupListenerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mssql.VirtualMachineAvailabilityGroupListener(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Microsoft SQL Virtual Machine Group. */
  def VirtualMachineGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.VirtualMachineGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.VirtualMachineGroupArgs.builder
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
    com.pulumi.azure.mssql.VirtualMachineGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Allows you to manage rules for allowing traffic between an Azure SQL server and a subnet of a virtual network. */
  def VirtualNetworkRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mssql.VirtualNetworkRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mssql.VirtualNetworkRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mssql.VirtualNetworkRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
