package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object chronicle:
  /**
   * BigQueryExport resource represents the BigQuery export configuration for a Chronicle instance.
   * 
   * To get more information about BigQueryExport, see:
   * 
   * * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.bigQueryExport)
   * * How-to Guides
   *     * [BigQuery Export Overview](https://cloud.google.com/chronicle/docs/secops/bigquery-export-overview)
   */
  def BigQueryExport(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.BigQueryExportArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.BigQueryExportArgs.builder
    com.pulumi.gcp.chronicle.BigQueryExport(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * CaseCloseDefinition provides predefined root cause options for closing security cases in SecOps. These definitions ensure consistent documentation and reporting across case investigations upon closure.
   * 
   * To get more information about CaseCloseDefinition, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.caseCloseDefinitions)
   * * How-to Guides
   *     * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def CaseCloseDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.CaseCloseDefinitionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.CaseCloseDefinitionArgs.builder
    com.pulumi.gcp.chronicle.CaseCloseDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * CaseStageDefinition represents a stage in the lifecycle of a case.
   * 
   * To get more information about CaseStageDefinition, see:
   * 
   * * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.caseStageDefinitions)
   * * How-to Guides
   *     * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def CaseStageDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.CaseStageDefinitionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.CaseStageDefinitionArgs.builder
    com.pulumi.gcp.chronicle.CaseStageDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A CaseTagDefinition is used to classify and tag cases based on criteria.
   * 
   * To get more information about CaseTagDefinition, see:
   * 
   * * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.caseTagDefinitions)
   * * How-to Guides
   *     * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def CaseTagDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.CaseTagDefinitionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.CaseTagDefinitionArgs.builder
    com.pulumi.gcp.chronicle.CaseTagDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * The custom list is a list of objects, that can be saved as a shared resource, and can be used by playbooks.
   * 
   * To get more information about CustomList, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.customLists)
   * * How-to Guides
   *     * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def CustomList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.CustomListArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.CustomListArgs.builder
    com.pulumi.gcp.chronicle.CustomList(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A chart resource used within a NativeDashboard. Its lifecycle (Create, Update, Delete) is managed via custom methods on the NativeDashboard resource.
   * 
   * To get more information about DashboardChart, see:
   * 
   * * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.dashboardCharts)
   * * How-to Guides
   *     * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def DashboardChart(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.DashboardChartArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.DashboardChartArgs.builder
    com.pulumi.gcp.chronicle.DashboardChart(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A DataAccessLabel is a label on events to define user access to data.
   * 
   * To get more information about DataAccessLabel, see:
   * 
   * * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.dataAccessLabels)
   * * How-to Guides
   *     * [Introduction to data RBAC](https://cloud.google.com/chronicle/docs/onboard/onboard-datarbac)
   */
  def DataAccessLabel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.DataAccessLabelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.DataAccessLabelArgs.builder
    com.pulumi.gcp.chronicle.DataAccessLabel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A DataAccessScope is a boolean expression of data access labels used to restrict access to data for users.
   * 
   * To get more information about DataAccessScope, see:
   * 
   * * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.dataAccessScopes)
   * * How-to Guides
   *     * [Introduction to data RBAC](https://cloud.google.com/chronicle/docs/onboard/onboard-datarbac)
   */
  def DataAccessScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.DataAccessScopeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.DataAccessScopeArgs.builder
    com.pulumi.gcp.chronicle.DataAccessScope(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * DataExport resource represents a request to export data from Chronicle to a GCS bucket.
   * 
   * To get more information about DataExport, see:
   * 
   * * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1beta/projects.locations.instances.dataExports)
   * * How-to Guides
   *     * [Data Export Overview](https://cloud.google.com/chronicle/docs/secops/data-export-overview)
   */
  def DataExport(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.DataExportArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.DataExportArgs.builder
    com.pulumi.gcp.chronicle.DataExport(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Represents a Chronicle Data Table, a multicolumn structure used to ingest your own data into Google SecOps.
   * 
   * To get more information about DataTable, see:
   * 
   * * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.dataTables)
   * * How-to Guides
   *     * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def DataTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.DataTableArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.DataTableArgs.builder
    com.pulumi.gcp.chronicle.DataTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Represents a single row in a data table.
   * 
   * To get more information about DataTableRow, see:
   * 
   * * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.dataTables.dataTableRows)
   * * How-to Guides
   *     * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def DataTableRow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.DataTableRowArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.DataTableRowArgs.builder
    com.pulumi.gcp.chronicle.DataTableRow(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * An environment is logical container for different networks or customers that are managed by the SOC or MSSP. This is useful for SOCs who provide services to several different networks, customers or business units within the organization. The Platform comes with a predefined environment named Default Environment.
   * 
   * To get more information about Environment, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.environments)
   * * How-to Guides
   *     * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def Environment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.EnvironmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.EnvironmentArgs.builder
    com.pulumi.gcp.chronicle.Environment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Environment groups let you organize multiple environments into logical categories, making it easier to manage large organizations or multiple customers as a Managed Security Service Provider (MSSP).
   * 
   * To get more information about EnvironmentGroup, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.environmentGroups)
   * * How-to Guides
   *     * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def EnvironmentGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.EnvironmentGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.EnvironmentGroupArgs.builder
    com.pulumi.gcp.chronicle.EnvironmentGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * The FeedsService is responsible for configuring and managing the ingestion of third-party security data and logs into Google Security Operations through various feed creation, updates, and lifecycle management, and schema validation.
   * 
   * To get more information about Feed, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.feeds)
   * * How-to Guides
   *     * [Feed management overview](https://docs.cloud.google.com/chronicle/docs/administration/feed-management-overview)
   */
  def Feed(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.FeedArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.FeedArgs.builder
    com.pulumi.gcp.chronicle.Feed(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Represents a set of logic conditions used to refine various types of findings such as curated rule detections.
   * 
   * To get more information about FindingsRefinement, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.findingsRefinements)
   * * How-to Guides
   *     * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def FindingsRefinement(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.FindingsRefinementArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.FindingsRefinementArgs.builder
    com.pulumi.gcp.chronicle.FindingsRefinement(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * The FindingsRefinementDeployment resource represents the deployment state of a findings refinement.
   * 
   * To get more information about FindingsRefinementDeployment, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/chronicle/docs/reference/rest/v1/FindingsRefinementDeployment)
   * * How-to Guides
   *     * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def FindingsRefinementDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.FindingsRefinementDeploymentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.FindingsRefinementDeploymentArgs.builder
    com.pulumi.gcp.chronicle.FindingsRefinementDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A configuration for a native dashboard within a Google SecOps (Chronicle) instance.
   * 
   * To get more information about NativeDashboard, see:
   * 
   * * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.nativeDashboards)
   * * How-to Guides
   *     * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def NativeDashboard(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.NativeDashboardArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.NativeDashboardArgs.builder
    com.pulumi.gcp.chronicle.NativeDashboard(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A parser is a configuration that parses raw logs of a specific log type into Unified Data Model (UDM) events.
   * Chronicle supports both customer-created custom parsers and Google-provided prebuilt parsers.
   * 
   * To get more information about Parser, see:
   * 
   * * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.logTypes.parsers)
   * * How-to Guides
   *     * [Custom parsers overview](https://cloud.google.com/chronicle/docs/detection/custom-parsers-overview)
   */
  def Parser(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.ParserArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.ParserArgs.builder
    com.pulumi.gcp.chronicle.Parser(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A parser extension allows customers to extend or customize the behavior of an existing prebuilt or custom parser.
   * It enables extracting additional fields from raw logs without modifying the base parser.
   * 
   * To get more information about ParserExtension, see:
   * 
   * * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.logTypes.parserExtensions)
   * * How-to Guides
   *     * [Custom parsers overview](https://cloud.google.com/chronicle/docs/detection/custom-parsers-overview)
   */
  def ParserExtension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.ParserExtensionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.ParserExtensionArgs.builder
    com.pulumi.gcp.chronicle.ParserExtension(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Reference lists are user-defined lists of values which users can use in multiple Rules.
   * 
   * To get more information about ReferenceList, see:
   * 
   * * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.referenceLists)
   * * How-to Guides
   *     * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def ReferenceList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.ReferenceListArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.ReferenceListArgs.builder
    com.pulumi.gcp.chronicle.ReferenceList(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Retrohunt is an execution of a Rule over a time range in the past.
   * 
   * To get more information about Retrohunt, see:
   * 
   * * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.rules.retrohunts)
   * * How-to Guides
   *     * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def Retrohunt(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.RetrohuntArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.RetrohuntArgs.builder
    com.pulumi.gcp.chronicle.Retrohunt(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * The Rule resource represents a user-created rule.
   * 
   * To get more information about Rule, see:
   * 
   * * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.rules)
   * * How-to Guides
   *     * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def Rule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.RuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.RuleArgs.builder
    com.pulumi.gcp.chronicle.Rule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * The RuleDeployment resource represents the deployment state of a Rule.
   * 
   * To get more information about RuleDeployment, see:
   * 
   * * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/RuleDeployment)
   * * How-to Guides
   *     * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def RuleDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.RuleDeploymentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.RuleDeploymentArgs.builder
    com.pulumi.gcp.chronicle.RuleDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A SOAR domain designate a domain as internal, ensuring that entities associated with it are treated as organizational assets rather than external threats during ingestion.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about SoarDomain, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/chronicle/docs/reference/rest/v1beta/projects.locations.instances.soarDomains)
   * * How-to Guides
   *     * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def SoarDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.SoarDomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.SoarDomainArgs.builder
    com.pulumi.gcp.chronicle.SoarDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manage networks in the platform using the Classless Inter-Domain Routing (CIDR) format. The system identifies network subnets to help Google Security Operations recognize internal assets and consider network sensitivity during playbook execution.
   * 
   * To get more information about SoarNetwork, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.soarNetworks)
   * * How-to Guides
   *     * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def SoarNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.SoarNetworkArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.SoarNetworkArgs.builder
    com.pulumi.gcp.chronicle.SoarNetwork(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A watchlist is a list of entities that allows for bulk operations over the included entities.
   * 
   * To get more information about Watchlist, see:
   * 
   * * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.watchlists)
   * * How-to Guides
   *     * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def Watchlist(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.WatchlistArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.chronicle.WatchlistArgs.builder
    com.pulumi.gcp.chronicle.Watchlist(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
