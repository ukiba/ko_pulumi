package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object monitoring:
  extension (builder: com.pulumi.gcp.monitoring.GenericServiceArgs.Builder)
    /**
     * @param basicService A well-known service type, defined by its service type and service labels.
     *  Valid values of service types and services labels are described at
     *  https://cloud.google.com/stackdriver/docs/solutions/slo-monitoring/api/api-structures#basic-svc-w-basic-sli
     *  Structure is documented below.
     * @return builder
     */
    def basicService(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GenericServiceBasicServiceArgs.Builder]):
        com.pulumi.gcp.monitoring.GenericServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GenericServiceBasicServiceArgs.builder
      builder.basicService(args(argsBuilder).build)

  /**
   * A Service is a discrete, autonomous, and network-accessible unit,
   *  designed to solve an individual concern. In Cloud Monitoring,
   *  a Service acts as the root resource under which operational aspects of
   *  the service are accessible
   * 
   *  To get more information about Service, see:
   * 
   *  * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
   *  * How-to Guides
   *      * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
   *      * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
   *      * [Service-orientation on Wikipedia](https://en.wikipedia.org/wiki/Service-orientation)
   */
  def CustomService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.monitoring.CustomServiceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.monitoring.CustomServiceArgs.builder
    com.pulumi.gcp.monitoring.CustomService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.monitoring.UptimeCheckConfigArgs.Builder)
    /**
     * @param contentMatchers The expected content on the page the check is run against. Currently, only the first entry in the list is supported, and other entries will be ignored. The server will look for an exact match of the string in the page response&#39;s content. This field is optional and should only be specified if a content match is required.
     *  Structure is documented below.
     * @return builder
     */
    def contentMatchers(args: Endofunction[com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigContentMatcherArgs.Builder]*):
        com.pulumi.gcp.monitoring.UptimeCheckConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigContentMatcherArgs.builder
      builder.contentMatchers(args.map(_(argsBuilder).build)*)

    /**
     * @param httpCheck Contains information needed to make an HTTP or HTTPS check.
     *  Structure is documented below.
     * @return builder
     */
    def httpCheck(args: Endofunction[com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckArgs.Builder]):
        com.pulumi.gcp.monitoring.UptimeCheckConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckArgs.builder
      builder.httpCheck(args(argsBuilder).build)

    /**
     * @param monitoredResource The [monitored resource](https://cloud.google.com/monitoring/api/resources) associated with the
     *  configuration. The following monitored resource types are supported for
     *  uptime checks:
     * @return builder
     */
    def monitoredResource(args: Endofunction[com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigMonitoredResourceArgs.Builder]):
        com.pulumi.gcp.monitoring.UptimeCheckConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigMonitoredResourceArgs.builder
      builder.monitoredResource(args(argsBuilder).build)

    /**
     * @param resourceGroup The group resource associated with the configuration.
     *  Structure is documented below.
     * @return builder
     */
    def resourceGroup(args: Endofunction[com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigResourceGroupArgs.Builder]):
        com.pulumi.gcp.monitoring.UptimeCheckConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigResourceGroupArgs.builder
      builder.resourceGroup(args(argsBuilder).build)

    /**
     * @param syntheticMonitor A Synthetic Monitor deployed to a Cloud Functions V2 instance.
     *  Structure is documented below.
     * @return builder
     */
    def syntheticMonitor(args: Endofunction[com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigSyntheticMonitorArgs.Builder]):
        com.pulumi.gcp.monitoring.UptimeCheckConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigSyntheticMonitorArgs.builder
      builder.syntheticMonitor(args(argsBuilder).build)

    /**
     * @param tcpCheck Contains information needed to make a TCP check.
     *  Structure is documented below.
     * @return builder
     */
    def tcpCheck(args: Endofunction[com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigTcpCheckArgs.Builder]):
        com.pulumi.gcp.monitoring.UptimeCheckConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigTcpCheckArgs.builder
      builder.tcpCheck(args(argsBuilder).build)

  /**
   * The description of a dynamic collection of monitored resources. Each group
   *  has a filter that is matched against monitored resources and their
   *  associated metadata. If a group&#39;s filter matches an available monitored
   *  resource, then that resource is a member of that group.
   * 
   *  To get more information about Group, see:
   * 
   *  * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.groups)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/monitoring/groups/)
   */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.monitoring.GroupArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.monitoring.GroupArgs.builder
    com.pulumi.gcp.monitoring.Group(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.monitoring.CustomServiceArgs.Builder)
    /**
     * @param telemetry Configuration for how to query telemetry on a Service.
     *  Structure is documented below.
     * @return builder
     */
    def telemetry(args: Endofunction[com.pulumi.gcp.monitoring.inputs.CustomServiceTelemetryArgs.Builder]):
        com.pulumi.gcp.monitoring.CustomServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.CustomServiceTelemetryArgs.builder
      builder.telemetry(args(argsBuilder).build)

  /**
   * A description of the conditions under which some aspect of your system is
   *  considered to be &#34;unhealthy&#34; and the ways to notify people or services
   *  about this state.
   * 
   *  To get more information about AlertPolicy, see:
   * 
   *  * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.alertPolicies)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/monitoring/alerts/)
   */
  def AlertPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.monitoring.AlertPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.monitoring.AlertPolicyArgs.builder
    com.pulumi.gcp.monitoring.AlertPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Defines a metric type and its schema. Once a metric descriptor is created, deleting or altering it stops data collection and makes the metric type&#39;s existing data unusable.
   * 
   *  To get more information about MetricDescriptor, see:
   * 
   *  * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/monitoring/custom-metrics/)
   */
  def MetricDescriptor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.monitoring.MetricDescriptorArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.monitoring.MetricDescriptorArgs.builder
    com.pulumi.gcp.monitoring.MetricDescriptor(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.monitoring.MetricDescriptorArgs.Builder)
    /**
     * @param labels The set of labels that can be used to describe a specific instance of this metric type. In order to delete a label, the entire resource must be deleted, then created with the desired labels.
     *  Structure is documented below.
     * @return builder
     */
    def labels(args: Endofunction[com.pulumi.gcp.monitoring.inputs.MetricDescriptorLabelArgs.Builder]*):
        com.pulumi.gcp.monitoring.MetricDescriptorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.monitoring.inputs.MetricDescriptorLabelArgs.builder
      builder.labels(args.map(_(argsBuilder).build)*)

    /**
     * @param metadata Metadata which can be used to guide usage of the metric.
     *  Structure is documented below.
     * @return builder
     */
    def metadata(args: Endofunction[com.pulumi.gcp.monitoring.inputs.MetricDescriptorMetadataArgs.Builder]):
        com.pulumi.gcp.monitoring.MetricDescriptorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.MetricDescriptorMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

  /**
   * A Google Stackdriver dashboard. Dashboards define the content and layout of pages in the Stackdriver web application.
   * 
   *  To get more information about Dashboards, see:
   * 
   *  * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v1/projects.dashboards)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/monitoring/dashboards)
   */
  def Dashboard(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.monitoring.DashboardArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.monitoring.DashboardArgs.builder
    com.pulumi.gcp.monitoring.Dashboard(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.monitoring.NotificationChannelArgs.Builder)
    /**
     * @param sensitiveLabels Different notification type behaviors are configured primarily using the the `labels` field on this
     *  resource. This block contains the labels which contain secrets or passwords so that they can be marked
     *  sensitive and hidden from plan output. The name of the field, eg: password, will be the key
     *  in the `labels` map in the api request.
     *  Credentials may not be specified in both locations and will cause an error. Changing from one location
     *  to a different credential configuration in the config will require an apply to update state.
     *  Structure is documented below.
     * @return builder
     */
    def sensitiveLabels(args: Endofunction[com.pulumi.gcp.monitoring.inputs.NotificationChannelSensitiveLabelsArgs.Builder]):
        com.pulumi.gcp.monitoring.NotificationChannelArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.NotificationChannelSensitiveLabelsArgs.builder
      builder.sensitiveLabels(args(argsBuilder).build)

  /**
   * This message configures which resources and services to monitor for availability.
   * 
   *  To get more information about UptimeCheckConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.uptimeCheckConfigs)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/monitoring/uptime-checks/)
   * 
   *  &gt; **Note:**  All arguments marked as write-only values will not be stored in the state: `http_check.auth_info.password_wo`.
   *  Read more about Write-only Arguments.
   */
  def UptimeCheckConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.monitoring.UptimeCheckConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.monitoring.UptimeCheckConfigArgs.builder
    com.pulumi.gcp.monitoring.UptimeCheckConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.monitoring.SloArgs.Builder)
    /**
     * @param basicSli Basic Service-Level Indicator (SLI) on a well-known service type.
     *  Performance will be computed on the basis of pre-defined metrics.
     *  SLIs are used to measure and calculate the quality of the Service&#39;s
     *  performance with respect to a single aspect of service quality.
     *  Exactly one of the following must be set:
     *  `basicSli`, `requestBasedSli`, `windowsBasedSli`
     *  Structure is documented below.
     * @return builder
     */
    def basicSli(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloBasicSliArgs.Builder]):
        com.pulumi.gcp.monitoring.SloArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloBasicSliArgs.builder
      builder.basicSli(args(argsBuilder).build)

    /**
     * @param requestBasedSli A request-based SLI defines a SLI for which atomic units of
     *  service are counted directly.
     *  A SLI describes a good service.
     *  It is used to measure and calculate the quality of the Service&#39;s
     *  performance with respect to a single aspect of service quality.
     *  Exactly one of the following must be set:
     *  `basicSli`, `requestBasedSli`, `windowsBasedSli`
     *  Structure is documented below.
     * @return builder
     */
    def requestBasedSli(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloRequestBasedSliArgs.Builder]):
        com.pulumi.gcp.monitoring.SloArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloRequestBasedSliArgs.builder
      builder.requestBasedSli(args(argsBuilder).build)

    /**
     * @param windowsBasedSli A windows-based SLI defines the criteria for time windows.
     *  goodService is defined based off the count of these time windows
     *  for which the provided service was of good quality.
     *  A SLI describes a good service. It is used to measure and calculate
     *  the quality of the Service&#39;s performance with respect to a single
     *  aspect of service quality.
     *  Exactly one of the following must be set:
     *  `basicSli`, `requestBasedSli`, `windowsBasedSli`
     *  Structure is documented below.
     * @return builder
     */
    def windowsBasedSli(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliArgs.Builder]):
        com.pulumi.gcp.monitoring.SloArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliArgs.builder
      builder.windowsBasedSli(args(argsBuilder).build)

  /**
   * A Service-Level Objective (SLO) describes the level of desired good
   *  service. It consists of a service-level indicator (SLI), a performance
   *  goal, and a period over which the objective is to be evaluated against
   *  that goal. The SLO can use SLIs defined in a number of different manners.
   *  Typical SLOs might include &#34;99% of requests in each rolling week have
   *  latency below 200 milliseconds&#34; or &#34;99.5% of requests in each calendar
   *  month return successfully.&#34;
   * 
   *  To get more information about Slo, see:
   * 
   *  * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services.serviceLevelObjectives)
   *  * How-to Guides
   *      * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
   *      * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
   */
  def Slo(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.monitoring.SloArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.monitoring.SloArgs.builder
    com.pulumi.gcp.monitoring.Slo(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A NotificationChannel is a medium through which an alert is delivered
   *  when a policy violation is detected. Examples of channels include email, SMS,
   *  and third-party messaging applications. Fields containing sensitive information
   *  like authentication tokens or contact info are only partially populated on retrieval.
   * 
   *  Notification Channels are designed to be flexible and are made up of a supported `type`
   *  and labels to configure that channel. Each `type` has specific labels that need to be
   *  present for that channel to be correctly configured. The labels that are required to be
   *  present for one channel `type` are often different than those required for another.
   *  Due to these loose constraints it&#39;s often best to set up a channel through the UI
   *  and import it to the provider when setting up a brand new channel type to determine which
   *  labels are required.
   * 
   *  A list of supported channels per project the `list` endpoint can be
   *  accessed programmatically or through the api explorer at  https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannelDescriptors/list .
   *  This provides the channel type and all of the required labels that must be passed.
   * 
   *  To get more information about NotificationChannel, see:
   * 
   *  * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannels)
   *  * How-to Guides
   *      * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
   *      * [Notification Options](https://cloud.google.com/monitoring/support/notification-options)
   * 
   *  &gt; **Note:**  All arguments marked as write-only values will not be stored in the state: `sensitive_labels.auth_token_wo`, `sensitive_labels.password_wo`, `sensitive_labels.service_key_wo`.
   *  Read more about Write-only Arguments.
   */
  def NotificationChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.monitoring.NotificationChannelArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.monitoring.NotificationChannelArgs.builder
    com.pulumi.gcp.monitoring.NotificationChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A [project being monitored](https://cloud.google.com/monitoring/settings/multiple-projects#create-multi) by a Metrics Scope.
   * 
   *  To get more information about MonitoredProject, see:
   * 
   *  * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v1/locations.global.metricsScopes.projects)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/monitoring/settings/manage-api)
   */
  def MonitoredProject(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.monitoring.MonitoredProjectArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.monitoring.MonitoredProjectArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.monitoring.MonitoredProject(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.monitoring.AlertPolicyArgs.Builder)
    /**
     * @param alertStrategy Control over how this alert policy&#39;s notification channels are notified.
     *  Structure is documented below.
     * @return builder
     */
    def alertStrategy(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyAlertStrategyArgs.Builder]):
        com.pulumi.gcp.monitoring.AlertPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyAlertStrategyArgs.builder
      builder.alertStrategy(args(argsBuilder).build)

    /**
     * @param conditions A list of conditions for the policy. The conditions are combined by
     *  AND or OR according to the combiner field. If the combined conditions
     *  evaluate to true, then an incident is created. A policy can have from
     *  one to six conditions.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionArgs.Builder]*):
        com.pulumi.gcp.monitoring.AlertPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param documentation Documentation that is included with notifications and incidents related
     *  to this policy. Best practice is for the documentation to include information
     *  to help responders understand, mitigate, escalate, and correct the underlying
     *  problems detected by the alerting policy. Notification channels that have
     *  limited capacity might not show this documentation.
     *  Structure is documented below.
     * @return builder
     */
    def documentation(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyDocumentationArgs.Builder]):
        com.pulumi.gcp.monitoring.AlertPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyDocumentationArgs.builder
      builder.documentation(args(argsBuilder).build)

  /**
   * A Service is a discrete, autonomous, and network-accessible unit,
   *  designed to solve an individual concern. In Cloud Monitoring,
   *  a Service acts as the root resource under which operational aspects of
   *  the service are accessible
   * 
   *  To get more information about GenericService, see:
   * 
   *  * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
   *  * How-to Guides
   *      * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
   *      * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
   *      * [Service-orientation on Wikipedia](https://en.wikipedia.org/wiki/Service-orientation)
   */
  def GenericService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.monitoring.GenericServiceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.monitoring.GenericServiceArgs.builder
    com.pulumi.gcp.monitoring.GenericService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object MonitoringFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * A Monitoring Service is the root resource under which operational aspects of a
     *  generic service are accessible. A service is some discrete, autonomous, and
     *  network-accessible unit, designed to solve an individual concern
     * 
     *  An App Engine monitoring service is automatically created by GCP to monitor
     *  App Engine services.
     * 
     *  To get more information about Service, see:
     * 
     *  * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
     *  * How-to Guides
     *      * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
     *      * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     */
    inline def getAppEngineService(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetAppEngineServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.monitoring.outputs.GetAppEngineServiceResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetAppEngineServiceArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getAppEngineService(args(argsBuilder).build)

    /**
     * A Monitoring Service is the root resource under which operational aspects of a
     *  generic service are accessible. A service is some discrete, autonomous, and
     *  network-accessible unit, designed to solve an individual concern
     * 
     *  An App Engine monitoring service is automatically created by GCP to monitor
     *  App Engine services.
     * 
     *  To get more information about Service, see:
     * 
     *  * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
     *  * How-to Guides
     *      * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
     *      * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     */
    inline def getAppEngineServicePlain(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetAppEngineServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.monitoring.outputs.GetAppEngineServiceResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetAppEngineServicePlainArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getAppEngineServicePlain(args(argsBuilder).build)

    /**
     * A Monitoring Service is the root resource under which operational aspects of a
     *  generic service are accessible. A service is some discrete, autonomous, and
     *  network-accessible unit, designed to solve an individual concern
     * 
     *  An Cluster Istio monitoring service is automatically created by GCP to monitor
     *  Cluster Istio services.
     * 
     *  To get more information about Service, see:
     * 
     *  * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
     *  * How-to Guides
     *      * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
     *      * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     */
    inline def getClusterIstioService(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetClusterIstioServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.monitoring.outputs.GetClusterIstioServiceResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetClusterIstioServiceArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getClusterIstioService(args(argsBuilder).build)

    /**
     * A Monitoring Service is the root resource under which operational aspects of a
     *  generic service are accessible. A service is some discrete, autonomous, and
     *  network-accessible unit, designed to solve an individual concern
     * 
     *  An Cluster Istio monitoring service is automatically created by GCP to monitor
     *  Cluster Istio services.
     * 
     *  To get more information about Service, see:
     * 
     *  * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
     *  * How-to Guides
     *      * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
     *      * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     */
    inline def getClusterIstioServicePlain(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetClusterIstioServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.monitoring.outputs.GetClusterIstioServiceResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetClusterIstioServicePlainArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getClusterIstioServicePlain(args(argsBuilder).build)

    /**
     * A Monitoring Service is the root resource under which operational aspects of a
     *  generic service are accessible. A service is some discrete, autonomous, and
     *  network-accessible unit, designed to solve an individual concern
     * 
     *  A monitoring Istio Canonical Service is automatically created by GCP to monitor
     *  Istio Canonical Services.
     * 
     *  To get more information about Service, see:
     * 
     *  * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
     *  * How-to Guides
     *      * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
     *      * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     */
    inline def getIstioCanonicalService(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetIstioCanonicalServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.monitoring.outputs.GetIstioCanonicalServiceResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetIstioCanonicalServiceArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getIstioCanonicalService(args(argsBuilder).build)

    /**
     * A Monitoring Service is the root resource under which operational aspects of a
     *  generic service are accessible. A service is some discrete, autonomous, and
     *  network-accessible unit, designed to solve an individual concern
     * 
     *  A monitoring Istio Canonical Service is automatically created by GCP to monitor
     *  Istio Canonical Services.
     * 
     *  To get more information about Service, see:
     * 
     *  * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
     *  * How-to Guides
     *      * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
     *      * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     */
    inline def getIstioCanonicalServicePlain(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetIstioCanonicalServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.monitoring.outputs.GetIstioCanonicalServiceResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetIstioCanonicalServicePlainArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getIstioCanonicalServicePlain(args(argsBuilder).build)

    /**
     * A Monitoring Service is the root resource under which operational aspects of a
     *  generic service are accessible. A service is some discrete, autonomous, and
     *  network-accessible unit, designed to solve an individual concern
     * 
     *  An Mesh Istio monitoring service is automatically created by GCP to monitor
     *  Mesh Istio services.
     * 
     *  To get more information about Service, see:
     * 
     *  * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
     *  * How-to Guides
     *      * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
     *      * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     */
    inline def getMeshIstioService(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetMeshIstioServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.monitoring.outputs.GetMeshIstioServiceResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetMeshIstioServiceArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getMeshIstioService(args(argsBuilder).build)

    /**
     * A Monitoring Service is the root resource under which operational aspects of a
     *  generic service are accessible. A service is some discrete, autonomous, and
     *  network-accessible unit, designed to solve an individual concern
     * 
     *  An Mesh Istio monitoring service is automatically created by GCP to monitor
     *  Mesh Istio services.
     * 
     *  To get more information about Service, see:
     * 
     *  * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
     *  * How-to Guides
     *      * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
     *      * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     */
    inline def getMeshIstioServicePlain(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetMeshIstioServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.monitoring.outputs.GetMeshIstioServiceResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetMeshIstioServicePlainArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getMeshIstioServicePlain(args(argsBuilder).build)

    /**
     * A NotificationChannel is a medium through which an alert is delivered
     *  when a policy violation is detected. Examples of channels include email, SMS,
     *  and third-party messaging applications. Fields containing sensitive information
     *  like authentication tokens or contact info are only partially populated on retrieval.
     * 
     *  To get more information about NotificationChannel, see:
     * 
     *  * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannels)
     *  * How-to Guides
     *      * [Notification Options](https://cloud.google.com/monitoring/support/notification-options)
     *      * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     */
    inline def getNotificationChannel(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetNotificationChannelArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.monitoring.outputs.GetNotificationChannelResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetNotificationChannelArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getNotificationChannel(args(argsBuilder).build)

    /**
     * A NotificationChannel is a medium through which an alert is delivered
     *  when a policy violation is detected. Examples of channels include email, SMS,
     *  and third-party messaging applications. Fields containing sensitive information
     *  like authentication tokens or contact info are only partially populated on retrieval.
     * 
     *  To get more information about NotificationChannel, see:
     * 
     *  * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannels)
     *  * How-to Guides
     *      * [Notification Options](https://cloud.google.com/monitoring/support/notification-options)
     *      * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     */
    inline def getNotificationChannelPlain(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetNotificationChannelPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.monitoring.outputs.GetNotificationChannelResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetNotificationChannelPlainArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getNotificationChannelPlain(args(argsBuilder).build)

    /** Get the value and metadata from a Secret Manager secret version. For more information see the [official documentation](https://cloud.google.com/secret-manager/docs/) and [API](https://cloud.google.com/secret-manager/docs/reference/rest/v1/projects.secrets.versions). If you don&#39;t need the metadata (i.e., if you want to use a more limited role to access the secret version only), see also the gcp.secretmanager.getSecretVersionAccess datasource. */
    @deprecated inline def getSecretVersion(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetSecretVersionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.monitoring.outputs.GetSecretVersionResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetSecretVersionArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getSecretVersion(args(argsBuilder).build)

    /** Get the value and metadata from a Secret Manager secret version. For more information see the [official documentation](https://cloud.google.com/secret-manager/docs/) and [API](https://cloud.google.com/secret-manager/docs/reference/rest/v1/projects.secrets.versions). If you don&#39;t need the metadata (i.e., if you want to use a more limited role to access the secret version only), see also the gcp.secretmanager.getSecretVersionAccess datasource. */
    @deprecated inline def getSecretVersionPlain(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetSecretVersionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.monitoring.outputs.GetSecretVersionResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetSecretVersionPlainArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getSecretVersionPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlDailyArgs.Builder)
    /**
     * @param executionTime The time of day (in UTC) at which the query should run. If left
     *  unspecified, the server picks an arbitrary time of day and runs
     *  the query at the same time each day.
     *  Structure is documented below.
     * @return builder
     */
    def executionTime(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlDailyExecutionTimeArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlDailyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlDailyExecutionTimeArgs.builder
      builder.executionTime(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceArgs.Builder)
    /**
     * @param availability Availability based SLI, dervied from count of requests made to this service that return successfully.
     *  Structure is documented below.
     * @return builder
     */
    def availability(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailabilityArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailabilityArgs.builder
      builder.availability(args(argsBuilder).build)

    /**
     * @param latency Parameters for a latency threshold SLI.
     *  Structure is documented below.
     * @return builder
     */
    def latency(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceLatencyArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceLatencyArgs.builder
      builder.latency(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlArgs.Builder)
    /**
     * @param booleanTest A test that uses an alerting result in a boolean column produced by the SQL query.
     *  Structure is documented below.
     * @return builder
     */
    def booleanTest(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlBooleanTestArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlBooleanTestArgs.builder
      builder.booleanTest(args(argsBuilder).build)

    /**
     * @param daily Used to schedule the query to run every so many days.
     *  Structure is documented below.
     * @return builder
     */
    def daily(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlDailyArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlDailyArgs.builder
      builder.daily(args(argsBuilder).build)

    /**
     * @param hourly Used to schedule the query to run every so many hours.
     *  Structure is documented below.
     * @return builder
     */
    def hourly(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlHourlyArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlHourlyArgs.builder
      builder.hourly(args(argsBuilder).build)

    /**
     * @param minutes Used to schedule the query to run every so many minutes.
     *  Structure is documented below.
     * @return builder
     */
    def minutes(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlMinutesArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlMinutesArgs.builder
      builder.minutes(args(argsBuilder).build)

    /**
     * @param rowCountTest A test that checks if the number of rows in the result set violates some threshold.
     *  Structure is documented below.
     * @return builder
     */
    def rowCountTest(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlRowCountTestArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlRowCountTestArgs.builder
      builder.rowCountTest(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs.Builder)
    /**
     * @param distributionCut Used when goodService is defined by a count of values aggregated in a
     *  Distribution that fall into a good range. The totalService is the
     *  total count of all values aggregated in the Distribution.
     *  Defines a distribution TimeSeries filter and thresholds used for
     *  measuring good service and total service.
     *  Structure is documented below.
     * @return builder
     */
    def distributionCut(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs.builder
      builder.distributionCut(args(argsBuilder).build)

    /**
     * @param goodTotalRatio A means to compute a ratio of `goodService` to `totalService`.
     *  Defines computing this ratio with two TimeSeries [monitoring filters](https://cloud.google.com/monitoring/api/v3/filters)
     *  Must specify exactly two of good, bad, and total service filters.
     *  The relationship goodService + badService = totalService
     *  will be assumed.
     *  Structure is documented below.
     * @return builder
     */
    def goodTotalRatio(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioArgs.builder
      builder.goodTotalRatio(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs.Builder)
    /**
     * @param range Range of numerical values. The computed goodService
     *  will be the count of values x in the Distribution such
     *  that range.min &lt;= x &lt;= range.max. inclusive of min and
     *  max. Open ranges can be defined by setting
     *  just one of min or max.
     *  Structure is documented below.
     * @return builder
     */
    def range(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRangeArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRangeArgs.builder
      builder.range(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.CustomServiceState.Builder)
    /**
     * @param telemetry Configuration for how to query telemetry on a Service.
     *  Structure is documented below.
     * @return builder
     */
    def telemetry(args: Endofunction[com.pulumi.gcp.monitoring.inputs.CustomServiceTelemetryArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.CustomServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.CustomServiceTelemetryArgs.builder
      builder.telemetry(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionMonitoringQueryLanguageArgs.Builder)
    /**
     * @param trigger The number/percent of time series for which
     *  the comparison must hold in order for the
     *  condition to trigger. If unspecified, then
     *  the condition will trigger if the comparison
     *  is true for any of the time series that have
     *  been identified by filter and aggregations,
     *  or by the ratio, if denominatorFilter and
     *  denominatorAggregations are specified.
     *  Structure is documented below.
     * @return builder
     */
    def trigger(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionMonitoringQueryLanguageTriggerArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionMonitoringQueryLanguageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionMonitoringQueryLanguageTriggerArgs.builder
      builder.trigger(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigContentMatcherArgs.Builder)
    /**
     * @param jsonPathMatcher Information needed to perform a JSONPath content match. Used for `ContentMatcherOption::MATCHES_JSON_PATH` and `ContentMatcherOption::NOT_MATCHES_JSON_PATH`.
     *  Structure is documented below.
     * @return builder
     */
    def jsonPathMatcher(args: Endofunction[com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigContentMatcherJsonPathMatcherArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigContentMatcherArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigContentMatcherJsonPathMatcherArgs.builder
      builder.jsonPathMatcher(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliMetricSumInRangeArgs.Builder)
    /**
     * @param range Range of numerical values. The computed goodService
     *  will be the count of values x in the Distribution such
     *  that range.min &lt;= x &lt;= range.max. inclusive of min and
     *  max. Open ranges can be defined by setting
     *  just one of min or max. Summed value `X` should satisfy
     *  `range.min &lt;= X &lt;= range.max` for a good window.
     *  Structure is documented below.
     * @return builder
     */
    def range(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliMetricSumInRangeRangeArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliMetricSumInRangeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliMetricSumInRangeRangeArgs.builder
      builder.range(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckArgs.Builder)
    /**
     * @param acceptedResponseStatusCodes If present, the check will only pass if the HTTP response status code is in this set of status codes. If empty, the HTTP status code will only pass if the HTTP status code is 200-299.
     *  Structure is documented below.
     * @return builder
     */
    def acceptedResponseStatusCodes(args: Endofunction[com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckAcceptedResponseStatusCodeArgs.Builder]*):
        com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckArgs.Builder =
      def argsBuilder = com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckAcceptedResponseStatusCodeArgs.builder
      builder.acceptedResponseStatusCodes(args.map(_(argsBuilder).build)*)

    /**
     * @param authInfo The authentication information using username and password. Optional when creating an HTTP check; defaults to empty. Do not use with other authentication fields.
     *  Structure is documented below.
     * @return builder
     */
    def authInfo(args: Endofunction[com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckAuthInfoArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckAuthInfoArgs.builder
      builder.authInfo(args(argsBuilder).build)

    /**
     * @param pingConfig Contains information needed to add pings to an HTTP check.
     *  Structure is documented below.
     * @return builder
     */
    def pingConfig(args: Endofunction[com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckPingConfigArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckPingConfigArgs.builder
      builder.pingConfig(args(argsBuilder).build)

    /**
     * @param serviceAgentAuthentication The authentication information using the Monitoring Service Agent. Optional when creating an HTTPS check; defaults to empty. Do not use with other authentication fields.
     *  Structure is documented below.
     * @return builder
     */
    def serviceAgentAuthentication(args: Endofunction[com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckServiceAgentAuthenticationArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckServiceAgentAuthenticationArgs.builder
      builder.serviceAgentAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.SloState.Builder)
    /**
     * @param basicSli Basic Service-Level Indicator (SLI) on a well-known service type.
     *  Performance will be computed on the basis of pre-defined metrics.
     *  SLIs are used to measure and calculate the quality of the Service&#39;s
     *  performance with respect to a single aspect of service quality.
     *  Exactly one of the following must be set:
     *  `basicSli`, `requestBasedSli`, `windowsBasedSli`
     *  Structure is documented below.
     * @return builder
     */
    def basicSli(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloBasicSliArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.SloState.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloBasicSliArgs.builder
      builder.basicSli(args(argsBuilder).build)

    /**
     * @param requestBasedSli A request-based SLI defines a SLI for which atomic units of
     *  service are counted directly.
     *  A SLI describes a good service.
     *  It is used to measure and calculate the quality of the Service&#39;s
     *  performance with respect to a single aspect of service quality.
     *  Exactly one of the following must be set:
     *  `basicSli`, `requestBasedSli`, `windowsBasedSli`
     *  Structure is documented below.
     * @return builder
     */
    def requestBasedSli(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloRequestBasedSliArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.SloState.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloRequestBasedSliArgs.builder
      builder.requestBasedSli(args(argsBuilder).build)

    /**
     * @param windowsBasedSli A windows-based SLI defines the criteria for time windows.
     *  goodService is defined based off the count of these time windows
     *  for which the provided service was of good quality.
     *  A SLI describes a good service. It is used to measure and calculate
     *  the quality of the Service&#39;s performance with respect to a single
     *  aspect of service quality.
     *  Exactly one of the following must be set:
     *  `basicSli`, `requestBasedSli`, `windowsBasedSli`
     *  Structure is documented below.
     * @return builder
     */
    def windowsBasedSli(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.SloState.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliArgs.builder
      builder.windowsBasedSli(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.SloBasicSliArgs.Builder)
    /**
     * @param availability Availability based SLI, dervied from count of requests made to this service that return successfully.
     *  Structure is documented below.
     * @return builder
     */
    def availability(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloBasicSliAvailabilityArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.SloBasicSliArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloBasicSliAvailabilityArgs.builder
      builder.availability(args(argsBuilder).build)

    /**
     * @param latency Parameters for a latency threshold SLI.
     *  Structure is documented below.
     * @return builder
     */
    def latency(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloBasicSliLatencyArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.SloBasicSliArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloBasicSliLatencyArgs.builder
      builder.latency(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigState.Builder)
    /**
     * @param contentMatchers The expected content on the page the check is run against. Currently, only the first entry in the list is supported, and other entries will be ignored. The server will look for an exact match of the string in the page response&#39;s content. This field is optional and should only be specified if a content match is required.
     *  Structure is documented below.
     * @return builder
     */
    def contentMatchers(args: Endofunction[com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigContentMatcherArgs.Builder]*):
        com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigContentMatcherArgs.builder
      builder.contentMatchers(args.map(_(argsBuilder).build)*)

    /**
     * @param httpCheck Contains information needed to make an HTTP or HTTPS check.
     *  Structure is documented below.
     * @return builder
     */
    def httpCheck(args: Endofunction[com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckArgs.builder
      builder.httpCheck(args(argsBuilder).build)

    /**
     * @param monitoredResource The [monitored resource](https://cloud.google.com/monitoring/api/resources) associated with the
     *  configuration. The following monitored resource types are supported for
     *  uptime checks:
     * @return builder
     */
    def monitoredResource(args: Endofunction[com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigMonitoredResourceArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigMonitoredResourceArgs.builder
      builder.monitoredResource(args(argsBuilder).build)

    /**
     * @param resourceGroup The group resource associated with the configuration.
     *  Structure is documented below.
     * @return builder
     */
    def resourceGroup(args: Endofunction[com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigResourceGroupArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigResourceGroupArgs.builder
      builder.resourceGroup(args(argsBuilder).build)

    /**
     * @param syntheticMonitor A Synthetic Monitor deployed to a Cloud Functions V2 instance.
     *  Structure is documented below.
     * @return builder
     */
    def syntheticMonitor(args: Endofunction[com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigSyntheticMonitorArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigSyntheticMonitorArgs.builder
      builder.syntheticMonitor(args(argsBuilder).build)

    /**
     * @param tcpCheck Contains information needed to make a TCP check.
     *  Structure is documented below.
     * @return builder
     */
    def tcpCheck(args: Endofunction[com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigTcpCheckArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigTcpCheckArgs.builder
      builder.tcpCheck(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.SloRequestBasedSliDistributionCutArgs.Builder)
    /**
     * @param range Range of numerical values. The computed goodService
     *  will be the count of values x in the Distribution such
     *  that range.min &lt;= x &lt;= range.max. inclusive of min and
     *  max. Open ranges can be defined by setting
     *  just one of min or max.
     *  Structure is documented below.
     * @return builder
     */
    def range(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloRequestBasedSliDistributionCutRangeArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.SloRequestBasedSliDistributionCutArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloRequestBasedSliDistributionCutRangeArgs.builder
      builder.range(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionAbsentArgs.Builder)
    /**
     * @param aggregations Specifies the alignment of data points in
     *  individual time series as well as how to
     *  combine the retrieved time series together
     *  (such as when aggregating multiple streams
     *  on each resource to a single stream for each
     *  resource or when aggregating streams across
     *  all members of a group of resources).
     *  Multiple aggregations are applied in the
     *  order specified.
     *  Structure is documented below.
     * @return builder
     */
    def aggregations(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionAbsentAggregationArgs.Builder]*):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionAbsentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionAbsentAggregationArgs.builder
      builder.aggregations(args.map(_(argsBuilder).build)*)

    /**
     * @param trigger The number/percent of time series for which
     *  the comparison must hold in order for the
     *  condition to trigger. If unspecified, then
     *  the condition will trigger if the comparison
     *  is true for any of the time series that have
     *  been identified by filter and aggregations.
     *  Structure is documented below.
     * @return builder
     */
    def trigger(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionAbsentTriggerArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionAbsentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionAbsentTriggerArgs.builder
      builder.trigger(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.AlertPolicyDocumentationArgs.Builder)
    /**
     * @param links Links to content such as playbooks, repositories, and other resources. This field can contain up to 3 entries.
     *  Structure is documented below.
     * @return builder
     */
    def links(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyDocumentationLinkArgs.Builder]*):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyDocumentationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyDocumentationLinkArgs.builder
      builder.links(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigSyntheticMonitorArgs.Builder)
    /**
     * @param cloudFunctionV2 Target a Synthetic Monitor GCFv2 Instance
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedSyntheticMonitorCloudFunctionV2&#34;&gt;&lt;/a&gt;The `cloudFunctionV2` block supports:
     * @return builder
     */
    def cloudFunctionV2(args: Endofunction[com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigSyntheticMonitorCloudFunctionV2Args.Builder]):
        com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigSyntheticMonitorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigSyntheticMonitorCloudFunctionV2Args.builder
      builder.cloudFunctionV2(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionArgs.Builder)
    /**
     * @param conditionAbsent A condition that checks that a time series
     *  continues to receive new data points.
     *  Structure is documented below.
     * @return builder
     */
    def conditionAbsent(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionAbsentArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionAbsentArgs.builder
      builder.conditionAbsent(args(argsBuilder).build)

    /**
     * @param conditionMatchedLog A condition that checks for log messages matching given constraints.
     *  If set, no other conditions can be present.
     *  Structure is documented below.
     * @return builder
     */
    def conditionMatchedLog(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionMatchedLogArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionMatchedLogArgs.builder
      builder.conditionMatchedLog(args(argsBuilder).build)

    /**
     * @param conditionMonitoringQueryLanguage A Monitoring Query Language query that outputs a boolean stream
     *  Structure is documented below.
     * @return builder
     */
    def conditionMonitoringQueryLanguage(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionMonitoringQueryLanguageArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionMonitoringQueryLanguageArgs.builder
      builder.conditionMonitoringQueryLanguage(args(argsBuilder).build)

    /**
     * @param conditionPrometheusQueryLanguage A condition type that allows alert policies to be defined using
     *  Prometheus Query Language (PromQL).
     *  The PrometheusQueryLanguageCondition message contains information
     *  from a Prometheus alerting rule and its associated rule group.
     *  Structure is documented below.
     * @return builder
     */
    def conditionPrometheusQueryLanguage(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionPrometheusQueryLanguageArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionPrometheusQueryLanguageArgs.builder
      builder.conditionPrometheusQueryLanguage(args(argsBuilder).build)

    /**
     * @param conditionSql A condition that allows alerting policies to be defined using GoogleSQL.
     *  SQL conditions examine a sliding window of logs using GoogleSQL.
     *  Alert policies with SQL conditions may incur additional billing.
     *  Structure is documented below.
     * @return builder
     */
    def conditionSql(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionSqlArgs.builder
      builder.conditionSql(args(argsBuilder).build)

    /**
     * @param conditionThreshold A condition that compares a time series against a
     *  threshold.
     *  Structure is documented below.
     * @return builder
     */
    def conditionThreshold(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdArgs.builder
      builder.conditionThreshold(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliArgs.Builder)
    /**
     * @param goodTotalRatioThreshold Criterion that describes a window as good if its performance is
     *  high enough. One of `goodBadMetricFilter`,
     *  `goodTotalRatioThreshold`, `metricMeanInRange`,
     *  `metricSumInRange` must be set for `windowsBasedSli`.
     *  Structure is documented below.
     * @return builder
     */
    def goodTotalRatioThreshold(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdArgs.builder
      builder.goodTotalRatioThreshold(args(argsBuilder).build)

    /**
     * @param metricMeanInRange Criterion that describes a window as good if the metric&#39;s value
     *  is in a good range, *averaged* across returned streams.
     *  One of `goodBadMetricFilter`,
     *  `goodTotalRatioThreshold`, `metricMeanInRange`,
     *  `metricSumInRange` must be set for `windowsBasedSli`.
     *  Average value X of `timeSeries` should satisfy
     *  `range.min &lt;= X &lt;= range.max` for a good window.
     *  Structure is documented below.
     * @return builder
     */
    def metricMeanInRange(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliMetricMeanInRangeArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliMetricMeanInRangeArgs.builder
      builder.metricMeanInRange(args(argsBuilder).build)

    /**
     * @param metricSumInRange Criterion that describes a window as good if the metric&#39;s value
     *  is in a good range, *summed* across returned streams.
     *  Summed value `X` of `timeSeries` should satisfy
     *  `range.min &lt;= X &lt;= range.max` for a good window.
     *  One of `goodBadMetricFilter`,
     *  `goodTotalRatioThreshold`, `metricMeanInRange`,
     *  `metricSumInRange` must be set for `windowsBasedSli`.
     *  Structure is documented below.
     * @return builder
     */
    def metricSumInRange(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliMetricSumInRangeArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliMetricSumInRangeArgs.builder
      builder.metricSumInRange(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.AlertPolicyState.Builder)
    /**
     * @param alertStrategy Control over how this alert policy&#39;s notification channels are notified.
     *  Structure is documented below.
     * @return builder
     */
    def alertStrategy(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyAlertStrategyArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyAlertStrategyArgs.builder
      builder.alertStrategy(args(argsBuilder).build)

    /**
     * @param conditions A list of conditions for the policy. The conditions are combined by
     *  AND or OR according to the combiner field. If the combined conditions
     *  evaluate to true, then an incident is created. A policy can have from
     *  one to six conditions.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionArgs.Builder]*):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param creationRecords A read-only record of the creation of the alerting policy.
     *  If provided in a call to create or update, this field will
     *  be ignored.
     *  Structure is documented below.
     * @return builder
     */
    def creationRecords(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyCreationRecordArgs.Builder]*):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyCreationRecordArgs.builder
      builder.creationRecords(args.map(_(argsBuilder).build)*)

    /**
     * @param documentation Documentation that is included with notifications and incidents related
     *  to this policy. Best practice is for the documentation to include information
     *  to help responders understand, mitigate, escalate, and correct the underlying
     *  problems detected by the alerting policy. Notification channels that have
     *  limited capacity might not show this documentation.
     *  Structure is documented below.
     * @return builder
     */
    def documentation(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyDocumentationArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyDocumentationArgs.builder
      builder.documentation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.AlertPolicyAlertStrategyArgs.Builder)
    /**
     * @param notificationChannelStrategies Control over how the notification channels in `notificationChannels`
     *  are notified when this alert fires, on a per-channel basis.
     *  Structure is documented below.
     * @return builder
     */
    def notificationChannelStrategies(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyAlertStrategyNotificationChannelStrategyArgs.Builder]*):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyAlertStrategyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyAlertStrategyNotificationChannelStrategyArgs.builder
      builder.notificationChannelStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param notificationRateLimit Required for alert policies with a LogMatch condition.
     *  This limit is not implemented for alert policies that are not log-based.
     *  Structure is documented below.
     * @return builder
     */
    def notificationRateLimit(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyAlertStrategyNotificationRateLimitArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyAlertStrategyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyAlertStrategyNotificationRateLimitArgs.builder
      builder.notificationRateLimit(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdArgs.Builder)
    /**
     * @param aggregations Specifies the alignment of data points in
     *  individual time series as well as how to
     *  combine the retrieved time series together
     *  (such as when aggregating multiple streams
     *  on each resource to a single stream for each
     *  resource or when aggregating streams across
     *  all members of a group of resources).
     *  Multiple aggregations are applied in the
     *  order specified.This field is similar to the
     *  one in the MetricService.ListTimeSeries
     *  request. It is advisable to use the
     *  ListTimeSeries method when debugging this
     *  field.
     *  Structure is documented below.
     * @return builder
     */
    def aggregations(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdAggregationArgs.Builder]*):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdArgs.Builder =
      def argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdAggregationArgs.builder
      builder.aggregations(args.map(_(argsBuilder).build)*)

    /**
     * @param denominatorAggregations Specifies the alignment of data points in
     *  individual time series selected by
     *  denominatorFilter as well as how to combine
     *  the retrieved time series together (such as
     *  when aggregating multiple streams on each
     *  resource to a single stream for each
     *  resource or when aggregating streams across
     *  all members of a group of resources).When
     *  computing ratios, the aggregations and
     *  denominatorAggregations fields must use the
     *  same alignment period and produce time
     *  series that have the same periodicity and
     *  labels.This field is similar to the one in
     *  the MetricService.ListTimeSeries request. It
     *  is advisable to use the ListTimeSeries
     *  method when debugging this field.
     *  Structure is documented below.
     * @return builder
     */
    def denominatorAggregations(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdDenominatorAggregationArgs.Builder]*):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdArgs.Builder =
      def argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdDenominatorAggregationArgs.builder
      builder.denominatorAggregations(args.map(_(argsBuilder).build)*)

    /**
     * @param forecastOptions When this field is present, the `MetricThreshold`
     *  condition forecasts whether the time series is
     *  predicted to violate the threshold within the
     *  `forecastHorizon`. When this field is not set, the
     *  `MetricThreshold` tests the current value of the
     *  timeseries against the threshold.
     *  Structure is documented below.
     * @return builder
     */
    def forecastOptions(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdForecastOptionsArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdForecastOptionsArgs.builder
      builder.forecastOptions(args(argsBuilder).build)

    /**
     * @param trigger The number/percent of time series for which
     *  the comparison must hold in order for the
     *  condition to trigger. If unspecified, then
     *  the condition will trigger if the comparison
     *  is true for any of the time series that have
     *  been identified by filter and aggregations,
     *  or by the ratio, if denominatorFilter and
     *  denominatorAggregations are specified.
     *  Structure is documented below.
     * @return builder
     */
    def trigger(args: Endofunction[com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdTriggerArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdTriggerArgs.builder
      builder.trigger(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.SloRequestBasedSliArgs.Builder)
    /**
     * @param distributionCut Used when goodService is defined by a count of values aggregated in a
     *  Distribution that fall into a good range. The totalService is the
     *  total count of all values aggregated in the Distribution.
     *  Defines a distribution TimeSeries filter and thresholds used for
     *  measuring good service and total service.
     *  Exactly one of `distributionCut` or `goodTotalRatio` can be set.
     *  Structure is documented below.
     * @return builder
     */
    def distributionCut(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloRequestBasedSliDistributionCutArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.SloRequestBasedSliArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloRequestBasedSliDistributionCutArgs.builder
      builder.distributionCut(args(argsBuilder).build)

    /**
     * @param goodTotalRatio A means to compute a ratio of `goodService` to `totalService`.
     *  Defines computing this ratio with two TimeSeries [monitoring filters](https://cloud.google.com/monitoring/api/v3/filters)
     *  Must specify exactly two of good, bad, and total service filters.
     *  The relationship goodService + badService = totalService
     *  will be assumed.
     *  Exactly one of `distributionCut` or `goodTotalRatio` can be set.
     *  Structure is documented below.
     * @return builder
     */
    def goodTotalRatio(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloRequestBasedSliGoodTotalRatioArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.SloRequestBasedSliArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloRequestBasedSliGoodTotalRatioArgs.builder
      builder.goodTotalRatio(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.GenericServiceState.Builder)
    /**
     * @param basicService A well-known service type, defined by its service type and service labels.
     *  Valid values of service types and services labels are described at
     *  https://cloud.google.com/stackdriver/docs/solutions/slo-monitoring/api/api-structures#basic-svc-w-basic-sli
     *  Structure is documented below.
     * @return builder
     */
    def basicService(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GenericServiceBasicServiceArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.GenericServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GenericServiceBasicServiceArgs.builder
      builder.basicService(args(argsBuilder).build)

    /**
     * @param telemetries Configuration for how to query telemetry on a Service.
     *  Structure is documented below.
     * @return builder
     */
    def telemetries(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GenericServiceTelemetryArgs.Builder]*):
        com.pulumi.gcp.monitoring.inputs.GenericServiceState.Builder =
      def argsBuilder = com.pulumi.gcp.monitoring.inputs.GenericServiceTelemetryArgs.builder
      builder.telemetries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.monitoring.inputs.NotificationChannelState.Builder)
    /**
     * @param sensitiveLabels Different notification type behaviors are configured primarily using the the `labels` field on this
     *  resource. This block contains the labels which contain secrets or passwords so that they can be marked
     *  sensitive and hidden from plan output. The name of the field, eg: password, will be the key
     *  in the `labels` map in the api request.
     *  Credentials may not be specified in both locations and will cause an error. Changing from one location
     *  to a different credential configuration in the config will require an apply to update state.
     *  Structure is documented below.
     * @return builder
     */
    def sensitiveLabels(args: Endofunction[com.pulumi.gcp.monitoring.inputs.NotificationChannelSensitiveLabelsArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.NotificationChannelState.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.NotificationChannelSensitiveLabelsArgs.builder
      builder.sensitiveLabels(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigTcpCheckArgs.Builder)
    /**
     * @param pingConfig Contains information needed to add pings to a TCP check.
     *  Structure is documented below.
     * @return builder
     */
    def pingConfig(args: Endofunction[com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigTcpCheckPingConfigArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigTcpCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigTcpCheckPingConfigArgs.builder
      builder.pingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdArgs.Builder)
    /**
     * @param basicSliPerformance Basic SLI to evaluate to judge window quality.
     *  Structure is documented below.
     * @return builder
     */
    def basicSliPerformance(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceArgs.builder
      builder.basicSliPerformance(args(argsBuilder).build)

    /**
     * @param performance Request-based SLI to evaluate to judge window quality.
     *  Structure is documented below.
     * @return builder
     */
    def performance(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs.builder
      builder.performance(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliMetricMeanInRangeArgs.Builder)
    /**
     * @param range Range of numerical values. The computed goodService
     *  will be the count of values x in the Distribution such
     *  that range.min &lt;= x &lt;= range.max. inclusive of min and
     *  max. Open ranges can be defined by setting
     *  just one of min or max. Mean value `X` of `timeSeries`
     *  values should satisfy `range.min &lt;= X &lt;= range.max` for a
     *  good service.
     *  Structure is documented below.
     * @return builder
     */
    def range(args: Endofunction[com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliMetricMeanInRangeRangeArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliMetricMeanInRangeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliMetricMeanInRangeRangeArgs.builder
      builder.range(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.monitoring.inputs.MetricDescriptorState.Builder)
    /**
     * @param labels The set of labels that can be used to describe a specific instance of this metric type. In order to delete a label, the entire resource must be deleted, then created with the desired labels.
     *  Structure is documented below.
     * @return builder
     */
    def labels(args: Endofunction[com.pulumi.gcp.monitoring.inputs.MetricDescriptorLabelArgs.Builder]*):
        com.pulumi.gcp.monitoring.inputs.MetricDescriptorState.Builder =
      def argsBuilder = com.pulumi.gcp.monitoring.inputs.MetricDescriptorLabelArgs.builder
      builder.labels(args.map(_(argsBuilder).build)*)

    /**
     * @param metadata Metadata which can be used to guide usage of the metric.
     *  Structure is documented below.
     * @return builder
     */
    def metadata(args: Endofunction[com.pulumi.gcp.monitoring.inputs.MetricDescriptorMetadataArgs.Builder]):
        com.pulumi.gcp.monitoring.inputs.MetricDescriptorState.Builder =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.MetricDescriptorMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)
