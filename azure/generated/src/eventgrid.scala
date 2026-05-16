package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object eventgrid:
  /** Manages an EventGrid Event Subscription */
  def EventSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.EventSubscriptionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.EventSubscriptionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventgrid.EventSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.eventgrid.PartnerNamespaceArgs.Builder)
    /**
     * @param inboundIpRules One or more `inboundIpRule` blocks as defined below.
     * @return builder
     */
    def inboundIpRules(args: Endofunction[com.pulumi.azure.eventgrid.inputs.PartnerNamespaceInboundIpRuleArgs.Builder]*):
        com.pulumi.azure.eventgrid.PartnerNamespaceArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.PartnerNamespaceInboundIpRuleArgs.builder
      builder.inboundIpRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.eventgrid.PartnerNamespaceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Event Grid Partner Configuration. */
  def PartnerConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.PartnerConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.PartnerConfigurationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.eventgrid.PartnerConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an EventGrid Partner Registration. */
  def PartnerRegistration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.PartnerRegistrationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.PartnerRegistrationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.eventgrid.PartnerRegistration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.eventgrid.PartnerConfigurationArgs.Builder)
    /**
     * @param partnerAuthorizations One or more `partnerAuthorization` blocks as defined below.
     * @return builder
     */
    def partnerAuthorizations(args: Endofunction[com.pulumi.azure.eventgrid.inputs.PartnerConfigurationPartnerAuthorizationArgs.Builder]*):
        com.pulumi.azure.eventgrid.PartnerConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.PartnerConfigurationPartnerAuthorizationArgs.builder
      builder.partnerAuthorizations(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.eventgrid.PartnerConfigurationArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.eventgrid.NamespaceArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.eventgrid.inputs.NamespaceIdentityArgs.Builder]):
        com.pulumi.azure.eventgrid.NamespaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.NamespaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param inboundIpRules One or more `inboundIpRule` blocks as defined below.
     * @return builder
     */
    def inboundIpRules(args: Endofunction[com.pulumi.azure.eventgrid.inputs.NamespaceInboundIpRuleArgs.Builder]*):
        com.pulumi.azure.eventgrid.NamespaceArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.NamespaceInboundIpRuleArgs.builder
      builder.inboundIpRules(args.map(_(argsBuilder).build)*)

    /**
     * @param topicSpacesConfigurations A `topicSpacesConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def topicSpacesConfigurations(args: Endofunction[com.pulumi.azure.eventgrid.inputs.NamespaceTopicSpacesConfigurationArgs.Builder]*):
        com.pulumi.azure.eventgrid.NamespaceArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.NamespaceTopicSpacesConfigurationArgs.builder
      builder.topicSpacesConfigurations(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.eventgrid.NamespaceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an EventGrid Namespace */
  def Namespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.NamespaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.NamespaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.eventgrid.Namespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.eventgrid.DomainArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.eventgrid.inputs.DomainIdentityArgs.Builder]):
        com.pulumi.azure.eventgrid.DomainArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.DomainIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param inboundIpRules One or more `inboundIpRule` blocks as defined below.
     * @return builder
     */
    def inboundIpRules(args: Endofunction[com.pulumi.azure.eventgrid.inputs.DomainInboundIpRuleArgs.Builder]*):
        com.pulumi.azure.eventgrid.DomainArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.DomainInboundIpRuleArgs.builder
      builder.inboundIpRules(args.map(_(argsBuilder).build)*)

    /**
     * @param inputMappingDefaultValues A `inputMappingDefaultValues` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def inputMappingDefaultValues(args: Endofunction[com.pulumi.azure.eventgrid.inputs.DomainInputMappingDefaultValuesArgs.Builder]):
        com.pulumi.azure.eventgrid.DomainArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.DomainInputMappingDefaultValuesArgs.builder
      builder.inputMappingDefaultValues(args(argsBuilder).build)

    /**
     * @param inputMappingFields A `inputMappingFields` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def inputMappingFields(args: Endofunction[com.pulumi.azure.eventgrid.inputs.DomainInputMappingFieldsArgs.Builder]):
        com.pulumi.azure.eventgrid.DomainArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.DomainInputMappingFieldsArgs.builder
      builder.inputMappingFields(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.eventgrid.DomainArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an EventGrid Domain Topic */
  def DomainTopic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.DomainTopicArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.DomainTopicArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventgrid.DomainTopic(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Event Grid Partner Namespace. */
  def PartnerNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.PartnerNamespaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.PartnerNamespaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.eventgrid.PartnerNamespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.eventgrid.SystemTopicArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicIdentityArgs.Builder]):
        com.pulumi.azure.eventgrid.SystemTopicArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.eventgrid.SystemTopicArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.eventgrid.EventSubscriptionArgs.Builder)
    /**
     * @param advancedFilter A `advancedFilter` block as defined below.
     * @return builder
     */
    def advancedFilter(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder]):
        com.pulumi.azure.eventgrid.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.builder
      builder.advancedFilter(args(argsBuilder).build)

    /**
     * @param azureFunctionEndpoint An `azureFunctionEndpoint` block as defined below.
     * @return builder
     */
    def azureFunctionEndpoint(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAzureFunctionEndpointArgs.Builder]):
        com.pulumi.azure.eventgrid.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAzureFunctionEndpointArgs.builder
      builder.azureFunctionEndpoint(args(argsBuilder).build)

    /**
     * @param deadLetterIdentity A `deadLetterIdentity` block as defined below.
     * 
     *  &gt; **Note:** `storageBlobDeadLetterDestination` must be specified when a `deadLetterIdentity` is specified
     * @return builder
     */
    def deadLetterIdentity(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionDeadLetterIdentityArgs.Builder]):
        com.pulumi.azure.eventgrid.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionDeadLetterIdentityArgs.builder
      builder.deadLetterIdentity(args(argsBuilder).build)

    /**
     * @param deliveryIdentity A `deliveryIdentity` block as defined below.
     * @return builder
     */
    def deliveryIdentity(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionDeliveryIdentityArgs.Builder]):
        com.pulumi.azure.eventgrid.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionDeliveryIdentityArgs.builder
      builder.deliveryIdentity(args(argsBuilder).build)

    /**
     * @param deliveryProperties One or more `deliveryProperty` blocks as defined below.
     * @return builder
     */
    def deliveryProperties(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionDeliveryPropertyArgs.Builder]*):
        com.pulumi.azure.eventgrid.EventSubscriptionArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionDeliveryPropertyArgs.builder
      builder.deliveryProperties(args.map(_(argsBuilder).build)*)

    /**
     * @param retryPolicy A `retryPolicy` block as defined below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionRetryPolicyArgs.Builder]):
        com.pulumi.azure.eventgrid.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param storageBlobDeadLetterDestination A `storageBlobDeadLetterDestination` block as defined below.
     * @return builder
     */
    def storageBlobDeadLetterDestination(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionStorageBlobDeadLetterDestinationArgs.Builder]):
        com.pulumi.azure.eventgrid.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionStorageBlobDeadLetterDestinationArgs.builder
      builder.storageBlobDeadLetterDestination(args(argsBuilder).build)

    /**
     * @param storageQueueEndpoint A `storageQueueEndpoint` block as defined below.
     * @return builder
     */
    def storageQueueEndpoint(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionStorageQueueEndpointArgs.Builder]):
        com.pulumi.azure.eventgrid.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionStorageQueueEndpointArgs.builder
      builder.storageQueueEndpoint(args(argsBuilder).build)

    /**
     * @param subjectFilter A `subjectFilter` block as defined below.
     * @return builder
     */
    def subjectFilter(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionSubjectFilterArgs.Builder]):
        com.pulumi.azure.eventgrid.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionSubjectFilterArgs.builder
      builder.subjectFilter(args(argsBuilder).build)

    /**
     * @param webhookEndpoint A `webhookEndpoint` block as defined below.
     * 
     *  &gt; **Note:** One of `eventhubEndpointId`, `hybridConnectionEndpointId`, `serviceBusQueueEndpointId`, `serviceBusTopicEndpointId`, `storageQueueEndpoint`, `webhookEndpoint` or `azureFunctionEndpoint` must be specified.
     * @return builder
     */
    def webhookEndpoint(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionWebhookEndpointArgs.Builder]):
        com.pulumi.azure.eventgrid.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionWebhookEndpointArgs.builder
      builder.webhookEndpoint(args(argsBuilder).build)

  /**
   * Manages an EventGrid Topic
   * 
   *  &gt; **Note:** at this time EventGrid Topics are only available in a limited number of regions.
   */
  def Topic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.TopicArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.TopicArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.eventgrid.Topic(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.eventgrid.TopicArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.eventgrid.inputs.TopicIdentityArgs.Builder]):
        com.pulumi.azure.eventgrid.TopicArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.TopicIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param inboundIpRules One or more `inboundIpRule` blocks as defined below.
     * @return builder
     */
    def inboundIpRules(args: Endofunction[com.pulumi.azure.eventgrid.inputs.TopicInboundIpRuleArgs.Builder]*):
        com.pulumi.azure.eventgrid.TopicArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.TopicInboundIpRuleArgs.builder
      builder.inboundIpRules(args.map(_(argsBuilder).build)*)

    /**
     * @param inputMappingDefaultValues A `inputMappingDefaultValues` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def inputMappingDefaultValues(args: Endofunction[com.pulumi.azure.eventgrid.inputs.TopicInputMappingDefaultValuesArgs.Builder]):
        com.pulumi.azure.eventgrid.TopicArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.TopicInputMappingDefaultValuesArgs.builder
      builder.inputMappingDefaultValues(args(argsBuilder).build)

    /**
     * @param inputMappingFields A `inputMappingFields` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def inputMappingFields(args: Endofunction[com.pulumi.azure.eventgrid.inputs.TopicInputMappingFieldsArgs.Builder]):
        com.pulumi.azure.eventgrid.TopicArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.TopicInputMappingFieldsArgs.builder
      builder.inputMappingFields(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.eventgrid.TopicArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  object EventgridFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing EventGrid Domain */
    inline def getDomain(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetDomainArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.eventgrid.outputs.GetDomainResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetDomainArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getDomain(args(argsBuilder).build)

    /** Use this data source to access information about an existing EventGrid Domain */
    inline def getDomainPlain(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetDomainPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventgrid.outputs.GetDomainResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetDomainPlainArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getDomainPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing EventGrid Domain Topic */
    inline def getDomainTopic(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetDomainTopicArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.eventgrid.outputs.GetDomainTopicResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetDomainTopicArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getDomainTopic(args(argsBuilder).build)

    /** Use this data source to access information about an existing EventGrid Domain Topic */
    inline def getDomainTopicPlain(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetDomainTopicPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventgrid.outputs.GetDomainTopicResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetDomainTopicPlainArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getDomainTopicPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Event Grid Partner Namespace */
    inline def getPartnerNamespace(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetPartnerNamespaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.eventgrid.outputs.GetPartnerNamespaceResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetPartnerNamespaceArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getPartnerNamespace(args(argsBuilder).build)

    /** Use this data source to access information about an existing Event Grid Partner Namespace */
    inline def getPartnerNamespacePlain(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetPartnerNamespacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventgrid.outputs.GetPartnerNamespaceResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetPartnerNamespacePlainArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getPartnerNamespacePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing EventGrid Partner Registration */
    inline def getPartnerRegistration(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetPartnerRegistrationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.eventgrid.outputs.GetPartnerRegistrationResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetPartnerRegistrationArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getPartnerRegistration(args(argsBuilder).build)

    /** Use this data source to access information about an existing EventGrid Partner Registration */
    inline def getPartnerRegistrationPlain(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetPartnerRegistrationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventgrid.outputs.GetPartnerRegistrationResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetPartnerRegistrationPlainArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getPartnerRegistrationPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Event Grid System Topic */
    inline def getSystemTopic(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetSystemTopicArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.eventgrid.outputs.GetSystemTopicResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetSystemTopicArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getSystemTopic(args(argsBuilder).build)

    /** Use this data source to access information about an existing Event Grid System Topic */
    inline def getSystemTopicPlain(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetSystemTopicPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventgrid.outputs.GetSystemTopicResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetSystemTopicPlainArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getSystemTopicPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing EventGrid Topic */
    inline def getTopic(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetTopicArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.eventgrid.outputs.GetTopicResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetTopicArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getTopic(args(argsBuilder).build)

    /** Use this data source to access information about an existing EventGrid Topic */
    inline def getTopicPlain(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetTopicPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventgrid.outputs.GetTopicResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetTopicPlainArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getTopicPlain(args(argsBuilder).build)

  /** Manages an Event Grid Namespace Topic. */
  def NamespaceTopic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.NamespaceTopicArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.NamespaceTopicArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventgrid.NamespaceTopic(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Event Grid System Topic. */
  def SystemTopic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.SystemTopicArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.SystemTopicArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.eventgrid.SystemTopic(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an EventGrid System Topic Event Subscription. */
  def SystemTopicEventSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.SystemTopicEventSubscriptionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.SystemTopicEventSubscriptionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventgrid.SystemTopicEventSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.eventgrid.SystemTopicEventSubscriptionArgs.Builder)
    /**
     * @param advancedFilter A `advancedFilter` block as defined below.
     * @return builder
     */
    def advancedFilter(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder]):
        com.pulumi.azure.eventgrid.SystemTopicEventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.builder
      builder.advancedFilter(args(argsBuilder).build)

    /**
     * @param azureFunctionEndpoint An `azureFunctionEndpoint` block as defined below.
     * @return builder
     */
    def azureFunctionEndpoint(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAzureFunctionEndpointArgs.Builder]):
        com.pulumi.azure.eventgrid.SystemTopicEventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAzureFunctionEndpointArgs.builder
      builder.azureFunctionEndpoint(args(argsBuilder).build)

    /**
     * @param deadLetterIdentity A `deadLetterIdentity` block as defined below.
     * 
     *  &gt; **Note:** `storageBlobDeadLetterDestination` must be specified when a `deadLetterIdentity` is specified
     * @return builder
     */
    def deadLetterIdentity(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionDeadLetterIdentityArgs.Builder]):
        com.pulumi.azure.eventgrid.SystemTopicEventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionDeadLetterIdentityArgs.builder
      builder.deadLetterIdentity(args(argsBuilder).build)

    /**
     * @param deliveryIdentity A `deliveryIdentity` block as defined below.
     * @return builder
     */
    def deliveryIdentity(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionDeliveryIdentityArgs.Builder]):
        com.pulumi.azure.eventgrid.SystemTopicEventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionDeliveryIdentityArgs.builder
      builder.deliveryIdentity(args(argsBuilder).build)

    /**
     * @param deliveryProperties One or more `deliveryProperty` blocks as defined below.
     * @return builder
     */
    def deliveryProperties(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionDeliveryPropertyArgs.Builder]*):
        com.pulumi.azure.eventgrid.SystemTopicEventSubscriptionArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionDeliveryPropertyArgs.builder
      builder.deliveryProperties(args.map(_(argsBuilder).build)*)

    /**
     * @param retryPolicy A `retryPolicy` block as defined below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionRetryPolicyArgs.Builder]):
        com.pulumi.azure.eventgrid.SystemTopicEventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param storageBlobDeadLetterDestination A `storageBlobDeadLetterDestination` block as defined below.
     * @return builder
     */
    def storageBlobDeadLetterDestination(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionStorageBlobDeadLetterDestinationArgs.Builder]):
        com.pulumi.azure.eventgrid.SystemTopicEventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionStorageBlobDeadLetterDestinationArgs.builder
      builder.storageBlobDeadLetterDestination(args(argsBuilder).build)

    /**
     * @param storageQueueEndpoint A `storageQueueEndpoint` block as defined below.
     * @return builder
     */
    def storageQueueEndpoint(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionStorageQueueEndpointArgs.Builder]):
        com.pulumi.azure.eventgrid.SystemTopicEventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionStorageQueueEndpointArgs.builder
      builder.storageQueueEndpoint(args(argsBuilder).build)

    /**
     * @param subjectFilter A `subjectFilter` block as defined below.
     * @return builder
     */
    def subjectFilter(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionSubjectFilterArgs.Builder]):
        com.pulumi.azure.eventgrid.SystemTopicEventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionSubjectFilterArgs.builder
      builder.subjectFilter(args(argsBuilder).build)

    /**
     * @param webhookEndpoint A `webhookEndpoint` block as defined below.
     * 
     *  &gt; **Note:** One of `azureFunctionEndpoint`, `eventhubEndpointId`, `hybridConnectionEndpoint`, `hybridConnectionEndpointId`, `serviceBusQueueEndpointId`, `serviceBusTopicEndpointId`, `storageQueueEndpoint` or `webhookEndpoint` must be specified.
     * @return builder
     */
    def webhookEndpoint(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionWebhookEndpointArgs.Builder]):
        com.pulumi.azure.eventgrid.SystemTopicEventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionWebhookEndpointArgs.builder
      builder.webhookEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventgrid.inputs.DomainState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.eventgrid.inputs.DomainIdentityArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.DomainIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param inboundIpRules One or more `inboundIpRule` blocks as defined below.
     * @return builder
     */
    def inboundIpRules(args: Endofunction[com.pulumi.azure.eventgrid.inputs.DomainInboundIpRuleArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.DomainState.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.DomainInboundIpRuleArgs.builder
      builder.inboundIpRules(args.map(_(argsBuilder).build)*)

    /**
     * @param inputMappingDefaultValues A `inputMappingDefaultValues` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def inputMappingDefaultValues(args: Endofunction[com.pulumi.azure.eventgrid.inputs.DomainInputMappingDefaultValuesArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.DomainInputMappingDefaultValuesArgs.builder
      builder.inputMappingDefaultValues(args(argsBuilder).build)

    /**
     * @param inputMappingFields A `inputMappingFields` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def inputMappingFields(args: Endofunction[com.pulumi.azure.eventgrid.inputs.DomainInputMappingFieldsArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.DomainInputMappingFieldsArgs.builder
      builder.inputMappingFields(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.eventgrid.inputs.DomainState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder)
    /**
     * @param boolEquals Compares a value of an event using a single boolean value.
     * @return builder
     */
    def boolEquals(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterBoolEqualArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterBoolEqualArgs.builder
      builder.boolEquals(args.map(_(argsBuilder).build)*)

    /**
     * @param isNotNulls Evaluates if a value of an event isn&#39;t NULL or undefined.
     * @return builder
     */
    def isNotNulls(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterIsNotNullArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterIsNotNullArgs.builder
      builder.isNotNulls(args.map(_(argsBuilder).build)*)

    /**
     * @param isNullOrUndefineds Evaluates if a value of an event is NULL or undefined.
     * 
     *  Each nested block consists of a key and a value(s) element.
     * @return builder
     */
    def isNullOrUndefineds(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterIsNullOrUndefinedArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterIsNullOrUndefinedArgs.builder
      builder.isNullOrUndefineds(args.map(_(argsBuilder).build)*)

    /**
     * @param numberGreaterThanOrEquals Compares a value of an event using a single floating point number.
     * @return builder
     */
    def numberGreaterThanOrEquals(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterNumberGreaterThanOrEqualArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterNumberGreaterThanOrEqualArgs.builder
      builder.numberGreaterThanOrEquals(args.map(_(argsBuilder).build)*)

    /**
     * @param numberGreaterThans Compares a value of an event using a single floating point number.
     * @return builder
     */
    def numberGreaterThans(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterNumberGreaterThanArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterNumberGreaterThanArgs.builder
      builder.numberGreaterThans(args.map(_(argsBuilder).build)*)

    /**
     * @param numberInRanges Compares a value of an event using multiple floating point number ranges.
     * @return builder
     */
    def numberInRanges(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterNumberInRangeArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterNumberInRangeArgs.builder
      builder.numberInRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param numberIns Compares a value of an event using multiple floating point numbers.
     * @return builder
     */
    def numberIns(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterNumberInArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterNumberInArgs.builder
      builder.numberIns(args.map(_(argsBuilder).build)*)

    /**
     * @param numberLessThanOrEquals Compares a value of an event using a single floating point number.
     * @return builder
     */
    def numberLessThanOrEquals(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs.builder
      builder.numberLessThanOrEquals(args.map(_(argsBuilder).build)*)

    /**
     * @param numberLessThans Compares a value of an event using a single floating point number.
     * @return builder
     */
    def numberLessThans(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterNumberLessThanArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterNumberLessThanArgs.builder
      builder.numberLessThans(args.map(_(argsBuilder).build)*)

    /**
     * @param numberNotInRanges Compares a value of an event using multiple floating point number ranges.
     * @return builder
     */
    def numberNotInRanges(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterNumberNotInRangeArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterNumberNotInRangeArgs.builder
      builder.numberNotInRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param numberNotIns Compares a value of an event using multiple floating point numbers.
     * @return builder
     */
    def numberNotIns(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterNumberNotInArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterNumberNotInArgs.builder
      builder.numberNotIns(args.map(_(argsBuilder).build)*)

    /**
     * @param stringBeginsWiths Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringBeginsWiths(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterStringBeginsWithArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterStringBeginsWithArgs.builder
      builder.stringBeginsWiths(args.map(_(argsBuilder).build)*)

    /**
     * @param stringContains Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringContains(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterStringContainArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterStringContainArgs.builder
      builder.stringContains(args.map(_(argsBuilder).build)*)

    /**
     * @param stringEndsWiths Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringEndsWiths(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterStringEndsWithArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterStringEndsWithArgs.builder
      builder.stringEndsWiths(args.map(_(argsBuilder).build)*)

    /**
     * @param stringIns Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringIns(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterStringInArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterStringInArgs.builder
      builder.stringIns(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotBeginsWiths Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringNotBeginsWiths(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterStringNotBeginsWithArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterStringNotBeginsWithArgs.builder
      builder.stringNotBeginsWiths(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotContains Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringNotContains(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterStringNotContainArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterStringNotContainArgs.builder
      builder.stringNotContains(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotEndsWiths Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringNotEndsWiths(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterStringNotEndsWithArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterStringNotEndsWithArgs.builder
      builder.stringNotEndsWiths(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotIns Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringNotIns(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterStringNotInArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterStringNotInArgs.builder
      builder.stringNotIns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.eventgrid.inputs.PartnerConfigurationState.Builder)
    /**
     * @param partnerAuthorizations One or more `partnerAuthorization` blocks as defined below.
     * @return builder
     */
    def partnerAuthorizations(args: Endofunction[com.pulumi.azure.eventgrid.inputs.PartnerConfigurationPartnerAuthorizationArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.PartnerConfigurationState.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.PartnerConfigurationPartnerAuthorizationArgs.builder
      builder.partnerAuthorizations(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.eventgrid.inputs.PartnerConfigurationState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.eventgrid.inputs.SystemTopicState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicIdentityArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.SystemTopicState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.eventgrid.inputs.SystemTopicState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.eventgrid.inputs.TopicState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.eventgrid.inputs.TopicIdentityArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.TopicState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.TopicIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param inboundIpRules One or more `inboundIpRule` blocks as defined below.
     * @return builder
     */
    def inboundIpRules(args: Endofunction[com.pulumi.azure.eventgrid.inputs.TopicInboundIpRuleArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.TopicState.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.TopicInboundIpRuleArgs.builder
      builder.inboundIpRules(args.map(_(argsBuilder).build)*)

    /**
     * @param inputMappingDefaultValues A `inputMappingDefaultValues` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def inputMappingDefaultValues(args: Endofunction[com.pulumi.azure.eventgrid.inputs.TopicInputMappingDefaultValuesArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.TopicState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.TopicInputMappingDefaultValuesArgs.builder
      builder.inputMappingDefaultValues(args(argsBuilder).build)

    /**
     * @param inputMappingFields A `inputMappingFields` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def inputMappingFields(args: Endofunction[com.pulumi.azure.eventgrid.inputs.TopicInputMappingFieldsArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.TopicState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.TopicInputMappingFieldsArgs.builder
      builder.inputMappingFields(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.eventgrid.inputs.TopicState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.eventgrid.inputs.EventSubscriptionState.Builder)
    /**
     * @param advancedFilter A `advancedFilter` block as defined below.
     * @return builder
     */
    def advancedFilter(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.builder
      builder.advancedFilter(args(argsBuilder).build)

    /**
     * @param azureFunctionEndpoint An `azureFunctionEndpoint` block as defined below.
     * @return builder
     */
    def azureFunctionEndpoint(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAzureFunctionEndpointArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAzureFunctionEndpointArgs.builder
      builder.azureFunctionEndpoint(args(argsBuilder).build)

    /**
     * @param deadLetterIdentity A `deadLetterIdentity` block as defined below.
     * 
     *  &gt; **Note:** `storageBlobDeadLetterDestination` must be specified when a `deadLetterIdentity` is specified
     * @return builder
     */
    def deadLetterIdentity(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionDeadLetterIdentityArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionDeadLetterIdentityArgs.builder
      builder.deadLetterIdentity(args(argsBuilder).build)

    /**
     * @param deliveryIdentity A `deliveryIdentity` block as defined below.
     * @return builder
     */
    def deliveryIdentity(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionDeliveryIdentityArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionDeliveryIdentityArgs.builder
      builder.deliveryIdentity(args(argsBuilder).build)

    /**
     * @param deliveryProperties One or more `deliveryProperty` blocks as defined below.
     * @return builder
     */
    def deliveryProperties(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionDeliveryPropertyArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionState.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionDeliveryPropertyArgs.builder
      builder.deliveryProperties(args.map(_(argsBuilder).build)*)

    /**
     * @param retryPolicy A `retryPolicy` block as defined below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionRetryPolicyArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param storageBlobDeadLetterDestination A `storageBlobDeadLetterDestination` block as defined below.
     * @return builder
     */
    def storageBlobDeadLetterDestination(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionStorageBlobDeadLetterDestinationArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionStorageBlobDeadLetterDestinationArgs.builder
      builder.storageBlobDeadLetterDestination(args(argsBuilder).build)

    /**
     * @param storageQueueEndpoint A `storageQueueEndpoint` block as defined below.
     * @return builder
     */
    def storageQueueEndpoint(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionStorageQueueEndpointArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionStorageQueueEndpointArgs.builder
      builder.storageQueueEndpoint(args(argsBuilder).build)

    /**
     * @param subjectFilter A `subjectFilter` block as defined below.
     * @return builder
     */
    def subjectFilter(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionSubjectFilterArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionSubjectFilterArgs.builder
      builder.subjectFilter(args(argsBuilder).build)

    /**
     * @param webhookEndpoint A `webhookEndpoint` block as defined below.
     * 
     *  &gt; **Note:** One of `eventhubEndpointId`, `hybridConnectionEndpointId`, `serviceBusQueueEndpointId`, `serviceBusTopicEndpointId`, `storageQueueEndpoint`, `webhookEndpoint` or `azureFunctionEndpoint` must be specified.
     * @return builder
     */
    def webhookEndpoint(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionWebhookEndpointArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionWebhookEndpointArgs.builder
      builder.webhookEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder)
    /**
     * @param boolEquals Compares a value of an event using a single boolean value.
     * @return builder
     */
    def boolEquals(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterBoolEqualArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterBoolEqualArgs.builder
      builder.boolEquals(args.map(_(argsBuilder).build)*)

    /**
     * @param isNotNulls Evaluates if a value of an event isn&#39;t NULL or undefined.
     * @return builder
     */
    def isNotNulls(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterIsNotNullArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterIsNotNullArgs.builder
      builder.isNotNulls(args.map(_(argsBuilder).build)*)

    /**
     * @param isNullOrUndefineds Evaluates if a value of an event is NULL or undefined.
     * 
     *  Each nested block consists of a key and a value(s) element.
     * @return builder
     */
    def isNullOrUndefineds(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterIsNullOrUndefinedArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterIsNullOrUndefinedArgs.builder
      builder.isNullOrUndefineds(args.map(_(argsBuilder).build)*)

    /**
     * @param numberGreaterThanOrEquals Compares a value of an event using a single floating point number.
     * @return builder
     */
    def numberGreaterThanOrEquals(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterNumberGreaterThanOrEqualArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterNumberGreaterThanOrEqualArgs.builder
      builder.numberGreaterThanOrEquals(args.map(_(argsBuilder).build)*)

    /**
     * @param numberGreaterThans Compares a value of an event using a single floating point number.
     * @return builder
     */
    def numberGreaterThans(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterNumberGreaterThanArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterNumberGreaterThanArgs.builder
      builder.numberGreaterThans(args.map(_(argsBuilder).build)*)

    /**
     * @param numberInRanges Compares a value of an event using multiple floating point number ranges.
     * @return builder
     */
    def numberInRanges(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterNumberInRangeArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterNumberInRangeArgs.builder
      builder.numberInRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param numberIns Compares a value of an event using multiple floating point numbers.
     * @return builder
     */
    def numberIns(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterNumberInArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterNumberInArgs.builder
      builder.numberIns(args.map(_(argsBuilder).build)*)

    /**
     * @param numberLessThanOrEquals Compares a value of an event using a single floating point number.
     * @return builder
     */
    def numberLessThanOrEquals(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs.builder
      builder.numberLessThanOrEquals(args.map(_(argsBuilder).build)*)

    /**
     * @param numberLessThans Compares a value of an event using a single floating point number.
     * @return builder
     */
    def numberLessThans(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterNumberLessThanArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterNumberLessThanArgs.builder
      builder.numberLessThans(args.map(_(argsBuilder).build)*)

    /**
     * @param numberNotInRanges Compares a value of an event using multiple floating point number ranges.
     * @return builder
     */
    def numberNotInRanges(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterNumberNotInRangeArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterNumberNotInRangeArgs.builder
      builder.numberNotInRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param numberNotIns Compares a value of an event using multiple floating point numbers.
     * @return builder
     */
    def numberNotIns(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterNumberNotInArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterNumberNotInArgs.builder
      builder.numberNotIns(args.map(_(argsBuilder).build)*)

    /**
     * @param stringBeginsWiths Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringBeginsWiths(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterStringBeginsWithArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterStringBeginsWithArgs.builder
      builder.stringBeginsWiths(args.map(_(argsBuilder).build)*)

    /**
     * @param stringContains Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringContains(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterStringContainArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterStringContainArgs.builder
      builder.stringContains(args.map(_(argsBuilder).build)*)

    /**
     * @param stringEndsWiths Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringEndsWiths(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterStringEndsWithArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterStringEndsWithArgs.builder
      builder.stringEndsWiths(args.map(_(argsBuilder).build)*)

    /**
     * @param stringIns Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringIns(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterStringInArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterStringInArgs.builder
      builder.stringIns(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotBeginsWiths Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringNotBeginsWiths(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterStringNotBeginsWithArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterStringNotBeginsWithArgs.builder
      builder.stringNotBeginsWiths(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotContains Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringNotContains(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterStringNotContainArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterStringNotContainArgs.builder
      builder.stringNotContains(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotEndsWiths Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringNotEndsWiths(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterStringNotEndsWithArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterStringNotEndsWithArgs.builder
      builder.stringNotEndsWiths(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotIns Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringNotIns(args: Endofunction[com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterStringNotInArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.EventSubscriptionAdvancedFilterStringNotInArgs.builder
      builder.stringNotIns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionState.Builder)
    /**
     * @param advancedFilter A `advancedFilter` block as defined below.
     * @return builder
     */
    def advancedFilter(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs.builder
      builder.advancedFilter(args(argsBuilder).build)

    /**
     * @param azureFunctionEndpoint An `azureFunctionEndpoint` block as defined below.
     * @return builder
     */
    def azureFunctionEndpoint(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAzureFunctionEndpointArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAzureFunctionEndpointArgs.builder
      builder.azureFunctionEndpoint(args(argsBuilder).build)

    /**
     * @param deadLetterIdentity A `deadLetterIdentity` block as defined below.
     * 
     *  &gt; **Note:** `storageBlobDeadLetterDestination` must be specified when a `deadLetterIdentity` is specified
     * @return builder
     */
    def deadLetterIdentity(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionDeadLetterIdentityArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionDeadLetterIdentityArgs.builder
      builder.deadLetterIdentity(args(argsBuilder).build)

    /**
     * @param deliveryIdentity A `deliveryIdentity` block as defined below.
     * @return builder
     */
    def deliveryIdentity(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionDeliveryIdentityArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionDeliveryIdentityArgs.builder
      builder.deliveryIdentity(args(argsBuilder).build)

    /**
     * @param deliveryProperties One or more `deliveryProperty` blocks as defined below.
     * @return builder
     */
    def deliveryProperties(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionDeliveryPropertyArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionState.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionDeliveryPropertyArgs.builder
      builder.deliveryProperties(args.map(_(argsBuilder).build)*)

    /**
     * @param retryPolicy A `retryPolicy` block as defined below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionRetryPolicyArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param storageBlobDeadLetterDestination A `storageBlobDeadLetterDestination` block as defined below.
     * @return builder
     */
    def storageBlobDeadLetterDestination(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionStorageBlobDeadLetterDestinationArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionStorageBlobDeadLetterDestinationArgs.builder
      builder.storageBlobDeadLetterDestination(args(argsBuilder).build)

    /**
     * @param storageQueueEndpoint A `storageQueueEndpoint` block as defined below.
     * @return builder
     */
    def storageQueueEndpoint(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionStorageQueueEndpointArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionStorageQueueEndpointArgs.builder
      builder.storageQueueEndpoint(args(argsBuilder).build)

    /**
     * @param subjectFilter A `subjectFilter` block as defined below.
     * @return builder
     */
    def subjectFilter(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionSubjectFilterArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionSubjectFilterArgs.builder
      builder.subjectFilter(args(argsBuilder).build)

    /**
     * @param webhookEndpoint A `webhookEndpoint` block as defined below.
     * 
     *  &gt; **Note:** One of `azureFunctionEndpoint`, `eventhubEndpointId`, `hybridConnectionEndpoint`, `hybridConnectionEndpointId`, `serviceBusQueueEndpointId`, `serviceBusTopicEndpointId`, `storageQueueEndpoint` or `webhookEndpoint` must be specified.
     * @return builder
     */
    def webhookEndpoint(args: Endofunction[com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionWebhookEndpointArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionWebhookEndpointArgs.builder
      builder.webhookEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventgrid.inputs.NamespaceState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.eventgrid.inputs.NamespaceIdentityArgs.Builder]):
        com.pulumi.azure.eventgrid.inputs.NamespaceState.Builder =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.NamespaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param inboundIpRules One or more `inboundIpRule` blocks as defined below.
     * @return builder
     */
    def inboundIpRules(args: Endofunction[com.pulumi.azure.eventgrid.inputs.NamespaceInboundIpRuleArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.NamespaceState.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.NamespaceInboundIpRuleArgs.builder
      builder.inboundIpRules(args.map(_(argsBuilder).build)*)

    /**
     * @param topicSpacesConfigurations A `topicSpacesConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def topicSpacesConfigurations(args: Endofunction[com.pulumi.azure.eventgrid.inputs.NamespaceTopicSpacesConfigurationArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.NamespaceState.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.NamespaceTopicSpacesConfigurationArgs.builder
      builder.topicSpacesConfigurations(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.eventgrid.inputs.NamespaceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.eventgrid.inputs.NamespaceTopicSpacesConfigurationArgs.Builder)
    /**
     * @param dynamicRoutingEnrichments One or more `dynamicRoutingEnrichment` blocks as defined below.
     * @return builder
     */
    def dynamicRoutingEnrichments(args: Endofunction[com.pulumi.azure.eventgrid.inputs.NamespaceTopicSpacesConfigurationDynamicRoutingEnrichmentArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.NamespaceTopicSpacesConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.NamespaceTopicSpacesConfigurationDynamicRoutingEnrichmentArgs.builder
      builder.dynamicRoutingEnrichments(args.map(_(argsBuilder).build)*)

    /**
     * @param staticRoutingEnrichments One or more `staticRoutingEnrichment` blocks as defined below.
     * @return builder
     */
    def staticRoutingEnrichments(args: Endofunction[com.pulumi.azure.eventgrid.inputs.NamespaceTopicSpacesConfigurationStaticRoutingEnrichmentArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.NamespaceTopicSpacesConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.NamespaceTopicSpacesConfigurationStaticRoutingEnrichmentArgs.builder
      builder.staticRoutingEnrichments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.eventgrid.inputs.PartnerNamespaceState.Builder)
    /**
     * @param inboundIpRules One or more `inboundIpRule` blocks as defined below.
     * @return builder
     */
    def inboundIpRules(args: Endofunction[com.pulumi.azure.eventgrid.inputs.PartnerNamespaceInboundIpRuleArgs.Builder]*):
        com.pulumi.azure.eventgrid.inputs.PartnerNamespaceState.Builder =
      def argsBuilder = com.pulumi.azure.eventgrid.inputs.PartnerNamespaceInboundIpRuleArgs.builder
      builder.inboundIpRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.eventgrid.inputs.PartnerNamespaceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an EventGrid Domain */
  def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.DomainArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.DomainArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.eventgrid.Domain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
