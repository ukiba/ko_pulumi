package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object frontdoor:
  /**
   * &gt; **Note:** This deploys an Azure Front Door (classic) resource which has been deprecated and will receive security updates only. Please migrate your existing Azure Front Door (classic) deployments to the new Azure Front Door (standard/premium) resources. For your convenience, the service team has exposed a `Front Door Classic` to `Front Door Standard/Premium` [migration tool](https://learn.microsoft.com/azure/frontdoor/tier-migration) to allow you to migrate your existing `Front Door Classic` instances to the new `Front Door Standard/Premium` product tiers.
   * 
   * Manages the Custom HTTPS Configuration for an Azure Front Door (classic) Frontend Endpoint.
   * 
   * &gt; **Note:** Defining custom HTTPS configurations using a separate `azure.frontdoor.CustomHttpsConfiguration` resource allows for parallel creation/update.
   * 
   * &gt; **Note:** In order to address the ordering issue we have changed the design on how to retrieve existing sub resources such as frontend endpoints. Existing design will be deprecated and will result in an incorrect configuration. Please refer to the updated documentation below for more information.
   * 
   * &gt; **Note:** The `resourceGroupName` field has been removed as of the `v2.58.0` provider release. If the `resourceGroupName` field has been defined in your current `azure.frontdoor.CustomHttpsConfiguration` resource configuration file please remove it else you will receive a `An argument named &#34;resourceGroupName&#34; is not expected here.` error. If your pre-existing Front Door instance contained inline `customHttpsConfiguration` blocks there are additional steps that will need to be completed to successfully migrate your Front Door onto the `v2.58.0` provider which can be found in this guide.
   * 
   * &gt; **Note:** Azure rolled out a breaking change on Friday 9th April 2021 which may cause issues with the CDN/FrontDoor resources. More information is available in this GitHub issue - unfortunately this may necessitate a breaking change to the CDN and Front Door resources, more information will be posted in the GitHub issue as the necessary changes are identified.
   * 
   * &gt; **Note:** The creation of new Azure Front Door (classic) resources is no longer supported following its deprecation on `April 1, 2025`. However, modifications to existing Azure Front Door (classic) resources will continue to be supported until the API reaches full retirement on `March 31, 2027`.
   */
  def CustomHttpsConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.frontdoor.CustomHttpsConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.frontdoor.CustomHttpsConfigurationArgs.builder
    com.pulumi.azure.frontdoor.CustomHttpsConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * &gt; **Note:** This deploys an Azure Front Door (classic) resource which has been deprecated and will receive security updates only. Please migrate your existing Azure Front Door (classic) deployments to the new Azure Front Door (standard/premium) resources. For your convenience, the service team has exposed a `Front Door Classic` to `Front Door Standard/Premium` [migration tool](https://learn.microsoft.com/azure/frontdoor/tier-migration) to allow you to migrate your existing `Front Door Classic` instances to the new `Front Door Standard/Premium` product tiers.
   * 
   * Manages an Azure Front Door (classic) Web Application Firewall Policy instance.
   * 
   * &gt; **Note:** Azure rolled out a breaking change on Friday 9th April 2021 which may cause issues with the CDN/FrontDoor resources. More information is available in this GitHub issue - unfortunately this may necessitate a breaking change to the CDN and Front Door resources, more information will be posted in the GitHub issue as the necessary changes are identified.
   * 
   * &gt; **Note:** The creation of new Azure Front Door (classic) resources is no longer supported following its deprecation on `April 1, 2025`. However, modifications to existing Azure Front Door (classic) resources will continue to be supported until the API reaches full retirement on `March 31, 2027`.
   */
  def FirewallPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.frontdoor.FirewallPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.frontdoor.FirewallPolicyArgs.builder
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
    com.pulumi.azure.frontdoor.FirewallPolicy(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * &gt; **IMPORTANT** This deploys an Azure Front Door (classic) resource which has been deprecated and will receive security updates only. Please migrate your existing Azure Front Door (classic) deployments to the new Azure Front Door (standard/premium) resources. For your convenience, the service team has exposed a `Front Door Classic` to `Front Door Standard/Premium` [migration tool](https://learn.microsoft.com/azure/frontdoor/tier-migration) to allow you to migrate your existing `Front Door Classic` instances to the new `Front Door Standard/Premium` product tiers.
   * 
   * Manages an Azure Front Door (classic) instance.
   * 
   * Azure Front Door Service is Microsoft&#39;s highly available and scalable web application acceleration platform and global HTTP(S) load balancer. It provides built-in DDoS protection and application layer security and caching. Front Door enables you to build applications that maximize and automate high-availability and performance for your end-users. Use Front Door with Azure services including Web/Mobile Apps, Cloud Services and Virtual Machines \u2013 or combine it with on-premises services for hybrid deployments and smooth cloud migration.
   * 
   * Below are some of the key scenarios that Azure Front Door Service addresses:
   * 
   * * Use Front Door to improve application scale and availability with instant multi-region failover
   * * Use Front Door to improve application performance with SSL offload and routing requests to the fastest available application backend.
   * * Use Front Door for application layer security and DDoS protection for your application.
   * 
   * &gt; **Note:** The `customHttpsProvisioningEnabled` field and the `customHttpsConfiguration` block have been removed from the `azure.frontdoor.Frontdoor` resource in the `v2.58.0` provider due to changes made by the service team. If you wish to enable the custom HTTPS configuration functionality within your `azure.frontdoor.Frontdoor` resource moving forward you will need to define a separate `azure.frontdoor.CustomHttpsConfiguration` block in your configuration file.
   * 
   * &gt; **Note:** With the release of the `v2.58.0` provider, if you run the `apply` command against an existing Front Door resource it **will not** apply the detected changes. Instead it will persist the `explicitResourceOrder` mapping structure to the state file. Once this operation has completed the resource will resume functioning normally.This change in behavior in Terraform is due to an issue where the underlying service teams API is now returning the response JSON out of order from the way it was sent to the resource via Terraform causing unexpected discrepancies in the `plan` after the resource has been provisioned. If your pre-existing Front Door instance contains `customHttpsConfiguration` blocks there are additional steps that will need to be completed to successfully migrate your Front Door onto the `v2.58.0` provider which can be found in this guide.
   * 
   * &gt; **Note:** The creation of new Azure Front Door (classic) resources is no longer supported following its deprecation on `April 1, 2025`. However, modifications to existing Azure Front Door (classic) resources will continue to be supported until the API reaches full retirement on `March 31, 2027`.
   */
  def Frontdoor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.frontdoor.FrontdoorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.frontdoor.FrontdoorArgs.builder
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
    com.pulumi.azure.frontdoor.Frontdoor(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * &gt; **Note:** This deploys an Azure Front Door (classic) resource which has been deprecated and will receive security updates only. Please migrate your existing Azure Front Door (classic) deployments to the new Azure Front Door (standard/premium) resources. For your convenience, the service team has exposed a `Front Door Classic` to `Front Door Standard/Premium` [migration tool](https://learn.microsoft.com/azure/frontdoor/tier-migration) to allow you to migrate your existing `Front Door Classic` instances to the new `Front Door Standard/Premium` product tiers.
   * 
   * &gt; **Note:** The creation of new Azure Front Door (classic) resources is no longer supported following its deprecation on `April 1, 2025`. However, modifications to existing Azure Front Door (classic) resources will continue to be supported until the API reaches full retirement on `March 31, 2027`.
   * 
   * Manages an Azure Front Door (classic) Rules Engine configuration and rules.
   */
  def RulesEngine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.frontdoor.RulesEngineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.frontdoor.RulesEngineArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.frontdoor.RulesEngine(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
