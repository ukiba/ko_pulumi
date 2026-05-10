package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object cdn:
  /** Manages a Front Door (standard/premium) Rule Set. */
  def FrontdoorRuleSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorRuleSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorRuleSetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cdn.FrontdoorRuleSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a CDN (classic) Profile to create a collection of CDN Endpoints.
   * 
   *  !&gt; **Note:** Azure rolled out a breaking change on Friday 9th April 2021 which may cause issues with the CDN/FrontDoor resources. More information is available in this GitHub issue - unfortunately this may necessitate a breaking change to the CDN and FrontDoor resources, more information will be posted in the GitHub issue as the necessary changes are identified.
   * 
   *  !&gt; **Note:** Support for the CDN (classic) `sku` `Standard_Akamai` was deprecated from Azure on `October 31, 2023` and is no longer available.
   * 
   *  !&gt; **Note:** Support for the CDN (classic) `sku` `Standard_Verizon` and `Premium_Verizon` was deprecated from Azure on `January 15, 2025` and is no longer available.
   * 
   *  !&gt; **Note:** Support for the CDN (classic) `sku` `Standard_Microsoft` and `Standard_ChinaCdn` will be deprecated from Azure on `October 1, 2025` and will no longer be available, however modifications to existing CDN (classic) resources will continue to be supported until the API reaches full retirement on `September 30, 2027`.
   */
  def Profile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cdn.ProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.ProfileArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.cdn.Profile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.cdn.FrontdoorSecretArgs.Builder)
    /**
     * @param secret A `secret` block as defined below. Changing this forces a new Front Door Secret to be created.
     * @return builder
     */
    def secret(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorSecretSecretArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorSecretArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorSecretSecretArgs.builder
      builder.secret(args(argsBuilder).build)

  type CdnFunctions = com.pulumi.azure.cdn.CdnFunctions
  object CdnFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.cdn.CdnFunctions.*
  extension (self: CdnFunctions.type)
    /** Use this data source to access information about an existing Front Door (standard/premium) Custom Domain. */
    def getFrontdoorCustomDomain(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorCustomDomainArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.cdn.outputs.GetFrontdoorCustomDomainResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorCustomDomainArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorCustomDomain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Custom Domain. */
    def getFrontdoorCustomDomainPlain(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorCustomDomainPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cdn.outputs.GetFrontdoorCustomDomainResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorCustomDomainPlainArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorCustomDomainPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Endpoint. */
    def getFrontdoorEndpoint(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorEndpointArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.cdn.outputs.GetFrontdoorEndpointResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorEndpointArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorEndpoint(args(argsBuilder).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Endpoint. */
    def getFrontdoorEndpointPlain(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorEndpointPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cdn.outputs.GetFrontdoorEndpointResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorEndpointPlainArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorEndpointPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Firewall Policy. */
    def getFrontdoorFirewallPolicy(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorFirewallPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.cdn.outputs.GetFrontdoorFirewallPolicyResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorFirewallPolicyArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorFirewallPolicy(args(argsBuilder).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Firewall Policy. */
    def getFrontdoorFirewallPolicyPlain(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorFirewallPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cdn.outputs.GetFrontdoorFirewallPolicyResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorFirewallPolicyPlainArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorFirewallPolicyPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Origin Group. */
    def getFrontdoorOriginGroup(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorOriginGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.cdn.outputs.GetFrontdoorOriginGroupResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorOriginGroupArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorOriginGroup(args(argsBuilder).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Origin Group. */
    def getFrontdoorOriginGroupPlain(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorOriginGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cdn.outputs.GetFrontdoorOriginGroupResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorOriginGroupPlainArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorOriginGroupPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Profile. */
    def getFrontdoorProfile(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorProfileArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.cdn.outputs.GetFrontdoorProfileResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorProfileArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorProfile(args(argsBuilder).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Profile. */
    def getFrontdoorProfilePlain(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorProfilePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cdn.outputs.GetFrontdoorProfileResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorProfilePlainArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorProfilePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Rule Set. */
    def getFrontdoorRuleSet(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorRuleSetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.cdn.outputs.GetFrontdoorRuleSetResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorRuleSetArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorRuleSet(args(argsBuilder).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Rule Set. */
    def getFrontdoorRuleSetPlain(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorRuleSetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cdn.outputs.GetFrontdoorRuleSetResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorRuleSetPlainArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorRuleSetPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Secret. */
    def getFrontdoorSecret(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorSecretArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.cdn.outputs.GetFrontdoorSecretResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorSecretArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorSecret(args(argsBuilder).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Secret. */
    def getFrontdoorSecretPlain(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorSecretPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cdn.outputs.GetFrontdoorSecretResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorSecretPlainArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorSecretPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing CDN Profile. */
    def getProfile(args: Endofunction[com.pulumi.azure.cdn.inputs.GetProfileArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.cdn.outputs.GetProfileResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetProfileArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getProfile(args(argsBuilder).build)

    /** Use this data source to access information about an existing CDN Profile. */
    def getProfilePlain(args: Endofunction[com.pulumi.azure.cdn.inputs.GetProfilePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cdn.outputs.GetProfileResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetProfilePlainArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getProfilePlain(args(argsBuilder).build)

  /** Manages a Front Door (standard/premium) Endpoint. */
  def FrontdoorEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.cdn.FrontdoorEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Front Door (standard/premium) Route.
   * 
   *  &gt; **Note:** The `azure.cdn.FrontdoorRoute` resource must **explicitly** reference its associated `azure.cdn.FrontdoorOrigin` resource(s). This can be achieved either by using a `dependsOn` meta-argument that points to the `azure.cdn.FrontdoorOrigin` resource(s), or by specifying the `azure.cdn.FrontdoorOrigin` IDs via the `cdnFrontdoorOriginIds` field.
   */
  def FrontdoorRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorRouteArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorRouteArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cdn.FrontdoorRoute(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Front Door (standard/premium) Origin Group. */
  def FrontdoorOriginGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorOriginGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorOriginGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cdn.FrontdoorOriginGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.cdn.EndpointCustomDomainArgs.Builder)
    /**
     * @param cdnManagedHttps A `cdnManagedHttps` block as defined below.
     * @return builder
     */
    def cdnManagedHttps(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointCustomDomainCdnManagedHttpsArgs.Builder]):
        com.pulumi.azure.cdn.EndpointCustomDomainArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointCustomDomainCdnManagedHttpsArgs.builder
      builder.cdnManagedHttps(args(argsBuilder).build)

    /**
     * @param userManagedHttps A `userManagedHttps` block as defined below.
     * 
     *  &gt; **Note:** Only one of `cdnManagedHttps` and `userManagedHttps` can be specified.
     * @return builder
     */
    def userManagedHttps(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointCustomDomainUserManagedHttpsArgs.Builder]):
        com.pulumi.azure.cdn.EndpointCustomDomainArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointCustomDomainUserManagedHttpsArgs.builder
      builder.userManagedHttps(args(argsBuilder).build)

  /**
   * Manages a Front Door (standard/premium) Origin.
   * 
   *  !&gt; **Note:** If you are attempting to implement an Origin that uses its own Private Link Service with a Load Balancer the Profile resource in your configuration file **must** have a `dependsOn` meta-argument which references the `azure.privatedns.LinkService`, see `Example Usage With Private Link Service` below.
   */
  def FrontdoorOrigin(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorOriginArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorOriginArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cdn.FrontdoorOrigin(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.cdn.FrontdoorProfileArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorProfileIdentityArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorProfileIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param logScrubbingRules One or more `logScrubbingRule` blocks as defined below.
     * 
     *  &gt; **Note:** When no `logScrubbingRule` blocks are defined, log scrubbing will be automatically `disabled`. When one or more `logScrubbingRule` blocks are present, log scrubbing will be `enabled`.
     * @return builder
     */
    def logScrubbingRules(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorProfileLogScrubbingRuleArgs.Builder]*):
        com.pulumi.azure.cdn.FrontdoorProfileArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorProfileLogScrubbingRuleArgs.builder
      builder.logScrubbingRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.cdn.FrontdoorProfileArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.cdn.FrontdoorFirewallPolicyArgs.Builder)
    /**
     * @param customRules One or more `customRule` blocks as defined below.
     * @return builder
     */
    def customRules(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyCustomRuleArgs.Builder]*):
        com.pulumi.azure.cdn.FrontdoorFirewallPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyCustomRuleArgs.builder
      builder.customRules(args.map(_(argsBuilder).build)*)

    /**
     * @param logScrubbing A `logScrubbing` block as defined below.
     * 
     *  !&gt; **Note:** Setting the`logScrubbing` block is currently in **PREVIEW**. Please see the [Supplemental Terms of Use for Microsoft Azure Previews](https://azure.microsoft.com/support/legal/preview-supplemental-terms/) for legal terms that apply to Azure features that are in beta, preview, or otherwise not yet released into general availability.
     * @return builder
     */
    def logScrubbing(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyLogScrubbingArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorFirewallPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyLogScrubbingArgs.builder
      builder.logScrubbing(args(argsBuilder).build)

    /**
     * @param managedRules One or more `managedRule` blocks as defined below.
     * @return builder
     */
    def managedRules(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleArgs.Builder]*):
        com.pulumi.azure.cdn.FrontdoorFirewallPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleArgs.builder
      builder.managedRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.cdn.FrontdoorFirewallPolicyArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages a Front Door (standard/premium) Secret.
   * 
   *  ## Required Key Vault Permissions
   * 
   *  !&gt; **Note:** You must add an `Access Policy` to your `azure.keyvault.KeyVault` for the `Microsoft.AzurefrontDoor-Cdn` Enterprise Application Object ID.
   * 
   *  This can be created by running Az Powershell command like this:
   * 
   *  ```New-AzADServicePrincipal -ApplicationId &#34;00000000-0000-0000-0000-000000000000&#34;```
   * 
   *  | Object ID                                | Key Permissions | Secret Permissions   | Certificate Permissions                       |
   *  |:-----------------------------------------|:---------------:|:--------------------:|:---------------------------------------------:|
   *  | `Microsoft.Azure.Cdn` Object ID          | -               | **Get**              | -                                             |
   *  | Your Personal AAD Object ID              | -               | **Get** and **List** | **Get**, **List**, **Purge** and **Recover**  |
   *  | Terraform Service Principal              | -               | **Get**              | **Get**, **Import**, **Delete** and **Purge** |
   * 
   *  -&gt; **Note:** You only need to add the `Access Policy` for your personal AAD Object ID if you are planning to view the `secrets` via the Azure Portal.
   * 
   *  ## Import
   * 
   *  Front Door Secrets can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:cdn/frontdoorSecret:FrontdoorSecret example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Cdn/profiles/profile1/secrets/secrets1
   *  ```
   */
  def FrontdoorSecret(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorSecretArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorSecretArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cdn.FrontdoorSecret(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.cdn.FrontdoorSecurityPolicyArgs.Builder)
    /**
     * @param securityPolicies An `securityPolicies` block as defined below.
     * @return builder
     */
    def securityPolicies(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorSecurityPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesArgs.builder
      builder.securityPolicies(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.FrontdoorRuleArgs.Builder)
    /**
     * @param actions An `actions` block as defined below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsArgs.builder
      builder.actions(args(argsBuilder).build)

    /**
     * @param conditions A `conditions` block as defined below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.builder
      builder.conditions(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.FrontdoorOriginGroupArgs.Builder)
    /**
     * @param healthProbe A `healthProbe` block as defined below.
     * @return builder
     */
    def healthProbe(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupHealthProbeArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorOriginGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupHealthProbeArgs.builder
      builder.healthProbe(args(argsBuilder).build)

    /**
     * @param loadBalancing A `loadBalancing` block as defined below.
     * @return builder
     */
    def loadBalancing(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupLoadBalancingArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorOriginGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupLoadBalancingArgs.builder
      builder.loadBalancing(args(argsBuilder).build)

  /**
   * Manages a Front Door (standard/premium) Custom Domain.
   * 
   *  !&gt; **Note:** If you are using Terraform to manage your DNS Auth and DNS CNAME records for your Custom Domain you will need to add configuration blocks for both the `azure.dns.TxtRecord`(see the `Example DNS Auth TXT Record Usage` below) and the `azure.dns.CNameRecord`(see the `Example CNAME Record Usage` below) to your configuration file.
   */
  def FrontdoorCustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorCustomDomainArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorCustomDomainArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cdn.FrontdoorCustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A CDN (classic) Endpoint is the entity within a CDN Profile containing configuration information regarding caching behaviours and origins. The CDN Endpoint is exposed using the URL format `&lt;endpointname&gt;.azureedge.net`.
   * 
   *  !&gt; **Note:** Azure rolled out a breaking change on Friday 9th April 2021 which may cause issues with the CDN/FrontDoor resources. More information is available in this GitHub issue - unfortunately this may necessitate a breaking change to the CDN (classic) and FrontDoor (classic) resources, more information will be posted in the GitHub issue as the necessary changes are identified.
   * 
   *  !&gt; **Note:** Support for the CDN (classic) `sku` `Standard_Akamai` was deprecated from Azure on `October 31, 2023` and is no longer available.
   * 
   *  !&gt; **Note:** Support for the CDN (classic) `sku` `Standard_Verizon` and `Premium_Verizon` was deprecated from Azure on `January 15, 2025` and is no longer available.
   * 
   *  !&gt; **Note:** Support for the CDN (classic) `sku` `Standard_Microsoft` and `Standard_ChinaCdn` will be deprecated from Azure on `October 1, 2025` and will no longer be available, however modifications to existing CDN (classic) resources will continue to be supported until the API reaches full retirement on `September 30, 2027`.
   */
  def Endpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cdn.EndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.EndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.cdn.Endpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Front Door (standard/premium) Rule.
   * 
   *  !&gt; **Note:** The Rules resource **must** include a `dependsOn` meta-argument which references the `azure.cdn.FrontdoorOrigin` and the `azure.cdn.FrontdoorOriginGroup`.
   */
  def FrontdoorRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cdn.FrontdoorRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the association between a Front Door (standard/premium) Custom Domain and one or more Front Door (standard/premium) Routes. */
  def FrontdoorCustomDomainAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorCustomDomainAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.cdn.FrontdoorCustomDomainAssociationArgs.builder
    com.pulumi.azure.cdn.FrontdoorCustomDomainAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.cdn.FrontdoorCustomDomainArgs.Builder)
    /**
     * @param tls A `tls` block as defined below.
     * @return builder
     */
    def tls(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorCustomDomainTlsArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorCustomDomainArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorCustomDomainTlsArgs.builder
      builder.tls(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.FrontdoorOriginArgs.Builder)
    /**
     * @param privateLink A `privateLink` block as defined below.
     * 
     *  &gt; **Note:** Private Link requires that the Front Door Profile this Origin is hosted within is using the SKU `Premium_AzureFrontDoor` and that the `certificateNameCheckEnabled` field is set to `true`.
     * @return builder
     */
    def privateLink(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorOriginPrivateLinkArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorOriginArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorOriginPrivateLinkArgs.builder
      builder.privateLink(args(argsBuilder).build)

  /** Manages a Front Door (standard/premium) Security Policy. */
  def FrontdoorSecurityPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorSecurityPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorSecurityPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cdn.FrontdoorSecurityPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Custom Domain for a CDN (classic) Endpoint.
   * 
   *  !&gt; **Note:** Support for the CDN (classic) `sku` `Standard_Akamai` was deprecated from Azure on `October 31, 2023` and is no longer available.
   * 
   *  !&gt; **Note:** Support for the CDN (classic) `sku` values `Standard_Verizon` and `Premium_Verizon` were deprecated from Azure on `January 15, 2025` and are no longer available.
   * 
   *  !&gt; **Note:** Support for the CDN (classic) `sku` values `Standard_Microsoft` and `Standard_ChinaCdn` will be deprecated from Azure on `October 1, 2025` and will no longer be available, however, modifications to existing CDN (classic) resources will continue to be supported until the API reaches full retirement on `September 30, 2027`.
   */
  def EndpointCustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cdn.EndpointCustomDomainArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.EndpointCustomDomainArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cdn.EndpointCustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Front Door (standard/premium) Firewall Policy instance. */
  def FrontdoorFirewallPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorFirewallPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorFirewallPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.cdn.FrontdoorFirewallPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.cdn.EndpointArgs.Builder)
    /**
     * @param deliveryRules Rules for the rules engine. An endpoint can contain up until 4 of those rules that consist of conditions and actions. A `deliveryRule` blocks as defined below.
     * @return builder
     */
    def deliveryRules(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder]*):
        com.pulumi.azure.cdn.EndpointArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.builder
      builder.deliveryRules(args.map(_(argsBuilder).build)*)

    /**
     * @param geoFilters A set of Geo Filters for this CDN Endpoint. Each `geoFilter` block supports fields documented below.
     * @return builder
     */
    def geoFilters(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointGeoFilterArgs.Builder]*):
        com.pulumi.azure.cdn.EndpointArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointGeoFilterArgs.builder
      builder.geoFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param globalDeliveryRule Actions that are valid for all resources regardless of any conditions. A `globalDeliveryRule` block as defined below.
     * @return builder
     */
    def globalDeliveryRule(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.Builder]):
        com.pulumi.azure.cdn.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.builder
      builder.globalDeliveryRule(args(argsBuilder).build)

    /**
     * @param origins The set of origins of the CDN endpoint. When multiple origins exist, the first origin will be used as primary and rest will be used as failover options. Each `origin` block supports fields documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    def origins(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointOriginArgs.Builder]*):
        com.pulumi.azure.cdn.EndpointArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointOriginArgs.builder
      builder.origins(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.cdn.EndpointArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.cdn.FrontdoorRouteArgs.Builder)
    /**
     * @param cache A `cache` block as defined below.
     * 
     *  &gt; **Note:** To disable caching, do not provide the `cache` block in the configuration file.
     * @return builder
     */
    def cache(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRouteCacheArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorRouteArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRouteCacheArgs.builder
      builder.cache(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsArgs.Builder)
    /**
     * @param requestHeaderActions A `requestHeaderAction` block as defined below.
     * @return builder
     */
    def requestHeaderActions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsRequestHeaderActionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsRequestHeaderActionArgs.builder
      builder.requestHeaderActions(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeaderActions A `responseHeaderAction` block as defined below.
     * @return builder
     */
    def responseHeaderActions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsResponseHeaderActionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsResponseHeaderActionArgs.builder
      builder.responseHeaderActions(args.map(_(argsBuilder).build)*)

    /**
     * @param routeConfigurationOverrideAction A `routeConfigurationOverrideAction` block as defined below.
     * @return builder
     */
    def routeConfigurationOverrideAction(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsRouteConfigurationOverrideActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsRouteConfigurationOverrideActionArgs.builder
      builder.routeConfigurationOverrideAction(args(argsBuilder).build)

    /**
     * @param urlRedirectAction A `urlRedirectAction` block as defined below. You may **not** have a `urlRedirectAction` **and** a `urlRewriteAction` defined in the same `actions` block.
     * @return builder
     */
    def urlRedirectAction(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsUrlRedirectActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsUrlRedirectActionArgs.builder
      builder.urlRedirectAction(args(argsBuilder).build)

    /**
     * @param urlRewriteAction A `urlRewriteAction` block as defined below. You may **not** have a `urlRewriteAction` **and** a `urlRedirectAction` defined in the same `actions` block.
     * @return builder
     */
    def urlRewriteAction(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsUrlRewriteActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsUrlRewriteActionArgs.builder
      builder.urlRewriteAction(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideArgs.Builder)
    /**
     * @param exclusions One or more `exclusion` blocks as defined below.
     * @return builder
     */
    def exclusions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideExclusionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

    /**
     * @param rules One or more `rule` blocks as defined below. If none are specified, all of the rules in the group will be disabled.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideRuleArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyLogScrubbingArgs.Builder)
    /**
     * @param scrubbingRules One or more `scrubbingRule` blocks as defined below.
     * 
     *  &gt; **Note:** For more information on masking sensitive data in Azure Front Door please see the [product documentation](https://learn.microsoft.com/azure/web-application-firewall/afds/waf-sensitive-data-protection-configure-frontdoor).
     * @return builder
     */
    def scrubbingRules(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyLogScrubbingScrubbingRuleArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyLogScrubbingArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyLogScrubbingScrubbingRuleArgs.builder
      builder.scrubbingRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleArgs.Builder)
    /**
     * @param exclusions One or more `exclusion` blocks as defined below.
     * @return builder
     */
    def exclusions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleExclusionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

    /**
     * @param overrides One or more `override` blocks as defined below.
     * @return builder
     */
    def overrides(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideArgs.builder
      builder.overrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallAssociationArgs.Builder)
    /**
     * @param domains One or more `domain` blocks as defined below.
     * @return builder
     */
    def domains(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallAssociationDomainArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallAssociationArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallAssociationDomainArgs.builder
      builder.domains(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.Builder)
    /**
     * @param cacheExpirationAction A `cacheExpirationAction` block as defined above.
     * @return builder
     */
    def cacheExpirationAction(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleCacheExpirationActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleCacheExpirationActionArgs.builder
      builder.cacheExpirationAction(args(argsBuilder).build)

    /**
     * @param cacheKeyQueryStringAction A `cacheKeyQueryStringAction` block as defined above.
     * @return builder
     */
    def cacheKeyQueryStringAction(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleCacheKeyQueryStringActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleCacheKeyQueryStringActionArgs.builder
      builder.cacheKeyQueryStringAction(args(argsBuilder).build)

    /**
     * @param modifyRequestHeaderActions A `modifyRequestHeaderAction` block as defined below.
     * @return builder
     */
    def modifyRequestHeaderActions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleModifyRequestHeaderActionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleModifyRequestHeaderActionArgs.builder
      builder.modifyRequestHeaderActions(args.map(_(argsBuilder).build)*)

    /**
     * @param modifyResponseHeaderActions A `modifyResponseHeaderAction` block as defined below.
     * @return builder
     */
    def modifyResponseHeaderActions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleModifyResponseHeaderActionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleModifyResponseHeaderActionArgs.builder
      builder.modifyResponseHeaderActions(args.map(_(argsBuilder).build)*)

    /**
     * @param urlRedirectAction A `urlRedirectAction` block as defined below.
     * @return builder
     */
    def urlRedirectAction(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleUrlRedirectActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleUrlRedirectActionArgs.builder
      builder.urlRedirectAction(args(argsBuilder).build)

    /**
     * @param urlRewriteAction A `urlRewriteAction` block as defined below.
     * @return builder
     */
    def urlRewriteAction(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleUrlRewriteActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleUrlRewriteActionArgs.builder
      builder.urlRewriteAction(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorProfileState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorProfileIdentityArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorProfileState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorProfileIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param logScrubbingRules One or more `logScrubbingRule` blocks as defined below.
     * 
     *  &gt; **Note:** When no `logScrubbingRule` blocks are defined, log scrubbing will be automatically `disabled`. When one or more `logScrubbingRule` blocks are present, log scrubbing will be `enabled`.
     * @return builder
     */
    def logScrubbingRules(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorProfileLogScrubbingRuleArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorProfileState.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorProfileLogScrubbingRuleArgs.builder
      builder.logScrubbingRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.cdn.inputs.FrontdoorProfileState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.cdn.inputs.EndpointState.Builder)
    /**
     * @param deliveryRules Rules for the rules engine. An endpoint can contain up until 4 of those rules that consist of conditions and actions. A `deliveryRule` blocks as defined below.
     * @return builder
     */
    def deliveryRules(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointState.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.builder
      builder.deliveryRules(args.map(_(argsBuilder).build)*)

    /**
     * @param geoFilters A set of Geo Filters for this CDN Endpoint. Each `geoFilter` block supports fields documented below.
     * @return builder
     */
    def geoFilters(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointGeoFilterArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointState.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointGeoFilterArgs.builder
      builder.geoFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param globalDeliveryRule Actions that are valid for all resources regardless of any conditions. A `globalDeliveryRule` block as defined below.
     * @return builder
     */
    def globalDeliveryRule(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.builder
      builder.globalDeliveryRule(args(argsBuilder).build)

    /**
     * @param origins The set of origins of the CDN endpoint. When multiple origins exist, the first origin will be used as primary and rest will be used as failover options. Each `origin` block supports fields documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    def origins(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointOriginArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointState.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointOriginArgs.builder
      builder.origins(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.cdn.inputs.EndpointState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.cdn.inputs.EndpointCustomDomainState.Builder)
    /**
     * @param cdnManagedHttps A `cdnManagedHttps` block as defined below.
     * @return builder
     */
    def cdnManagedHttps(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointCustomDomainCdnManagedHttpsArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointCustomDomainState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointCustomDomainCdnManagedHttpsArgs.builder
      builder.cdnManagedHttps(args(argsBuilder).build)

    /**
     * @param userManagedHttps A `userManagedHttps` block as defined below.
     * 
     *  &gt; **Note:** Only one of `cdnManagedHttps` and `userManagedHttps` can be specified.
     * @return builder
     */
    def userManagedHttps(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointCustomDomainUserManagedHttpsArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointCustomDomainState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointCustomDomainUserManagedHttpsArgs.builder
      builder.userManagedHttps(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyState.Builder)
    /**
     * @param customRules One or more `customRule` blocks as defined below.
     * @return builder
     */
    def customRules(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyCustomRuleArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyState.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyCustomRuleArgs.builder
      builder.customRules(args.map(_(argsBuilder).build)*)

    /**
     * @param logScrubbing A `logScrubbing` block as defined below.
     * 
     *  !&gt; **Note:** Setting the`logScrubbing` block is currently in **PREVIEW**. Please see the [Supplemental Terms of Use for Microsoft Azure Previews](https://azure.microsoft.com/support/legal/preview-supplemental-terms/) for legal terms that apply to Azure features that are in beta, preview, or otherwise not yet released into general availability.
     * @return builder
     */
    def logScrubbing(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyLogScrubbingArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyLogScrubbingArgs.builder
      builder.logScrubbing(args(argsBuilder).build)

    /**
     * @param managedRules One or more `managedRule` blocks as defined below.
     * @return builder
     */
    def managedRules(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyState.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleArgs.builder
      builder.managedRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesArgs.Builder)
    /**
     * @param firewall An `firewall` block as defined below.
     * @return builder
     */
    def firewall(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallArgs.builder
      builder.firewall(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorRuleState.Builder)
    /**
     * @param actions An `actions` block as defined below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsArgs.builder
      builder.actions(args(argsBuilder).build)

    /**
     * @param conditions A `conditions` block as defined below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.builder
      builder.conditions(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideRuleArgs.Builder)
    /**
     * @param exclusions One or more `exclusion` blocks as defined below.
     * @return builder
     */
    def exclusions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideRuleExclusionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideRuleExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorSecretState.Builder)
    /**
     * @param secret A `secret` block as defined below. Changing this forces a new Front Door Secret to be created.
     * @return builder
     */
    def secret(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorSecretSecretArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorSecretState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorSecretSecretArgs.builder
      builder.secret(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorOriginState.Builder)
    /**
     * @param privateLink A `privateLink` block as defined below.
     * 
     *  &gt; **Note:** Private Link requires that the Front Door Profile this Origin is hosted within is using the SKU `Premium_AzureFrontDoor` and that the `certificateNameCheckEnabled` field is set to `true`.
     * @return builder
     */
    def privateLink(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorOriginPrivateLinkArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorOriginState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorOriginPrivateLinkArgs.builder
      builder.privateLink(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupState.Builder)
    /**
     * @param healthProbe A `healthProbe` block as defined below.
     * @return builder
     */
    def healthProbe(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupHealthProbeArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupHealthProbeArgs.builder
      builder.healthProbe(args(argsBuilder).build)

    /**
     * @param loadBalancing A `loadBalancing` block as defined below.
     * @return builder
     */
    def loadBalancing(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupLoadBalancingArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupLoadBalancingArgs.builder
      builder.loadBalancing(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicyState.Builder)
    /**
     * @param securityPolicies An `securityPolicies` block as defined below.
     * @return builder
     */
    def securityPolicies(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesArgs.builder
      builder.securityPolicies(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder)
    /**
     * @param cacheExpirationAction A `cacheExpirationAction` block as defined above.
     * @return builder
     */
    def cacheExpirationAction(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleCacheExpirationActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleCacheExpirationActionArgs.builder
      builder.cacheExpirationAction(args(argsBuilder).build)

    /**
     * @param cacheKeyQueryStringAction A `cacheKeyQueryStringAction` block as defined above.
     * @return builder
     */
    def cacheKeyQueryStringAction(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleCacheKeyQueryStringActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleCacheKeyQueryStringActionArgs.builder
      builder.cacheKeyQueryStringAction(args(argsBuilder).build)

    /**
     * @param cookiesConditions A `cookiesCondition` block as defined above.
     * @return builder
     */
    def cookiesConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleCookiesConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleCookiesConditionArgs.builder
      builder.cookiesConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param deviceCondition A `deviceCondition` block as defined below.
     * @return builder
     */
    def deviceCondition(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleDeviceConditionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleDeviceConditionArgs.builder
      builder.deviceCondition(args(argsBuilder).build)

    /**
     * @param httpVersionConditions A `httpVersionCondition` block as defined below.
     * @return builder
     */
    def httpVersionConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleHttpVersionConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleHttpVersionConditionArgs.builder
      builder.httpVersionConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param modifyRequestHeaderActions A `modifyRequestHeaderAction` block as defined below.
     * @return builder
     */
    def modifyRequestHeaderActions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleModifyRequestHeaderActionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleModifyRequestHeaderActionArgs.builder
      builder.modifyRequestHeaderActions(args.map(_(argsBuilder).build)*)

    /**
     * @param modifyResponseHeaderActions A `modifyResponseHeaderAction` block as defined below.
     * @return builder
     */
    def modifyResponseHeaderActions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleModifyResponseHeaderActionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleModifyResponseHeaderActionArgs.builder
      builder.modifyResponseHeaderActions(args.map(_(argsBuilder).build)*)

    /**
     * @param postArgConditions A `postArgCondition` block as defined below.
     * @return builder
     */
    def postArgConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRulePostArgConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRulePostArgConditionArgs.builder
      builder.postArgConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param queryStringConditions A `queryStringCondition` block as defined below.
     * @return builder
     */
    def queryStringConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleQueryStringConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleQueryStringConditionArgs.builder
      builder.queryStringConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param remoteAddressConditions A `remoteAddressCondition` block as defined below.
     * @return builder
     */
    def remoteAddressConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRemoteAddressConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRemoteAddressConditionArgs.builder
      builder.remoteAddressConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param requestBodyConditions A `requestBodyCondition` block as defined below.
     * @return builder
     */
    def requestBodyConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRequestBodyConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRequestBodyConditionArgs.builder
      builder.requestBodyConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param requestHeaderConditions A `requestHeaderCondition` block as defined below.
     * @return builder
     */
    def requestHeaderConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRequestHeaderConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRequestHeaderConditionArgs.builder
      builder.requestHeaderConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param requestMethodCondition A `requestMethodCondition` block as defined below.
     * @return builder
     */
    def requestMethodCondition(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRequestMethodConditionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRequestMethodConditionArgs.builder
      builder.requestMethodCondition(args(argsBuilder).build)

    /**
     * @param requestSchemeCondition A `requestSchemeCondition` block as defined below.
     * @return builder
     */
    def requestSchemeCondition(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRequestSchemeConditionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRequestSchemeConditionArgs.builder
      builder.requestSchemeCondition(args(argsBuilder).build)

    /**
     * @param requestUriConditions A `requestUriCondition` block as defined below.
     * @return builder
     */
    def requestUriConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRequestUriConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRequestUriConditionArgs.builder
      builder.requestUriConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param urlFileExtensionConditions A `urlFileExtensionCondition` block as defined below.
     * @return builder
     */
    def urlFileExtensionConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleUrlFileExtensionConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleUrlFileExtensionConditionArgs.builder
      builder.urlFileExtensionConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param urlFileNameConditions A `urlFileNameCondition` block as defined below.
     * @return builder
     */
    def urlFileNameConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleUrlFileNameConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleUrlFileNameConditionArgs.builder
      builder.urlFileNameConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param urlPathConditions A `urlPathCondition` block as defined below.
     * @return builder
     */
    def urlPathConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleUrlPathConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleUrlPathConditionArgs.builder
      builder.urlPathConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param urlRedirectAction A `urlRedirectAction` block as defined below.
     * @return builder
     */
    def urlRedirectAction(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleUrlRedirectActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleUrlRedirectActionArgs.builder
      builder.urlRedirectAction(args(argsBuilder).build)

    /**
     * @param urlRewriteAction A `urlRewriteAction` block as defined below.
     * @return builder
     */
    def urlRewriteAction(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleUrlRewriteActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleUrlRewriteActionArgs.builder
      builder.urlRewriteAction(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorSecretSecretArgs.Builder)
    /**
     * @param customerCertificates A `customerCertificate` block as defined below. Changing this forces a new Front Door Secret to be created.
     * @return builder
     */
    def customerCertificates(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorSecretSecretCustomerCertificateArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorSecretSecretArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorSecretSecretCustomerCertificateArgs.builder
      builder.customerCertificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorRouteState.Builder)
    /**
     * @param cache A `cache` block as defined below.
     * 
     *  &gt; **Note:** To disable caching, do not provide the `cache` block in the configuration file.
     * @return builder
     */
    def cache(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRouteCacheArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorRouteState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRouteCacheArgs.builder
      builder.cache(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyCustomRuleArgs.Builder)
    /**
     * @param matchConditions One or more `matchCondition` block defined below. Can support up to `10` `matchCondition` blocks.
     * @return builder
     */
    def matchConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyCustomRuleMatchConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyCustomRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyCustomRuleMatchConditionArgs.builder
      builder.matchConditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder)
    /**
     * @param clientPortConditions A `clientPortCondition` block as defined below.
     * @return builder
     */
    def clientPortConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsClientPortConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsClientPortConditionArgs.builder
      builder.clientPortConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param cookiesConditions A `cookiesCondition` block as defined below.
     * @return builder
     */
    def cookiesConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsCookiesConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsCookiesConditionArgs.builder
      builder.cookiesConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param hostNameConditions A `hostNameCondition` block as defined below.
     * @return builder
     */
    def hostNameConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsHostNameConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsHostNameConditionArgs.builder
      builder.hostNameConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param httpVersionConditions A `httpVersionCondition` block as defined below.
     * @return builder
     */
    def httpVersionConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsHttpVersionConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsHttpVersionConditionArgs.builder
      builder.httpVersionConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param isDeviceConditions A `isDeviceCondition` block as defined below.
     * @return builder
     */
    def isDeviceConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsIsDeviceConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsIsDeviceConditionArgs.builder
      builder.isDeviceConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param postArgsConditions A `postArgsCondition` block as defined below.
     * @return builder
     */
    def postArgsConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsPostArgsConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsPostArgsConditionArgs.builder
      builder.postArgsConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param queryStringConditions A `queryStringCondition` block as defined below.
     * @return builder
     */
    def queryStringConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsQueryStringConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsQueryStringConditionArgs.builder
      builder.queryStringConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param remoteAddressConditions A `remoteAddressCondition` block as defined below.
     * @return builder
     */
    def remoteAddressConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRemoteAddressConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRemoteAddressConditionArgs.builder
      builder.remoteAddressConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param requestBodyConditions A `requestBodyCondition` block as defined below.
     * @return builder
     */
    def requestBodyConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRequestBodyConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRequestBodyConditionArgs.builder
      builder.requestBodyConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param requestHeaderConditions A `requestHeaderCondition` block as defined below.
     * @return builder
     */
    def requestHeaderConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRequestHeaderConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRequestHeaderConditionArgs.builder
      builder.requestHeaderConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param requestMethodConditions A `requestMethodCondition` block as defined below.
     * @return builder
     */
    def requestMethodConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRequestMethodConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRequestMethodConditionArgs.builder
      builder.requestMethodConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param requestSchemeConditions A `requestSchemeCondition` block as defined below.
     * @return builder
     */
    def requestSchemeConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRequestSchemeConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRequestSchemeConditionArgs.builder
      builder.requestSchemeConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param requestUriConditions A `requestUriCondition` block as defined below.
     * @return builder
     */
    def requestUriConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRequestUriConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRequestUriConditionArgs.builder
      builder.requestUriConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param serverPortConditions A `serverPortCondition` block as defined below.
     * @return builder
     */
    def serverPortConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsServerPortConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsServerPortConditionArgs.builder
      builder.serverPortConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param socketAddressConditions A `socketAddressCondition` block as defined below.
     * @return builder
     */
    def socketAddressConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsSocketAddressConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsSocketAddressConditionArgs.builder
      builder.socketAddressConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param sslProtocolConditions A `sslProtocolCondition` block as defined below.
     * @return builder
     */
    def sslProtocolConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsSslProtocolConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsSslProtocolConditionArgs.builder
      builder.sslProtocolConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param urlFileExtensionConditions A `urlFileExtensionCondition` block as defined below.
     * @return builder
     */
    def urlFileExtensionConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsUrlFileExtensionConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsUrlFileExtensionConditionArgs.builder
      builder.urlFileExtensionConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param urlFilenameConditions A `urlFilenameCondition` block as defined below.
     * @return builder
     */
    def urlFilenameConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsUrlFilenameConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsUrlFilenameConditionArgs.builder
      builder.urlFilenameConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param urlPathConditions A `urlPathCondition` block as defined below.
     * @return builder
     */
    def urlPathConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsUrlPathConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsUrlPathConditionArgs.builder
      builder.urlPathConditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorCustomDomainState.Builder)
    /**
     * @param tls A `tls` block as defined below.
     * @return builder
     */
    def tls(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorCustomDomainTlsArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorCustomDomainState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorCustomDomainTlsArgs.builder
      builder.tls(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallArgs.Builder)
    /**
     * @param association An `association` block as defined below.
     * @return builder
     */
    def association(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallAssociationArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallAssociationArgs.builder
      builder.association(args(argsBuilder).build)

  /** Manages a Front Door (standard/premium) Profile which contains a collection of endpoints and origin groups. */
  def FrontdoorProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorProfileArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.cdn.FrontdoorProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
