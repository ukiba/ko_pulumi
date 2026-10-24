package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object monitoring:
  /**
   * Manages an Azure Active Directory Diagnostic Setting for Azure Monitor.
   * 
   * &gt; **Note:** When using Service Principal authentication, the Service Principal must be assigned the _Contributor_ role at the scope `/providers/Microsoft.aadiam`. You can assign this role using the `az` CLI command: `az role assignment create --assignee-principal-type ServicePrincipal --assignee-object-id &#34;&lt;sp-object-id&gt;&#34; --scope &#34;/providers/Microsoft.aadiam&#34; --role &#34;Contributor&#34;`. The assigning user must be a User Access Administrator at the root level. Refer to the [Azure elevation guide](https://learn.microsoft.com/en-us/azure/role-based-access-control/elevate-access-global-admin) for details.
   */
  def AadDiagnosticSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.AadDiagnosticSettingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.AadDiagnosticSettingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.monitoring.AadDiagnosticSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Action Group within Azure Monitor. */
  def ActionGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.ActionGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.ActionGroupArgs.builder
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
    com.pulumi.azure.monitoring.ActionGroup(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Activity Log Alert within Azure Monitor. */
  def ActivityLogAlert(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.ActivityLogAlertArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.ActivityLogAlertArgs.builder
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
    com.pulumi.azure.monitoring.ActivityLogAlert(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Alert Processing Rule which apply action group. */
  def AlertProcessingRuleActionGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.AlertProcessingRuleActionGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.AlertProcessingRuleActionGroupArgs.builder
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
    com.pulumi.azure.monitoring.AlertProcessingRuleActionGroup(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Alert Processing Rule which suppress notifications. */
  def AlertProcessingRuleSuppression(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.AlertProcessingRuleSuppressionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.AlertProcessingRuleSuppressionArgs.builder
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
    com.pulumi.azure.monitoring.AlertProcessingRuleSuppression(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Alert Management Prometheus Rule Group. */
  def AlertPrometheusRuleGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.AlertPrometheusRuleGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.AlertPrometheusRuleGroupArgs.builder
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
    com.pulumi.azure.monitoring.AlertPrometheusRuleGroup(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a AutoScale Setting which can be applied to Virtual Machine Scale Sets, App Services and other scalable resources. */
  def AutoscaleSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.AutoscaleSettingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.AutoscaleSettingArgs.builder
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
    com.pulumi.azure.monitoring.AutoscaleSetting(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Data Collection Endpoint. */
  def DataCollectionEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.DataCollectionEndpointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.DataCollectionEndpointArgs.builder
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
    com.pulumi.azure.monitoring.DataCollectionEndpoint(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a Data Collection Rule.
   * 
   * ## Import
   * 
   * Data Collection Rules can be imported using the `resource id`, e.g.
   * 
   * ```sh
   * \$ pulumi import azure:monitoring/dataCollectionRule:DataCollectionRule example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Insights/dataCollectionRules/rule1
   * ```
   */
  def DataCollectionRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.DataCollectionRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.DataCollectionRuleArgs.builder
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
    com.pulumi.azure.monitoring.DataCollectionRule(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Data Collection Rule Association. */
  def DataCollectionRuleAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.DataCollectionRuleAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.DataCollectionRuleAssociationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.monitoring.DataCollectionRuleAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Diagnostic Setting for an existing Resource. */
  def DiagnosticSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.DiagnosticSettingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.DiagnosticSettingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.monitoring.DiagnosticSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Metric Alert within Azure Monitor. */
  def MetricAlert(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.MetricAlertArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.MetricAlertArgs.builder
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
    com.pulumi.azure.monitoring.MetricAlert(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object MonitoringFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access the properties of an Action Group. */
    inline def getActionGroup(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetActionGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.monitoring.outputs.GetActionGroupResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetActionGroupArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getActionGroup(args(argsBuilder).build)

    /** Use this data source to access the properties of an Action Group. */
    inline def getActionGroupPlain(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetActionGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.monitoring.outputs.GetActionGroupResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetActionGroupPlainArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getActionGroupPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Data Collection Endpoint. */
    inline def getDataCollectionEndpoint(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetDataCollectionEndpointArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.monitoring.outputs.GetDataCollectionEndpointResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetDataCollectionEndpointArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getDataCollectionEndpoint(args(argsBuilder).build)

    /** Use this data source to access information about an existing Data Collection Endpoint. */
    inline def getDataCollectionEndpointPlain(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetDataCollectionEndpointPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.monitoring.outputs.GetDataCollectionEndpointResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetDataCollectionEndpointPlainArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getDataCollectionEndpointPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Data Collection Rule. */
    inline def getDataCollectionRule(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetDataCollectionRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.monitoring.outputs.GetDataCollectionRuleResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetDataCollectionRuleArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getDataCollectionRule(args(argsBuilder).build)

    /** Use this data source to access information about an existing Data Collection Rule. */
    inline def getDataCollectionRulePlain(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetDataCollectionRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.monitoring.outputs.GetDataCollectionRuleResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetDataCollectionRulePlainArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getDataCollectionRulePlain(args(argsBuilder).build)

    /** Use this data source to access information about the Monitor Diagnostics Categories supported by an existing Resource. */
    inline def getDiagnosticCategories(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetDiagnosticCategoriesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.monitoring.outputs.GetDiagnosticCategoriesResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetDiagnosticCategoriesArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getDiagnosticCategories(args(argsBuilder).build)

    /** Use this data source to access information about the Monitor Diagnostics Categories supported by an existing Resource. */
    inline def getDiagnosticCategoriesPlain(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetDiagnosticCategoriesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.monitoring.outputs.GetDiagnosticCategoriesResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetDiagnosticCategoriesPlainArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getDiagnosticCategoriesPlain(args(argsBuilder).build)

    /** Use this data source to access the properties of an AlertingAction scheduled query rule. */
    inline def getScheduledQueryRulesAlert(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetScheduledQueryRulesAlertArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.monitoring.outputs.GetScheduledQueryRulesAlertResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetScheduledQueryRulesAlertArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getScheduledQueryRulesAlert(args(argsBuilder).build)

    /** Use this data source to access the properties of an AlertingAction scheduled query rule. */
    inline def getScheduledQueryRulesAlertPlain(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetScheduledQueryRulesAlertPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.monitoring.outputs.GetScheduledQueryRulesAlertResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetScheduledQueryRulesAlertPlainArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getScheduledQueryRulesAlertPlain(args(argsBuilder).build)

    /** Use this data source to access the properties of a LogToMetricAction scheduled query rule. */
    inline def getScheduledQueryRulesLog(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetScheduledQueryRulesLogArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.monitoring.outputs.GetScheduledQueryRulesLogResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetScheduledQueryRulesLogArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getScheduledQueryRulesLog(args(argsBuilder).build)

    /** Use this data source to access the properties of a LogToMetricAction scheduled query rule. */
    inline def getScheduledQueryRulesLogPlain(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetScheduledQueryRulesLogPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.monitoring.outputs.GetScheduledQueryRulesLogResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetScheduledQueryRulesLogPlainArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getScheduledQueryRulesLogPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Workspace. */
    inline def getWorkspace(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetWorkspaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.monitoring.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetWorkspaceArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getWorkspace(args(argsBuilder).build)

    /** Use this data source to access information about an existing Workspace. */
    inline def getWorkspacePlain(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetWorkspacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.monitoring.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetWorkspacePlainArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getWorkspacePlain(args(argsBuilder).build)

  /** Manages an Azure Monitor Private Link Scope. */
  def PrivateLinkScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.PrivateLinkScopeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.PrivateLinkScopeArgs.builder
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
    com.pulumi.azure.monitoring.PrivateLinkScope(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Azure Monitor Private Link Scoped Service. */
  def PrivateLinkScopedService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.PrivateLinkScopedServiceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.PrivateLinkScopedServiceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.monitoring.PrivateLinkScopedService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages an AlertingAction Scheduled Query Rules resource within Azure Monitor.
   * 
   * &gt; **Note:** This resource is using an older AzureRM API version which is known to cause problems e.g. with custom webhook properties not included in triggered alerts. This resource is superseded by the azure.monitoring.ScheduledQueryRulesAlertV2 resource using newer API versions.
   */
  def ScheduledQueryRulesAlert(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.ScheduledQueryRulesAlertArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.ScheduledQueryRulesAlertArgs.builder
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
    com.pulumi.azure.monitoring.ScheduledQueryRulesAlert(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an AlertingAction Scheduled Query Rules Version 2 resource within Azure Monitor */
  def ScheduledQueryRulesAlertV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.ScheduledQueryRulesAlertV2Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.ScheduledQueryRulesAlertV2Args.builder
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
    com.pulumi.azure.monitoring.ScheduledQueryRulesAlertV2(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a LogToMetricAction Scheduled Query Rules resource within Azure Monitor. */
  def ScheduledQueryRulesLog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.ScheduledQueryRulesLogArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.ScheduledQueryRulesLogArgs.builder
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
    com.pulumi.azure.monitoring.ScheduledQueryRulesLog(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Monitor Smart Detector Alert Rule. */
  def SmartDetectorAlertRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.SmartDetectorAlertRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.SmartDetectorAlertRuleArgs.builder
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
    com.pulumi.azure.monitoring.SmartDetectorAlertRule(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Azure Monitor Workspace. */
  def Workspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.WorkspaceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.WorkspaceArgs.builder
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
    com.pulumi.azure.monitoring.Workspace(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
