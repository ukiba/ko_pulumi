package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object chronicle:
  /**
   * The FeedsService is responsible for configuring and managing the ingestion of third-party security data and logs into Google Security Operations through various feed creation, updates, and lifecycle management, and schema validation.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about Feed, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/chronicle/docs/reference/rest/v1beta/projects.locations.instances.feeds)
   *  * How-to Guides
   *      * [Feed management overview](https://docs.cloud.google.com/chronicle/docs/administration/feed-management-overview)
   */
  def Feed(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.FeedArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.chronicle.FeedArgs.builder
    com.pulumi.gcp.chronicle.Feed(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.chronicle.DataTableArgs.Builder)
    /**
     * @param columnInfos Details of all the columns in the table
     *  Structure is documented below.
     * @return builder
     */
    def columnInfos(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DataTableColumnInfoArgs.Builder]*):
        com.pulumi.gcp.chronicle.DataTableArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DataTableColumnInfoArgs.builder
      builder.columnInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param scopeInfo DataTableScopeInfo specifies the scope info of the data table.
     *  Structure is documented below.
     * @return builder
     */
    def scopeInfo(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DataTableScopeInfoArgs.Builder]):
        com.pulumi.gcp.chronicle.DataTableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DataTableScopeInfoArgs.builder
      builder.scopeInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.WatchlistArgs.Builder)
    /**
     * @param entityPopulationMechanism Mechanism to populate entities in the watchlist.
     *  Structure is documented below.
     * @return builder
     */
    def entityPopulationMechanism(args: Endofunction[com.pulumi.gcp.chronicle.inputs.WatchlistEntityPopulationMechanismArgs.Builder]):
        com.pulumi.gcp.chronicle.WatchlistArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.WatchlistEntityPopulationMechanismArgs.builder
      builder.entityPopulationMechanism(args(argsBuilder).build)

    /**
     * @param watchlistUserPreferences A collection of user preferences for watchlist UI configuration.
     *  Structure is documented below.
     * @return builder
     */
    def watchlistUserPreferences(args: Endofunction[com.pulumi.gcp.chronicle.inputs.WatchlistWatchlistUserPreferencesArgs.Builder]):
        com.pulumi.gcp.chronicle.WatchlistArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.WatchlistWatchlistUserPreferencesArgs.builder
      builder.watchlistUserPreferences(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.ReferenceListArgs.Builder)
    /**
     * @param entries Required. The entries of the reference list.
     *  When listed, they are returned in the order that was specified at creation
     *  or update. The combined size of the values of the reference list may not
     *  exceed 6MB.
     *  This is returned only when the view is REFERENCE_LIST_VIEW_FULL.
     *  Structure is documented below.
     * @return builder
     */
    def entries(args: Endofunction[com.pulumi.gcp.chronicle.inputs.ReferenceListEntryArgs.Builder]*):
        com.pulumi.gcp.chronicle.ReferenceListArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.ReferenceListEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

    /**
     * @param scopeInfos ScopeInfo specifies the scope info of the reference list.
     *  Structure is documented below.
     * @return builder
     */
    def scopeInfos(args: Endofunction[com.pulumi.gcp.chronicle.inputs.ReferenceListScopeInfoArgs.Builder]*):
        com.pulumi.gcp.chronicle.ReferenceListArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.ReferenceListScopeInfoArgs.builder
      builder.scopeInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.DataAccessScopeArgs.Builder)
    /**
     * @param allowedDataAccessLabels The allowed labels for the scope. There has to be at
     *  least one label allowed for the scope to be valid.
     *  The logical operator for evaluation of the allowed labels is OR.
     *  Either allowAll or allowedDataAccessLabels needs to be provided.
     *  E.g.: A customer with scope with allowed labels A and B will be able
     *  to see data with labeled with A or B or (A and B).
     *  Structure is documented below.
     * @return builder
     */
    def allowedDataAccessLabels(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DataAccessScopeAllowedDataAccessLabelArgs.Builder]*):
        com.pulumi.gcp.chronicle.DataAccessScopeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DataAccessScopeAllowedDataAccessLabelArgs.builder
      builder.allowedDataAccessLabels(args.map(_(argsBuilder).build)*)

    /**
     * @param deniedDataAccessLabels Optional. The denied labels for the scope.
     *  The logical operator for evaluation of the denied labels is AND.
     *  E.g.: A customer with scope with denied labels A and B won&#39;t be able
     *  to see data labeled with A and data labeled with B
     *  and data with labels A and B.
     *  Structure is documented below.
     * @return builder
     */
    def deniedDataAccessLabels(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DataAccessScopeDeniedDataAccessLabelArgs.Builder]*):
        com.pulumi.gcp.chronicle.DataAccessScopeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DataAccessScopeDeniedDataAccessLabelArgs.builder
      builder.deniedDataAccessLabels(args.map(_(argsBuilder).build)*)

  /**
   * A DataAccessLabel is a label on events to define user access to data.
   * 
   *  To get more information about DataAccessLabel, see:
   * 
   *  * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.dataAccessLabels)
   *  * How-to Guides
   *      * [Introduction to data RBAC](https://cloud.google.com/chronicle/docs/onboard/onboard-datarbac)
   */
  def DataAccessLabel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.DataAccessLabelArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.chronicle.DataAccessLabelArgs.builder
    com.pulumi.gcp.chronicle.DataAccessLabel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a Chronicle Data Table, a multicolumn structure used to ingest your own data into Google SecOps.
   * 
   *  To get more information about DataTable, see:
   * 
   *  * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.dataTables)
   *  * How-to Guides
   *      * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def DataTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.DataTableArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.chronicle.DataTableArgs.builder
    com.pulumi.gcp.chronicle.DataTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A configuration for a native dashboard within a Google SecOps (Chronicle) instance.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about NativeDashboard, see:
   * 
   *  * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1beta/projects.locations.instances.nativeDashboards)
   *  * How-to Guides
   *      * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def NativeDashboard(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.NativeDashboardArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.chronicle.NativeDashboardArgs.builder
    com.pulumi.gcp.chronicle.NativeDashboard(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Retrohunt is an execution of a Rule over a time range in the past.
   * 
   *  To get more information about Retrohunt, see:
   * 
   *  * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.rules.retrohunts)
   *  * How-to Guides
   *      * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def Retrohunt(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.RetrohuntArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.chronicle.RetrohuntArgs.builder
    com.pulumi.gcp.chronicle.Retrohunt(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A chart resource used within a NativeDashboard. Its lifecycle (Create, Update, Delete) is managed via custom methods on the NativeDashboard resource.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about DashboardChart, see:
   * 
   *  * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1beta/projects.locations.instances.dashboardCharts)
   *  * How-to Guides
   *      * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def DashboardChart(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.DashboardChartArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.chronicle.DashboardChartArgs.builder
    com.pulumi.gcp.chronicle.DashboardChart(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A watchlist is a list of entities that allows for bulk operations over the included entities.
   * 
   *  To get more information about Watchlist, see:
   * 
   *  * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.watchlists)
   *  * How-to Guides
   *      * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def Watchlist(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.WatchlistArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.chronicle.WatchlistArgs.builder
    com.pulumi.gcp.chronicle.Watchlist(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.chronicle.FeedArgs.Builder)
    /**
     * @param details Additional details of the feed, these details are dynamic and will be
     *  different for each of the feeds.
     *  Structure is documented below.
     * @return builder
     */
    def details(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder]):
        com.pulumi.gcp.chronicle.FeedArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.builder
      builder.details(args(argsBuilder).build)

    /**
     * @param failureDetails FeedFailureDetails contains details about the errors thrown by chronicle for
     *  the feeds. These are user visible details. These details help user identify
     *  the root cause and take appropriate action for the feed errors.
     *  NEXT TAG: 5
     *  Structure is documented below.
     * @return builder
     */
    def failureDetails(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedFailureDetailsArgs.Builder]):
        com.pulumi.gcp.chronicle.FeedArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedFailureDetailsArgs.builder
      builder.failureDetails(args(argsBuilder).build)

  /**
   * The RuleDeployment resource represents the deployment state of a Rule.
   * 
   *  To get more information about RuleDeployment, see:
   * 
   *  * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/RuleDeployment)
   *  * How-to Guides
   *      * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def RuleDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.RuleDeploymentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.chronicle.RuleDeploymentArgs.builder
    com.pulumi.gcp.chronicle.RuleDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A DataAccessScope is a boolean expression of data access labels used to restrict access to data for users.
   * 
   *  To get more information about DataAccessScope, see:
   * 
   *  * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.dataAccessScopes)
   *  * How-to Guides
   *      * [Introduction to data RBAC](https://cloud.google.com/chronicle/docs/onboard/onboard-datarbac)
   */
  def DataAccessScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.DataAccessScopeArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.chronicle.DataAccessScopeArgs.builder
    com.pulumi.gcp.chronicle.DataAccessScope(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Reference lists are user-defined lists of values which users can use in multiple Rules.
   * 
   *  To get more information about ReferenceList, see:
   * 
   *  * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.referenceLists)
   *  * How-to Guides
   *      * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def ReferenceList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.ReferenceListArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.chronicle.ReferenceListArgs.builder
    com.pulumi.gcp.chronicle.ReferenceList(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.chronicle.RetrohuntArgs.Builder)
    /**
     * @param processInterval Represents a time interval, encoded as a Timestamp start (inclusive) and a
     *  Timestamp end (exclusive).
     *  The start must be less than or equal to the end.
     *  When the start equals the end, the interval is empty (matches no time).
     *  When both start and end are unspecified, the interval matches any time.
     *  Structure is documented below.
     * @return builder
     */
    def processInterval(args: Endofunction[com.pulumi.gcp.chronicle.inputs.RetrohuntProcessIntervalArgs.Builder]):
        com.pulumi.gcp.chronicle.RetrohuntArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.RetrohuntProcessIntervalArgs.builder
      builder.processInterval(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.DashboardChartArgs.Builder)
    /**
     * @param chartLayout The layout of this chart within the NativeDashboard.
     *  Structure is documented below.
     * @return builder
     */
    def chartLayout(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartChartLayoutArgs.Builder]):
        com.pulumi.gcp.chronicle.DashboardChartArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartChartLayoutArgs.builder
      builder.chartLayout(args(argsBuilder).build)

    /**
     * @param dashboardChart Core configuration details for the DashboardChart.
     *  Structure is documented below.
     * @return builder
     */
    def dashboardChart(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartArgs.Builder]):
        com.pulumi.gcp.chronicle.DashboardChartArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartArgs.builder
      builder.dashboardChart(args(argsBuilder).build)

    /**
     * @param dashboardQuery The complete specification of the query for this chart. This includes the raw query string, execution parameters (like time windows), and server-generated metadata.
     *  Structure is documented below.
     * @return builder
     */
    def dashboardQuery(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardQueryArgs.Builder]):
        com.pulumi.gcp.chronicle.DashboardChartArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardQueryArgs.builder
      builder.dashboardQuery(args(argsBuilder).build)

  /**
   * Represents a single row in a data table.
   * 
   *  To get more information about DataTableRow, see:
   * 
   *  * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.dataTables.dataTableRows)
   *  * How-to Guides
   *      * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def DataTableRow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.DataTableRowArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.chronicle.DataTableRowArgs.builder
    com.pulumi.gcp.chronicle.DataTableRow(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.chronicle.NativeDashboardArgs.Builder)
    /**
     * @param charts A list of charts included in the dashboard definition.
     *  Structure is documented below.
     * @return builder
     */
    def charts(args: Endofunction[com.pulumi.gcp.chronicle.inputs.NativeDashboardChartArgs.Builder]*):
        com.pulumi.gcp.chronicle.NativeDashboardArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.NativeDashboardChartArgs.builder
      builder.charts(args.map(_(argsBuilder).build)*)

    /**
     * @param filters Global filters defined for the dashboard.
     *  Structure is documented below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.gcp.chronicle.inputs.NativeDashboardFilterArgs.Builder]*):
        com.pulumi.gcp.chronicle.NativeDashboardArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.NativeDashboardFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  /**
   * The Rule resource represents a user-created rule.
   * 
   *  To get more information about Rule, see:
   * 
   *  * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.rules)
   *  * How-to Guides
   *      * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
   */
  def Rule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.chronicle.RuleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.chronicle.RuleArgs.builder
    com.pulumi.gcp.chronicle.Rule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceGroupsSettingsAuthenticationArgs.Builder)
    /**
     * @param claims Claims identifying a specific customer.
     *  Structure is documented below.
     * @return builder
     */
    def claims(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceGroupsSettingsAuthenticationClaimsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceGroupsSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceGroupsSettingsAuthenticationClaimsArgs.builder
      builder.claims(args(argsBuilder).build)

    /**
     * @param rsCredentials RS credentials.
     *  Structure is documented below.
     * @return builder
     */
    def rsCredentials(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceGroupsSettingsAuthenticationRsCredentialsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceGroupsSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceGroupsSettingsAuthenticationRsCredentialsArgs.builder
      builder.rsCredentials(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsRapid7InsightSettingsAuthenticationArgs.Builder)
    /**
     * @param headerKeyValues Header key-value pairs.
     *  Structure is documented below.
     * @return builder
     */
    def headerKeyValues(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsRapid7InsightSettingsAuthenticationHeaderKeyValueArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsRapid7InsightSettingsAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsRapid7InsightSettingsAuthenticationHeaderKeyValueArgs.builder
      builder.headerKeyValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxBulkAcqsSettingsArgs.Builder)
    /**
     * @param authentication TrellixStarXAuthentication contains a oneof with all of the authentication
     *  types supported by Trellix *X devices.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxBulkAcqsSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxBulkAcqsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxBulkAcqsSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsProofpointOnDemandSettingsAuthenticationArgs.Builder)
    /**
     * @param headerKeyValues Header key-value pairs.
     *  Structure is documented below.
     * @return builder
     */
    def headerKeyValues(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsProofpointOnDemandSettingsAuthenticationHeaderKeyValueArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsProofpointOnDemandSettingsAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsProofpointOnDemandSettingsAuthenticationHeaderKeyValueArgs.builder
      builder.headerKeyValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceAlertsSettingsArgs.Builder)
    /**
     * @param authentication OAuth 2.0 JWT grant. See, https://tools.ietf.org/html/rfc7519
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceAlertsSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceAlertsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceAlertsSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsPanPrismaCloudSettingsArgs.Builder)
    /**
     * @param authentication PAN Prisma Cloud auth.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsPanPrismaCloudSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsPanPrismaCloudSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsPanPrismaCloudSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsOktaUserContextSettingsAuthenticationArgs.Builder)
    /**
     * @param headerKeyValues Header key-value pairs.
     *  Structure is documented below.
     * @return builder
     */
    def headerKeyValues(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsOktaUserContextSettingsAuthenticationHeaderKeyValueArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsOktaUserContextSettingsAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsOktaUserContextSettingsAuthenticationHeaderKeyValueArgs.builder
      builder.headerKeyValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsMicrosoftSecurityCenterAlertSettingsArgs.Builder)
    /**
     * @param authentication Microsoft OAuth 2.0 client credentials grant.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsMicrosoftSecurityCenterAlertSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsMicrosoftSecurityCenterAlertSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsMicrosoftSecurityCenterAlertSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspacePrivilegesSettingsAuthenticationArgs.Builder)
    /**
     * @param claims Claims identifying a specific customer.
     *  Structure is documented below.
     * @return builder
     */
    def claims(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspacePrivilegesSettingsAuthenticationClaimsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspacePrivilegesSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspacePrivilegesSettingsAuthenticationClaimsArgs.builder
      builder.claims(args(argsBuilder).build)

    /**
     * @param rsCredentials RS credentials.
     *  Structure is documented below.
     * @return builder
     */
    def rsCredentials(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspacePrivilegesSettingsAuthenticationRsCredentialsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspacePrivilegesSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspacePrivilegesSettingsAuthenticationRsCredentialsArgs.builder
      builder.rsCredentials(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedState.Builder)
    /**
     * @param details Additional details of the feed, these details are dynamic and will be
     *  different for each of the feeds.
     *  Structure is documented below.
     * @return builder
     */
    def details(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedState.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.builder
      builder.details(args(argsBuilder).build)

    /**
     * @param failureDetails FeedFailureDetails contains details about the errors thrown by chronicle for
     *  the feeds. These are user visible details. These details help user identify
     *  the root cause and take appropriate action for the feed errors.
     *  NEXT TAG: 5
     *  Structure is documented below.
     * @return builder
     */
    def failureDetails(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedFailureDetailsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedState.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedFailureDetailsArgs.builder
      builder.failureDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DataAccessScopeState.Builder)
    /**
     * @param allowedDataAccessLabels The allowed labels for the scope. There has to be at
     *  least one label allowed for the scope to be valid.
     *  The logical operator for evaluation of the allowed labels is OR.
     *  Either allowAll or allowedDataAccessLabels needs to be provided.
     *  E.g.: A customer with scope with allowed labels A and B will be able
     *  to see data with labeled with A or B or (A and B).
     *  Structure is documented below.
     * @return builder
     */
    def allowedDataAccessLabels(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DataAccessScopeAllowedDataAccessLabelArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.DataAccessScopeState.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DataAccessScopeAllowedDataAccessLabelArgs.builder
      builder.allowedDataAccessLabels(args.map(_(argsBuilder).build)*)

    /**
     * @param deniedDataAccessLabels Optional. The denied labels for the scope.
     *  The logical operator for evaluation of the denied labels is AND.
     *  E.g.: A customer with scope with denied labels A and B won&#39;t be able
     *  to see data labeled with A and data labeled with B
     *  and data with labels A and B.
     *  Structure is documented below.
     * @return builder
     */
    def deniedDataAccessLabels(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DataAccessScopeDeniedDataAccessLabelArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.DataAccessScopeState.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DataAccessScopeDeniedDataAccessLabelArgs.builder
      builder.deniedDataAccessLabels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsIamSettingsArgs.Builder)
    /**
     * @param authentication Info for username and secret based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsIamSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsIamSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsIamSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsMicrosoftGraphAlertSettingsArgs.Builder)
    /**
     * @param authentication Microsoft OAuth 2.0 client credentials grant.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsMicrosoftGraphAlertSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsMicrosoftGraphAlertSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsMicrosoftGraphAlertSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsCrowdstrikeAlertsSettingsArgs.Builder)
    /**
     * @param authentication OAuth 2.0 client credentials grant. See https://tools.ietf.org/html/rfc6749.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsCrowdstrikeAlertsSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsCrowdstrikeAlertsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsCrowdstrikeAlertsSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsRhIsacIocSettingsArgs.Builder)
    /**
     * @param authentication OAuth 2.0 client credentials grant. See https://tools.ietf.org/html/rfc6749.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsRhIsacIocSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsRhIsacIocSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsRhIsacIocSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsSentineloneAlertSettingsArgs.Builder)
    /**
     * @param authentication HTTP header based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsSentineloneAlertSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsSentineloneAlertSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsSentineloneAlertSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDevicesSettingsAuthenticationArgs.Builder)
    /**
     * @param claims Claims identifying a specific customer.
     *  Structure is documented below.
     * @return builder
     */
    def claims(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDevicesSettingsAuthenticationClaimsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDevicesSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDevicesSettingsAuthenticationClaimsArgs.builder
      builder.claims(args(argsBuilder).build)

    /**
     * @param rsCredentials RS credentials.
     *  Structure is documented below.
     * @return builder
     */
    def rsCredentials(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDevicesSettingsAuthenticationRsCredentialsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDevicesSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDevicesSettingsAuthenticationRsCredentialsArgs.builder
      builder.rsCredentials(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsSentineloneAlertSettingsAuthenticationArgs.Builder)
    /**
     * @param headerKeyValues Header key-value pairs.
     *  Structure is documented below.
     * @return builder
     */
    def headerKeyValues(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsSentineloneAlertSettingsAuthenticationHeaderKeyValueArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsSentineloneAlertSettingsAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsSentineloneAlertSettingsAuthenticationHeaderKeyValueArgs.builder
      builder.headerKeyValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsServiceNowCmdbSettingsArgs.Builder)
    /**
     * @param authentication Info for username and secret based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsServiceNowCmdbSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsServiceNowCmdbSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsServiceNowCmdbSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceUsersSettingsArgs.Builder)
    /**
     * @param authentication OAuth 2.0 JWT grant. See, https://tools.ietf.org/html/rfc7519
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceUsersSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceUsersSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceUsersSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesItemColorsArgs.Builder)
    /**
     * @param colors Structure is documented below.
     * @return builder
     */
    def colors(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesItemColorsColorArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesItemColorsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesItemColorsColorArgs.builder
      builder.colors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsDummyLogTypeSettingsArgs.Builder)
    /**
     * @param authentication HTTP header based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsDummyLogTypeSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsDummyLogTypeSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsDummyLogTypeSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownCustomSettingsFilterArgs.Builder)
    /**
     * @param dashboardFilters Structure is documented below.
     * @return builder
     */
    def dashboardFilters(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownCustomSettingsFilterDashboardFilterArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownCustomSettingsFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownCustomSettingsFilterDashboardFilterArgs.builder
      builder.dashboardFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxHostsSettingsAuthenticationArgs.Builder)
    /**
     * @param msso Info for MssoAuthentication using a username, password, and login api
     *  endpoint.
     *  Structure is documented below.
     * @return builder
     */
    def msso(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxHostsSettingsAuthenticationMssoArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxHostsSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxHostsSettingsAuthenticationMssoArgs.builder
      builder.msso(args(argsBuilder).build)

    /**
     * @param trellixIam Settings for TrellixIAMAuthentication.
     *  Structure is documented below.
     * @return builder
     */
    def trellixIam(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxHostsSettingsAuthenticationTrellixIamArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxHostsSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxHostsSettingsAuthenticationTrellixIamArgs.builder
      builder.trellixIam(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsRecordedFutureIocSettingsArgs.Builder)
    /**
     * @param authentication HTTP header based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsRecordedFutureIocSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsRecordedFutureIocSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsRecordedFutureIocSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsProofpointMailSettingsArgs.Builder)
    /**
     * @param authentication Info for username and secret based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsProofpointMailSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsProofpointMailSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsProofpointMailSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsQualysScanSettingsArgs.Builder)
    /**
     * @param authentication Info for username and secret based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsQualysScanSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsQualysScanSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsQualysScanSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsV2SettingsAuthenticationArgs.Builder)
    /**
     * @param awsIamRoleAuth AWS IAM Role Auth for SQS V2.
     *  Structure is documented below.
     * @return builder
     */
    def awsIamRoleAuth(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsV2SettingsAuthenticationAwsIamRoleAuthArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsV2SettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsV2SettingsAuthenticationAwsIamRoleAuthArgs.builder
      builder.awsIamRoleAuth(args(argsBuilder).build)

    /**
     * @param sqsV2AccessKeySecretAuth SQS V2 access key and secret auth.
     *  Structure is documented below.
     * @return builder
     */
    def sqsV2AccessKeySecretAuth(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsV2SettingsAuthenticationSqsV2AccessKeySecretAuthArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsV2SettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsV2SettingsAuthenticationSqsV2AccessKeySecretAuthArgs.builder
      builder.sqsV2AccessKeySecretAuth(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsSalesforceSettingsOauthJwtCredentialsArgs.Builder)
    /**
     * @param claims Claims identifying a specific customer.
     *  Structure is documented below.
     * @return builder
     */
    def claims(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsSalesforceSettingsOauthJwtCredentialsClaimsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsSalesforceSettingsOauthJwtCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsSalesforceSettingsOauthJwtCredentialsClaimsArgs.builder
      builder.claims(args(argsBuilder).build)

    /**
     * @param rsCredentials RS credentials.
     *  Structure is documented below.
     * @return builder
     */
    def rsCredentials(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsSalesforceSettingsOauthJwtCredentialsRsCredentialsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsSalesforceSettingsOauthJwtCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsSalesforceSettingsOauthJwtCredentialsRsCredentialsArgs.builder
      builder.rsCredentials(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsQualysVmSettingsArgs.Builder)
    /**
     * @param authentication Info for username and secret based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsQualysVmSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsQualysVmSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsQualysVmSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxBulkAcqsSettingsAuthenticationArgs.Builder)
    /**
     * @param msso Info for MssoAuthentication using a username, password, and login api
     *  endpoint.
     *  Structure is documented below.
     * @return builder
     */
    def msso(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxBulkAcqsSettingsAuthenticationMssoArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxBulkAcqsSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxBulkAcqsSettingsAuthenticationMssoArgs.builder
      builder.msso(args(argsBuilder).build)

    /**
     * @param trellixIam Settings for TrellixIAMAuthentication.
     *  Structure is documented below.
     * @return builder
     */
    def trellixIam(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxBulkAcqsSettingsAuthenticationTrellixIamArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxBulkAcqsSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxBulkAcqsSettingsAuthenticationTrellixIamArgs.builder
      builder.trellixIam(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.WatchlistState.Builder)
    /**
     * @param entityCounts Count of different types of entities in the watchlist.
     *  Structure is documented below.
     * @return builder
     */
    def entityCounts(args: Endofunction[com.pulumi.gcp.chronicle.inputs.WatchlistEntityCountArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.WatchlistState.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.WatchlistEntityCountArgs.builder
      builder.entityCounts(args.map(_(argsBuilder).build)*)

    /**
     * @param entityPopulationMechanism Mechanism to populate entities in the watchlist.
     *  Structure is documented below.
     * @return builder
     */
    def entityPopulationMechanism(args: Endofunction[com.pulumi.gcp.chronicle.inputs.WatchlistEntityPopulationMechanismArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.WatchlistState.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.WatchlistEntityPopulationMechanismArgs.builder
      builder.entityPopulationMechanism(args(argsBuilder).build)

    /**
     * @param watchlistUserPreferences A collection of user preferences for watchlist UI configuration.
     *  Structure is documented below.
     * @return builder
     */
    def watchlistUserPreferences(args: Endofunction[com.pulumi.gcp.chronicle.inputs.WatchlistWatchlistUserPreferencesArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.WatchlistState.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.WatchlistWatchlistUserPreferencesArgs.builder
      builder.watchlistUserPreferences(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartState.Builder)
    /**
     * @param chartLayout The layout of this chart within the NativeDashboard.
     *  Structure is documented below.
     * @return builder
     */
    def chartLayout(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartChartLayoutArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartState.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartChartLayoutArgs.builder
      builder.chartLayout(args(argsBuilder).build)

    /**
     * @param dashboardChart Core configuration details for the DashboardChart.
     *  Structure is documented below.
     * @return builder
     */
    def dashboardChart(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartState.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartArgs.builder
      builder.dashboardChart(args(argsBuilder).build)

    /**
     * @param dashboardQuery The complete specification of the query for this chart. This includes the raw query string, execution parameters (like time windows), and server-generated metadata.
     *  Structure is documented below.
     * @return builder
     */
    def dashboardQuery(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardQueryArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartState.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardQueryArgs.builder
      builder.dashboardQuery(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsEc2HostsSettingsArgs.Builder)
    /**
     * @param authentication Info for username and secret based authentication.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsEc2HostsSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsEc2HostsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsEc2HostsSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsDummyLogTypeSettingsAuthenticationArgs.Builder)
    /**
     * @param headerKeyValues Header key-value pairs.
     *  Structure is documented below.
     * @return builder
     */
    def headerKeyValues(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsDummyLogTypeSettingsAuthenticationHeaderKeyValueArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsDummyLogTypeSettingsAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsDummyLogTypeSettingsAuthenticationHeaderKeyValueArgs.builder
      builder.headerKeyValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsPanIocSettingsArgs.Builder)
    /**
     * @param authentication HTTP header based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsPanIocSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsPanIocSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsPanIocSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsProofpointOnDemandSettingsArgs.Builder)
    /**
     * @param authentication HTTP header based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsProofpointOnDemandSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsProofpointOnDemandSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsProofpointOnDemandSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsThinkstCanarySettingsArgs.Builder)
    /**
     * @param authentication HTTP header based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsThinkstCanarySettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsThinkstCanarySettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsThinkstCanarySettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.NativeDashboardState.Builder)
    /**
     * @param charts A list of charts included in the dashboard definition.
     *  Structure is documented below.
     * @return builder
     */
    def charts(args: Endofunction[com.pulumi.gcp.chronicle.inputs.NativeDashboardChartArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.NativeDashboardState.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.NativeDashboardChartArgs.builder
      builder.charts(args.map(_(argsBuilder).build)*)

    /**
     * @param filters Global filters defined for the dashboard.
     *  Structure is documented below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.gcp.chronicle.inputs.NativeDashboardFilterArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.NativeDashboardState.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.NativeDashboardFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsRecordedFutureIocSettingsAuthenticationArgs.Builder)
    /**
     * @param headerKeyValues Header key-value pairs.
     *  Structure is documented below.
     * @return builder
     */
    def headerKeyValues(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsRecordedFutureIocSettingsAuthenticationHeaderKeyValueArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsRecordedFutureIocSettingsAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsRecordedFutureIocSettingsAuthenticationHeaderKeyValueArgs.builder
      builder.headerKeyValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceChromeOsSettingsAuthenticationArgs.Builder)
    /**
     * @param claims Claims identifying a specific customer.
     *  Structure is documented below.
     * @return builder
     */
    def claims(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceChromeOsSettingsAuthenticationClaimsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceChromeOsSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceChromeOsSettingsAuthenticationClaimsArgs.builder
      builder.claims(args(argsBuilder).build)

    /**
     * @param rsCredentials RS credentials.
     *  Structure is documented below.
     * @return builder
     */
    def rsCredentials(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceChromeOsSettingsAuthenticationRsCredentialsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceChromeOsSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceChromeOsSettingsAuthenticationRsCredentialsArgs.builder
      builder.rsCredentials(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsMimecastMailV2SettingsArgs.Builder)
    /**
     * @param authCredentials OAuth 2.0 client credentials grant. See https://tools.ietf.org/html/rfc6749.
     *  NEXT TAG: 3
     * @return builder
     */
    def authCredentials(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsMimecastMailV2SettingsAuthCredentialsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsMimecastMailV2SettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsMimecastMailV2SettingsAuthCredentialsArgs.builder
      builder.authCredentials(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsDuoUserContextSettingsArgs.Builder)
    /**
     * @param authentication Info for username and secret based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsDuoUserContextSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsDuoUserContextSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsDuoUserContextSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspacePrivilegesSettingsArgs.Builder)
    /**
     * @param authentication OAuth 2.0 JWT grant. See, https://tools.ietf.org/html/rfc7519
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspacePrivilegesSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspacePrivilegesSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspacePrivilegesSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesArgs.Builder)
    /**
     * @param areaStyle A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def areaStyle(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesAreaStyleArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesAreaStyleArgs.builder
      builder.areaStyle(args(argsBuilder).build)

    /**
     * @param dataLabel A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def dataLabel(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesDataLabelArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesDataLabelArgs.builder
      builder.dataLabel(args(argsBuilder).build)

    /**
     * @param encode A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def encode(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesEncodeArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesEncodeArgs.builder
      builder.encode(args(argsBuilder).build)

    /**
     * @param gaugeConfig A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def gaugeConfig(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesGaugeConfigArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesGaugeConfigArgs.builder
      builder.gaugeConfig(args(argsBuilder).build)

    /**
     * @param itemColors A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def itemColors(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesItemColorsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesItemColorsArgs.builder
      builder.itemColors(args(argsBuilder).build)

    /**
     * @param itemStyle A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def itemStyle(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesItemStyleArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesItemStyleArgs.builder
      builder.itemStyle(args(argsBuilder).build)

    /**
     * @param metricTrendConfig A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def metricTrendConfig(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesMetricTrendConfigArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesMetricTrendConfigArgs.builder
      builder.metricTrendConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsEc2InstancesSettingsArgs.Builder)
    /**
     * @param authentication Info for username and secret based authentication.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsEc2InstancesSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsEc2InstancesSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsEc2InstancesSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsOktaUserContextSettingsArgs.Builder)
    /**
     * @param authentication HTTP header based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsOktaUserContextSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsOktaUserContextSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsOktaUserContextSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsCrowdstrikeDetectsSettingsArgs.Builder)
    /**
     * @param authentication OAuth 2.0 client credentials grant. See https://tools.ietf.org/html/rfc6749.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsCrowdstrikeDetectsSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsCrowdstrikeDetectsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsCrowdstrikeDetectsSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureBlobStoreSettingsArgs.Builder)
    /**
     * @param authentication Azure auth.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureBlobStoreSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureBlobStoreSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureBlobStoreSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureBlobStoreV2SettingsAuthenticationArgs.Builder)
    /**
     * @param azureV2WorkloadIdentityFederation Azure V2 Workload Identity Federation.
     *  Structure is documented below.
     * @return builder
     */
    def azureV2WorkloadIdentityFederation(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureBlobStoreV2SettingsAuthenticationAzureV2WorkloadIdentityFederationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureBlobStoreV2SettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureBlobStoreV2SettingsAuthenticationAzureV2WorkloadIdentityFederationArgs.builder
      builder.azureV2WorkloadIdentityFederation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsNetskopeAlertV2SettingsArgs.Builder)
    /**
     * @param authentication HTTP header based authentication.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsNetskopeAlertV2SettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsNetskopeAlertV2SettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsNetskopeAlertV2SettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsNetskopeAlertSettingsAuthenticationArgs.Builder)
    /**
     * @param headerKeyValues Header key-value pairs.
     *  Structure is documented below.
     * @return builder
     */
    def headerKeyValues(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsNetskopeAlertSettingsAuthenticationHeaderKeyValueArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsNetskopeAlertSettingsAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsNetskopeAlertSettingsAuthenticationHeaderKeyValueArgs.builder
      builder.headerKeyValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationTableConfigArgs.Builder)
    /**
     * @param columnRenderTypeSettings Structure is documented below.
     * @return builder
     */
    def columnRenderTypeSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationTableConfigColumnRenderTypeSettingArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationTableConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationTableConfigColumnRenderTypeSettingArgs.builder
      builder.columnRenderTypeSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param columnTooltipSettings Structure is documented below.
     * @return builder
     */
    def columnTooltipSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationTableConfigColumnTooltipSettingArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationTableConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationTableConfigColumnTooltipSettingArgs.builder
      builder.columnTooltipSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownCustomSettingsArgs.Builder)
    /**
     * @param externalLink A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def externalLink(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownCustomSettingsExternalLinkArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownCustomSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownCustomSettingsExternalLinkArgs.builder
      builder.externalLink(args(argsBuilder).build)

    /**
     * @param filter A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownCustomSettingsFilterArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownCustomSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownCustomSettingsFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param query A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def query(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownCustomSettingsQueryArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownCustomSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownCustomSettingsQueryArgs.builder
      builder.query(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonS3V2SettingsArgs.Builder)
    /**
     * @param authentication A message containing fields used to authenticate with Amazon S3.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonS3V2SettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonS3V2SettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonS3V2SettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceActivitySettingsArgs.Builder)
    /**
     * @param authentication OAuth 2.0 JWT grant. See, https://tools.ietf.org/html/rfc7519
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceActivitySettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceActivitySettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceActivitySettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationGoogleMapsConfigArgs.Builder)
    /**
     * @param dataSettings A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def dataSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationGoogleMapsConfigDataSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationGoogleMapsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationGoogleMapsConfigDataSettingsArgs.builder
      builder.dataSettings(args(argsBuilder).build)

    /**
     * @param mapPosition A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def mapPosition(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationGoogleMapsConfigMapPositionArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationGoogleMapsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationGoogleMapsConfigMapPositionArgs.builder
      builder.mapPosition(args(argsBuilder).build)

    /**
     * @param pointSettings A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def pointSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationGoogleMapsConfigPointSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationGoogleMapsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationGoogleMapsConfigPointSettingsArgs.builder
      builder.pointSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxAlertsSettingsArgs.Builder)
    /**
     * @param authentication TrellixStarXAuthentication contains a oneof with all of the authentication
     *  types supported by Trellix *X devices.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxAlertsSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxAlertsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxAlertsSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsThreatConnectIocSettingsArgs.Builder)
    /**
     * @param authentication Info for username and secret based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsThreatConnectIocSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsThreatConnectIocSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsThreatConnectIocSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder)
    /**
     * @param amazonKinesisFirehoseSettings Settings required by Amazon Kinesis Firehose Feeds(HTTP-Push).
     * @return builder
     */
    def amazonKinesisFirehoseSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonKinesisFirehoseSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonKinesisFirehoseSettingsArgs.builder
      builder.amazonKinesisFirehoseSettings(args(argsBuilder).build)

    /**
     * @param amazonS3Settings Amazon S3 settings.
     *  Structure is documented below.
     * @return builder
     */
    def amazonS3Settings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonS3SettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonS3SettingsArgs.builder
      builder.amazonS3Settings(args(argsBuilder).build)

    /**
     * @param amazonS3V2Settings AmazonS3V2Settings is the settings proto for Omniflow S3 feeds.
     *  Structure is documented below.
     * @return builder
     */
    def amazonS3V2Settings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonS3V2SettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonS3V2SettingsArgs.builder
      builder.amazonS3V2Settings(args(argsBuilder).build)

    /**
     * @param amazonSqsSettings Amazon SQS settings.
     *  Structure is documented below.
     * @return builder
     */
    def amazonSqsSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsSettingsArgs.builder
      builder.amazonSqsSettings(args(argsBuilder).build)

    /**
     * @param amazonSqsV2Settings AmazonSQSV2Settings is the settings proto for Omniflow SQS feeds.
     *  Structure is documented below.
     * @return builder
     */
    def amazonSqsV2Settings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsV2SettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsV2SettingsArgs.builder
      builder.amazonSqsV2Settings(args(argsBuilder).build)

    /**
     * @param anomaliSettings Anomali IOC settings.
     *  Structure is documented below.
     * @return builder
     */
    def anomaliSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAnomaliSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAnomaliSettingsArgs.builder
      builder.anomaliSettings(args(argsBuilder).build)

    /**
     * @param awsEc2HostsSettings AWS EC2 Hosts Settings.
     *  Structure is documented below.
     * @return builder
     */
    def awsEc2HostsSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsEc2HostsSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsEc2HostsSettingsArgs.builder
      builder.awsEc2HostsSettings(args(argsBuilder).build)

    /**
     * @param awsEc2InstancesSettings AWS EC2 Instances Settings.
     *  Structure is documented below.
     * @return builder
     */
    def awsEc2InstancesSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsEc2InstancesSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsEc2InstancesSettingsArgs.builder
      builder.awsEc2InstancesSettings(args(argsBuilder).build)

    /**
     * @param awsEc2VpcsSettings AWS EC2 Vpcs Settings.
     *  Structure is documented below.
     * @return builder
     */
    def awsEc2VpcsSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsEc2VpcsSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsEc2VpcsSettingsArgs.builder
      builder.awsEc2VpcsSettings(args(argsBuilder).build)

    /**
     * @param awsIamSettings AWSIAMSettings contains details needed for creating an AWS IAM feed.
     *  Structure is documented below.
     * @return builder
     */
    def awsIamSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsIamSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsIamSettingsArgs.builder
      builder.awsIamSettings(args(argsBuilder).build)

    /**
     * @param azureAdAuditSettings Azure AD Audit settings.
     *  Structure is documented below.
     * @return builder
     */
    def azureAdAuditSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureAdAuditSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureAdAuditSettingsArgs.builder
      builder.azureAdAuditSettings(args(argsBuilder).build)

    /**
     * @param azureAdContextSettings Azure AD Context settings.
     *  Structure is documented below.
     * @return builder
     */
    def azureAdContextSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureAdContextSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureAdContextSettingsArgs.builder
      builder.azureAdContextSettings(args(argsBuilder).build)

    /**
     * @param azureAdSettings Azure AD settings.
     *  Structure is documented below.
     * @return builder
     */
    def azureAdSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureAdSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureAdSettingsArgs.builder
      builder.azureAdSettings(args(argsBuilder).build)

    /**
     * @param azureBlobStoreSettings Azure Blob Storage settings.
     *  Structure is documented below.
     * @return builder
     */
    def azureBlobStoreSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureBlobStoreSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureBlobStoreSettingsArgs.builder
      builder.azureBlobStoreSettings(args(argsBuilder).build)

    /**
     * @param azureBlobStoreV2Settings AzureBlobStoreV2Settings is the settings proto for Azure Blob Storage feeds.
     *  Structure is documented below.
     * @return builder
     */
    def azureBlobStoreV2Settings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureBlobStoreV2SettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureBlobStoreV2SettingsArgs.builder
      builder.azureBlobStoreV2Settings(args(argsBuilder).build)

    /**
     * @param azureEventHubSettings Settings required by Azure Event Hub Feeds.
     *  Structure is documented below.
     * @return builder
     */
    def azureEventHubSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureEventHubSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureEventHubSettingsArgs.builder
      builder.azureEventHubSettings(args(argsBuilder).build)

    /**
     * @param azureMdmIntuneSettings Azure MDM Intune settings.
     *  Structure is documented below.
     * @return builder
     */
    def azureMdmIntuneSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureMdmIntuneSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureMdmIntuneSettingsArgs.builder
      builder.azureMdmIntuneSettings(args(argsBuilder).build)

    /**
     * @param cloudPassageSettings CloudPassage settings.
     *  Structure is documented below.
     * @return builder
     */
    def cloudPassageSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsCloudPassageSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsCloudPassageSettingsArgs.builder
      builder.cloudPassageSettings(args(argsBuilder).build)

    /**
     * @param cortexXdrSettings PAN Cortex XDR settings.
     *  Structure is documented below.
     * @return builder
     */
    def cortexXdrSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsCortexXdrSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsCortexXdrSettingsArgs.builder
      builder.cortexXdrSettings(args(argsBuilder).build)

    /**
     * @param crowdstrikeAlertsSettings CrowdStrike Alerts settings.
     *  Structure is documented below.
     * @return builder
     */
    def crowdstrikeAlertsSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsCrowdstrikeAlertsSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsCrowdstrikeAlertsSettingsArgs.builder
      builder.crowdstrikeAlertsSettings(args(argsBuilder).build)

    /**
     * @param crowdstrikeDetectsSettings CrowdStrike Detects settings.
     *  Structure is documented below.
     * @return builder
     */
    def crowdstrikeDetectsSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsCrowdstrikeDetectsSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsCrowdstrikeDetectsSettingsArgs.builder
      builder.crowdstrikeDetectsSettings(args(argsBuilder).build)

    /**
     * @param dummyLogTypeSettings Settings required by Feeds of DummyLogType(used for testing purposes).
     *  Structure is documented below.
     * @return builder
     */
    def dummyLogTypeSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsDummyLogTypeSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsDummyLogTypeSettingsArgs.builder
      builder.dummyLogTypeSettings(args(argsBuilder).build)

    /**
     * @param duoAuthSettings Duo Authentication settings.
     *  Structure is documented below.
     * @return builder
     */
    def duoAuthSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsDuoAuthSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsDuoAuthSettingsArgs.builder
      builder.duoAuthSettings(args(argsBuilder).build)

    /**
     * @param duoUserContextSettings Duo User Context settings.
     *  Structure is documented below.
     * @return builder
     */
    def duoUserContextSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsDuoUserContextSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsDuoUserContextSettingsArgs.builder
      builder.duoUserContextSettings(args(argsBuilder).build)

    /**
     * @param foxItStixSettings Fox-IT STIX settings.
     *  Structure is documented below.
     * @return builder
     */
    def foxItStixSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsFoxItStixSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsFoxItStixSettingsArgs.builder
      builder.foxItStixSettings(args(argsBuilder).build)

    /**
     * @param gcsSettings Google Cloud Storage settings.
     *  Structure is documented below.
     * @return builder
     */
    def gcsSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsGcsSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsGcsSettingsArgs.builder
      builder.gcsSettings(args(argsBuilder).build)

    /**
     * @param gcsV2Settings GoogleCloudStorageV2Settings is the settings proto for Omniflow Google Cloud
     *  Storage feeds.
     *  Structure is documented below.
     * @return builder
     */
    def gcsV2Settings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsGcsV2SettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsGcsV2SettingsArgs.builder
      builder.gcsV2Settings(args(argsBuilder).build)

    /**
     * @param googleCloudIdentityDeviceUsersSettings Google Cloud Identity Device Users settings.
     *  Structure is documented below.
     * @return builder
     */
    def googleCloudIdentityDeviceUsersSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDeviceUsersSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDeviceUsersSettingsArgs.builder
      builder.googleCloudIdentityDeviceUsersSettings(args(argsBuilder).build)

    /**
     * @param googleCloudIdentityDevicesSettings Google Cloud Identity Devices settings.
     *  Structure is documented below.
     * @return builder
     */
    def googleCloudIdentityDevicesSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDevicesSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDevicesSettingsArgs.builder
      builder.googleCloudIdentityDevicesSettings(args(argsBuilder).build)

    /**
     * @param googleCloudStorageEventDrivenSettings GoogleCloudStorageEventDrivenSettings is the settings proto for Omniflow
     *  Google Cloud Storage feeds driven by pubsub events.
     *  Structure is documented below.
     * @return builder
     */
    def googleCloudStorageEventDrivenSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudStorageEventDrivenSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudStorageEventDrivenSettingsArgs.builder
      builder.googleCloudStorageEventDrivenSettings(args(argsBuilder).build)

    /**
     * @param httpSettings HTTP settings.
     *  Structure is documented below.
     * @return builder
     */
    def httpSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsHttpSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsHttpSettingsArgs.builder
      builder.httpSettings(args(argsBuilder).build)

    /**
     * @param httpsPushAmazonKinesisFirehoseSettings Settings required by Amazon Kinesis Firehose Feeds(HTTPS-Push V2).
     *  Structure is documented below.
     * @return builder
     */
    def httpsPushAmazonKinesisFirehoseSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsHttpsPushAmazonKinesisFirehoseSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsHttpsPushAmazonKinesisFirehoseSettingsArgs.builder
      builder.httpsPushAmazonKinesisFirehoseSettings(args(argsBuilder).build)

    /**
     * @param httpsPushGoogleCloudPubsubSettings Settings required by Google Cloud Platform Pub/Sub Feeds(HTTPS-Push V2).
     *  Structure is documented below.
     * @return builder
     */
    def httpsPushGoogleCloudPubsubSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsHttpsPushGoogleCloudPubsubSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsHttpsPushGoogleCloudPubsubSettingsArgs.builder
      builder.httpsPushGoogleCloudPubsubSettings(args(argsBuilder).build)

    /**
     * @param httpsPushWebhookSettings Settings required by Webhook Feeds(HTTPS-Push V2).
     *  Structure is documented below.
     * @return builder
     */
    def httpsPushWebhookSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsHttpsPushWebhookSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsHttpsPushWebhookSettingsArgs.builder
      builder.httpsPushWebhookSettings(args(argsBuilder).build)

    /**
     * @param impervaWafSettings Imperva WAF settings.
     *  Structure is documented below.
     * @return builder
     */
    def impervaWafSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsImpervaWafSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsImpervaWafSettingsArgs.builder
      builder.impervaWafSettings(args(argsBuilder).build)

    /**
     * @param mandiantIocSettings Mandiant IOC settings.
     *  Structure is documented below.
     * @return builder
     */
    def mandiantIocSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsMandiantIocSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsMandiantIocSettingsArgs.builder
      builder.mandiantIocSettings(args(argsBuilder).build)

    /**
     * @param microsoftGraphAlertSettings Microsoft Graph Alert settings.
     *  Structure is documented below.
     * @return builder
     */
    def microsoftGraphAlertSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsMicrosoftGraphAlertSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsMicrosoftGraphAlertSettingsArgs.builder
      builder.microsoftGraphAlertSettings(args(argsBuilder).build)

    /**
     * @param microsoftSecurityCenterAlertSettings Microsoft Security Center alert settings.
     *  Structure is documented below.
     * @return builder
     */
    def microsoftSecurityCenterAlertSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsMicrosoftSecurityCenterAlertSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsMicrosoftSecurityCenterAlertSettingsArgs.builder
      builder.microsoftSecurityCenterAlertSettings(args(argsBuilder).build)

    /**
     * @param mimecastMailSettings Mimecast Mail settings.
     *  Structure is documented below.
     * @return builder
     */
    def mimecastMailSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsMimecastMailSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsMimecastMailSettingsArgs.builder
      builder.mimecastMailSettings(args(argsBuilder).build)

    /**
     * @param mimecastMailV2Settings Mimecast Mail V2 Settings.
     *  Structure is documented below.
     * @return builder
     */
    def mimecastMailV2Settings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsMimecastMailV2SettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsMimecastMailV2SettingsArgs.builder
      builder.mimecastMailV2Settings(args(argsBuilder).build)

    /**
     * @param netskopeAlertSettings Netskope Alert settings.
     *  Structure is documented below.
     * @return builder
     */
    def netskopeAlertSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsNetskopeAlertSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsNetskopeAlertSettingsArgs.builder
      builder.netskopeAlertSettings(args(argsBuilder).build)

    /**
     * @param netskopeAlertV2Settings Netskope Alert V2 settings.
     *  Structure is documented below.
     * @return builder
     */
    def netskopeAlertV2Settings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsNetskopeAlertV2SettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsNetskopeAlertV2SettingsArgs.builder
      builder.netskopeAlertV2Settings(args(argsBuilder).build)

    /**
     * @param office365Settings Office 365 settings.
     *  Structure is documented below.
     * @return builder
     */
    def office365Settings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsOffice365SettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsOffice365SettingsArgs.builder
      builder.office365Settings(args(argsBuilder).build)

    /**
     * @param oktaSettings Okta settings.
     *  Structure is documented below.
     * @return builder
     */
    def oktaSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsOktaSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsOktaSettingsArgs.builder
      builder.oktaSettings(args(argsBuilder).build)

    /**
     * @param oktaUserContextSettings Okta user context settings.
     *  Structure is documented below.
     * @return builder
     */
    def oktaUserContextSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsOktaUserContextSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsOktaUserContextSettingsArgs.builder
      builder.oktaUserContextSettings(args(argsBuilder).build)

    /**
     * @param panIocSettings PAN IOC settings.
     *  Structure is documented below.
     * @return builder
     */
    def panIocSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsPanIocSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsPanIocSettingsArgs.builder
      builder.panIocSettings(args(argsBuilder).build)

    /**
     * @param panPrismaCloudSettings PAN Prisma Cloud settings.
     *  Structure is documented below.
     * @return builder
     */
    def panPrismaCloudSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsPanPrismaCloudSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsPanPrismaCloudSettingsArgs.builder
      builder.panPrismaCloudSettings(args(argsBuilder).build)

    /**
     * @param proofpointMailSettings Proofpoint Mail settings.
     *  Structure is documented below.
     * @return builder
     */
    def proofpointMailSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsProofpointMailSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsProofpointMailSettingsArgs.builder
      builder.proofpointMailSettings(args(argsBuilder).build)

    /**
     * @param proofpointOnDemandSettings Proofpoint On-demand settings.
     *  Structure is documented below.
     * @return builder
     */
    def proofpointOnDemandSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsProofpointOnDemandSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsProofpointOnDemandSettingsArgs.builder
      builder.proofpointOnDemandSettings(args(argsBuilder).build)

    /**
     * @param pubsubSettings Settings required by Google Cloud Pub/Sub Feeds(HTTP-Push).
     *  Structure is documented below.
     * @return builder
     */
    def pubsubSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsPubsubSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsPubsubSettingsArgs.builder
      builder.pubsubSettings(args(argsBuilder).build)

    /**
     * @param qualysScanSettings Qualys Scan settings.
     *  Structure is documented below.
     * @return builder
     */
    def qualysScanSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsQualysScanSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsQualysScanSettingsArgs.builder
      builder.qualysScanSettings(args(argsBuilder).build)

    /**
     * @param qualysVmSettings Qualys VM settings.
     *  Structure is documented below.
     * @return builder
     */
    def qualysVmSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsQualysVmSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsQualysVmSettingsArgs.builder
      builder.qualysVmSettings(args(argsBuilder).build)

    /**
     * @param rapid7InsightSettings Rapid7 Insight settings.
     *  Structure is documented below.
     * @return builder
     */
    def rapid7InsightSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsRapid7InsightSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsRapid7InsightSettingsArgs.builder
      builder.rapid7InsightSettings(args(argsBuilder).build)

    /**
     * @param recordedFutureIocSettings Recorded Future IOC settings.
     *  Structure is documented below.
     * @return builder
     */
    def recordedFutureIocSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsRecordedFutureIocSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsRecordedFutureIocSettingsArgs.builder
      builder.recordedFutureIocSettings(args(argsBuilder).build)

    /**
     * @param rhIsacIocSettings RH-ISAC settings.
     *  Structure is documented below.
     * @return builder
     */
    def rhIsacIocSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsRhIsacIocSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsRhIsacIocSettingsArgs.builder
      builder.rhIsacIocSettings(args(argsBuilder).build)

    /**
     * @param salesforceSettings Salesforce settings.
     *  Structure is documented below.
     * @return builder
     */
    def salesforceSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsSalesforceSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsSalesforceSettingsArgs.builder
      builder.salesforceSettings(args(argsBuilder).build)

    /**
     * @param sentineloneAlertSettings SentinelOne Alert settings.
     *  Structure is documented below.
     * @return builder
     */
    def sentineloneAlertSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsSentineloneAlertSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsSentineloneAlertSettingsArgs.builder
      builder.sentineloneAlertSettings(args(argsBuilder).build)

    /**
     * @param serviceNowCmdbSettings ServiceNow CMDB settings.
     *  Structure is documented below.
     * @return builder
     */
    def serviceNowCmdbSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsServiceNowCmdbSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsServiceNowCmdbSettingsArgs.builder
      builder.serviceNowCmdbSettings(args(argsBuilder).build)

    /**
     * @param sftpSettings SFTP settings.
     *  Structure is documented below.
     * @return builder
     */
    def sftpSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsSftpSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsSftpSettingsArgs.builder
      builder.sftpSettings(args(argsBuilder).build)

    /**
     * @param symantecEventExportSettings Symantec Event Export settings.
     *  Structure is documented below.
     * @return builder
     */
    def symantecEventExportSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsSymantecEventExportSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsSymantecEventExportSettingsArgs.builder
      builder.symantecEventExportSettings(args(argsBuilder).build)

    /**
     * @param thinkstCanarySettings Thinkst Canary settings.
     *  Structure is documented below.
     * @return builder
     */
    def thinkstCanarySettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsThinkstCanarySettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsThinkstCanarySettingsArgs.builder
      builder.thinkstCanarySettings(args(argsBuilder).build)

    /**
     * @param threatConnectIocSettings ThreatConnect IOC Settings.
     *  Structure is documented below.
     * @return builder
     */
    def threatConnectIocSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsThreatConnectIocSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsThreatConnectIocSettingsArgs.builder
      builder.threatConnectIocSettings(args(argsBuilder).build)

    /**
     * @param threatConnectIocV3Settings ThreatConnectIoCV3Settings
     *  Structure is documented below.
     * @return builder
     */
    def threatConnectIocV3Settings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsThreatConnectIocV3SettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsThreatConnectIocV3SettingsArgs.builder
      builder.threatConnectIocV3Settings(args(argsBuilder).build)

    /**
     * @param trellixHxAlertsSettings Settings required by Feeds of TrellixHxAlerts.
     *  Structure is documented below.
     * @return builder
     */
    def trellixHxAlertsSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxAlertsSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxAlertsSettingsArgs.builder
      builder.trellixHxAlertsSettings(args(argsBuilder).build)

    /**
     * @param trellixHxBulkAcqsSettings Settings required by Feeds of TrellixHxBulkAcqs.
     *  Structure is documented below.
     * @return builder
     */
    def trellixHxBulkAcqsSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxBulkAcqsSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxBulkAcqsSettingsArgs.builder
      builder.trellixHxBulkAcqsSettings(args(argsBuilder).build)

    /**
     * @param trellixHxHostsSettings Settings required by Feeds of TrellixHxHosts.
     *  Structure is documented below.
     * @return builder
     */
    def trellixHxHostsSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxHostsSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxHostsSettingsArgs.builder
      builder.trellixHxHostsSettings(args(argsBuilder).build)

    /**
     * @param webhookSettings Settings required by Webhook Feeds(HTTP-Push).
     * @return builder
     */
    def webhookSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWebhookSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWebhookSettingsArgs.builder
      builder.webhookSettings(args(argsBuilder).build)

    /**
     * @param workdaySettings Workday settings.
     *  Structure is documented below.
     * @return builder
     */
    def workdaySettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkdaySettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkdaySettingsArgs.builder
      builder.workdaySettings(args(argsBuilder).build)

    /**
     * @param workspaceActivitySettings Workspace Activity settings.
     *  Structure is documented below.
     * @return builder
     */
    def workspaceActivitySettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceActivitySettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceActivitySettingsArgs.builder
      builder.workspaceActivitySettings(args(argsBuilder).build)

    /**
     * @param workspaceAlertsSettings Workspace Alert settings.
     *  Structure is documented below.
     * @return builder
     */
    def workspaceAlertsSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceAlertsSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceAlertsSettingsArgs.builder
      builder.workspaceAlertsSettings(args(argsBuilder).build)

    /**
     * @param workspaceChromeOsSettings Workspace Chrome OS settings.
     *  Structure is documented below.
     * @return builder
     */
    def workspaceChromeOsSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceChromeOsSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceChromeOsSettingsArgs.builder
      builder.workspaceChromeOsSettings(args(argsBuilder).build)

    /**
     * @param workspaceGroupsSettings Workspace Groups settings.
     *  Structure is documented below.
     * @return builder
     */
    def workspaceGroupsSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceGroupsSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceGroupsSettingsArgs.builder
      builder.workspaceGroupsSettings(args(argsBuilder).build)

    /**
     * @param workspaceMobileSettings Workspace Mobile settings.
     *  Structure is documented below.
     * @return builder
     */
    def workspaceMobileSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceMobileSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceMobileSettingsArgs.builder
      builder.workspaceMobileSettings(args(argsBuilder).build)

    /**
     * @param workspacePrivilegesSettings Workspace Privileges settings.
     *  Structure is documented below.
     * @return builder
     */
    def workspacePrivilegesSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspacePrivilegesSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspacePrivilegesSettingsArgs.builder
      builder.workspacePrivilegesSettings(args(argsBuilder).build)

    /**
     * @param workspaceUsersSettings Workspace Users settings.
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedDetailsAmazonS3Settings&#34;&gt;&lt;/a&gt;The `amazonS3Settings` block supports:
     * @return builder
     */
    def workspaceUsersSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceUsersSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceUsersSettingsArgs.builder
      builder.workspaceUsersSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DataAccessScopeAllowedDataAccessLabelArgs.Builder)
    /**
     * @param ingestionLabel Representation of an ingestion label type.
     *  Structure is documented below.
     * @return builder
     */
    def ingestionLabel(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DataAccessScopeAllowedDataAccessLabelIngestionLabelArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DataAccessScopeAllowedDataAccessLabelArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DataAccessScopeAllowedDataAccessLabelIngestionLabelArgs.builder
      builder.ingestionLabel(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsRapid7InsightSettingsArgs.Builder)
    /**
     * @param authentication HTTP header based authentication.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsRapid7InsightSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsRapid7InsightSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsRapid7InsightSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DataTableState.Builder)
    /**
     * @param columnInfos Details of all the columns in the table
     *  Structure is documented below.
     * @return builder
     */
    def columnInfos(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DataTableColumnInfoArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.DataTableState.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DataTableColumnInfoArgs.builder
      builder.columnInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param scopeInfo DataTableScopeInfo specifies the scope info of the data table.
     *  Structure is documented below.
     * @return builder
     */
    def scopeInfo(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DataTableScopeInfoArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DataTableState.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DataTableScopeInfoArgs.builder
      builder.scopeInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsMandiantIocSettingsArgs.Builder)
    /**
     * @param authentication HTTP header based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsMandiantIocSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsMandiantIocSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsMandiantIocSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.ReferenceListScopeInfoArgs.Builder)
    /**
     * @param referenceListScope ReferenceListScope specifies the list of scope names of the reference list.
     *  Structure is documented below.
     * @return builder
     */
    def referenceListScope(args: Endofunction[com.pulumi.gcp.chronicle.inputs.ReferenceListScopeInfoReferenceListScopeArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.ReferenceListScopeInfoArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.ReferenceListScopeInfoReferenceListScopeArgs.builder
      builder.referenceListScope(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.RuleCompilationDiagnosticArgs.Builder)
    /**
     * @param position CompilationPosition represents the location of a compilation diagnostic in
     *  rule text.
     *  Structure is documented below.
     * @return builder
     */
    def position(args: Endofunction[com.pulumi.gcp.chronicle.inputs.RuleCompilationDiagnosticPositionArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.RuleCompilationDiagnosticArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.RuleCompilationDiagnosticPositionArgs.builder
      builder.position(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsAnomaliSettingsArgs.Builder)
    /**
     * @param authentication Info for username and secret based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAnomaliSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAnomaliSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAnomaliSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationButtonArgs.Builder)
    /**
     * @param properties A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationButtonPropertiesArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationButtonArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationButtonPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceMobileSettingsAuthenticationArgs.Builder)
    /**
     * @param claims Claims identifying a specific customer.
     *  Structure is documented below.
     * @return builder
     */
    def claims(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceMobileSettingsAuthenticationClaimsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceMobileSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceMobileSettingsAuthenticationClaimsArgs.builder
      builder.claims(args(argsBuilder).build)

    /**
     * @param rsCredentials RS credentials.
     *  Structure is documented below.
     * @return builder
     */
    def rsCredentials(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceMobileSettingsAuthenticationRsCredentialsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceMobileSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceMobileSettingsAuthenticationRsCredentialsArgs.builder
      builder.rsCredentials(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownArgs.Builder)
    /**
     * @param customSettings A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def customSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownCustomSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownCustomSettingsArgs.builder
      builder.customSettings(args(argsBuilder).build)

    /**
     * @param defaultSettings A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def defaultSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownDefaultSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownDefaultSettingsArgs.builder
      builder.defaultSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsV2SettingsArgs.Builder)
    /**
     * @param authentication A message containing fields used to authenticate with Amazon SQS.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsV2SettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsV2SettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsV2SettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceMobileSettingsArgs.Builder)
    /**
     * @param authentication OAuth 2.0 JWT grant. See, https://tools.ietf.org/html/rfc7519
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceMobileSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceMobileSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceMobileSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownArgs.Builder)
    /**
     * @param customSettings A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def customSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownCustomSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownCustomSettingsArgs.builder
      builder.customSettings(args(argsBuilder).build)

    /**
     * @param defaultSettings A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def defaultSettings(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownDefaultSettingsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownDefaultSettingsArgs.builder
      builder.defaultSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsPanIocSettingsAuthenticationArgs.Builder)
    /**
     * @param headerKeyValues Header key-value pairs.
     *  Structure is documented below.
     * @return builder
     */
    def headerKeyValues(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsPanIocSettingsAuthenticationHeaderKeyValueArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsPanIocSettingsAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsPanIocSettingsAuthenticationHeaderKeyValueArgs.builder
      builder.headerKeyValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsOktaSettingsArgs.Builder)
    /**
     * @param authentication HTTP header based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsOktaSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsOktaSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsOktaSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsSftpSettingsArgs.Builder)
    /**
     * @param authentication SFTP Auth.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsSftpSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsSftpSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsSftpSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceUsersSettingsAuthenticationArgs.Builder)
    /**
     * @param claims Claims identifying a specific customer.
     *  Structure is documented below.
     * @return builder
     */
    def claims(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceUsersSettingsAuthenticationClaimsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceUsersSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceUsersSettingsAuthenticationClaimsArgs.builder
      builder.claims(args(argsBuilder).build)

    /**
     * @param rsCredentials RS credentials.
     *  Structure is documented below.
     * @return builder
     */
    def rsCredentials(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceUsersSettingsAuthenticationRsCredentialsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceUsersSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceUsersSettingsAuthenticationRsCredentialsArgs.builder
      builder.rsCredentials(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceChromeOsSettingsArgs.Builder)
    /**
     * @param authentication OAuth 2.0 JWT grant. See, https://tools.ietf.org/html/rfc7519
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceChromeOsSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceChromeOsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceChromeOsSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.NativeDashboardChartArgs.Builder)
    /**
     * @param chartLayout The visual layout parameters of this chart within the dashboard.
     *  Structure is documented below.
     * @return builder
     */
    def chartLayout(args: Endofunction[com.pulumi.gcp.chronicle.inputs.NativeDashboardChartChartLayoutArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.NativeDashboardChartArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.NativeDashboardChartChartLayoutArgs.builder
      builder.chartLayout(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDeviceUsersSettingsAuthenticationArgs.Builder)
    /**
     * @param claims Claims identifying a specific customer.
     *  Structure is documented below.
     * @return builder
     */
    def claims(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDeviceUsersSettingsAuthenticationClaimsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDeviceUsersSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDeviceUsersSettingsAuthenticationClaimsArgs.builder
      builder.claims(args(argsBuilder).build)

    /**
     * @param rsCredentials RS credentials.
     *  Structure is documented below.
     * @return builder
     */
    def rsCredentials(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDeviceUsersSettingsAuthenticationRsCredentialsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDeviceUsersSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDeviceUsersSettingsAuthenticationRsCredentialsArgs.builder
      builder.rsCredentials(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsDuoAuthSettingsArgs.Builder)
    /**
     * @param authentication Info for username and secret based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsDuoAuthSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsDuoAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsDuoAuthSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceAlertsSettingsAuthenticationArgs.Builder)
    /**
     * @param claims Claims identifying a specific customer.
     *  Structure is documented below.
     * @return builder
     */
    def claims(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceAlertsSettingsAuthenticationClaimsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceAlertsSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceAlertsSettingsAuthenticationClaimsArgs.builder
      builder.claims(args(argsBuilder).build)

    /**
     * @param rsCredentials RS credentials.
     *  Structure is documented below.
     * @return builder
     */
    def rsCredentials(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceAlertsSettingsAuthenticationRsCredentialsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceAlertsSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceAlertsSettingsAuthenticationRsCredentialsArgs.builder
      builder.rsCredentials(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureAdSettingsArgs.Builder)
    /**
     * @param authentication Microsoft OAuth 2.0 client credentials grant.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureAdSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureAdSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureAdSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonS3V2SettingsAuthenticationArgs.Builder)
    /**
     * @param accessKeySecretAuth S3 V2 access key and secret auth.
     *  Structure is documented below.
     * @return builder
     */
    def accessKeySecretAuth(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonS3V2SettingsAuthenticationAccessKeySecretAuthArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonS3V2SettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonS3V2SettingsAuthenticationAccessKeySecretAuthArgs.builder
      builder.accessKeySecretAuth(args(argsBuilder).build)

    /**
     * @param awsIamRoleAuth AWS IAM Role Auth for SQS V2.
     *  Structure is documented below.
     * @return builder
     */
    def awsIamRoleAuth(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonS3V2SettingsAuthenticationAwsIamRoleAuthArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonS3V2SettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonS3V2SettingsAuthenticationAwsIamRoleAuthArgs.builder
      builder.awsIamRoleAuth(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownCustomSettingsFilterDashboardFilterArgs.Builder)
    /**
     * @param filterOperatorAndValues Structure is documented below.
     * @return builder
     */
    def filterOperatorAndValues(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownCustomSettingsFilterDashboardFilterFilterOperatorAndValueArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownCustomSettingsFilterDashboardFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownCustomSettingsFilterDashboardFilterFilterOperatorAndValueArgs.builder
      builder.filterOperatorAndValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DataAccessScopeDeniedDataAccessLabelArgs.Builder)
    /**
     * @param ingestionLabel Representation of an ingestion label type.
     *  Structure is documented below.
     * @return builder
     */
    def ingestionLabel(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DataAccessScopeDeniedDataAccessLabelIngestionLabelArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DataAccessScopeDeniedDataAccessLabelArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DataAccessScopeDeniedDataAccessLabelIngestionLabelArgs.builder
      builder.ingestionLabel(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceActivitySettingsAuthenticationArgs.Builder)
    /**
     * @param claims Claims identifying a specific customer.
     *  Structure is documented below.
     * @return builder
     */
    def claims(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceActivitySettingsAuthenticationClaimsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceActivitySettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceActivitySettingsAuthenticationClaimsArgs.builder
      builder.claims(args(argsBuilder).build)

    /**
     * @param rsCredentials RS credentials.
     *  Structure is documented below.
     * @return builder
     */
    def rsCredentials(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceActivitySettingsAuthenticationRsCredentialsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceActivitySettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceActivitySettingsAuthenticationRsCredentialsArgs.builder
      builder.rsCredentials(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsFoxItStixSettingsArgs.Builder)
    /**
     * @param authentication Info for username and secret based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsFoxItStixSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsFoxItStixSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsFoxItStixSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    /**
     * @param ssl An SSL client certificate keypair.
     *  Structure is documented below.
     * @return builder
     */
    def ssl(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsFoxItStixSettingsSslArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsFoxItStixSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsFoxItStixSettingsSslArgs.builder
      builder.ssl(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxHostsSettingsArgs.Builder)
    /**
     * @param authentication TrellixStarXAuthentication contains a oneof with all of the authentication
     *  types supported by Trellix *X devices.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxHostsSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxHostsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxHostsSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsSalesforceSettingsArgs.Builder)
    /**
     * @param oauthJwtCredentials OAuth 2.0 JWT grant. See, https://tools.ietf.org/html/rfc7519
     *  Structure is documented below.
     * @return builder
     */
    def oauthJwtCredentials(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsSalesforceSettingsOauthJwtCredentialsArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsSalesforceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsSalesforceSettingsOauthJwtCredentialsArgs.builder
      builder.oauthJwtCredentials(args(argsBuilder).build)

    /**
     * @param oauthPasswordGrantAuth OAuth 2.0 password grant. See https://tools.ietf.org/html/rfc6749.
     *  Structure is documented below.
     * @return builder
     */
    def oauthPasswordGrantAuth(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsSalesforceSettingsOauthPasswordGrantAuthArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsSalesforceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsSalesforceSettingsOauthPasswordGrantAuthArgs.builder
      builder.oauthPasswordGrantAuth(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceGroupsSettingsArgs.Builder)
    /**
     * @param authentication OAuth 2.0 JWT grant. See, https://tools.ietf.org/html/rfc7519
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceGroupsSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceGroupsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkspaceGroupsSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxAlertsSettingsAuthenticationArgs.Builder)
    /**
     * @param msso Info for MssoAuthentication using a username, password, and login api
     *  endpoint.
     *  Structure is documented below.
     * @return builder
     */
    def msso(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxAlertsSettingsAuthenticationMssoArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxAlertsSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxAlertsSettingsAuthenticationMssoArgs.builder
      builder.msso(args(argsBuilder).build)

    /**
     * @param trellixIam Settings for TrellixIAMAuthentication.
     *  Structure is documented below.
     * @return builder
     */
    def trellixIam(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxAlertsSettingsAuthenticationTrellixIamArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxAlertsSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsTrellixHxAlertsSettingsAuthenticationTrellixIamArgs.builder
      builder.trellixIam(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownCustomSettingsArgs.Builder)
    /**
     * @param externalLink A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def externalLink(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownCustomSettingsExternalLinkArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownCustomSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownCustomSettingsExternalLinkArgs.builder
      builder.externalLink(args(argsBuilder).build)

    /**
     * @param filter A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownCustomSettingsFilterArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownCustomSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownCustomSettingsFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param query A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def query(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownCustomSettingsQueryArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownCustomSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownCustomSettingsQueryArgs.builder
      builder.query(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsCortexXdrSettingsArgs.Builder)
    /**
     * @param authentication HTTP header based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsCortexXdrSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsCortexXdrSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsCortexXdrSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureAdAuditSettingsArgs.Builder)
    /**
     * @param authentication Microsoft OAuth 2.0 client credentials grant.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureAdAuditSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureAdAuditSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureAdAuditSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureAdContextSettingsArgs.Builder)
    /**
     * @param authentication Microsoft OAuth 2.0 client credentials grant.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureAdContextSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureAdContextSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureAdContextSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardQueryArgs.Builder)
    /**
     * @param input Input parameters for the query, such as time windows.
     *  Structure is documented below.
     * @return builder
     */
    def input(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardQueryInputArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardQueryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardQueryInputArgs.builder
      builder.input(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDevicesSettingsArgs.Builder)
    /**
     * @param authentication OAuth 2.0 JWT grant. See, https://tools.ietf.org/html/rfc7519
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDevicesSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDevicesSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDevicesSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkdaySettingsArgs.Builder)
    /**
     * @param authentication Authentication for Workday.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkdaySettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkdaySettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsWorkdaySettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsMandiantIocSettingsAuthenticationArgs.Builder)
    /**
     * @param headerKeyValues Header key-value pairs.
     *  Structure is documented below.
     * @return builder
     */
    def headerKeyValues(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsMandiantIocSettingsAuthenticationHeaderKeyValueArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsMandiantIocSettingsAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsMandiantIocSettingsAuthenticationHeaderKeyValueArgs.builder
      builder.headerKeyValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsOffice365SettingsArgs.Builder)
    /**
     * @param authentication Microsoft OAuth 2.0 client credentials grant.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsOffice365SettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsOffice365SettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsOffice365SettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsOktaSettingsAuthenticationArgs.Builder)
    /**
     * @param headerKeyValues Header key-value pairs.
     *  Structure is documented below.
     * @return builder
     */
    def headerKeyValues(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsOktaSettingsAuthenticationHeaderKeyValueArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsOktaSettingsAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsOktaSettingsAuthenticationHeaderKeyValueArgs.builder
      builder.headerKeyValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonS3SettingsArgs.Builder)
    /**
     * @param authentication Amazon S3 auth.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonS3SettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonS3SettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonS3SettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigArgs.Builder)
    /**
     * @param leftDrillDowns Structure is documented below.
     * @return builder
     */
    def leftDrillDowns(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownArgs.builder
      builder.leftDrillDowns(args.map(_(argsBuilder).build)*)

    /**
     * @param rightDrillDowns Structure is documented below.
     * @return builder
     */
    def rightDrillDowns(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownArgs.builder
      builder.rightDrillDowns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsThinkstCanarySettingsAuthenticationArgs.Builder)
    /**
     * @param headerKeyValues Header key-value pairs.
     *  Structure is documented below.
     * @return builder
     */
    def headerKeyValues(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsThinkstCanarySettingsAuthenticationHeaderKeyValueArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsThinkstCanarySettingsAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsThinkstCanarySettingsAuthenticationHeaderKeyValueArgs.builder
      builder.headerKeyValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsCortexXdrSettingsAuthenticationArgs.Builder)
    /**
     * @param headerKeyValues Header key-value pairs.
     *  Structure is documented below.
     * @return builder
     */
    def headerKeyValues(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsCortexXdrSettingsAuthenticationHeaderKeyValueArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsCortexXdrSettingsAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsCortexXdrSettingsAuthenticationHeaderKeyValueArgs.builder
      builder.headerKeyValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureBlobStoreV2SettingsArgs.Builder)
    /**
     * @param authentication A message containing fields used to authenticate with Azure Blob Storage.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureBlobStoreV2SettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureBlobStoreV2SettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureBlobStoreV2SettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.WatchlistEntityPopulationMechanismArgs.Builder)
    /**
     * @param manual Entities are added manually.
     * @return builder
     */
    def manual(args: Endofunction[com.pulumi.gcp.chronicle.inputs.WatchlistEntityPopulationMechanismManualArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.WatchlistEntityPopulationMechanismArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.WatchlistEntityPopulationMechanismManualArgs.builder
      builder.manual(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsEc2VpcsSettingsArgs.Builder)
    /**
     * @param authentication Info for username and secret based authentication.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsEc2VpcsSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsEc2VpcsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAwsEc2VpcsSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownCustomSettingsFilterArgs.Builder)
    /**
     * @param dashboardFilters Structure is documented below.
     * @return builder
     */
    def dashboardFilters(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownCustomSettingsFilterDashboardFilterArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownCustomSettingsFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigLeftDrillDownCustomSettingsFilterDashboardFilterArgs.builder
      builder.dashboardFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.ReferenceListState.Builder)
    /**
     * @param entries Required. The entries of the reference list.
     *  When listed, they are returned in the order that was specified at creation
     *  or update. The combined size of the values of the reference list may not
     *  exceed 6MB.
     *  This is returned only when the view is REFERENCE_LIST_VIEW_FULL.
     *  Structure is documented below.
     * @return builder
     */
    def entries(args: Endofunction[com.pulumi.gcp.chronicle.inputs.ReferenceListEntryArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.ReferenceListState.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.ReferenceListEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

    /**
     * @param scopeInfos ScopeInfo specifies the scope info of the reference list.
     *  Structure is documented below.
     * @return builder
     */
    def scopeInfos(args: Endofunction[com.pulumi.gcp.chronicle.inputs.ReferenceListScopeInfoArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.ReferenceListState.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.ReferenceListScopeInfoArgs.builder
      builder.scopeInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownCustomSettingsFilterDashboardFilterArgs.Builder)
    /**
     * @param filterOperatorAndValues Structure is documented below.
     * @return builder
     */
    def filterOperatorAndValues(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownCustomSettingsFilterDashboardFilterFilterOperatorAndValueArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownCustomSettingsFilterDashboardFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigRightDrillDownCustomSettingsFilterDashboardFilterFilterOperatorAndValueArgs.builder
      builder.filterOperatorAndValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDeviceUsersSettingsArgs.Builder)
    /**
     * @param authentication OAuth 2.0 JWT grant. See, https://tools.ietf.org/html/rfc7519
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDeviceUsersSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDeviceUsersSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsGoogleCloudIdentityDeviceUsersSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsCloudPassageSettingsArgs.Builder)
    /**
     * @param authentication Info for username and secret based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsCloudPassageSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsCloudPassageSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsCloudPassageSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsMimecastMailSettingsAuthenticationArgs.Builder)
    /**
     * @param headerKeyValues Header key-value pairs.
     *  Structure is documented below.
     * @return builder
     */
    def headerKeyValues(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsMimecastMailSettingsAuthenticationHeaderKeyValueArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsMimecastMailSettingsAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsMimecastMailSettingsAuthenticationHeaderKeyValueArgs.builder
      builder.headerKeyValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsMimecastMailSettingsArgs.Builder)
    /**
     * @param authentication HTTP header based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsMimecastMailSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsMimecastMailSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsMimecastMailSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsNetskopeAlertSettingsArgs.Builder)
    /**
     * @param authentication HTTP header based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsNetskopeAlertSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsNetskopeAlertSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsNetskopeAlertSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationArgs.Builder)
    /**
     * @param button Button config if tileType is TILE_TYPE_BUTTON.
     *  Structure is documented below.
     * @return builder
     */
    def button(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationButtonArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationButtonArgs.builder
      builder.button(args(argsBuilder).build)

    /**
     * @param columnDefs Structure is documented below.
     * @return builder
     */
    def columnDefs(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationColumnDefArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationColumnDefArgs.builder
      builder.columnDefs(args.map(_(argsBuilder).build)*)

    /**
     * @param googleMapsConfig A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def googleMapsConfig(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationGoogleMapsConfigArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationGoogleMapsConfigArgs.builder
      builder.googleMapsConfig(args(argsBuilder).build)

    /**
     * @param legends Structure is documented below.
     * @return builder
     */
    def legends(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationLegendArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationLegendArgs.builder
      builder.legends(args.map(_(argsBuilder).build)*)

    /**
     * @param markdown Markdown config if tileType is TILE_TYPE_MARKDOWN.
     *  Structure is documented below.
     * @return builder
     */
    def markdown(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationMarkdownArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationMarkdownArgs.builder
      builder.markdown(args(argsBuilder).build)

    /**
     * @param series Structure is documented below.
     * @return builder
     */
    def series(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesArgs.builder
      builder.series(args.map(_(argsBuilder).build)*)

    /**
     * @param tableConfig A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def tableConfig(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationTableConfigArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationTableConfigArgs.builder
      builder.tableConfig(args(argsBuilder).build)

    /**
     * @param tooltip A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def tooltip(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationTooltipArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationTooltipArgs.builder
      builder.tooltip(args(argsBuilder).build)

    /**
     * @param visualMaps Structure is documented below.
     * @return builder
     */
    def visualMaps(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationVisualMapArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationVisualMapArgs.builder
      builder.visualMaps(args.map(_(argsBuilder).build)*)

    /**
     * @param xAxes Structure is documented below.
     * @return builder
     */
    def xAxes(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationXAxisArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationXAxisArgs.builder
      builder.xAxes(args.map(_(argsBuilder).build)*)

    /**
     * @param yAxes Structure is documented below.
     * @return builder
     */
    def yAxes(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationYAxisArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationYAxisArgs.builder
      builder.yAxes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsImpervaWafSettingsArgs.Builder)
    /**
     * @param authentication HTTP header based authentication.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsImpervaWafSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsImpervaWafSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsImpervaWafSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureMdmIntuneSettingsArgs.Builder)
    /**
     * @param authentication Microsoft OAuth 2.0 client credentials grant.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureMdmIntuneSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureMdmIntuneSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAzureMdmIntuneSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationMarkdownArgs.Builder)
    /**
     * @param properties A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationMarkdownPropertiesArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationMarkdownArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationMarkdownPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsSettingsArgs.Builder)
    /**
     * @param authentication Amazon SQS auth.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.RuleState.Builder)
    /**
     * @param compilationDiagnostics Output only. A list of a rule&#39;s corresponding compilation diagnostic messages
     *  such as compilation errors and compilation warnings.
     *  Populated in FULL view.
     *  Structure is documented below.
     * @return builder
     */
    def compilationDiagnostics(args: Endofunction[com.pulumi.gcp.chronicle.inputs.RuleCompilationDiagnosticArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.RuleState.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.RuleCompilationDiagnosticArgs.builder
      builder.compilationDiagnostics(args.map(_(argsBuilder).build)*)

    /**
     * @param severities (Output)
     *  Output only. The severity of a rule&#39;s compilation diagnostic.
     *  Possible values:
     *  SEVERITY_UNSPECIFIED
     *  WARNING
     *  ERROR
     * @return builder
     */
    def severities(args: Endofunction[com.pulumi.gcp.chronicle.inputs.RuleSeverityArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.RuleState.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.RuleSeverityArgs.builder
      builder.severities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsImpervaWafSettingsAuthenticationArgs.Builder)
    /**
     * @param headerKeyValues Header key-value pairs.
     *  Structure is documented below.
     * @return builder
     */
    def headerKeyValues(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsImpervaWafSettingsAuthenticationHeaderKeyValueArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsImpervaWafSettingsAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsImpervaWafSettingsAuthenticationHeaderKeyValueArgs.builder
      builder.headerKeyValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardQueryInputArgs.Builder)
    /**
     * @param relativeTime Relative time range.
     *  Structure is documented below.
     * @return builder
     */
    def relativeTime(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardQueryInputRelativeTimeArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardQueryInputArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardQueryInputRelativeTimeArgs.builder
      builder.relativeTime(args(argsBuilder).build)

    /**
     * @param timeWindow Specific start and end times.
     *  Structure is documented below.
     * @return builder
     */
    def timeWindow(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardQueryInputTimeWindowArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardQueryInputArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardQueryInputTimeWindowArgs.builder
      builder.timeWindow(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsThreatConnectIocV3SettingsArgs.Builder)
    /**
     * @param authentication Info for username and secret based authentication.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsThreatConnectIocV3SettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsThreatConnectIocV3SettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsThreatConnectIocV3SettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.RetrohuntState.Builder)
    /**
     * @param executionIntervals Represents a time interval, encoded as a Timestamp start (inclusive) and a
     *  Timestamp end (exclusive).
     *  The start must be less than or equal to the end.
     *  When the start equals the end, the interval is empty (matches no time).
     *  When both start and end are unspecified, the interval matches any time.
     *  Structure is documented below.
     * @return builder
     */
    def executionIntervals(args: Endofunction[com.pulumi.gcp.chronicle.inputs.RetrohuntExecutionIntervalArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.RetrohuntState.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.RetrohuntExecutionIntervalArgs.builder
      builder.executionIntervals(args.map(_(argsBuilder).build)*)

    /**
     * @param processInterval Represents a time interval, encoded as a Timestamp start (inclusive) and a
     *  Timestamp end (exclusive).
     *  The start must be less than or equal to the end.
     *  When the start equals the end, the interval is empty (matches no time).
     *  When both start and end are unspecified, the interval matches any time.
     *  Structure is documented below.
     * @return builder
     */
    def processInterval(args: Endofunction[com.pulumi.gcp.chronicle.inputs.RetrohuntProcessIntervalArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.RetrohuntState.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.RetrohuntProcessIntervalArgs.builder
      builder.processInterval(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.NativeDashboardFilterArgs.Builder)
    /**
     * @param filterOperatorAndFieldValues The specific operator and value set for the filter.
     *  Structure is documented below.
     * @return builder
     */
    def filterOperatorAndFieldValues(args: Endofunction[com.pulumi.gcp.chronicle.inputs.NativeDashboardFilterFilterOperatorAndFieldValueArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.NativeDashboardFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.NativeDashboardFilterFilterOperatorAndFieldValueArgs.builder
      builder.filterOperatorAndFieldValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesGaugeConfigArgs.Builder)
    /**
     * @param baseValue A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def baseValue(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesGaugeConfigBaseValueArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesGaugeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesGaugeConfigBaseValueArgs.builder
      builder.baseValue(args(argsBuilder).build)

    /**
     * @param limitValue A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def limitValue(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesGaugeConfigLimitValueArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesGaugeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesGaugeConfigLimitValueArgs.builder
      builder.limitValue(args(argsBuilder).build)

    /**
     * @param thresholdValues Structure is documented below.
     * @return builder
     */
    def thresholdValues(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesGaugeConfigThresholdValueArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesGaugeConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesGaugeConfigThresholdValueArgs.builder
      builder.thresholdValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsSymantecEventExportSettingsArgs.Builder)
    /**
     * @param authentication OAuth 2.0 refresh token grant. See https://tools.ietf.org/html/rfc6749.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsSymantecEventExportSettingsAuthenticationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsSymantecEventExportSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsSymantecEventExportSettingsAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartArgs.Builder)
    /**
     * @param chartDatasource Query and datasource used in the chart.
     *  Structure is documented below.
     * @return builder
     */
    def chartDatasource(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartChartDatasourceArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartChartDatasourceArgs.builder
      builder.chartDatasource(args(argsBuilder).build)

    /**
     * @param drillDownConfig Drill down configuration.
     *  Structure is documented below.
     * @return builder
     */
    def drillDownConfig(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartDrillDownConfigArgs.builder
      builder.drillDownConfig(args(argsBuilder).build)

    /**
     * @param visualization Visualization config for a chart.
     *  Structure is documented below.
     * @return builder
     */
    def visualization(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationArgs.builder
      builder.visualization(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesItemColorsColorArgs.Builder)
    /**
     * @param value A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesItemColorsColorValueArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesItemColorsColorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationSeriesItemColorsColorValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationVisualMapArgs.Builder)
    /**
     * @param pieces Structure is documented below.
     * @return builder
     */
    def pieces(args: Endofunction[com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationVisualMapPieceArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationVisualMapArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.DashboardChartDashboardChartVisualizationVisualMapPieceArgs.builder
      builder.pieces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsNetskopeAlertV2SettingsAuthenticationArgs.Builder)
    /**
     * @param headerKeyValues Header key-value pairs.
     *  Structure is documented below.
     * @return builder
     */
    def headerKeyValues(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsNetskopeAlertV2SettingsAuthenticationHeaderKeyValueArgs.Builder]*):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsNetskopeAlertV2SettingsAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsNetskopeAlertV2SettingsAuthenticationHeaderKeyValueArgs.builder
      builder.headerKeyValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsSettingsAuthenticationArgs.Builder)
    /**
     * @param additionalS3AccessKeySecretAuth Additional S3 access key secret auth.
     *  Structure is documented below.
     * @return builder
     */
    def additionalS3AccessKeySecretAuth(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsSettingsAuthenticationAdditionalS3AccessKeySecretAuthArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsSettingsAuthenticationAdditionalS3AccessKeySecretAuthArgs.builder
      builder.additionalS3AccessKeySecretAuth(args(argsBuilder).build)

    /**
     * @param sqsAccessKeySecretAuth Amazon SQS access key and secret auth.
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedDetailsAmazonSqsSettingsAuthenticationAdditionalS3AccessKeySecretAuth&#34;&gt;&lt;/a&gt;The `additionalS3AccessKeySecretAuth` block supports:
     * @return builder
     */
    def sqsAccessKeySecretAuth(args: Endofunction[com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsSettingsAuthenticationSqsAccessKeySecretAuthArgs.Builder]):
        com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsSettingsAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.chronicle.inputs.FeedDetailsAmazonSqsSettingsAuthenticationSqsAccessKeySecretAuthArgs.builder
      builder.sqsAccessKeySecretAuth(args(argsBuilder).build)
