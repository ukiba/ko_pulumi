package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object eventhub:
  extension (builder: com.pulumi.azure.eventhub.SubscriptionArgs.Builder)
    /**
     * @param clientScopedSubscription A `clientScopedSubscription` block as defined below.
     * @return builder
     */
    def clientScopedSubscription(args: Endofunction[com.pulumi.azure.eventhub.inputs.SubscriptionClientScopedSubscriptionArgs.Builder]):
        com.pulumi.azure.eventhub.SubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.SubscriptionClientScopedSubscriptionArgs.builder
      builder.clientScopedSubscription(args(argsBuilder).build)

  /** Manages an EventGrid Event Subscription */
  @deprecated() def EventSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.EventSubscriptionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.EventSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a ServiceBus Subscription Rule. */
  @deprecated() def SubscriptionRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.SubscriptionRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.SubscriptionRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.SubscriptionRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Authorization Rule for a ServiceBus Queue. */
  @deprecated() def QueueAuthorizationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.QueueAuthorizationRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.QueueAuthorizationRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.QueueAuthorizationRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.eventhub.SubscriptionRuleArgs.Builder)
    /**
     * @param correlationFilter A `correlationFilter` block as documented below to be evaluated against a BrokeredMessage. Required when `filterType` is set to `CorrelationFilter`.
     * @return builder
     */
    def correlationFilter(args: Endofunction[com.pulumi.azure.eventhub.inputs.SubscriptionRuleCorrelationFilterArgs.Builder]):
        com.pulumi.azure.eventhub.SubscriptionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.SubscriptionRuleCorrelationFilterArgs.builder
      builder.correlationFilter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventhub.EventGridTopicArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventGridTopicIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.EventGridTopicArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventGridTopicIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param inboundIpRules One or more `inboundIpRule` blocks as defined below.
     * @return builder
     */
    def inboundIpRules(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventGridTopicInboundIpRuleArgs.Builder]*):
        com.pulumi.azure.eventhub.EventGridTopicArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventGridTopicInboundIpRuleArgs.builder
      builder.inboundIpRules(args.map(_(argsBuilder).build)*)

    /**
     * @param inputMappingDefaultValues A `inputMappingDefaultValues` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def inputMappingDefaultValues(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventGridTopicInputMappingDefaultValuesArgs.Builder]):
        com.pulumi.azure.eventhub.EventGridTopicArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventGridTopicInputMappingDefaultValuesArgs.builder
      builder.inputMappingDefaultValues(args(argsBuilder).build)

    /**
     * @param inputMappingFields A `inputMappingFields` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def inputMappingFields(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventGridTopicInputMappingFieldsArgs.Builder]):
        com.pulumi.azure.eventhub.EventGridTopicArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventGridTopicInputMappingFieldsArgs.builder
      builder.inputMappingFields(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.eventhub.EventGridTopicArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an EventHub Namespace. */
  def EventHubNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.EventHubNamespaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.EventHubNamespaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.eventhub.EventHubNamespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Authorization Rule for an Event Hub Namespace. */
  def EventHubNamespaceAuthorizationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.EventHubNamespaceAuthorizationRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.EventHubNamespaceAuthorizationRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.EventHubNamespaceAuthorizationRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a ServiceBus Topic authorization Rule within a ServiceBus Topic. */
  @deprecated() def TopicAuthorizationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.TopicAuthorizationRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.TopicAuthorizationRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.TopicAuthorizationRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.eventhub.NamespaceArgs.Builder)
    /**
     * @param customerManagedKey An `customerManagedKey` block as defined below.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.eventhub.inputs.NamespaceCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.eventhub.NamespaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.NamespaceCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.eventhub.inputs.NamespaceIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.NamespaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.NamespaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkRuleSet An `networkRuleSet` block as defined below.
     * @return builder
     */
    def networkRuleSet(args: Endofunction[com.pulumi.azure.eventhub.inputs.NamespaceNetworkRuleSetArgs.Builder]):
        com.pulumi.azure.eventhub.NamespaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.NamespaceNetworkRuleSetArgs.builder
      builder.networkRuleSet(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.eventhub.NamespaceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  object EventhubFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Event Hubs Authorization Rule within an Event Hub. */
    inline def getAuthorizationRule(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetAuthorizationRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.eventhub.outputs.GetAuthorizationRuleResult] =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.GetAuthorizationRuleArgs.builder
      com.pulumi.azure.eventhub.EventhubFunctions.getAuthorizationRule(args(argsBuilder).build)

    /** Use this data source to access information about an existing Event Hubs Authorization Rule within an Event Hub. */
    inline def getAuthorizationRulePlain(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetAuthorizationRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventhub.outputs.GetAuthorizationRuleResult] =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.GetAuthorizationRulePlainArgs.builder
      com.pulumi.azure.eventhub.EventhubFunctions.getAuthorizationRulePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing EventHub. */
    inline def getCluster(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetClusterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.eventhub.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.GetClusterArgs.builder
      com.pulumi.azure.eventhub.EventhubFunctions.getCluster(args(argsBuilder).build)

    /** Use this data source to access information about an existing EventHub. */
    inline def getClusterPlain(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetClusterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventhub.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.GetClusterPlainArgs.builder
      com.pulumi.azure.eventhub.EventhubFunctions.getClusterPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Event Hubs Consumer Group within an Event Hub. */
    inline def getConsumeGroup(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetConsumeGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.eventhub.outputs.GetConsumeGroupResult] =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.GetConsumeGroupArgs.builder
      com.pulumi.azure.eventhub.EventhubFunctions.getConsumeGroup(args(argsBuilder).build)

    /** Use this data source to access information about an existing Event Hubs Consumer Group within an Event Hub. */
    inline def getConsumeGroupPlain(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetConsumeGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventhub.outputs.GetConsumeGroupResult] =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.GetConsumeGroupPlainArgs.builder
      com.pulumi.azure.eventhub.EventhubFunctions.getConsumeGroupPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing EventHub. */
    inline def getEventHub(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetEventHubArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.eventhub.outputs.GetEventHubResult] =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.GetEventHubArgs.builder
      com.pulumi.azure.eventhub.EventhubFunctions.getEventHub(args(argsBuilder).build)

    /** Use this data source to access information about an existing EventHub. */
    inline def getEventHubPlain(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetEventHubPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventhub.outputs.GetEventHubResult] =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.GetEventHubPlainArgs.builder
      com.pulumi.azure.eventhub.EventhubFunctions.getEventHubPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing EventHub Namespace. */
    @deprecated inline def getEventhubNamespace(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetEventhubNamespaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.eventhub.outputs.GetEventhubNamespaceResult] =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.GetEventhubNamespaceArgs.builder
      com.pulumi.azure.eventhub.EventhubFunctions.getEventhubNamespace(args(argsBuilder).build)

    /** Use this data source to access information about an existing EventHub Namespace. */
    @deprecated inline def getEventhubNamespacePlain(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetEventhubNamespacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventhub.outputs.GetEventhubNamespaceResult] =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.GetEventhubNamespacePlainArgs.builder
      com.pulumi.azure.eventhub.EventhubFunctions.getEventhubNamespacePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing EventHub Namespace. */
    inline def getNamespace(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetNamespaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.eventhub.outputs.GetNamespaceResult] =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.GetNamespaceArgs.builder
      com.pulumi.azure.eventhub.EventhubFunctions.getNamespace(args(argsBuilder).build)

    /** Use this data source to access information about an existing EventHub Namespace. */
    inline def getNamespacePlain(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetNamespacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventhub.outputs.GetNamespaceResult] =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.GetNamespacePlainArgs.builder
      com.pulumi.azure.eventhub.EventhubFunctions.getNamespacePlain(args(argsBuilder).build)

    /** Use this data source to access information about an Authorization Rule for an Event Hub Namespace. */
    inline def getNamespaceAuthorizationRule(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetNamespaceAuthorizationRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.eventhub.outputs.GetNamespaceAuthorizationRuleResult] =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.GetNamespaceAuthorizationRuleArgs.builder
      com.pulumi.azure.eventhub.EventhubFunctions.getNamespaceAuthorizationRule(args(argsBuilder).build)

    /** Use this data source to access information about an Authorization Rule for an Event Hub Namespace. */
    inline def getNamespaceAuthorizationRulePlain(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetNamespaceAuthorizationRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventhub.outputs.GetNamespaceAuthorizationRuleResult] =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.GetNamespaceAuthorizationRulePlainArgs.builder
      com.pulumi.azure.eventhub.EventhubFunctions.getNamespaceAuthorizationRulePlain(args(argsBuilder).build)

    /** Use this data source to obtain a Shared Access Signature (SAS Token) for an existing Event Hub. */
    inline def getSas(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetSasArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.eventhub.outputs.GetSasResult] =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.GetSasArgs.builder
      com.pulumi.azure.eventhub.EventhubFunctions.getSas(args(argsBuilder).build)

    /** Use this data source to obtain a Shared Access Signature (SAS Token) for an existing Event Hub. */
    inline def getSasPlain(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetSasPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventhub.outputs.GetSasResult] =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.GetSasPlainArgs.builder
      com.pulumi.azure.eventhub.EventhubFunctions.getSasPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing ServiceBus Namespace. */
    @deprecated inline def getServiceBusNamespace(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetServiceBusNamespaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.eventhub.outputs.GetServiceBusNamespaceResult] =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.GetServiceBusNamespaceArgs.builder
      com.pulumi.azure.eventhub.EventhubFunctions.getServiceBusNamespace(args(argsBuilder).build)

    /** Use this data source to access information about an existing ServiceBus Namespace. */
    @deprecated inline def getServiceBusNamespacePlain(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetServiceBusNamespacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventhub.outputs.GetServiceBusNamespaceResult] =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.GetServiceBusNamespacePlainArgs.builder
      com.pulumi.azure.eventhub.EventhubFunctions.getServiceBusNamespacePlain(args(argsBuilder).build)

  /** Manages a ServiceBus Namespace. */
  @deprecated() def Namespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.NamespaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.NamespaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.eventhub.Namespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * 
   */
  def NamespaceSchemaGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.NamespaceSchemaGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.NamespaceSchemaGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.NamespaceSchemaGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a ServiceBus Queue. */
  @deprecated() def Queue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.QueueArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.QueueArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.Queue(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an EventHub Cluster */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.ClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.eventhub.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.eventhub.DomainArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.eventhub.inputs.DomainIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.DomainArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.DomainIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param inboundIpRules One or more `inboundIpRule` blocks as defined below.
     * @return builder
     */
    def inboundIpRules(args: Endofunction[com.pulumi.azure.eventhub.inputs.DomainInboundIpRuleArgs.Builder]*):
        com.pulumi.azure.eventhub.DomainArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.DomainInboundIpRuleArgs.builder
      builder.inboundIpRules(args.map(_(argsBuilder).build)*)

    /**
     * @param inputMappingDefaultValues A `inputMappingDefaultValues` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def inputMappingDefaultValues(args: Endofunction[com.pulumi.azure.eventhub.inputs.DomainInputMappingDefaultValuesArgs.Builder]):
        com.pulumi.azure.eventhub.DomainArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.DomainInputMappingDefaultValuesArgs.builder
      builder.inputMappingDefaultValues(args(argsBuilder).build)

    /**
     * @param inputMappingFields A `inputMappingFields` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def inputMappingFields(args: Endofunction[com.pulumi.azure.eventhub.inputs.DomainInputMappingFieldsArgs.Builder]):
        com.pulumi.azure.eventhub.DomainArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.DomainInputMappingFieldsArgs.builder
      builder.inputMappingFields(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.eventhub.DomainArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages an EventGrid Topic
   * 
   *  &gt; **Note:** at this time EventGrid Topics are only available in a limited number of regions.
   */
  @deprecated() def EventGridTopic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.EventGridTopicArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.EventGridTopicArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.eventhub.EventGridTopic(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Event Hubs Consumer Group as a nested resource within an Event Hub. */
  @deprecated() def EventHubConsumerGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.EventHubConsumerGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.EventHubConsumerGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.EventHubConsumerGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.eventhub.EventHubNamespaceArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubNamespaceIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.EventHubNamespaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubNamespaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkRulesets A `networkRulesets` block as defined below.
     * @return builder
     */
    def networkRulesets(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsArgs.Builder]):
        com.pulumi.azure.eventhub.EventHubNamespaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsArgs.builder
      builder.networkRulesets(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.eventhub.EventHubNamespaceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Event Hubs authorization Rule within an Event Hub. */
  def AuthorizationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.AuthorizationRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.AuthorizationRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.AuthorizationRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Event Hubs Consumer Group as a nested resource within an Event Hub. */
  def ConsumerGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.ConsumerGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.ConsumerGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.ConsumerGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Event Hubs authorization Rule within an Event Hub. */
  @deprecated() def EventHubAuthorizationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.EventHubAuthorizationRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.EventHubAuthorizationRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.EventHubAuthorizationRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder)
    /**
     * @param advancedFilter A `advancedFilter` block as defined below.
     * @return builder
     */
    def advancedFilter(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder]):
        com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.builder
      builder.advancedFilter(args(argsBuilder).build)

    /**
     * @param azureFunctionEndpoint An `azureFunctionEndpoint` block as defined below.
     * @return builder
     */
    def azureFunctionEndpoint(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAzureFunctionEndpointArgs.Builder]):
        com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAzureFunctionEndpointArgs.builder
      builder.azureFunctionEndpoint(args(argsBuilder).build)

    /**
     * @param deadLetterIdentity A `deadLetterIdentity` block as defined below.
     * 
     *  &gt; **Note:** `storageBlobDeadLetterDestination` must be specified when a `deadLetterIdentity` is specified
     * @return builder
     */
    def deadLetterIdentity(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionDeadLetterIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionDeadLetterIdentityArgs.builder
      builder.deadLetterIdentity(args(argsBuilder).build)

    /**
     * @param deliveryIdentity A `deliveryIdentity` block as defined below.
     * @return builder
     */
    def deliveryIdentity(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionDeliveryIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionDeliveryIdentityArgs.builder
      builder.deliveryIdentity(args(argsBuilder).build)

    /**
     * @param deliveryProperties One or more `deliveryProperty` blocks as defined below.
     * @return builder
     */
    def deliveryProperties(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionDeliveryPropertyArgs.Builder]*):
        com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionDeliveryPropertyArgs.builder
      builder.deliveryProperties(args.map(_(argsBuilder).build)*)

    /**
     * @param retryPolicy A `retryPolicy` block as defined below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionRetryPolicyArgs.Builder]):
        com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param storageBlobDeadLetterDestination A `storageBlobDeadLetterDestination` block as defined below.
     * @return builder
     */
    def storageBlobDeadLetterDestination(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionStorageBlobDeadLetterDestinationArgs.Builder]):
        com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionStorageBlobDeadLetterDestinationArgs.builder
      builder.storageBlobDeadLetterDestination(args(argsBuilder).build)

    /**
     * @param storageQueueEndpoint A `storageQueueEndpoint` block as defined below.
     * @return builder
     */
    def storageQueueEndpoint(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionStorageQueueEndpointArgs.Builder]):
        com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionStorageQueueEndpointArgs.builder
      builder.storageQueueEndpoint(args(argsBuilder).build)

    /**
     * @param subjectFilter A `subjectFilter` block as defined below.
     * @return builder
     */
    def subjectFilter(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionSubjectFilterArgs.Builder]):
        com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionSubjectFilterArgs.builder
      builder.subjectFilter(args(argsBuilder).build)

    /**
     * @param webhookEndpoint A `webhookEndpoint` block as defined below.
     * 
     *  &gt; **Note:** One of `eventhubEndpointId`, `hybridConnectionEndpointId`, `serviceBusQueueEndpointId`, `serviceBusTopicEndpointId`, `storageQueueEndpoint`, `webhookEndpoint` or `azureFunctionEndpoint` must be specified.
     * @return builder
     */
    def webhookEndpoint(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionWebhookEndpointArgs.Builder]):
        com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionWebhookEndpointArgs.builder
      builder.webhookEndpoint(args(argsBuilder).build)

  /**
   * Manages a ServiceBus Topic.
   * 
   *  &gt; **Note:** Topics can only be created in Namespaces with an SKU of `Standard` or higher.
   */
  @deprecated() def Topic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.TopicArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.TopicArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.Topic(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Disaster Recovery Config for an Event Hub Namespace. */
  def EventhubNamespaceDisasterRecoveryConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.EventhubNamespaceDisasterRecoveryConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.EventhubNamespaceDisasterRecoveryConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.EventhubNamespaceDisasterRecoveryConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Customer Managed Key for a EventHub Namespace.
   * 
   *  !&gt; **Note:** In 2.x versions of the Azure Provider during deletion this resource will **delete and recreate the parent EventHub Namespace which may involve data loss** as it&#39;s not possible to remove the Customer Managed Key from the EventHub Namespace once it&#39;s been added. Version 3.0 of the Azure Provider will change this so that the Delete operation is a noop, requiring the parent EventHub Namespace is deleted/recreated to remove the Customer Managed Key.
   */
  def NamespaceCustomerManagedKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.NamespaceCustomerManagedKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.eventhub.NamespaceCustomerManagedKeyArgs.builder
    com.pulumi.azure.eventhub.NamespaceCustomerManagedKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a ServiceBus Subscription. */
  @deprecated() def Subscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.SubscriptionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.SubscriptionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.Subscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.eventhub.EventHubArgs.Builder)
    /**
     * @param captureDescription A `captureDescription` block as defined below.
     * @return builder
     */
    def captureDescription(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubCaptureDescriptionArgs.Builder]):
        com.pulumi.azure.eventhub.EventHubArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubCaptureDescriptionArgs.builder
      builder.captureDescription(args(argsBuilder).build)

    /**
     * @param retentionDescription A `retentionDescription` block as defined below.
     * @return builder
     */
    def retentionDescription(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubRetentionDescriptionArgs.Builder]):
        com.pulumi.azure.eventhub.EventHubArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubRetentionDescriptionArgs.builder
      builder.retentionDescription(args(argsBuilder).build)

  /** Manages a ServiceBus Namespace authorization Rule within a ServiceBus. */
  @deprecated() def NamespaceAuthorizationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.NamespaceAuthorizationRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.NamespaceAuthorizationRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.NamespaceAuthorizationRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Event Hubs as a nested resource within a Event Hubs namespace. */
  def EventHub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.EventHubArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.EventHubArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.EventHub(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.eventhub.inputs.NamespaceNetworkRuleSetArgs.Builder)
    /**
     * @param networkRules One or more `networkRules` blocks as defined below.
     * @return builder
     */
    def networkRules(args: Endofunction[com.pulumi.azure.eventhub.inputs.NamespaceNetworkRuleSetNetworkRuleArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.NamespaceNetworkRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.NamespaceNetworkRuleSetNetworkRuleArgs.builder
      builder.networkRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.eventhub.inputs.DomainState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.eventhub.inputs.DomainIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.DomainIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param inboundIpRules One or more `inboundIpRule` blocks as defined below.
     * @return builder
     */
    def inboundIpRules(args: Endofunction[com.pulumi.azure.eventhub.inputs.DomainInboundIpRuleArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.DomainState.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.DomainInboundIpRuleArgs.builder
      builder.inboundIpRules(args.map(_(argsBuilder).build)*)

    /**
     * @param inputMappingDefaultValues A `inputMappingDefaultValues` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def inputMappingDefaultValues(args: Endofunction[com.pulumi.azure.eventhub.inputs.DomainInputMappingDefaultValuesArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.DomainInputMappingDefaultValuesArgs.builder
      builder.inputMappingDefaultValues(args(argsBuilder).build)

    /**
     * @param inputMappingFields A `inputMappingFields` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def inputMappingFields(args: Endofunction[com.pulumi.azure.eventhub.inputs.DomainInputMappingFieldsArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.DomainInputMappingFieldsArgs.builder
      builder.inputMappingFields(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.eventhub.inputs.DomainState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.eventhub.inputs.EventHubNamespaceState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubNamespaceIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventHubNamespaceState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubNamespaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkRulesets A `networkRulesets` block as defined below.
     * @return builder
     */
    def networkRulesets(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventHubNamespaceState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsArgs.builder
      builder.networkRulesets(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.eventhub.inputs.EventHubNamespaceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.eventhub.inputs.SubscriptionState.Builder)
    /**
     * @param clientScopedSubscription A `clientScopedSubscription` block as defined below.
     * @return builder
     */
    def clientScopedSubscription(args: Endofunction[com.pulumi.azure.eventhub.inputs.SubscriptionClientScopedSubscriptionArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.SubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.SubscriptionClientScopedSubscriptionArgs.builder
      builder.clientScopedSubscription(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder)
    /**
     * @param advancedFilter A `advancedFilter` block as defined below.
     * @return builder
     */
    def advancedFilter(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.builder
      builder.advancedFilter(args(argsBuilder).build)

    /**
     * @param azureFunctionEndpoint An `azureFunctionEndpoint` block as defined below.
     * @return builder
     */
    def azureFunctionEndpoint(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAzureFunctionEndpointArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAzureFunctionEndpointArgs.builder
      builder.azureFunctionEndpoint(args(argsBuilder).build)

    /**
     * @param deadLetterIdentity A `deadLetterIdentity` block as defined below.
     * 
     *  &gt; **Note:** `storageBlobDeadLetterDestination` must be specified when a `deadLetterIdentity` is specified
     * @return builder
     */
    def deadLetterIdentity(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionDeadLetterIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionDeadLetterIdentityArgs.builder
      builder.deadLetterIdentity(args(argsBuilder).build)

    /**
     * @param deliveryIdentity A `deliveryIdentity` block as defined below.
     * @return builder
     */
    def deliveryIdentity(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionDeliveryIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionDeliveryIdentityArgs.builder
      builder.deliveryIdentity(args(argsBuilder).build)

    /**
     * @param deliveryProperties One or more `deliveryProperty` blocks as defined below.
     * @return builder
     */
    def deliveryProperties(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionDeliveryPropertyArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionDeliveryPropertyArgs.builder
      builder.deliveryProperties(args.map(_(argsBuilder).build)*)

    /**
     * @param retryPolicy A `retryPolicy` block as defined below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionRetryPolicyArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param storageBlobDeadLetterDestination A `storageBlobDeadLetterDestination` block as defined below.
     * @return builder
     */
    def storageBlobDeadLetterDestination(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionStorageBlobDeadLetterDestinationArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionStorageBlobDeadLetterDestinationArgs.builder
      builder.storageBlobDeadLetterDestination(args(argsBuilder).build)

    /**
     * @param storageQueueEndpoint A `storageQueueEndpoint` block as defined below.
     * @return builder
     */
    def storageQueueEndpoint(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionStorageQueueEndpointArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionStorageQueueEndpointArgs.builder
      builder.storageQueueEndpoint(args(argsBuilder).build)

    /**
     * @param subjectFilter A `subjectFilter` block as defined below.
     * @return builder
     */
    def subjectFilter(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionSubjectFilterArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionSubjectFilterArgs.builder
      builder.subjectFilter(args(argsBuilder).build)

    /**
     * @param webhookEndpoint A `webhookEndpoint` block as defined below.
     * 
     *  &gt; **Note:** One of `eventhubEndpointId`, `hybridConnectionEndpointId`, `serviceBusQueueEndpointId`, `serviceBusTopicEndpointId`, `storageQueueEndpoint`, `webhookEndpoint` or `azureFunctionEndpoint` must be specified.
     * @return builder
     */
    def webhookEndpoint(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionWebhookEndpointArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionWebhookEndpointArgs.builder
      builder.webhookEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder)
    /**
     * @param boolEquals Compares a value of an event using a single boolean value.
     * @return builder
     */
    def boolEquals(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterBoolEqualArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterBoolEqualArgs.builder
      builder.boolEquals(args.map(_(argsBuilder).build)*)

    /**
     * @param isNotNulls Evaluates if a value of an event isn&#39;t NULL or undefined.
     * @return builder
     */
    def isNotNulls(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterIsNotNullArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterIsNotNullArgs.builder
      builder.isNotNulls(args.map(_(argsBuilder).build)*)

    /**
     * @param isNullOrUndefineds Evaluates if a value of an event is NULL or undefined.
     * 
     *  Each nested block consists of a key and a value(s) element.
     * @return builder
     */
    def isNullOrUndefineds(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterIsNullOrUndefinedArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterIsNullOrUndefinedArgs.builder
      builder.isNullOrUndefineds(args.map(_(argsBuilder).build)*)

    /**
     * @param numberGreaterThanOrEquals Compares a value of an event using a single floating point number.
     * @return builder
     */
    def numberGreaterThanOrEquals(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberGreaterThanOrEqualArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberGreaterThanOrEqualArgs.builder
      builder.numberGreaterThanOrEquals(args.map(_(argsBuilder).build)*)

    /**
     * @param numberGreaterThans Compares a value of an event using a single floating point number.
     * @return builder
     */
    def numberGreaterThans(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberGreaterThanArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberGreaterThanArgs.builder
      builder.numberGreaterThans(args.map(_(argsBuilder).build)*)

    /**
     * @param numberInRanges Compares a value of an event using multiple floating point number ranges.
     * @return builder
     */
    def numberInRanges(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberInRangeArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberInRangeArgs.builder
      builder.numberInRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param numberIns Compares a value of an event using multiple floating point numbers.
     * @return builder
     */
    def numberIns(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberInArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberInArgs.builder
      builder.numberIns(args.map(_(argsBuilder).build)*)

    /**
     * @param numberLessThanOrEquals Compares a value of an event using a single floating point number.
     * @return builder
     */
    def numberLessThanOrEquals(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs.builder
      builder.numberLessThanOrEquals(args.map(_(argsBuilder).build)*)

    /**
     * @param numberLessThans Compares a value of an event using a single floating point number.
     * @return builder
     */
    def numberLessThans(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberLessThanArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberLessThanArgs.builder
      builder.numberLessThans(args.map(_(argsBuilder).build)*)

    /**
     * @param numberNotInRanges Compares a value of an event using multiple floating point number ranges.
     * @return builder
     */
    def numberNotInRanges(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberNotInRangeArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberNotInRangeArgs.builder
      builder.numberNotInRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param numberNotIns Compares a value of an event using multiple floating point numbers.
     * @return builder
     */
    def numberNotIns(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberNotInArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberNotInArgs.builder
      builder.numberNotIns(args.map(_(argsBuilder).build)*)

    /**
     * @param stringBeginsWiths Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringBeginsWiths(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringBeginsWithArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringBeginsWithArgs.builder
      builder.stringBeginsWiths(args.map(_(argsBuilder).build)*)

    /**
     * @param stringContains Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringContains(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringContainArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringContainArgs.builder
      builder.stringContains(args.map(_(argsBuilder).build)*)

    /**
     * @param stringEndsWiths Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringEndsWiths(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringEndsWithArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringEndsWithArgs.builder
      builder.stringEndsWiths(args.map(_(argsBuilder).build)*)

    /**
     * @param stringIns Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringIns(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringInArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringInArgs.builder
      builder.stringIns(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotBeginsWiths Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringNotBeginsWiths(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringNotBeginsWithArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringNotBeginsWithArgs.builder
      builder.stringNotBeginsWiths(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotContains Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringNotContains(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringNotContainArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringNotContainArgs.builder
      builder.stringNotContains(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotEndsWiths Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringNotEndsWiths(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringNotEndsWithArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringNotEndsWithArgs.builder
      builder.stringNotEndsWiths(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotIns Compares a value of an event using multiple string values.
     * @return builder
     */
    def stringNotIns(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringNotInArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringNotInArgs.builder
      builder.stringNotIns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsArgs.Builder)
    /**
     * @param ipRules One or more `ipRule` blocks as defined below.
     * @return builder
     */
    def ipRules(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsIpRuleArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsIpRuleArgs.builder
      builder.ipRules(args.map(_(argsBuilder).build)*)

    /**
     * @param virtualNetworkRules One or more `virtualNetworkRule` blocks as defined below.
     * @return builder
     */
    def virtualNetworkRules(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsVirtualNetworkRuleArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsVirtualNetworkRuleArgs.builder
      builder.virtualNetworkRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.eventhub.inputs.SubscriptionRuleState.Builder)
    /**
     * @param correlationFilter A `correlationFilter` block as documented below to be evaluated against a BrokeredMessage. Required when `filterType` is set to `CorrelationFilter`.
     * @return builder
     */
    def correlationFilter(args: Endofunction[com.pulumi.azure.eventhub.inputs.SubscriptionRuleCorrelationFilterArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.SubscriptionRuleState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.SubscriptionRuleCorrelationFilterArgs.builder
      builder.correlationFilter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventhub.inputs.EventHubState.Builder)
    /**
     * @param captureDescription A `captureDescription` block as defined below.
     * @return builder
     */
    def captureDescription(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubCaptureDescriptionArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventHubState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubCaptureDescriptionArgs.builder
      builder.captureDescription(args(argsBuilder).build)

    /**
     * @param retentionDescription A `retentionDescription` block as defined below.
     * @return builder
     */
    def retentionDescription(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubRetentionDescriptionArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventHubState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubRetentionDescriptionArgs.builder
      builder.retentionDescription(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventhub.inputs.NamespaceState.Builder)
    /**
     * @param customerManagedKey An `customerManagedKey` block as defined below.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.eventhub.inputs.NamespaceCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.NamespaceState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.NamespaceCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.eventhub.inputs.NamespaceIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.NamespaceState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.NamespaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkRuleSet An `networkRuleSet` block as defined below.
     * @return builder
     */
    def networkRuleSet(args: Endofunction[com.pulumi.azure.eventhub.inputs.NamespaceNetworkRuleSetArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.NamespaceState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.NamespaceNetworkRuleSetArgs.builder
      builder.networkRuleSet(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.eventhub.inputs.NamespaceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.eventhub.inputs.EventGridTopicState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventGridTopicIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventGridTopicState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventGridTopicIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param inboundIpRules One or more `inboundIpRule` blocks as defined below.
     * @return builder
     */
    def inboundIpRules(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventGridTopicInboundIpRuleArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventGridTopicState.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventGridTopicInboundIpRuleArgs.builder
      builder.inboundIpRules(args.map(_(argsBuilder).build)*)

    /**
     * @param inputMappingDefaultValues A `inputMappingDefaultValues` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def inputMappingDefaultValues(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventGridTopicInputMappingDefaultValuesArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventGridTopicState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventGridTopicInputMappingDefaultValuesArgs.builder
      builder.inputMappingDefaultValues(args(argsBuilder).build)

    /**
     * @param inputMappingFields A `inputMappingFields` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def inputMappingFields(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventGridTopicInputMappingFieldsArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventGridTopicState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventGridTopicInputMappingFieldsArgs.builder
      builder.inputMappingFields(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.eventhub.inputs.EventGridTopicState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.eventhub.inputs.EventHubCaptureDescriptionArgs.Builder)
    /**
     * @param destination A `destination` block as defined below.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubCaptureDescriptionDestinationArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventHubCaptureDescriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubCaptureDescriptionDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

  /** Manages an EventGrid Domain */
  @deprecated() def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.DomainArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.DomainArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.eventhub.Domain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
