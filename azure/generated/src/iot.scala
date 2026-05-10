package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object iot:
  /**
   * Manages an IotHub Storage Container Endpoint
   * 
   *  &gt; **Note:** Endpoints can be defined either directly on the `azure.iot.IoTHub` resource, or using the `azurerm_iothub_endpoint_*` resources - but the two ways of defining the endpoints cannot be used together. If both are used against the same IoTHub, spurious changes will occur. Also, defining a `azurerm_iothub_endpoint_*` resource and another endpoint of a different type directly on the `azure.iot.IoTHub` resource is not supported.
   */
  def EndpointStorageContainer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iot.EndpointStorageContainerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.iot.EndpointStorageContainerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.iot.EndpointStorageContainer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.iot.IoTHubArgs.Builder)
    def cloudToDevice(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubCloudToDeviceArgs.Builder]):
        com.pulumi.azure.iot.IoTHubArgs.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IoTHubCloudToDeviceArgs.builder
      builder.cloudToDevice(args(argsBuilder).build)

    /**
     * @param endpoints An `endpoint` block as defined below.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubEndpointArgs.Builder]*):
        com.pulumi.azure.iot.IoTHubArgs.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

    def enrichments(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubEnrichmentArgs.Builder]*):
        com.pulumi.azure.iot.IoTHubArgs.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubEnrichmentArgs.builder
      builder.enrichments(args.map(_(argsBuilder).build)*)

    /**
     * @param fallbackRoute A `fallbackRoute` block as defined below. If the fallback route is enabled, messages that don&#39;t match any of the supplied routes are automatically sent to this route. Defaults to messages/events.
     * 
     *  &gt; **Note:** If `fallbackRoute` isn&#39;t explicitly specified, the fallback route wouldn&#39;t be enabled by default.
     * @return builder
     */
    def fallbackRoute(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubFallbackRouteArgs.Builder]):
        com.pulumi.azure.iot.IoTHubArgs.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IoTHubFallbackRouteArgs.builder
      builder.fallbackRoute(args(argsBuilder).build)

    /**
     * @param fileUpload A `fileUpload` block as defined below.
     * @return builder
     */
    def fileUpload(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubFileUploadArgs.Builder]):
        com.pulumi.azure.iot.IoTHubArgs.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IoTHubFileUploadArgs.builder
      builder.fileUpload(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubIdentityArgs.Builder]):
        com.pulumi.azure.iot.IoTHubArgs.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IoTHubIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkRuleSets A `networkRuleSet` block as defined below.
     * @return builder
     */
    def networkRuleSets(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubNetworkRuleSetArgs.Builder]*):
        com.pulumi.azure.iot.IoTHubArgs.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubNetworkRuleSetArgs.builder
      builder.networkRuleSets(args.map(_(argsBuilder).build)*)

    def routes(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubRouteArgs.Builder]*):
        com.pulumi.azure.iot.IoTHubArgs.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubSkuArgs.Builder]):
        com.pulumi.azure.iot.IoTHubArgs.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IoTHubSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.iot.IoTHubArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages an IotHub Enrichment
   * 
   *  &gt; **Note:** Enrichment can be defined either directly on the `azure.iot.IoTHub` resource, or using the `azure.iot.Enrichment` resources - but the two cannot be used together. If both are used against the same IoTHub, spurious changes will occur.
   */
  def Enrichment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iot.EnrichmentArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.iot.EnrichmentArgs.builder
    com.pulumi.azure.iot.Enrichment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an IotHub ServiceBus Queue Endpoint
   * 
   *  &gt; **Note:** Endpoints can be defined either directly on the `azure.iot.IoTHub` resource, or using the `azurerm_iothub_endpoint_*` resources - but the two ways of defining the endpoints cannot be used together. If both are used against the same IoTHub, spurious changes will occur. Also, defining a `azurerm_iothub_endpoint_*` resource and another endpoint of a different type directly on the `azure.iot.IoTHub` resource is not supported.
   */
  def EndpointServicebusQueue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iot.EndpointServicebusQueueArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.iot.EndpointServicebusQueueArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.iot.EndpointServicebusQueue(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.iot.IotHubDpsArgs.Builder)
    /**
     * @param ipFilterRules An `ipFilterRule` block as defined below.
     * @return builder
     */
    def ipFilterRules(args: Endofunction[com.pulumi.azure.iot.inputs.IotHubDpsIpFilterRuleArgs.Builder]*):
        com.pulumi.azure.iot.IotHubDpsArgs.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IotHubDpsIpFilterRuleArgs.builder
      builder.ipFilterRules(args.map(_(argsBuilder).build)*)

    /**
     * @param linkedHubs A `linkedHub` block as defined below.
     * @return builder
     */
    def linkedHubs(args: Endofunction[com.pulumi.azure.iot.inputs.IotHubDpsLinkedHubArgs.Builder]*):
        com.pulumi.azure.iot.IotHubDpsArgs.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IotHubDpsLinkedHubArgs.builder
      builder.linkedHubs(args.map(_(argsBuilder).build)*)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.iot.inputs.IotHubDpsSkuArgs.Builder]):
        com.pulumi.azure.iot.IotHubDpsArgs.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IotHubDpsSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.iot.IotHubDpsArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  type IotFunctions = com.pulumi.azure.iot.IotFunctions
  object IotFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.iot.IotFunctions.*
  extension (self: IotFunctions.type)
    /** Use this data source to access information about an existing IotHub Device Provisioning Service. */
    def getDps(args: Endofunction[com.pulumi.azure.iot.inputs.GetDpsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.iot.outputs.GetDpsResult] =
      val argsBuilder = com.pulumi.azure.iot.inputs.GetDpsArgs.builder
      com.pulumi.azure.iot.IotFunctions.getDps(args(argsBuilder).build)

    /** Use this data source to access information about an existing IotHub Device Provisioning Service. */
    def getDpsPlain(args: Endofunction[com.pulumi.azure.iot.inputs.GetDpsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.iot.outputs.GetDpsResult] =
      val argsBuilder = com.pulumi.azure.iot.inputs.GetDpsPlainArgs.builder
      com.pulumi.azure.iot.IotFunctions.getDpsPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing IotHub Device Provisioning Service Shared Access Policy */
    def getDpsSharedAccessPolicy(args: Endofunction[com.pulumi.azure.iot.inputs.GetDpsSharedAccessPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.iot.outputs.GetDpsSharedAccessPolicyResult] =
      val argsBuilder = com.pulumi.azure.iot.inputs.GetDpsSharedAccessPolicyArgs.builder
      com.pulumi.azure.iot.IotFunctions.getDpsSharedAccessPolicy(args(argsBuilder).build)

    /** Use this data source to access information about an existing IotHub Device Provisioning Service Shared Access Policy */
    def getDpsSharedAccessPolicyPlain(args: Endofunction[com.pulumi.azure.iot.inputs.GetDpsSharedAccessPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.iot.outputs.GetDpsSharedAccessPolicyResult] =
      val argsBuilder = com.pulumi.azure.iot.inputs.GetDpsSharedAccessPolicyPlainArgs.builder
      com.pulumi.azure.iot.IotFunctions.getDpsSharedAccessPolicyPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing IoTHub. */
    def getIotHub(args: Endofunction[com.pulumi.azure.iot.inputs.GetIotHubArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.iot.outputs.GetIotHubResult] =
      val argsBuilder = com.pulumi.azure.iot.inputs.GetIotHubArgs.builder
      com.pulumi.azure.iot.IotFunctions.getIotHub(args(argsBuilder).build)

    /** Use this data source to access information about an existing IoTHub. */
    def getIotHubPlain(args: Endofunction[com.pulumi.azure.iot.inputs.GetIotHubPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.iot.outputs.GetIotHubResult] =
      val argsBuilder = com.pulumi.azure.iot.inputs.GetIotHubPlainArgs.builder
      com.pulumi.azure.iot.IotFunctions.getIotHubPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing IotHub Shared Access Policy */
    def getSharedAccessPolicy(args: Endofunction[com.pulumi.azure.iot.inputs.GetSharedAccessPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.iot.outputs.GetSharedAccessPolicyResult] =
      val argsBuilder = com.pulumi.azure.iot.inputs.GetSharedAccessPolicyArgs.builder
      com.pulumi.azure.iot.IotFunctions.getSharedAccessPolicy(args(argsBuilder).build)

    /** Use this data source to access information about an existing IotHub Shared Access Policy */
    def getSharedAccessPolicyPlain(args: Endofunction[com.pulumi.azure.iot.inputs.GetSharedAccessPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.iot.outputs.GetSharedAccessPolicyResult] =
      val argsBuilder = com.pulumi.azure.iot.inputs.GetSharedAccessPolicyPlainArgs.builder
      com.pulumi.azure.iot.IotFunctions.getSharedAccessPolicyPlain(args(argsBuilder).build)

  /** Manages an IotHub Device Provisioning Service Shared Access Policy */
  def DpsSharedAccessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iot.DpsSharedAccessPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.iot.DpsSharedAccessPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.iot.DpsSharedAccessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an IotHub Route
   * 
   *  &gt; **Note:** Routes can be defined either directly on the `azure.iot.IoTHub` resource, or using the `azure.iot.Route` resource - but the two cannot be used together. If both are used against the same IoTHub, spurious changes will occur.
   */
  def Route(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iot.RouteArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.iot.RouteArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.iot.Route(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an IotHub Certificate. */
  def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iot.CertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.iot.CertificateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.iot.Certificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an IotHub Cosmos DB Account Endpoint
   * 
   *  &gt; **Note:** Endpoints can be defined either directly on the `azure.iot.IoTHub` resource, or using the `azurerm_iothub_endpoint_*` resources - but the two ways of defining the endpoints cannot be used together. If both are used against the same IoTHub, spurious changes will occur. Also, defining a `azurerm_iothub_endpoint_*` resource and another endpoint of a different type directly on the `azure.iot.IoTHub` resource is not supported.
   */
  def EndpointCosmosdbAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iot.EndpointCosmosdbAccountArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.iot.EndpointCosmosdbAccountArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.iot.EndpointCosmosdbAccount(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an IoT Hub Device Update Account. */
  def IotHubDeviceUpdateAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iot.IotHubDeviceUpdateAccountArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.iot.IotHubDeviceUpdateAccountArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.iot.IotHubDeviceUpdateAccount(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an iot security solution. */
  def SecuritySolution(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iot.SecuritySolutionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.iot.SecuritySolutionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.iot.SecuritySolution(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Iot Security Device Group. */
  def SecurityDeviceGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iot.SecurityDeviceGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.iot.SecurityDeviceGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.iot.SecurityDeviceGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an IotHub
   * 
   *  &gt; **Note:** Endpoints can be defined either directly on the `azure.iot.IoTHub` resource, or using the `azurerm_iothub_endpoint_*` resources - but the two ways of defining the endpoints cannot be used together. If both are used against the same IoTHub, spurious changes will occur. Also, defining a `azurerm_iothub_endpoint_*` resource and another endpoint of a different type directly on the `azure.iot.IoTHub` resource is not supported.
   * 
   *  &gt; **Note:** Routes can be defined either directly on the `azure.iot.IoTHub` resource, or using the `azure.iot.Route` resource - but the two cannot be used together. If both are used against the same IoTHub, spurious changes will occur.
   * 
   *  &gt; **Note:** Enrichments can be defined either directly on the `azure.iot.IoTHub` resource, or using the `azure.iot.Enrichment` resource - but the two cannot be used together. If both are used against the same IoTHub, spurious changes will occur.
   * 
   *  &gt; **Note:** Fallback route can be defined either directly on the `azure.iot.IoTHub` resource, or using the `azure.iot.FallbackRoute` resource - but the two cannot be used together. If both are used against the same IoTHub, spurious changes will occur.
   * 
   *  &gt; **Note:** File upload can be defined either directly on the `azure.iot.IoTHub` resource, or using the `azure.iot.FileUpload` resource - but the two cannot be used together. If both are used against the same IoTHub, spurious changes will occur.
   */
  def IoTHub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iot.IoTHubArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.iot.IoTHubArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.iot.IoTHub(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.iot.IotHubDeviceUpdateAccountArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.iot.inputs.IotHubDeviceUpdateAccountIdentityArgs.Builder]):
        com.pulumi.azure.iot.IotHubDeviceUpdateAccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IotHubDeviceUpdateAccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.iot.IotHubDeviceUpdateAccountArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Consumer Group within an IotHub */
  def ConsumerGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iot.ConsumerGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.iot.ConsumerGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.iot.ConsumerGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.iot.SecurityDeviceGroupArgs.Builder)
    /**
     * @param allowRule an `allowRule` blocks as defined below.
     * @return builder
     */
    def allowRule(args: Endofunction[com.pulumi.azure.iot.inputs.SecurityDeviceGroupAllowRuleArgs.Builder]):
        com.pulumi.azure.iot.SecurityDeviceGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.SecurityDeviceGroupAllowRuleArgs.builder
      builder.allowRule(args(argsBuilder).build)

    /**
     * @param rangeRules One or more `rangeRule` blocks as defined below.
     * @return builder
     */
    def rangeRules(args: Endofunction[com.pulumi.azure.iot.inputs.SecurityDeviceGroupRangeRuleArgs.Builder]*):
        com.pulumi.azure.iot.SecurityDeviceGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.SecurityDeviceGroupRangeRuleArgs.builder
      builder.rangeRules(args.map(_(argsBuilder).build)*)

  /** Manages an IotHub Device Provisioning Service Certificate. */
  def IotHubCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iot.IotHubCertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.iot.IotHubCertificateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.iot.IotHubCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an IotHub EventHub Endpoint
   * 
   *  &gt; **Note:** Endpoints can be defined either directly on the `azure.iot.IoTHub` resource, or using the `azurerm_iothub_endpoint_*` resources - but the two ways of defining the endpoints cannot be used together. If both are used against the same IoTHub, spurious changes will occur. Also, defining a `azurerm_iothub_endpoint_*` resource and another endpoint of a different type directly on the `azure.iot.IoTHub` resource is not supported.
   */
  def EndpointEventhub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iot.EndpointEventhubArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.iot.EndpointEventhubArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.iot.EndpointEventhub(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an IotHub Fallback Route
   * 
   *  ## Disclaimers
   * 
   *  &gt; **Note:** Fallback route can be defined either directly on the `azure.iot.IoTHub` resource, or using the `azure.iot.FallbackRoute` resource - but the two cannot be used together. If both are used against the same IoTHub, spurious changes will occur.
   * 
   *  &gt; **Note:** Since this resource is provisioned by default, the Azure Provider will not check for the presence of an existing resource prior to attempting to create it.
   */
  def FallbackRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iot.FallbackRouteArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.iot.FallbackRouteArgs.builder
    com.pulumi.azure.iot.FallbackRoute(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an IotHub ServiceBus Topic Endpoint
   * 
   *  &gt; **Note:** Endpoints can be defined either directly on the `azure.iot.IoTHub` resource, or using the `azurerm_iothub_endpoint_*` resources - but the two ways of defining the endpoints cannot be used together. If both are used against the same IoTHub, spurious changes will occur. Also, defining a `azurerm_iothub_endpoint_*` resource and another endpoint of a different type directly on the `azure.iot.IoTHub` resource is not supported.
   */
  def EndpointServicebusTopic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iot.EndpointServicebusTopicArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.iot.EndpointServicebusTopicArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.iot.EndpointServicebusTopic(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.iot.SecuritySolutionArgs.Builder)
    /**
     * @param additionalWorkspaces A `additionalWorkspace` block as defined below.
     * @return builder
     */
    def additionalWorkspaces(args: Endofunction[com.pulumi.azure.iot.inputs.SecuritySolutionAdditionalWorkspaceArgs.Builder]*):
        com.pulumi.azure.iot.SecuritySolutionArgs.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.SecuritySolutionAdditionalWorkspaceArgs.builder
      builder.additionalWorkspaces(args.map(_(argsBuilder).build)*)

    /**
     * @param recommendationsEnabled A `recommendationsEnabled` block of options to enable or disable as defined below.
     * @return builder
     */
    def recommendationsEnabled(args: Endofunction[com.pulumi.azure.iot.inputs.SecuritySolutionRecommendationsEnabledArgs.Builder]):
        com.pulumi.azure.iot.SecuritySolutionArgs.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.SecuritySolutionRecommendationsEnabledArgs.builder
      builder.recommendationsEnabled(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.iot.SecuritySolutionArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages the File Upload of an IoT Hub.
   * 
   *  &gt; **Note:** File upload can be defined either directly on the `azure.iot.IoTHub` resource, or using the `azure.iot.FileUpload` resource - but the two cannot be used together. If both are used against the same IoTHub, spurious changes will occur.
   */
  def FileUpload(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iot.FileUploadArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.iot.FileUploadArgs.builder
    com.pulumi.azure.iot.FileUpload(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.iot.IotHubDeviceUpdateInstanceArgs.Builder)
    /**
     * @param diagnosticStorageAccount A `diagnosticStorageAccount` block as defined below.
     * @return builder
     */
    def diagnosticStorageAccount(args: Endofunction[com.pulumi.azure.iot.inputs.IotHubDeviceUpdateInstanceDiagnosticStorageAccountArgs.Builder]):
        com.pulumi.azure.iot.IotHubDeviceUpdateInstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IotHubDeviceUpdateInstanceDiagnosticStorageAccountArgs.builder
      builder.diagnosticStorageAccount(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.iot.IotHubDeviceUpdateInstanceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.iot.inputs.SecuritySolutionState.Builder)
    /**
     * @param additionalWorkspaces A `additionalWorkspace` block as defined below.
     * @return builder
     */
    def additionalWorkspaces(args: Endofunction[com.pulumi.azure.iot.inputs.SecuritySolutionAdditionalWorkspaceArgs.Builder]*):
        com.pulumi.azure.iot.inputs.SecuritySolutionState.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.SecuritySolutionAdditionalWorkspaceArgs.builder
      builder.additionalWorkspaces(args.map(_(argsBuilder).build)*)

    /**
     * @param recommendationsEnabled A `recommendationsEnabled` block of options to enable or disable as defined below.
     * @return builder
     */
    def recommendationsEnabled(args: Endofunction[com.pulumi.azure.iot.inputs.SecuritySolutionRecommendationsEnabledArgs.Builder]):
        com.pulumi.azure.iot.inputs.SecuritySolutionState.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.SecuritySolutionRecommendationsEnabledArgs.builder
      builder.recommendationsEnabled(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.iot.inputs.SecuritySolutionState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.iot.inputs.IotHubDpsState.Builder)
    /**
     * @param ipFilterRules An `ipFilterRule` block as defined below.
     * @return builder
     */
    def ipFilterRules(args: Endofunction[com.pulumi.azure.iot.inputs.IotHubDpsIpFilterRuleArgs.Builder]*):
        com.pulumi.azure.iot.inputs.IotHubDpsState.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IotHubDpsIpFilterRuleArgs.builder
      builder.ipFilterRules(args.map(_(argsBuilder).build)*)

    /**
     * @param linkedHubs A `linkedHub` block as defined below.
     * @return builder
     */
    def linkedHubs(args: Endofunction[com.pulumi.azure.iot.inputs.IotHubDpsLinkedHubArgs.Builder]*):
        com.pulumi.azure.iot.inputs.IotHubDpsState.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IotHubDpsLinkedHubArgs.builder
      builder.linkedHubs(args.map(_(argsBuilder).build)*)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.iot.inputs.IotHubDpsSkuArgs.Builder]):
        com.pulumi.azure.iot.inputs.IotHubDpsState.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IotHubDpsSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.iot.inputs.IotHubDpsState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.iot.inputs.IoTHubState.Builder)
    def cloudToDevice(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubCloudToDeviceArgs.Builder]):
        com.pulumi.azure.iot.inputs.IoTHubState.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IoTHubCloudToDeviceArgs.builder
      builder.cloudToDevice(args(argsBuilder).build)

    /**
     * @param endpoints An `endpoint` block as defined below.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubEndpointArgs.Builder]*):
        com.pulumi.azure.iot.inputs.IoTHubState.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

    def enrichments(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubEnrichmentArgs.Builder]*):
        com.pulumi.azure.iot.inputs.IoTHubState.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubEnrichmentArgs.builder
      builder.enrichments(args.map(_(argsBuilder).build)*)

    /**
     * @param fallbackRoute A `fallbackRoute` block as defined below. If the fallback route is enabled, messages that don&#39;t match any of the supplied routes are automatically sent to this route. Defaults to messages/events.
     * 
     *  &gt; **Note:** If `fallbackRoute` isn&#39;t explicitly specified, the fallback route wouldn&#39;t be enabled by default.
     * @return builder
     */
    def fallbackRoute(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubFallbackRouteArgs.Builder]):
        com.pulumi.azure.iot.inputs.IoTHubState.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IoTHubFallbackRouteArgs.builder
      builder.fallbackRoute(args(argsBuilder).build)

    /**
     * @param fileUpload A `fileUpload` block as defined below.
     * @return builder
     */
    def fileUpload(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubFileUploadArgs.Builder]):
        com.pulumi.azure.iot.inputs.IoTHubState.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IoTHubFileUploadArgs.builder
      builder.fileUpload(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubIdentityArgs.Builder]):
        com.pulumi.azure.iot.inputs.IoTHubState.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IoTHubIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkRuleSets A `networkRuleSet` block as defined below.
     * @return builder
     */
    def networkRuleSets(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubNetworkRuleSetArgs.Builder]*):
        com.pulumi.azure.iot.inputs.IoTHubState.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubNetworkRuleSetArgs.builder
      builder.networkRuleSets(args.map(_(argsBuilder).build)*)

    def routes(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubRouteArgs.Builder]*):
        com.pulumi.azure.iot.inputs.IoTHubState.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

    /**
     * @param sharedAccessPolicies One or more `sharedAccessPolicy` blocks as defined below.
     * @return builder
     */
    def sharedAccessPolicies(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubSharedAccessPolicyArgs.Builder]*):
        com.pulumi.azure.iot.inputs.IoTHubState.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubSharedAccessPolicyArgs.builder
      builder.sharedAccessPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubSkuArgs.Builder]):
        com.pulumi.azure.iot.inputs.IoTHubState.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IoTHubSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.iot.inputs.IoTHubState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.iot.inputs.IotHubDeviceUpdateInstanceState.Builder)
    /**
     * @param diagnosticStorageAccount A `diagnosticStorageAccount` block as defined below.
     * @return builder
     */
    def diagnosticStorageAccount(args: Endofunction[com.pulumi.azure.iot.inputs.IotHubDeviceUpdateInstanceDiagnosticStorageAccountArgs.Builder]):
        com.pulumi.azure.iot.inputs.IotHubDeviceUpdateInstanceState.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IotHubDeviceUpdateInstanceDiagnosticStorageAccountArgs.builder
      builder.diagnosticStorageAccount(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.iot.inputs.IotHubDeviceUpdateInstanceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.iot.inputs.IoTHubNetworkRuleSetArgs.Builder)
    /**
     * @param ipRules One or more `ipRule` blocks as defined below.
     * @return builder
     */
    def ipRules(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubNetworkRuleSetIpRuleArgs.Builder]*):
        com.pulumi.azure.iot.inputs.IoTHubNetworkRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubNetworkRuleSetIpRuleArgs.builder
      builder.ipRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.iot.inputs.IotHubDeviceUpdateAccountState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.iot.inputs.IotHubDeviceUpdateAccountIdentityArgs.Builder]):
        com.pulumi.azure.iot.inputs.IotHubDeviceUpdateAccountState.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IotHubDeviceUpdateAccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.iot.inputs.IotHubDeviceUpdateAccountState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.iot.inputs.IoTHubCloudToDeviceArgs.Builder)
    /**
     * @param feedbacks A `feedback` block as defined below.
     * @return builder
     */
    def feedbacks(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubCloudToDeviceFeedbackArgs.Builder]*):
        com.pulumi.azure.iot.inputs.IoTHubCloudToDeviceArgs.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubCloudToDeviceFeedbackArgs.builder
      builder.feedbacks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.iot.inputs.SecurityDeviceGroupState.Builder)
    /**
     * @param allowRule an `allowRule` blocks as defined below.
     * @return builder
     */
    def allowRule(args: Endofunction[com.pulumi.azure.iot.inputs.SecurityDeviceGroupAllowRuleArgs.Builder]):
        com.pulumi.azure.iot.inputs.SecurityDeviceGroupState.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.SecurityDeviceGroupAllowRuleArgs.builder
      builder.allowRule(args(argsBuilder).build)

    /**
     * @param rangeRules One or more `rangeRule` blocks as defined below.
     * @return builder
     */
    def rangeRules(args: Endofunction[com.pulumi.azure.iot.inputs.SecurityDeviceGroupRangeRuleArgs.Builder]*):
        com.pulumi.azure.iot.inputs.SecurityDeviceGroupState.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.SecurityDeviceGroupRangeRuleArgs.builder
      builder.rangeRules(args.map(_(argsBuilder).build)*)

  /** Manages an IoT Hub Device Update Instance. */
  def IotHubDeviceUpdateInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iot.IotHubDeviceUpdateInstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.iot.IotHubDeviceUpdateInstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.iot.IotHubDeviceUpdateInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an IotHub Device Provisioning Service. */
  def IotHubDps(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iot.IotHubDpsArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.iot.IotHubDpsArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.iot.IotHubDps(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an IotHub Shared Access Policy */
  def SharedAccessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iot.SharedAccessPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.iot.SharedAccessPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.iot.SharedAccessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
