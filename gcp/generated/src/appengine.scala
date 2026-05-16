package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object appengine:
  extension (builder: com.pulumi.gcp.appengine.ServiceNetworkSettingsArgs.Builder)
    /**
     * @param networkSettings Ingress settings for this service. Will apply to all versions.
     *  Structure is documented below.
     * @return builder
     */
    def networkSettings(args: Endofunction[com.pulumi.gcp.appengine.inputs.ServiceNetworkSettingsNetworkSettingsArgs.Builder]):
        com.pulumi.gcp.appengine.ServiceNetworkSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.ServiceNetworkSettingsNetworkSettingsArgs.builder
      builder.networkSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.appengine.FlexibleAppVersionArgs.Builder)
    /**
     * @param apiConfig Serving configuration for Google Cloud Endpoints.
     *  Structure is documented below.
     * @return builder
     */
    def apiConfig(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionApiConfigArgs.Builder]):
        com.pulumi.gcp.appengine.FlexibleAppVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionApiConfigArgs.builder
      builder.apiConfig(args(argsBuilder).build)

    /**
     * @param automaticScaling Automatic scaling is based on request rate, response latencies, and other application metrics.
     *  Structure is documented below.
     * @return builder
     */
    def automaticScaling(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingArgs.Builder]):
        com.pulumi.gcp.appengine.FlexibleAppVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingArgs.builder
      builder.automaticScaling(args(argsBuilder).build)

    /**
     * @param deployment Code and application artifacts that make up this version.
     *  Structure is documented below.
     * @return builder
     */
    def deployment(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentArgs.Builder]):
        com.pulumi.gcp.appengine.FlexibleAppVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentArgs.builder
      builder.deployment(args(argsBuilder).build)

    /**
     * @param endpointsApiService Code and application artifacts that make up this version.
     *  Structure is documented below.
     * @return builder
     */
    def endpointsApiService(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionEndpointsApiServiceArgs.Builder]):
        com.pulumi.gcp.appengine.FlexibleAppVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionEndpointsApiServiceArgs.builder
      builder.endpointsApiService(args(argsBuilder).build)

    /**
     * @param entrypoint The entrypoint for the application.
     *  Structure is documented below.
     * @return builder
     */
    def entrypoint(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionEntrypointArgs.Builder]):
        com.pulumi.gcp.appengine.FlexibleAppVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionEntrypointArgs.builder
      builder.entrypoint(args(argsBuilder).build)

    /**
     * @param flexibleRuntimeSettings Runtime settings for App Engine flexible environment.
     *  Structure is documented below.
     * @return builder
     */
    def flexibleRuntimeSettings(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionFlexibleRuntimeSettingsArgs.Builder]):
        com.pulumi.gcp.appengine.FlexibleAppVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionFlexibleRuntimeSettingsArgs.builder
      builder.flexibleRuntimeSettings(args(argsBuilder).build)

    /**
     * @param handlers An ordered list of URL-matching patterns that should be applied to incoming requests.
     *  The first matching URL handles the request and other request handlers are not attempted.
     *  Structure is documented below.
     * @return builder
     */
    def handlers(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionHandlerArgs.Builder]*):
        com.pulumi.gcp.appengine.FlexibleAppVersionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionHandlerArgs.builder
      builder.handlers(args.map(_(argsBuilder).build)*)

    /**
     * @param livenessCheck Health checking configuration for VM instances. Unhealthy instances are killed and replaced with new instances.
     *  Structure is documented below.
     * @return builder
     */
    def livenessCheck(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionLivenessCheckArgs.Builder]):
        com.pulumi.gcp.appengine.FlexibleAppVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionLivenessCheckArgs.builder
      builder.livenessCheck(args(argsBuilder).build)

    /**
     * @param manualScaling A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     *  Structure is documented below.
     * @return builder
     */
    def manualScaling(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionManualScalingArgs.Builder]):
        com.pulumi.gcp.appengine.FlexibleAppVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionManualScalingArgs.builder
      builder.manualScaling(args(argsBuilder).build)

    /**
     * @param network Extra network settings
     *  Structure is documented below.
     * @return builder
     */
    def network(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionNetworkArgs.Builder]):
        com.pulumi.gcp.appengine.FlexibleAppVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionNetworkArgs.builder
      builder.network(args(argsBuilder).build)

    /**
     * @param readinessCheck Configures readiness health checking for instances. Unhealthy instances are not put into the backend traffic rotation.
     *  Structure is documented below.
     * @return builder
     */
    def readinessCheck(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionReadinessCheckArgs.Builder]):
        com.pulumi.gcp.appengine.FlexibleAppVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionReadinessCheckArgs.builder
      builder.readinessCheck(args(argsBuilder).build)

    /**
     * @param resources Machine resources for a version.
     *  Structure is documented below.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionResourcesArgs.Builder]):
        com.pulumi.gcp.appengine.FlexibleAppVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionResourcesArgs.builder
      builder.resources(args(argsBuilder).build)

    /**
     * @param vpcAccessConnector Enables VPC connectivity for standard apps.
     *  Structure is documented below.
     * @return builder
     */
    def vpcAccessConnector(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionVpcAccessConnectorArgs.Builder]):
        com.pulumi.gcp.appengine.FlexibleAppVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionVpcAccessConnectorArgs.builder
      builder.vpcAccessConnector(args(argsBuilder).build)

  /**
   * Standard App Version resource to create a new version of standard GAE Application.
   *  Learn about the differences between the standard environment and the flexible environment
   *  at https://cloud.google.com/appengine/docs/the-appengine-environments.
   *  Currently supporting Zip and File Containers.
   * 
   *  To get more information about StandardAppVersion, see:
   * 
   *  * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/appengine/docs/standard)
   */
  def StandardAppVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.appengine.StandardAppVersionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.appengine.StandardAppVersionArgs.builder
    com.pulumi.gcp.appengine.StandardAppVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A single firewall rule that is evaluated against incoming traffic
   *  and provides an action to take on matched requests.
   * 
   *  To get more information about FirewallRule, see:
   * 
   *  * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.firewall.ingressRules)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/appengine/docs/standard/python/creating-firewalls#creating_firewall_rules)
   */
  def FirewallRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.appengine.FirewallRuleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.appengine.FirewallRuleArgs.builder
    com.pulumi.gcp.appengine.FirewallRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Allows creation and management of an App Engine application.
   * 
   *  &gt; App Engine applications cannot be deleted once they&#39;re created; you have to delete the
   *     entire project to delete the application. This provider will report the application has been
   *     successfully deleted; this is a limitation of the provider, and will go away in the future.
   *     This provider is not able to delete App Engine applications.
   */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.appengine.ApplicationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.appengine.ApplicationArgs.builder
    com.pulumi.gcp.appengine.Application(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.appengine.DomainMappingArgs.Builder)
    /**
     * @param sslSettings SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
     *  Structure is documented below.
     * @return builder
     */
    def sslSettings(args: Endofunction[com.pulumi.gcp.appengine.inputs.DomainMappingSslSettingsArgs.Builder]):
        com.pulumi.gcp.appengine.DomainMappingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.DomainMappingSslSettingsArgs.builder
      builder.sslSettings(args(argsBuilder).build)

  object AppengineFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to retrieve the default App Engine service account for the specified project. */
    inline def getDefaultServiceAccount(args: Endofunction[com.pulumi.gcp.appengine.inputs.GetDefaultServiceAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.appengine.outputs.GetDefaultServiceAccountResult] =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.GetDefaultServiceAccountArgs.builder
      com.pulumi.gcp.appengine.AppengineFunctions.getDefaultServiceAccount(args(argsBuilder).build)

    /** Use this data source to retrieve the default App Engine service account for the specified project. */
    inline def getDefaultServiceAccountPlain(args: Endofunction[com.pulumi.gcp.appengine.inputs.GetDefaultServiceAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.appengine.outputs.GetDefaultServiceAccountResult] =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.GetDefaultServiceAccountPlainArgs.builder
      com.pulumi.gcp.appengine.AppengineFunctions.getDefaultServiceAccountPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.appengine.StandardAppVersionArgs.Builder)
    /**
     * @param automaticScaling Automatic scaling is based on request rate, response latencies, and other application metrics.
     *  Structure is documented below.
     * @return builder
     */
    def automaticScaling(args: Endofunction[com.pulumi.gcp.appengine.inputs.StandardAppVersionAutomaticScalingArgs.Builder]):
        com.pulumi.gcp.appengine.StandardAppVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.StandardAppVersionAutomaticScalingArgs.builder
      builder.automaticScaling(args(argsBuilder).build)

    /**
     * @param basicScaling Basic scaling creates instances when your application receives requests. Each instance will be shut down when the application becomes idle. Basic scaling is ideal for work that is intermittent or driven by user activity.
     *  Structure is documented below.
     * @return builder
     */
    def basicScaling(args: Endofunction[com.pulumi.gcp.appengine.inputs.StandardAppVersionBasicScalingArgs.Builder]):
        com.pulumi.gcp.appengine.StandardAppVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.StandardAppVersionBasicScalingArgs.builder
      builder.basicScaling(args(argsBuilder).build)

    /**
     * @param deployment Code and application artifacts that make up this version.
     *  Structure is documented below.
     * @return builder
     */
    def deployment(args: Endofunction[com.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentArgs.Builder]):
        com.pulumi.gcp.appengine.StandardAppVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentArgs.builder
      builder.deployment(args(argsBuilder).build)

    /**
     * @param entrypoint The entrypoint for the application.
     *  Structure is documented below.
     * @return builder
     */
    def entrypoint(args: Endofunction[com.pulumi.gcp.appengine.inputs.StandardAppVersionEntrypointArgs.Builder]):
        com.pulumi.gcp.appengine.StandardAppVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.StandardAppVersionEntrypointArgs.builder
      builder.entrypoint(args(argsBuilder).build)

    /**
     * @param handlers An ordered list of URL-matching patterns that should be applied to incoming requests.
     *  The first matching URL handles the request and other request handlers are not attempted.
     *  Structure is documented below.
     * @return builder
     */
    def handlers(args: Endofunction[com.pulumi.gcp.appengine.inputs.StandardAppVersionHandlerArgs.Builder]*):
        com.pulumi.gcp.appengine.StandardAppVersionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.appengine.inputs.StandardAppVersionHandlerArgs.builder
      builder.handlers(args.map(_(argsBuilder).build)*)

    /**
     * @param libraries Configuration for third-party Python runtime libraries that are required by the application.
     *  Structure is documented below.
     * @return builder
     */
    def libraries(args: Endofunction[com.pulumi.gcp.appengine.inputs.StandardAppVersionLibraryArgs.Builder]*):
        com.pulumi.gcp.appengine.StandardAppVersionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.appengine.inputs.StandardAppVersionLibraryArgs.builder
      builder.libraries(args.map(_(argsBuilder).build)*)

    /**
     * @param manualScaling A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     *  Structure is documented below.
     * @return builder
     */
    def manualScaling(args: Endofunction[com.pulumi.gcp.appengine.inputs.StandardAppVersionManualScalingArgs.Builder]):
        com.pulumi.gcp.appengine.StandardAppVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.StandardAppVersionManualScalingArgs.builder
      builder.manualScaling(args(argsBuilder).build)

    /**
     * @param vpcAccessConnector Enables VPC connectivity for standard apps.
     *  Structure is documented below.
     * @return builder
     */
    def vpcAccessConnector(args: Endofunction[com.pulumi.gcp.appengine.inputs.StandardAppVersionVpcAccessConnectorArgs.Builder]):
        com.pulumi.gcp.appengine.StandardAppVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.StandardAppVersionVpcAccessConnectorArgs.builder
      builder.vpcAccessConnector(args(argsBuilder).build)

  /**
   * Rules to match an HTTP request and dispatch that request to a service.
   * 
   *  To get more information about ApplicationUrlDispatchRules, see:
   * 
   *  * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps#UrlDispatchRule)
   */
  def ApplicationUrlDispatchRules(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.appengine.ApplicationUrlDispatchRulesArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.appengine.ApplicationUrlDispatchRulesArgs.builder
    com.pulumi.gcp.appengine.ApplicationUrlDispatchRules(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A NetworkSettings resource is a container for ingress settings for a version or service.
   * 
   *  To get more information about ServiceNetworkSettings, see:
   * 
   *  * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services)
   */
  def ServiceNetworkSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.appengine.ServiceNetworkSettingsArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.appengine.ServiceNetworkSettingsArgs.builder
    com.pulumi.gcp.appengine.ServiceNetworkSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Traffic routing configuration for versions within a single service. Traffic splits define how traffic directed to the service is assigned to versions.
   * 
   *  To get more information about ServiceSplitTraffic, see:
   * 
   *  * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services)
   */
  def EngineSplitTraffic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.appengine.EngineSplitTrafficArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.appengine.EngineSplitTrafficArgs.builder
    com.pulumi.gcp.appengine.EngineSplitTraffic(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.appengine.ApplicationArgs.Builder)
    /**
     * @param featureSettings A block of optional settings to configure specific App Engine features:
     * @return builder
     */
    def featureSettings(args: Endofunction[com.pulumi.gcp.appengine.inputs.ApplicationFeatureSettingsArgs.Builder]):
        com.pulumi.gcp.appengine.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.ApplicationFeatureSettingsArgs.builder
      builder.featureSettings(args(argsBuilder).build)

    /**
     * @param iap Settings for enabling Cloud Identity Aware Proxy
     * @return builder
     */
    def iap(args: Endofunction[com.pulumi.gcp.appengine.inputs.ApplicationIapArgs.Builder]):
        com.pulumi.gcp.appengine.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.ApplicationIapArgs.builder
      builder.iap(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.appengine.EngineSplitTrafficArgs.Builder)
    /**
     * @param split Mapping that defines fractional HTTP traffic diversion to different versions within the service.
     *  Structure is documented below.
     * @return builder
     */
    def split(args: Endofunction[com.pulumi.gcp.appengine.inputs.EngineSplitTrafficSplitArgs.Builder]):
        com.pulumi.gcp.appengine.EngineSplitTrafficArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.EngineSplitTrafficSplitArgs.builder
      builder.split(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.appengine.ApplicationUrlDispatchRulesArgs.Builder)
    /**
     * @param dispatchRules Rules to match an HTTP request and dispatch that request to a service.
     *  Structure is documented below.
     * @return builder
     */
    def dispatchRules(args: Endofunction[com.pulumi.gcp.appengine.inputs.ApplicationUrlDispatchRulesDispatchRuleArgs.Builder]*):
        com.pulumi.gcp.appengine.ApplicationUrlDispatchRulesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.appengine.inputs.ApplicationUrlDispatchRulesDispatchRuleArgs.builder
      builder.dispatchRules(args.map(_(argsBuilder).build)*)

  /**
   * Flexible App Version resource to create a new version of flexible GAE Application. Based on Google Compute Engine,
   *  the App Engine flexible environment automatically scales your app up and down while also balancing the load.
   *  Learn about the differences between the standard environment and the flexible environment
   *  at https://cloud.google.com/appengine/docs/the-appengine-environments.
   * 
   *  &gt; **Note:** The App Engine flexible environment service account uses the member ID `service-[YOUR_PROJECT_NUMBER]{@literal @}gae-api-prod.google.com.iam.gserviceaccount.com`
   *  It should have the App Engine Flexible Environment Service Agent role, which will be applied when the `appengineflex.googleapis.com` service is enabled.
   * 
   *  To get more information about FlexibleAppVersion, see:
   * 
   *  * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/appengine/docs/flexible)
   */
  def FlexibleAppVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.appengine.FlexibleAppVersionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.appengine.FlexibleAppVersionArgs.builder
    com.pulumi.gcp.appengine.FlexibleAppVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A domain serving an App Engine application.
   * 
   *  To get more information about DomainMapping, see:
   * 
   *  * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.domainMappings)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/appengine/docs/standard/python/mapping-custom-domains)
   */
  def DomainMapping(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.appengine.DomainMappingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.appengine.DomainMappingArgs.builder
    com.pulumi.gcp.appengine.DomainMapping(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.appengine.inputs.FlexibleAppVersionState.Builder)
    /**
     * @param apiConfig Serving configuration for Google Cloud Endpoints.
     *  Structure is documented below.
     * @return builder
     */
    def apiConfig(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionApiConfigArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionApiConfigArgs.builder
      builder.apiConfig(args(argsBuilder).build)

    /**
     * @param automaticScaling Automatic scaling is based on request rate, response latencies, and other application metrics.
     *  Structure is documented below.
     * @return builder
     */
    def automaticScaling(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingArgs.builder
      builder.automaticScaling(args(argsBuilder).build)

    /**
     * @param deployment Code and application artifacts that make up this version.
     *  Structure is documented below.
     * @return builder
     */
    def deployment(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentArgs.builder
      builder.deployment(args(argsBuilder).build)

    /**
     * @param endpointsApiService Code and application artifacts that make up this version.
     *  Structure is documented below.
     * @return builder
     */
    def endpointsApiService(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionEndpointsApiServiceArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionEndpointsApiServiceArgs.builder
      builder.endpointsApiService(args(argsBuilder).build)

    /**
     * @param entrypoint The entrypoint for the application.
     *  Structure is documented below.
     * @return builder
     */
    def entrypoint(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionEntrypointArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionEntrypointArgs.builder
      builder.entrypoint(args(argsBuilder).build)

    /**
     * @param flexibleRuntimeSettings Runtime settings for App Engine flexible environment.
     *  Structure is documented below.
     * @return builder
     */
    def flexibleRuntimeSettings(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionFlexibleRuntimeSettingsArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionFlexibleRuntimeSettingsArgs.builder
      builder.flexibleRuntimeSettings(args(argsBuilder).build)

    /**
     * @param handlers An ordered list of URL-matching patterns that should be applied to incoming requests.
     *  The first matching URL handles the request and other request handlers are not attempted.
     *  Structure is documented below.
     * @return builder
     */
    def handlers(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionHandlerArgs.Builder]*):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionState.Builder =
      def argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionHandlerArgs.builder
      builder.handlers(args.map(_(argsBuilder).build)*)

    /**
     * @param livenessCheck Health checking configuration for VM instances. Unhealthy instances are killed and replaced with new instances.
     *  Structure is documented below.
     * @return builder
     */
    def livenessCheck(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionLivenessCheckArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionLivenessCheckArgs.builder
      builder.livenessCheck(args(argsBuilder).build)

    /**
     * @param manualScaling A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     *  Structure is documented below.
     * @return builder
     */
    def manualScaling(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionManualScalingArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionManualScalingArgs.builder
      builder.manualScaling(args(argsBuilder).build)

    /**
     * @param network Extra network settings
     *  Structure is documented below.
     * @return builder
     */
    def network(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionNetworkArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionNetworkArgs.builder
      builder.network(args(argsBuilder).build)

    /**
     * @param readinessCheck Configures readiness health checking for instances. Unhealthy instances are not put into the backend traffic rotation.
     *  Structure is documented below.
     * @return builder
     */
    def readinessCheck(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionReadinessCheckArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionReadinessCheckArgs.builder
      builder.readinessCheck(args(argsBuilder).build)

    /**
     * @param resources Machine resources for a version.
     *  Structure is documented below.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionResourcesArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionResourcesArgs.builder
      builder.resources(args(argsBuilder).build)

    /**
     * @param vpcAccessConnector Enables VPC connectivity for standard apps.
     *  Structure is documented below.
     * @return builder
     */
    def vpcAccessConnector(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionVpcAccessConnectorArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionVpcAccessConnectorArgs.builder
      builder.vpcAccessConnector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.appengine.inputs.DomainMappingState.Builder)
    /**
     * @param resourceRecords The resource records required to configure this domain mapping. These records must be added to the domain&#39;s DNS
     *  configuration in order to serve the application via this domain mapping.
     *  Structure is documented below.
     * @return builder
     */
    def resourceRecords(args: Endofunction[com.pulumi.gcp.appengine.inputs.DomainMappingResourceRecordArgs.Builder]*):
        com.pulumi.gcp.appengine.inputs.DomainMappingState.Builder =
      def argsBuilder = com.pulumi.gcp.appengine.inputs.DomainMappingResourceRecordArgs.builder
      builder.resourceRecords(args.map(_(argsBuilder).build)*)

    /**
     * @param sslSettings SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
     *  Structure is documented below.
     * @return builder
     */
    def sslSettings(args: Endofunction[com.pulumi.gcp.appengine.inputs.DomainMappingSslSettingsArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.DomainMappingState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.DomainMappingSslSettingsArgs.builder
      builder.sslSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingArgs.Builder)
    /**
     * @param cpuUtilization Target scaling by CPU usage.
     *  Structure is documented below.
     * @return builder
     */
    def cpuUtilization(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingCpuUtilizationArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingCpuUtilizationArgs.builder
      builder.cpuUtilization(args(argsBuilder).build)

    /**
     * @param diskUtilization Target scaling by disk usage.
     *  Structure is documented below.
     * @return builder
     */
    def diskUtilization(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingDiskUtilizationArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingDiskUtilizationArgs.builder
      builder.diskUtilization(args(argsBuilder).build)

    /**
     * @param networkUtilization Target scaling by network usage.
     *  Structure is documented below.
     * @return builder
     */
    def networkUtilization(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingNetworkUtilizationArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingNetworkUtilizationArgs.builder
      builder.networkUtilization(args(argsBuilder).build)

    /**
     * @param requestUtilization Target scaling by request utilization.
     *  Structure is documented below.
     * @return builder
     */
    def requestUtilization(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingRequestUtilizationArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingRequestUtilizationArgs.builder
      builder.requestUtilization(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.appengine.inputs.StandardAppVersionAutomaticScalingArgs.Builder)
    /**
     * @param standardSchedulerSettings Scheduler settings for standard environment.
     *  Structure is documented below.
     * @return builder
     */
    def standardSchedulerSettings(args: Endofunction[com.pulumi.gcp.appengine.inputs.StandardAppVersionAutomaticScalingStandardSchedulerSettingsArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.StandardAppVersionAutomaticScalingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.StandardAppVersionAutomaticScalingStandardSchedulerSettingsArgs.builder
      builder.standardSchedulerSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.appengine.inputs.FlexibleAppVersionResourcesArgs.Builder)
    /**
     * @param volumes List of ports, or port pairs, to forward from the virtual machine to the application container.
     *  Structure is documented below.
     * @return builder
     */
    def volumes(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionResourcesVolumeArgs.Builder]*):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionResourcesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionResourcesVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentArgs.Builder)
    /**
     * @param files Manifest of the files stored in Google Cloud Storage that are included as part of this version.
     *  All files must be readable using the credentials supplied with this call.
     *  Structure is documented below.
     * @return builder
     */
    def files(args: Endofunction[com.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentFileArgs.Builder]*):
        com.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentFileArgs.builder
      builder.files(args.map(_(argsBuilder).build)*)

    /**
     * @param zip Zip File
     *  Structure is documented below.
     * @return builder
     */
    def zip(args: Endofunction[com.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentZipArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentZipArgs.builder
      builder.zip(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.appengine.inputs.ApplicationUrlDispatchRulesState.Builder)
    /**
     * @param dispatchRules Rules to match an HTTP request and dispatch that request to a service.
     *  Structure is documented below.
     * @return builder
     */
    def dispatchRules(args: Endofunction[com.pulumi.gcp.appengine.inputs.ApplicationUrlDispatchRulesDispatchRuleArgs.Builder]*):
        com.pulumi.gcp.appengine.inputs.ApplicationUrlDispatchRulesState.Builder =
      def argsBuilder = com.pulumi.gcp.appengine.inputs.ApplicationUrlDispatchRulesDispatchRuleArgs.builder
      builder.dispatchRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentArgs.Builder)
    /**
     * @param cloudBuildOptions Options for the build operations performed as a part of the version deployment. Only applicable when creating a version using source code directly.
     *  Structure is documented below.
     * @return builder
     */
    def cloudBuildOptions(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentCloudBuildOptionsArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentCloudBuildOptionsArgs.builder
      builder.cloudBuildOptions(args(argsBuilder).build)

    /**
     * @param container The Docker image for the container that runs the version.
     *  Structure is documented below.
     * @return builder
     */
    def container(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentContainerArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentContainerArgs.builder
      builder.container(args(argsBuilder).build)

    /**
     * @param files Manifest of the files stored in Google Cloud Storage that are included as part of this version.
     *  All files must be readable using the credentials supplied with this call.
     *  Structure is documented below.
     * @return builder
     */
    def files(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentFileArgs.Builder]*):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentFileArgs.builder
      builder.files(args.map(_(argsBuilder).build)*)

    /**
     * @param zip Zip File
     *  Structure is documented below.
     * @return builder
     */
    def zip(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentZipArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentZipArgs.builder
      builder.zip(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.appengine.inputs.FlexibleAppVersionHandlerArgs.Builder)
    /**
     * @param script Executes a script to handle the requests that match this URL pattern.
     *  Only the auto value is supported for Node.js in the App Engine standard environment, for example &#34;script:&#34; &#34;auto&#34;.
     *  Structure is documented below.
     * @return builder
     */
    def script(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionHandlerScriptArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionHandlerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionHandlerScriptArgs.builder
      builder.script(args(argsBuilder).build)

    /**
     * @param staticFiles Files served directly to the user for a given URL, such as images, CSS stylesheets, or JavaScript source files.
     *  Static file handlers describe which files in the application directory are static files, and which URLs serve them.
     *  Structure is documented below.
     * @return builder
     */
    def staticFiles(args: Endofunction[com.pulumi.gcp.appengine.inputs.FlexibleAppVersionHandlerStaticFilesArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.FlexibleAppVersionHandlerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.FlexibleAppVersionHandlerStaticFilesArgs.builder
      builder.staticFiles(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.appengine.inputs.ApplicationState.Builder)
    /**
     * @param featureSettings A block of optional settings to configure specific App Engine features:
     * @return builder
     */
    def featureSettings(args: Endofunction[com.pulumi.gcp.appengine.inputs.ApplicationFeatureSettingsArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.ApplicationFeatureSettingsArgs.builder
      builder.featureSettings(args(argsBuilder).build)

    /**
     * @param iap Settings for enabling Cloud Identity Aware Proxy
     * @return builder
     */
    def iap(args: Endofunction[com.pulumi.gcp.appengine.inputs.ApplicationIapArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.ApplicationIapArgs.builder
      builder.iap(args(argsBuilder).build)

    /**
     * @param urlDispatchRules A list of dispatch rule blocks. Each block has a `domain`, `path`, and `service` field.
     * @return builder
     */
    def urlDispatchRules(args: Endofunction[com.pulumi.gcp.appengine.inputs.ApplicationUrlDispatchRuleArgs.Builder]*):
        com.pulumi.gcp.appengine.inputs.ApplicationState.Builder =
      def argsBuilder = com.pulumi.gcp.appengine.inputs.ApplicationUrlDispatchRuleArgs.builder
      builder.urlDispatchRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.appengine.inputs.StandardAppVersionState.Builder)
    /**
     * @param automaticScaling Automatic scaling is based on request rate, response latencies, and other application metrics.
     *  Structure is documented below.
     * @return builder
     */
    def automaticScaling(args: Endofunction[com.pulumi.gcp.appengine.inputs.StandardAppVersionAutomaticScalingArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.StandardAppVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.StandardAppVersionAutomaticScalingArgs.builder
      builder.automaticScaling(args(argsBuilder).build)

    /**
     * @param basicScaling Basic scaling creates instances when your application receives requests. Each instance will be shut down when the application becomes idle. Basic scaling is ideal for work that is intermittent or driven by user activity.
     *  Structure is documented below.
     * @return builder
     */
    def basicScaling(args: Endofunction[com.pulumi.gcp.appengine.inputs.StandardAppVersionBasicScalingArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.StandardAppVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.StandardAppVersionBasicScalingArgs.builder
      builder.basicScaling(args(argsBuilder).build)

    /**
     * @param deployment Code and application artifacts that make up this version.
     *  Structure is documented below.
     * @return builder
     */
    def deployment(args: Endofunction[com.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.StandardAppVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentArgs.builder
      builder.deployment(args(argsBuilder).build)

    /**
     * @param entrypoint The entrypoint for the application.
     *  Structure is documented below.
     * @return builder
     */
    def entrypoint(args: Endofunction[com.pulumi.gcp.appengine.inputs.StandardAppVersionEntrypointArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.StandardAppVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.StandardAppVersionEntrypointArgs.builder
      builder.entrypoint(args(argsBuilder).build)

    /**
     * @param handlers An ordered list of URL-matching patterns that should be applied to incoming requests.
     *  The first matching URL handles the request and other request handlers are not attempted.
     *  Structure is documented below.
     * @return builder
     */
    def handlers(args: Endofunction[com.pulumi.gcp.appengine.inputs.StandardAppVersionHandlerArgs.Builder]*):
        com.pulumi.gcp.appengine.inputs.StandardAppVersionState.Builder =
      def argsBuilder = com.pulumi.gcp.appengine.inputs.StandardAppVersionHandlerArgs.builder
      builder.handlers(args.map(_(argsBuilder).build)*)

    /**
     * @param libraries Configuration for third-party Python runtime libraries that are required by the application.
     *  Structure is documented below.
     * @return builder
     */
    def libraries(args: Endofunction[com.pulumi.gcp.appengine.inputs.StandardAppVersionLibraryArgs.Builder]*):
        com.pulumi.gcp.appengine.inputs.StandardAppVersionState.Builder =
      def argsBuilder = com.pulumi.gcp.appengine.inputs.StandardAppVersionLibraryArgs.builder
      builder.libraries(args.map(_(argsBuilder).build)*)

    /**
     * @param manualScaling A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     *  Structure is documented below.
     * @return builder
     */
    def manualScaling(args: Endofunction[com.pulumi.gcp.appengine.inputs.StandardAppVersionManualScalingArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.StandardAppVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.StandardAppVersionManualScalingArgs.builder
      builder.manualScaling(args(argsBuilder).build)

    /**
     * @param vpcAccessConnector Enables VPC connectivity for standard apps.
     *  Structure is documented below.
     * @return builder
     */
    def vpcAccessConnector(args: Endofunction[com.pulumi.gcp.appengine.inputs.StandardAppVersionVpcAccessConnectorArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.StandardAppVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.StandardAppVersionVpcAccessConnectorArgs.builder
      builder.vpcAccessConnector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.appengine.inputs.EngineSplitTrafficState.Builder)
    /**
     * @param split Mapping that defines fractional HTTP traffic diversion to different versions within the service.
     *  Structure is documented below.
     * @return builder
     */
    def split(args: Endofunction[com.pulumi.gcp.appengine.inputs.EngineSplitTrafficSplitArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.EngineSplitTrafficState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.EngineSplitTrafficSplitArgs.builder
      builder.split(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.appengine.inputs.StandardAppVersionHandlerArgs.Builder)
    /**
     * @param script Executes a script to handle the requests that match this URL pattern.
     *  Only the auto value is supported for Node.js in the App Engine standard environment, for example &#34;script:&#34; &#34;auto&#34;.
     *  Structure is documented below.
     * @return builder
     */
    def script(args: Endofunction[com.pulumi.gcp.appengine.inputs.StandardAppVersionHandlerScriptArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.StandardAppVersionHandlerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.StandardAppVersionHandlerScriptArgs.builder
      builder.script(args(argsBuilder).build)

    /**
     * @param staticFiles Files served directly to the user for a given URL, such as images, CSS stylesheets, or JavaScript source files. Static file handlers describe which files in the application directory are static files, and which URLs serve them.
     *  Structure is documented below.
     * @return builder
     */
    def staticFiles(args: Endofunction[com.pulumi.gcp.appengine.inputs.StandardAppVersionHandlerStaticFilesArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.StandardAppVersionHandlerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.StandardAppVersionHandlerStaticFilesArgs.builder
      builder.staticFiles(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.appengine.inputs.ServiceNetworkSettingsState.Builder)
    /**
     * @param networkSettings Ingress settings for this service. Will apply to all versions.
     *  Structure is documented below.
     * @return builder
     */
    def networkSettings(args: Endofunction[com.pulumi.gcp.appengine.inputs.ServiceNetworkSettingsNetworkSettingsArgs.Builder]):
        com.pulumi.gcp.appengine.inputs.ServiceNetworkSettingsState.Builder =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.ServiceNetworkSettingsNetworkSettingsArgs.builder
      builder.networkSettings(args(argsBuilder).build)
