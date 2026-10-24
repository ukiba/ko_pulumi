package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object monitoring:
  /**
   * A description of the conditions under which some aspect of your system is
   * considered to be &#34;unhealthy&#34; and the ways to notify people or services
   * about this state.
   * 
   * To get more information about AlertPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.alertPolicies)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/monitoring/alerts/)
   */
  def AlertPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.monitoring.AlertPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.monitoring.AlertPolicyArgs.builder
    com.pulumi.gcp.monitoring.AlertPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Service is a discrete, autonomous, and network-accessible unit,
   * designed to solve an individual concern. In Cloud Monitoring,
   * a Service acts as the root resource under which operational aspects of
   * the service are accessible
   * 
   * To get more information about Service, see:
   * 
   * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
   * * How-to Guides
   *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
   *     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
   *     * [Service-orientation on Wikipedia](https://en.wikipedia.org/wiki/Service-orientation)
   */
  def CustomService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.monitoring.CustomServiceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.monitoring.CustomServiceArgs.builder
    com.pulumi.gcp.monitoring.CustomService(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Google Stackdriver dashboard. Dashboards define the content and layout of pages in the Stackdriver web application.
   * 
   * To get more information about Dashboards, see:
   * 
   * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v1/projects.dashboards)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/monitoring/dashboards)
   */
  def Dashboard(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.monitoring.DashboardArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.monitoring.DashboardArgs.builder
    com.pulumi.gcp.monitoring.Dashboard(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Service is a discrete, autonomous, and network-accessible unit,
   * designed to solve an individual concern. In Cloud Monitoring,
   * a Service acts as the root resource under which operational aspects of
   * the service are accessible
   * 
   * To get more information about GenericService, see:
   * 
   * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
   * * How-to Guides
   *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
   *     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
   *     * [Service-orientation on Wikipedia](https://en.wikipedia.org/wiki/Service-orientation)
   */
  def GenericService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.monitoring.GenericServiceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.monitoring.GenericServiceArgs.builder
    com.pulumi.gcp.monitoring.GenericService(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The description of a dynamic collection of monitored resources. Each group
   * has a filter that is matched against monitored resources and their
   * associated metadata. If a group&#39;s filter matches an available monitored
   * resource, then that resource is a member of that group.
   * 
   * To get more information about Group, see:
   * 
   * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.groups)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/monitoring/groups/)
   */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.monitoring.GroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.monitoring.GroupArgs.builder
    com.pulumi.gcp.monitoring.Group(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Defines a metric type and its schema. Once a metric descriptor is created, deleting or altering it stops data collection and makes the metric type&#39;s existing data unusable.
   * 
   * To get more information about MetricDescriptor, see:
   * 
   * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/monitoring/custom-metrics/)
   */
  def MetricDescriptor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.monitoring.MetricDescriptorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.monitoring.MetricDescriptorArgs.builder
    com.pulumi.gcp.monitoring.MetricDescriptor(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A [project being monitored](https://cloud.google.com/monitoring/settings/multiple-projects#create-multi) by a Metrics Scope.
   * 
   * To get more information about MonitoredProject, see:
   * 
   * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v1/locations.global.metricsScopes.projects)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/monitoring/settings/manage-api)
   */
  def MonitoredProject(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.monitoring.MonitoredProjectArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.monitoring.MonitoredProjectArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.monitoring.MonitoredProject(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object MonitoringFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * A Monitoring Service is the root resource under which operational aspects of a
     * generic service are accessible. A service is some discrete, autonomous, and
     * network-accessible unit, designed to solve an individual concern
     * 
     * An App Engine monitoring service is automatically created by GCP to monitor
     * App Engine services.
     * 
     * To get more information about Service, see:
     * 
     * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
     * * How-to Guides
     *     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
     *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     */
    inline def getAppEngineService(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetAppEngineServiceArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.monitoring.outputs.GetAppEngineServiceResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetAppEngineServiceArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getAppEngineService(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * A Monitoring Service is the root resource under which operational aspects of a
     * generic service are accessible. A service is some discrete, autonomous, and
     * network-accessible unit, designed to solve an individual concern
     * 
     * An App Engine monitoring service is automatically created by GCP to monitor
     * App Engine services.
     * 
     * To get more information about Service, see:
     * 
     * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
     * * How-to Guides
     *     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
     *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     */
    inline def getAppEngineServicePlain(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetAppEngineServicePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.monitoring.outputs.GetAppEngineServiceResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetAppEngineServicePlainArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getAppEngineServicePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * A Monitoring Service is the root resource under which operational aspects of a
     * generic service are accessible. A service is some discrete, autonomous, and
     * network-accessible unit, designed to solve an individual concern
     * 
     * An Cluster Istio monitoring service is automatically created by GCP to monitor
     * Cluster Istio services.
     * 
     * To get more information about Service, see:
     * 
     * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
     * * How-to Guides
     *     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
     *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     */
    inline def getClusterIstioService(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetClusterIstioServiceArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.monitoring.outputs.GetClusterIstioServiceResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetClusterIstioServiceArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getClusterIstioService(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * A Monitoring Service is the root resource under which operational aspects of a
     * generic service are accessible. A service is some discrete, autonomous, and
     * network-accessible unit, designed to solve an individual concern
     * 
     * An Cluster Istio monitoring service is automatically created by GCP to monitor
     * Cluster Istio services.
     * 
     * To get more information about Service, see:
     * 
     * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
     * * How-to Guides
     *     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
     *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     */
    inline def getClusterIstioServicePlain(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetClusterIstioServicePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.monitoring.outputs.GetClusterIstioServiceResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetClusterIstioServicePlainArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getClusterIstioServicePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * A Monitoring Service is the root resource under which operational aspects of a
     * generic service are accessible. A service is some discrete, autonomous, and
     * network-accessible unit, designed to solve an individual concern
     * 
     * A monitoring Istio Canonical Service is automatically created by GCP to monitor
     * Istio Canonical Services.
     * 
     * To get more information about Service, see:
     * 
     * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
     * * How-to Guides
     *     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
     *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     */
    inline def getIstioCanonicalService(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetIstioCanonicalServiceArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.monitoring.outputs.GetIstioCanonicalServiceResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetIstioCanonicalServiceArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getIstioCanonicalService(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * A Monitoring Service is the root resource under which operational aspects of a
     * generic service are accessible. A service is some discrete, autonomous, and
     * network-accessible unit, designed to solve an individual concern
     * 
     * A monitoring Istio Canonical Service is automatically created by GCP to monitor
     * Istio Canonical Services.
     * 
     * To get more information about Service, see:
     * 
     * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
     * * How-to Guides
     *     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
     *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     */
    inline def getIstioCanonicalServicePlain(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetIstioCanonicalServicePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.monitoring.outputs.GetIstioCanonicalServiceResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetIstioCanonicalServicePlainArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getIstioCanonicalServicePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * A Monitoring Service is the root resource under which operational aspects of a
     * generic service are accessible. A service is some discrete, autonomous, and
     * network-accessible unit, designed to solve an individual concern
     * 
     * An Mesh Istio monitoring service is automatically created by GCP to monitor
     * Mesh Istio services.
     * 
     * To get more information about Service, see:
     * 
     * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
     * * How-to Guides
     *     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
     *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     */
    inline def getMeshIstioService(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetMeshIstioServiceArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.monitoring.outputs.GetMeshIstioServiceResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetMeshIstioServiceArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getMeshIstioService(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * A Monitoring Service is the root resource under which operational aspects of a
     * generic service are accessible. A service is some discrete, autonomous, and
     * network-accessible unit, designed to solve an individual concern
     * 
     * An Mesh Istio monitoring service is automatically created by GCP to monitor
     * Mesh Istio services.
     * 
     * To get more information about Service, see:
     * 
     * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
     * * How-to Guides
     *     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
     *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     */
    inline def getMeshIstioServicePlain(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetMeshIstioServicePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.monitoring.outputs.GetMeshIstioServiceResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetMeshIstioServicePlainArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getMeshIstioServicePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * A NotificationChannel is a medium through which an alert is delivered
     * when a policy violation is detected. Examples of channels include email, SMS,
     * and third-party messaging applications. Fields containing sensitive information
     * like authentication tokens or contact info are only partially populated on retrieval.
     * 
     * To get more information about NotificationChannel, see:
     * 
     * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannels)
     * * How-to Guides
     *     * [Notification Options](https://cloud.google.com/monitoring/support/notification-options)
     *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     */
    inline def getNotificationChannel(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetNotificationChannelArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.monitoring.outputs.GetNotificationChannelResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetNotificationChannelArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getNotificationChannel(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * A NotificationChannel is a medium through which an alert is delivered
     * when a policy violation is detected. Examples of channels include email, SMS,
     * and third-party messaging applications. Fields containing sensitive information
     * like authentication tokens or contact info are only partially populated on retrieval.
     * 
     * To get more information about NotificationChannel, see:
     * 
     * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannels)
     * * How-to Guides
     *     * [Notification Options](https://cloud.google.com/monitoring/support/notification-options)
     *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     */
    inline def getNotificationChannelPlain(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetNotificationChannelPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.monitoring.outputs.GetNotificationChannelResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetNotificationChannelPlainArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getNotificationChannelPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Get the value and metadata from a Secret Manager secret version. For more information see the [official documentation](https://cloud.google.com/secret-manager/docs/) and [API](https://cloud.google.com/secret-manager/docs/reference/rest/v1/projects.secrets.versions). If you don&#39;t need the metadata (i.e., if you want to use a more limited role to access the secret version only), see also the gcp.secretmanager.getSecretVersionAccess datasource. */
    @deprecated("gcp.monitoring.getSecretVersion has been deprecated in favor of gcp.secretmanager.getSecretVersion") inline def getSecretVersion(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetSecretVersionArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.monitoring.outputs.GetSecretVersionResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetSecretVersionArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getSecretVersion(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get the value and metadata from a Secret Manager secret version. For more information see the [official documentation](https://cloud.google.com/secret-manager/docs/) and [API](https://cloud.google.com/secret-manager/docs/reference/rest/v1/projects.secrets.versions). If you don&#39;t need the metadata (i.e., if you want to use a more limited role to access the secret version only), see also the gcp.secretmanager.getSecretVersionAccess datasource. */
    @deprecated("gcp.monitoring.getSecretVersion has been deprecated in favor of gcp.secretmanager.getSecretVersion") inline def getSecretVersionPlain(args: Endofunction[com.pulumi.gcp.monitoring.inputs.GetSecretVersionPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.monitoring.outputs.GetSecretVersionResult] =
      val argsBuilder = com.pulumi.gcp.monitoring.inputs.GetSecretVersionPlainArgs.builder
      com.pulumi.gcp.monitoring.MonitoringFunctions.getSecretVersionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * A NotificationChannel is a medium through which an alert is delivered
   * when a policy violation is detected. Examples of channels include email, SMS,
   * and third-party messaging applications. Fields containing sensitive information
   * like authentication tokens or contact info are only partially populated on retrieval.
   * 
   * Notification Channels are designed to be flexible and are made up of a supported `type`
   * and labels to configure that channel. Each `type` has specific labels that need to be
   * present for that channel to be correctly configured. The labels that are required to be
   * present for one channel `type` are often different than those required for another.
   * Due to these loose constraints it&#39;s often best to set up a channel through the UI
   * and import it to the provider when setting up a brand new channel type to determine which
   * labels are required.
   * 
   * A list of supported channels per project the `list` endpoint can be
   * accessed programmatically or through the api explorer at  https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannelDescriptors/list .
   * This provides the channel type and all of the required labels that must be passed.
   * 
   * To get more information about NotificationChannel, see:
   * 
   * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannels)
   * * How-to Guides
   *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
   *     * [Notification Options](https://cloud.google.com/monitoring/support/notification-options)
   * 
   * &gt; **Note:**  All arguments marked as write-only values will not be stored in the state: `sensitive_labels.auth_token_wo`, `sensitive_labels.password_wo`, `sensitive_labels.service_key_wo`.
   * Read more about Write-only Arguments.
   */
  def NotificationChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.monitoring.NotificationChannelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.monitoring.NotificationChannelArgs.builder
    com.pulumi.gcp.monitoring.NotificationChannel(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Service-Level Objective (SLO) describes the level of desired good
   * service. It consists of a service-level indicator (SLI), a performance
   * goal, and a period over which the objective is to be evaluated against
   * that goal. The SLO can use SLIs defined in a number of different manners.
   * Typical SLOs might include &#34;99% of requests in each rolling week have
   * latency below 200 milliseconds&#34; or &#34;99.5% of requests in each calendar
   * month return successfully.&#34;
   * 
   * To get more information about Slo, see:
   * 
   * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services.serviceLevelObjectives)
   * * How-to Guides
   *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
   *     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
   */
  def Slo(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.monitoring.SloArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.monitoring.SloArgs.builder
    com.pulumi.gcp.monitoring.Slo(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Snooze will prevent any alerts from being opened, and close any that are already open.
   * The Snooze will work on alerts that match the criteria defined in the Snooze.
   * The Snooze will be active from interval.start_time through interval.end_time.
   * 
   * &gt; **Note:** Monitoring Snoozes cannot be deleted from the Google Cloud Platform.
   * Destroying a Terraform-managed Snooze will cancel the snooze and remove it from state but
   * *will not delete the resource from the project.*
   * 
   * To get more information about Snooze, see:
   * 
   * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.snoozes)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/monitoring/alerts/snooze)
   */
  def Snooze(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.monitoring.SnoozeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.monitoring.SnoozeArgs.builder
    com.pulumi.gcp.monitoring.Snooze(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * This message configures which resources and services to monitor for availability.
   * 
   * To get more information about UptimeCheckConfig, see:
   * 
   * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.uptimeCheckConfigs)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/monitoring/uptime-checks/)
   * 
   * &gt; **Note:**  All arguments marked as write-only values will not be stored in the state: `http_check.auth_info.password_wo`.
   * Read more about Write-only Arguments.
   */
  def UptimeCheckConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.monitoring.UptimeCheckConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.monitoring.UptimeCheckConfigArgs.builder
    com.pulumi.gcp.monitoring.UptimeCheckConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
