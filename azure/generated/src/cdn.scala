package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object cdn:
  object CdnFunctions:
    /**
     * Gets information about an existing Front Door (standard/premium) Batch Rule Set.
     * 
     * &gt; **Note:** This data source can only read Rule Sets that were provisioned in batch mode. Use the `azure.cdn.FrontdoorRuleSet` data source for Rule Sets that were not provisioned in batch mode.
     */
    inline def getFrontdoorBatchRuleSet(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorBatchRuleSetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.cdn.outputs.GetFrontdoorBatchRuleSetResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorBatchRuleSetArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorBatchRuleSet(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Gets information about an existing Front Door (standard/premium) Batch Rule Set.
     * 
     * &gt; **Note:** This data source can only read Rule Sets that were provisioned in batch mode. Use the `azure.cdn.FrontdoorRuleSet` data source for Rule Sets that were not provisioned in batch mode.
     */
    inline def getFrontdoorBatchRuleSetPlain(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorBatchRuleSetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cdn.outputs.GetFrontdoorBatchRuleSetResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorBatchRuleSetPlainArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorBatchRuleSetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Gets information about an existing Front Door (standard/premium) Custom Domain. */
    inline def getFrontdoorCustomDomain(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorCustomDomainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.cdn.outputs.GetFrontdoorCustomDomainResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorCustomDomainArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorCustomDomain(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Gets information about an existing Front Door (standard/premium) Custom Domain. */
    inline def getFrontdoorCustomDomainPlain(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorCustomDomainPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cdn.outputs.GetFrontdoorCustomDomainResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorCustomDomainPlainArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorCustomDomainPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Endpoint. */
    inline def getFrontdoorEndpoint(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorEndpointArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.cdn.outputs.GetFrontdoorEndpointResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorEndpointArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorEndpoint(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Endpoint. */
    inline def getFrontdoorEndpointPlain(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorEndpointPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cdn.outputs.GetFrontdoorEndpointResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorEndpointPlainArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorEndpointPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Firewall Policy. */
    inline def getFrontdoorFirewallPolicy(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorFirewallPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.cdn.outputs.GetFrontdoorFirewallPolicyResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorFirewallPolicyArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorFirewallPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Firewall Policy. */
    inline def getFrontdoorFirewallPolicyPlain(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorFirewallPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cdn.outputs.GetFrontdoorFirewallPolicyResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorFirewallPolicyPlainArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorFirewallPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Origin Group. */
    inline def getFrontdoorOriginGroup(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorOriginGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.cdn.outputs.GetFrontdoorOriginGroupResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorOriginGroupArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorOriginGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Origin Group. */
    inline def getFrontdoorOriginGroupPlain(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorOriginGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cdn.outputs.GetFrontdoorOriginGroupResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorOriginGroupPlainArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorOriginGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Profile. */
    inline def getFrontdoorProfile(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorProfileArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.cdn.outputs.GetFrontdoorProfileResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorProfileArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorProfile(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Profile. */
    inline def getFrontdoorProfilePlain(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorProfilePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cdn.outputs.GetFrontdoorProfileResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorProfilePlainArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorProfilePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to access information about an existing Front Door (standard/premium) Rule Set.
     * 
     * &gt; **Note:** This data source can only read Rule Sets that were not provisioned in batch mode. Use the `azure.cdn.FrontdoorBatchRuleSet` data source for Rule Sets that were provisioned in batch mode.
     */
    inline def getFrontdoorRuleSet(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorRuleSetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.cdn.outputs.GetFrontdoorRuleSetResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorRuleSetArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorRuleSet(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to access information about an existing Front Door (standard/premium) Rule Set.
     * 
     * &gt; **Note:** This data source can only read Rule Sets that were not provisioned in batch mode. Use the `azure.cdn.FrontdoorBatchRuleSet` data source for Rule Sets that were provisioned in batch mode.
     */
    inline def getFrontdoorRuleSetPlain(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorRuleSetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cdn.outputs.GetFrontdoorRuleSetResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorRuleSetPlainArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorRuleSetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Secret. */
    inline def getFrontdoorSecret(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorSecretArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.cdn.outputs.GetFrontdoorSecretResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorSecretArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorSecret(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Front Door (standard/premium) Secret. */
    inline def getFrontdoorSecretPlain(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorSecretPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cdn.outputs.GetFrontdoorSecretResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorSecretPlainArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorSecretPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Gets information about an existing Front Door (standard/premium) Security Policy. */
    inline def getFrontdoorSecurityPolicy(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorSecurityPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.cdn.outputs.GetFrontdoorSecurityPolicyResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorSecurityPolicyArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorSecurityPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Gets information about an existing Front Door (standard/premium) Security Policy. */
    inline def getFrontdoorSecurityPolicyPlain(args: Endofunction[com.pulumi.azure.cdn.inputs.GetFrontdoorSecurityPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cdn.outputs.GetFrontdoorSecurityPolicyResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetFrontdoorSecurityPolicyPlainArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getFrontdoorSecurityPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing CDN Profile. */
    inline def getProfile(args: Endofunction[com.pulumi.azure.cdn.inputs.GetProfileArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.cdn.outputs.GetProfileResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetProfileArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getProfile(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing CDN Profile. */
    inline def getProfilePlain(args: Endofunction[com.pulumi.azure.cdn.inputs.GetProfilePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cdn.outputs.GetProfileResult] =
      val argsBuilder = com.pulumi.azure.cdn.inputs.GetProfilePlainArgs.builder
      com.pulumi.azure.cdn.CdnFunctions.getProfilePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * A CDN (classic) Endpoint is the entity within a CDN Profile containing configuration information regarding caching behaviours and origins. The CDN Endpoint is exposed using the URL format `&lt;endpointname&gt;.azureedge.net`.
   * 
   * &gt; **Note:** Azure rolled out a breaking change on Friday 9th April 2021 which may cause issues with the CDN/FrontDoor resources. More information is available in this GitHub issue - unfortunately this may necessitate a breaking change to the CDN (classic) and FrontDoor (classic) resources, more information will be posted in the GitHub issue as the necessary changes are identified.
   * 
   * &gt; **Note:** Support for the CDN (classic) `sku` `Standard_Akamai` was deprecated from Azure on `October 31, 2023` and is no longer available.
   * 
   * &gt; **Note:** Support for the CDN (classic) `sku` `Standard_Verizon` and `Premium_Verizon` was deprecated from Azure on `January 15, 2025` and is no longer available.
   * 
   * &gt; **Note:** Support for the CDN (classic) `sku` `Standard_Microsoft` and `Standard_ChinaCdn` will be deprecated from Azure on `October 1, 2025` and will no longer be available, however modifications to existing CDN (classic) resources will continue to be supported until the API reaches full retirement on `September 30, 2027`.
   */
  inline def Endpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cdn.EndpointArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.EndpointArgs.builder
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
    com.pulumi.azure.cdn.Endpoint(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Custom Domain for a CDN (classic) Endpoint.
   * 
   * &gt; **Note:** Support for the CDN (classic) `sku` `Standard_Akamai` was deprecated from Azure on `October 31, 2023` and is no longer available.
   * 
   * &gt; **Note:** Support for the CDN (classic) `sku` values `Standard_Verizon` and `Premium_Verizon` were deprecated from Azure on `January 15, 2025` and are no longer available.
   * 
   * &gt; **Note:** Support for the CDN (classic) `sku` values `Standard_Microsoft` and `Standard_ChinaCdn` will be deprecated from Azure on `October 1, 2025` and will no longer be available, however, modifications to existing CDN (classic) resources will continue to be supported until the API reaches full retirement on `September 30, 2027`.
   */
  inline def EndpointCustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cdn.EndpointCustomDomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.EndpointCustomDomainArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cdn.EndpointCustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Front Door (standard/premium) Batch Rule Set.
   * 
   * &gt; **Note:** This resource creates the Front Door Rule Set in batch mode and manages the full ordered batch rule collection for it. Any change to the configured `rule` blocks sends the desired final ordered rule list to the Resource Provider in a single request.
   */
  inline def FrontdoorBatchRuleSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorBatchRuleSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorBatchRuleSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cdn.FrontdoorBatchRuleSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Front Door (standard/premium) Custom Domain.
   * 
   * &gt; **Note:** If you are using Terraform to manage your DNS Auth and DNS CNAME records for your Custom Domain you will need to add configuration blocks for both the `azure.dns.TxtRecord` (see the `Example DNS Auth TXT Record Usage` below) and the `azure.dns.CNameRecord` (see the `Example CNAME Record Usage` below) to your configuration file.
   */
  inline def FrontdoorCustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorCustomDomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorCustomDomainArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cdn.FrontdoorCustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages the association between a Front Door (standard/premium) Custom Domain and one or more Front Door (standard/premium) Routes.
   * 
   * &gt; **Note:** Domain ownership validation for Azure Front Door custom domains is performed asynchronously by the service (typically transitioning through states like `Submitting` and `Pending` before becoming `Approved`). For details on the required `_dnsauth` TXT record and the possible validation states, see the Azure Front Door documentation on [domain validation](https://learn.microsoft.com/azure/frontdoor/domain#domain-validation).
   */
  inline def FrontdoorCustomDomainAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorCustomDomainAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.cdn.FrontdoorCustomDomainAssociationArgs.builder
    com.pulumi.azure.cdn.FrontdoorCustomDomainAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Front Door (standard/premium) Endpoint. */
  inline def FrontdoorEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorEndpointArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorEndpointArgs.builder
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
    com.pulumi.azure.cdn.FrontdoorEndpoint(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Front Door (standard/premium) Firewall Policy instance. */
  inline def FrontdoorFirewallPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorFirewallPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorFirewallPolicyArgs.builder
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
    com.pulumi.azure.cdn.FrontdoorFirewallPolicy(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Front Door (standard/premium) Origin.
   * 
   * &gt; **Note:** If you are attempting to implement an Origin that uses its own Private Link Service with a Load Balancer the Profile resource in your configuration file **must** have a `dependsOn` meta-argument which references the `azure.privatedns.LinkService`, see `Example Usage With Private Link Service` below.
   */
  inline def FrontdoorOrigin(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorOriginArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorOriginArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cdn.FrontdoorOrigin(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Front Door (standard/premium) Origin Group. */
  inline def FrontdoorOriginGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorOriginGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorOriginGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cdn.FrontdoorOriginGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Front Door (standard/premium) Profile which contains a collection of endpoints and origin groups. */
  inline def FrontdoorProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorProfileArgs.builder
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
    com.pulumi.azure.cdn.FrontdoorProfile(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Front Door (standard/premium) Route.
   * 
   * &gt; **Note:** The `azure.cdn.FrontdoorRoute` resource must **explicitly** reference its associated `azure.cdn.FrontdoorOrigin` resource(s). This can be achieved either by using a `dependsOn` meta-argument that points to the `azure.cdn.FrontdoorOrigin` resource(s), or by specifying the `azure.cdn.FrontdoorOrigin` IDs via the `cdnFrontdoorOriginIds` field.
   */
  inline def FrontdoorRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorRouteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorRouteArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cdn.FrontdoorRoute(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Front Door (standard/premium) Rule.
   * 
   * &gt; **Note:** The Rules resource **must** include a `dependsOn` meta-argument which references the `azure.cdn.FrontdoorOrigin` and the `azure.cdn.FrontdoorOriginGroup`.
   * 
   * &gt; **Note:** This resource cannot be used to manage individual rules for a rule set provisioned in batch mode, to manage rules for a batch mode rule set, use `azure.cdn.FrontdoorBatchRuleSet`.
   */
  inline def FrontdoorRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cdn.FrontdoorRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Front Door (standard/premium) Rule Set.
   * 
   * &gt; **Note:** This resource creates the Front Door Rule Set in non-batch mode and individual rules are managed using `azure.cdn.FrontdoorRule`.
   */
  inline def FrontdoorRuleSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorRuleSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorRuleSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cdn.FrontdoorRuleSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Front Door (standard/premium) Secret.
   * 
   * ## Required Key Vault Permissions
   * 
   * &gt; **Note:** You must add an `Access Policy` to your `azure.keyvault.KeyVault` for the `Microsoft.AzurefrontDoor-Cdn` Enterprise Application Object ID.
   * 
   * This can be created by running Az Powershell command like this:
   * 
   * ```New-AzADServicePrincipal -ApplicationId &#34;00000000-0000-0000-0000-000000000000&#34;```
   * 
   * | Object ID                                | Key Permissions | Secret Permissions   | Certificate Permissions                       |
   * |:-----------------------------------------|:---------------:|:--------------------:|:---------------------------------------------:|
   * | `Microsoft.Azure.Cdn` Object ID          | -               | **Get**              | -                                             |
   * | Your Personal AAD Object ID              | -               | **Get** and **List** | **Get**, **List**, **Purge** and **Recover**  |
   * | Terraform Service Principal              | -               | **Get**              | **Get**, **Import**, **Delete** and **Purge** |
   * 
   * -&gt; **Note:** You only need to add the `Access Policy` for your personal AAD Object ID if you are planning to view the `secrets` via the Azure Portal.
   * 
   * ## Import
   * 
   * Front Door Secrets can be imported using the `resource id`, e.g.
   * 
   * ```sh
   * \$ pulumi import azure:cdn/frontdoorSecret:FrontdoorSecret example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Cdn/profiles/profile1/secrets/secrets1
   * ```
   */
  inline def FrontdoorSecret(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorSecretArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorSecretArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cdn.FrontdoorSecret(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Front Door (standard/premium) Security Policy. */
  inline def FrontdoorSecurityPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cdn.FrontdoorSecurityPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.FrontdoorSecurityPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cdn.FrontdoorSecurityPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a CDN (classic) Profile to create a collection of CDN Endpoints.
   * 
   * &gt; **Note:** Azure rolled out a breaking change on Friday 9th April 2021 which may cause issues with the CDN/FrontDoor resources. More information is available in this GitHub issue - unfortunately this may necessitate a breaking change to the CDN and FrontDoor resources, more information will be posted in the GitHub issue as the necessary changes are identified.
   * 
   * &gt; **Note:** Support for the CDN (classic) `sku` `Standard_Akamai` was deprecated from Azure on `October 31, 2023` and is no longer available.
   * 
   * &gt; **Note:** Support for the CDN (classic) `sku` `Standard_Verizon` and `Premium_Verizon` was deprecated from Azure on `January 15, 2025` and is no longer available.
   * 
   * &gt; **Note:** Support for the CDN (classic) `sku` `Standard_Microsoft` and `Standard_ChinaCdn` will be deprecated from Azure on `October 1, 2025` and will no longer be available, however modifications to existing CDN (classic) resources will continue to be supported until the API reaches full retirement on `September 30, 2027`.
   */
  inline def Profile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cdn.ProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cdn.ProfileArgs.builder
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
    com.pulumi.azure.cdn.Profile(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
