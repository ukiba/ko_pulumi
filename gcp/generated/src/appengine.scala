package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object appengine:
  object AppengineFunctions:
    /** Use this data source to retrieve the default App Engine service account for the specified project. */
    inline def getDefaultServiceAccount(args: Endofunction[com.pulumi.gcp.appengine.inputs.GetDefaultServiceAccountArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.appengine.outputs.GetDefaultServiceAccountResult] =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.GetDefaultServiceAccountArgs.builder
      com.pulumi.gcp.appengine.AppengineFunctions.getDefaultServiceAccount(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to retrieve the default App Engine service account for the specified project. */
    inline def getDefaultServiceAccountPlain(args: Endofunction[com.pulumi.gcp.appengine.inputs.GetDefaultServiceAccountPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.appengine.outputs.GetDefaultServiceAccountResult] =
      val argsBuilder = com.pulumi.gcp.appengine.inputs.GetDefaultServiceAccountPlainArgs.builder
      com.pulumi.gcp.appengine.AppengineFunctions.getDefaultServiceAccountPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Allows creation and management of an App Engine application.
   * 
   * &gt; App Engine applications cannot be deleted once they&#39;re created; you have to delete the
   *    entire project to delete the application. This provider will report the application has been
   *    successfully deleted; this is a limitation of the provider, and will go away in the future.
   *    This provider is not able to delete App Engine applications.
   * 
   * &gt; **Note:** All arguments marked as write-only values will not be stored in the state: `iap.oauth2_client_secret_wo`.
   * Read more about Write-only Arguments.
   */
  inline def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.appengine.ApplicationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.appengine.ApplicationArgs.builder
    com.pulumi.gcp.appengine.Application(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Rules to match an HTTP request and dispatch that request to a service.
   * 
   * To get more information about ApplicationUrlDispatchRules, see:
   * 
   * * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps#UrlDispatchRule)
   */
  inline def ApplicationUrlDispatchRules(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.appengine.ApplicationUrlDispatchRulesArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.appengine.ApplicationUrlDispatchRulesArgs.builder
    com.pulumi.gcp.appengine.ApplicationUrlDispatchRules(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A domain serving an App Engine application.
   * 
   * To get more information about DomainMapping, see:
   * 
   * * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.domainMappings)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/appengine/docs/standard/python/mapping-custom-domains)
   */
  inline def DomainMapping(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.appengine.DomainMappingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.appengine.DomainMappingArgs.builder
    com.pulumi.gcp.appengine.DomainMapping(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Traffic routing configuration for versions within a single service. Traffic splits define how traffic directed to the service is assigned to versions.
   * 
   * To get more information about ServiceSplitTraffic, see:
   * 
   * * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services)
   */
  inline def EngineSplitTraffic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.appengine.EngineSplitTrafficArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.appengine.EngineSplitTrafficArgs.builder
    com.pulumi.gcp.appengine.EngineSplitTraffic(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A single firewall rule that is evaluated against incoming traffic
   * and provides an action to take on matched requests.
   * 
   * To get more information about FirewallRule, see:
   * 
   * * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.firewall.ingressRules)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/appengine/docs/standard/python/creating-firewalls#creating_firewall_rules)
   */
  inline def FirewallRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.appengine.FirewallRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.appengine.FirewallRuleArgs.builder
    com.pulumi.gcp.appengine.FirewallRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Flexible App Version resource to create a new version of flexible GAE Application. Based on Google Compute Engine,
   * the App Engine flexible environment automatically scales your app up and down while also balancing the load.
   * Learn about the differences between the standard environment and the flexible environment
   * at https://cloud.google.com/appengine/docs/the-appengine-environments.
   * 
   * &gt; **Note:** The App Engine flexible environment service account uses the member ID `service-[YOUR_PROJECT_NUMBER]{@literal @}gae-api-prod.google.com.iam.gserviceaccount.com`
   * It should have the App Engine Flexible Environment Service Agent role, which will be applied when the `appengineflex.googleapis.com` service is enabled.
   * 
   * To get more information about FlexibleAppVersion, see:
   * 
   * * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/appengine/docs/flexible)
   */
  inline def FlexibleAppVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.appengine.FlexibleAppVersionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.appengine.FlexibleAppVersionArgs.builder
    com.pulumi.gcp.appengine.FlexibleAppVersion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A NetworkSettings resource is a container for ingress settings for a version or service.
   * 
   * To get more information about ServiceNetworkSettings, see:
   * 
   * * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services)
   */
  inline def ServiceNetworkSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.appengine.ServiceNetworkSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.appengine.ServiceNetworkSettingsArgs.builder
    com.pulumi.gcp.appengine.ServiceNetworkSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Standard App Version resource to create a new version of standard GAE Application.
   * Learn about the differences between the standard environment and the flexible environment
   * at https://cloud.google.com/appengine/docs/the-appengine-environments.
   * Currently supporting Zip and File Containers.
   * 
   * To get more information about StandardAppVersion, see:
   * 
   * * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/appengine/docs/standard)
   */
  inline def StandardAppVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.appengine.StandardAppVersionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.appengine.StandardAppVersionArgs.builder
    com.pulumi.gcp.appengine.StandardAppVersion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
