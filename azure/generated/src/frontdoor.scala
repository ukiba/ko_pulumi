package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object frontdoor:
  extension (builder: com.pulumi.azure.frontdoor.CustomHttpsConfigurationArgs.Builder)
    /**
     * @param customHttpsConfiguration A `customHttpsConfiguration` block as defined above.
     * @return builder
     */
    def customHttpsConfiguration(args: Endofunction[com.pulumi.azure.frontdoor.inputs.CustomHttpsConfigurationCustomHttpsConfigurationArgs.Builder]):
        com.pulumi.azure.frontdoor.CustomHttpsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.frontdoor.inputs.CustomHttpsConfigurationCustomHttpsConfigurationArgs.builder
      builder.customHttpsConfiguration(args(argsBuilder).build)

  /**
   * !&gt; **Note:** This deploys an Azure Front Door (classic) resource which has been deprecated and will receive security updates only. Please migrate your existing Azure Front Door (classic) deployments to the new Azure Front Door (standard/premium) resources. For your convenience, the service team has exposed a `Front Door Classic` to `Front Door Standard/Premium` [migration tool](https://learn.microsoft.com/azure/frontdoor/tier-migration) to allow you to migrate your existing `Front Door Classic` instances to the new `Front Door Standard/Premium` product tiers.
   * 
   *  !&gt; **Note:** The creation of new Azure Front Door (classic) resources is no longer supported following its deprecation on `April 1, 2025`. However, modifications to existing Azure Front Door (classic) resources will continue to be supported until the API reaches full retirement on `March 31, 2027`.
   * 
   *  Manages an Azure Front Door (classic) Rules Engine configuration and rules.
   */
  def RulesEngine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.frontdoor.RulesEngineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.frontdoor.RulesEngineArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.frontdoor.RulesEngine(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.frontdoor.RulesEngineArgs.Builder)
    /**
     * @param rules A `rule` block as defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.frontdoor.inputs.RulesEngineRuleArgs.Builder]*):
        com.pulumi.azure.frontdoor.RulesEngineArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.RulesEngineRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.frontdoor.FirewallPolicyArgs.Builder)
    /**
     * @param customRules One or more `customRule` blocks as defined below.
     * @return builder
     */
    def customRules(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FirewallPolicyCustomRuleArgs.Builder]*):
        com.pulumi.azure.frontdoor.FirewallPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FirewallPolicyCustomRuleArgs.builder
      builder.customRules(args.map(_(argsBuilder).build)*)

    /**
     * @param managedRules One or more `managedRule` blocks as defined below.
     * @return builder
     */
    def managedRules(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleArgs.Builder]*):
        com.pulumi.azure.frontdoor.FirewallPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleArgs.builder
      builder.managedRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.frontdoor.FirewallPolicyArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * !&gt; **Note:** This deploys an Azure Front Door (classic) resource which has been deprecated and will receive security updates only. Please migrate your existing Azure Front Door (classic) deployments to the new Azure Front Door (standard/premium) resources. For your convenience, the service team has exposed a `Front Door Classic` to `Front Door Standard/Premium` [migration tool](https://learn.microsoft.com/azure/frontdoor/tier-migration) to allow you to migrate your existing `Front Door Classic` instances to the new `Front Door Standard/Premium` product tiers.
   * 
   *  Manages an Azure Front Door (classic) Web Application Firewall Policy instance.
   * 
   *  !&gt; **Note:** Azure rolled out a breaking change on Friday 9th April 2021 which may cause issues with the CDN/FrontDoor resources. More information is available in this GitHub issue - unfortunately this may necessitate a breaking change to the CDN and Front Door resources, more information will be posted in the GitHub issue as the necessary changes are identified.
   * 
   *  !&gt; **Note:** The creation of new Azure Front Door (classic) resources is no longer supported following its deprecation on `April 1, 2025`. However, modifications to existing Azure Front Door (classic) resources will continue to be supported until the API reaches full retirement on `March 31, 2027`.
   */
  def FirewallPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.frontdoor.FirewallPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.frontdoor.FirewallPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.frontdoor.FirewallPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * !&gt; **Note:** This deploys an Azure Front Door (classic) resource which has been deprecated and will receive security updates only. Please migrate your existing Azure Front Door (classic) deployments to the new Azure Front Door (standard/premium) resources. For your convenience, the service team has exposed a `Front Door Classic` to `Front Door Standard/Premium` [migration tool](https://learn.microsoft.com/azure/frontdoor/tier-migration) to allow you to migrate your existing `Front Door Classic` instances to the new `Front Door Standard/Premium` product tiers.
   * 
   *  Manages the Custom HTTPS Configuration for an Azure Front Door (classic) Frontend Endpoint.
   * 
   *  &gt; **Note:** Defining custom HTTPS configurations using a separate `azure.frontdoor.CustomHttpsConfiguration` resource allows for parallel creation/update.
   * 
   *  !&gt; **Note:** In order to address the ordering issue we have changed the design on how to retrieve existing sub resources such as frontend endpoints. Existing design will be deprecated and will result in an incorrect configuration. Please refer to the updated documentation below for more information.
   * 
   *  !&gt; **Note:** The `resourceGroupName` field has been removed as of the `v2.58.0` provider release. If the `resourceGroupName` field has been defined in your current `azure.frontdoor.CustomHttpsConfiguration` resource configuration file please remove it else you will receive a `An argument named &#34;resourceGroupName&#34; is not expected here.` error. If your pre-existing Front Door instance contained inline `customHttpsConfiguration` blocks there are additional steps that will need to be completed to successfully migrate your Front Door onto the `v2.58.0` provider which can be found in this guide.
   * 
   *  !&gt; **Note:** Azure rolled out a breaking change on Friday 9th April 2021 which may cause issues with the CDN/FrontDoor resources. More information is available in this GitHub issue - unfortunately this may necessitate a breaking change to the CDN and Front Door resources, more information will be posted in the GitHub issue as the necessary changes are identified.
   * 
   *  !&gt; **Note:** The creation of new Azure Front Door (classic) resources is no longer supported following its deprecation on `April 1, 2025`. However, modifications to existing Azure Front Door (classic) resources will continue to be supported until the API reaches full retirement on `March 31, 2027`.
   */
  def CustomHttpsConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.frontdoor.CustomHttpsConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.frontdoor.CustomHttpsConfigurationArgs.builder
    com.pulumi.azure.frontdoor.CustomHttpsConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * !&gt; **IMPORTANT** This deploys an Azure Front Door (classic) resource which has been deprecated and will receive security updates only. Please migrate your existing Azure Front Door (classic) deployments to the new Azure Front Door (standard/premium) resources. For your convenience, the service team has exposed a `Front Door Classic` to `Front Door Standard/Premium` [migration tool](https://learn.microsoft.com/azure/frontdoor/tier-migration) to allow you to migrate your existing `Front Door Classic` instances to the new `Front Door Standard/Premium` product tiers.
   * 
   *  Manages an Azure Front Door (classic) instance.
   * 
   *  Azure Front Door Service is Microsoft&#39;s highly available and scalable web application acceleration platform and global HTTP(S) load balancer. It provides built-in DDoS protection and application layer security and caching. Front Door enables you to build applications that maximize and automate high-availability and performance for your end-users. Use Front Door with Azure services including Web/Mobile Apps, Cloud Services and Virtual Machines \u2013 or combine it with on-premises services for hybrid deployments and smooth cloud migration.
   * 
   *  Below are some of the key scenarios that Azure Front Door Service addresses:
   * 
   *  * Use Front Door to improve application scale and availability with instant multi-region failover
   *  * Use Front Door to improve application performance with SSL offload and routing requests to the fastest available application backend.
   *  * Use Front Door for application layer security and DDoS protection for your application.
   * 
   *  !&gt; **Note:** The `customHttpsProvisioningEnabled` field and the `customHttpsConfiguration` block have been removed from the `azure.frontdoor.Frontdoor` resource in the `v2.58.0` provider due to changes made by the service team. If you wish to enable the custom HTTPS configuration functionality within your `azure.frontdoor.Frontdoor` resource moving forward you will need to define a separate `azure.frontdoor.CustomHttpsConfiguration` block in your configuration file.
   * 
   *  !&gt; **Note:** With the release of the `v2.58.0` provider, if you run the `apply` command against an existing Front Door resource it **will not** apply the detected changes. Instead it will persist the `explicitResourceOrder` mapping structure to the state file. Once this operation has completed the resource will resume functioning normally.This change in behavior in Terraform is due to an issue where the underlying service teams API is now returning the response JSON out of order from the way it was sent to the resource via Terraform causing unexpected discrepancies in the `plan` after the resource has been provisioned. If your pre-existing Front Door instance contains `customHttpsConfiguration` blocks there are additional steps that will need to be completed to successfully migrate your Front Door onto the `v2.58.0` provider which can be found in this guide.
   * 
   *  !&gt; **Note:** The creation of new Azure Front Door (classic) resources is no longer supported following its deprecation on `April 1, 2025`. However, modifications to existing Azure Front Door (classic) resources will continue to be supported until the API reaches full retirement on `March 31, 2027`.
   */
  def Frontdoor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.frontdoor.FrontdoorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.frontdoor.FrontdoorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.frontdoor.Frontdoor(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.frontdoor.FrontdoorArgs.Builder)
    /**
     * @param backendPoolHealthProbes A `backendPoolHealthProbe` block as defined below.
     * @return builder
     */
    def backendPoolHealthProbes(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolHealthProbeArgs.Builder]*):
        com.pulumi.azure.frontdoor.FrontdoorArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolHealthProbeArgs.builder
      builder.backendPoolHealthProbes(args.map(_(argsBuilder).build)*)

    /**
     * @param backendPoolLoadBalancings A `backendPoolLoadBalancing` block as defined below.
     * @return builder
     */
    def backendPoolLoadBalancings(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolLoadBalancingArgs.Builder]*):
        com.pulumi.azure.frontdoor.FrontdoorArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolLoadBalancingArgs.builder
      builder.backendPoolLoadBalancings(args.map(_(argsBuilder).build)*)

    /**
     * @param backendPoolSettings A `backendPoolSettings` block as defined below.
     * @return builder
     */
    def backendPoolSettings(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolSettingArgs.Builder]*):
        com.pulumi.azure.frontdoor.FrontdoorArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolSettingArgs.builder
      builder.backendPoolSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param backendPools A `backendPool` block as defined below.
     * 
     *  &gt; Azure by default allows specifying up to 50 Backend Pools - but this quota can be increased via Microsoft Support.
     * @return builder
     */
    def backendPools(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolArgs.Builder]*):
        com.pulumi.azure.frontdoor.FrontdoorArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolArgs.builder
      builder.backendPools(args.map(_(argsBuilder).build)*)

    /**
     * @param frontendEndpoints A `frontendEndpoint` block as defined below.
     * @return builder
     */
    def frontendEndpoints(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorFrontendEndpointArgs.Builder]*):
        com.pulumi.azure.frontdoor.FrontdoorArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorFrontendEndpointArgs.builder
      builder.frontendEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param routingRules A `routingRule` block as defined below.
     * @return builder
     */
    def routingRules(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleArgs.Builder]*):
        com.pulumi.azure.frontdoor.FrontdoorArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleArgs.builder
      builder.routingRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.frontdoor.FrontdoorArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleArgs.Builder)
    /**
     * @param forwardingConfiguration A `forwardingConfiguration` block as defined below.
     * @return builder
     */
    def forwardingConfiguration(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleForwardingConfigurationArgs.Builder]):
        com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleForwardingConfigurationArgs.builder
      builder.forwardingConfiguration(args(argsBuilder).build)

    /**
     * @param redirectConfiguration A `redirectConfiguration` block as defined below.
     * @return builder
     */
    def redirectConfiguration(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleRedirectConfigurationArgs.Builder]):
        com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleRedirectConfigurationArgs.builder
      builder.redirectConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.frontdoor.inputs.CustomHttpsConfigurationState.Builder)
    /**
     * @param customHttpsConfiguration A `customHttpsConfiguration` block as defined above.
     * @return builder
     */
    def customHttpsConfiguration(args: Endofunction[com.pulumi.azure.frontdoor.inputs.CustomHttpsConfigurationCustomHttpsConfigurationArgs.Builder]):
        com.pulumi.azure.frontdoor.inputs.CustomHttpsConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.frontdoor.inputs.CustomHttpsConfigurationCustomHttpsConfigurationArgs.builder
      builder.customHttpsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.frontdoor.inputs.RulesEngineState.Builder)
    /**
     * @param rules A `rule` block as defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.frontdoor.inputs.RulesEngineRuleArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.RulesEngineState.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.RulesEngineRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.frontdoor.inputs.FirewallPolicyState.Builder)
    /**
     * @param customRules One or more `customRule` blocks as defined below.
     * @return builder
     */
    def customRules(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FirewallPolicyCustomRuleArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FirewallPolicyState.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FirewallPolicyCustomRuleArgs.builder
      builder.customRules(args.map(_(argsBuilder).build)*)

    /**
     * @param managedRules One or more `managedRule` blocks as defined below.
     * @return builder
     */
    def managedRules(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FirewallPolicyState.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleArgs.builder
      builder.managedRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.frontdoor.inputs.FirewallPolicyState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.frontdoor.inputs.RulesEngineRuleActionArgs.Builder)
    /**
     * @param requestHeaders A `requestHeader` block as defined below.
     * @return builder
     */
    def requestHeaders(args: Endofunction[com.pulumi.azure.frontdoor.inputs.RulesEngineRuleActionRequestHeaderArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.RulesEngineRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.RulesEngineRuleActionRequestHeaderArgs.builder
      builder.requestHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeaders A `responseHeader` block as defined below.
     * @return builder
     */
    def responseHeaders(args: Endofunction[com.pulumi.azure.frontdoor.inputs.RulesEngineRuleActionResponseHeaderArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.RulesEngineRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.RulesEngineRuleActionResponseHeaderArgs.builder
      builder.responseHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.frontdoor.inputs.FrontdoorState.Builder)
    /**
     * @param backendPoolHealthProbes A `backendPoolHealthProbe` block as defined below.
     * @return builder
     */
    def backendPoolHealthProbes(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolHealthProbeArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FrontdoorState.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolHealthProbeArgs.builder
      builder.backendPoolHealthProbes(args.map(_(argsBuilder).build)*)

    /**
     * @param backendPoolLoadBalancings A `backendPoolLoadBalancing` block as defined below.
     * @return builder
     */
    def backendPoolLoadBalancings(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolLoadBalancingArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FrontdoorState.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolLoadBalancingArgs.builder
      builder.backendPoolLoadBalancings(args.map(_(argsBuilder).build)*)

    /**
     * @param backendPoolSettings A `backendPoolSettings` block as defined below.
     * @return builder
     */
    def backendPoolSettings(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolSettingArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FrontdoorState.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolSettingArgs.builder
      builder.backendPoolSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param backendPools A `backendPool` block as defined below.
     * 
     *  &gt; Azure by default allows specifying up to 50 Backend Pools - but this quota can be increased via Microsoft Support.
     * @return builder
     */
    def backendPools(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FrontdoorState.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolArgs.builder
      builder.backendPools(args.map(_(argsBuilder).build)*)

    def explicitResourceOrders(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorExplicitResourceOrderArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FrontdoorState.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorExplicitResourceOrderArgs.builder
      builder.explicitResourceOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param frontendEndpoints A `frontendEndpoint` block as defined below.
     * @return builder
     */
    def frontendEndpoints(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorFrontendEndpointArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FrontdoorState.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorFrontendEndpointArgs.builder
      builder.frontendEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param routingRules A `routingRule` block as defined below.
     * @return builder
     */
    def routingRules(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FrontdoorState.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleArgs.builder
      builder.routingRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.frontdoor.inputs.FrontdoorState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.frontdoor.inputs.RulesEngineRuleArgs.Builder)
    /**
     * @param action An `action` block as defined below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.azure.frontdoor.inputs.RulesEngineRuleActionArgs.Builder]):
        com.pulumi.azure.frontdoor.inputs.RulesEngineRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.frontdoor.inputs.RulesEngineRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param matchConditions One or more `matchCondition` block as defined below.
     * @return builder
     */
    def matchConditions(args: Endofunction[com.pulumi.azure.frontdoor.inputs.RulesEngineRuleMatchConditionArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.RulesEngineRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.RulesEngineRuleMatchConditionArgs.builder
      builder.matchConditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleArgs.Builder)
    /**
     * @param exclusions One or more `exclusion` blocks as defined below.
     * @return builder
     */
    def exclusions(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleExclusionArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

    /**
     * @param overrides One or more `override` blocks as defined below.
     * @return builder
     */
    def overrides(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideArgs.builder
      builder.overrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.frontdoor.inputs.FirewallPolicyCustomRuleArgs.Builder)
    /**
     * @param matchConditions One or more `matchCondition` block defined below. Can support up to `10` `matchCondition` blocks.
     * @return builder
     */
    def matchConditions(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FirewallPolicyCustomRuleMatchConditionArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FirewallPolicyCustomRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FirewallPolicyCustomRuleMatchConditionArgs.builder
      builder.matchConditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideArgs.Builder)
    /**
     * @param exclusions One or more `exclusion` blocks as defined below.
     * @return builder
     */
    def exclusions(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideExclusionArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

    /**
     * @param rules One or more `rule` blocks as defined below. If none are specified, all of the rules in the group will be disabled.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideRuleArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideRuleArgs.Builder)
    /**
     * @param exclusions One or more `exclusion` blocks as defined below.
     * @return builder
     */
    def exclusions(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideRuleExclusionArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideRuleExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolArgs.Builder)
    /**
     * @param backends A `backend` block as defined below.
     * @return builder
     */
    def backends(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolBackendArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolBackendArgs.builder
      builder.backends(args.map(_(argsBuilder).build)*)
