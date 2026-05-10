package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object servicebus:
  extension (builder: com.pulumi.azure.servicebus.SubscriptionArgs.Builder)
    /**
     * @param clientScopedSubscription A `clientScopedSubscription` block as defined below.
     * @return builder
     */
    def clientScopedSubscription(args: Endofunction[com.pulumi.azure.servicebus.inputs.SubscriptionClientScopedSubscriptionArgs.Builder]):
        com.pulumi.azure.servicebus.SubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.SubscriptionClientScopedSubscriptionArgs.builder
      builder.clientScopedSubscription(args(argsBuilder).build)

  /** Manages a ServiceBus Subscription Rule. */
  def SubscriptionRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.servicebus.SubscriptionRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.servicebus.SubscriptionRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.servicebus.SubscriptionRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Authorization Rule for a ServiceBus Queue. */
  def QueueAuthorizationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.servicebus.QueueAuthorizationRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.servicebus.QueueAuthorizationRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.servicebus.QueueAuthorizationRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.servicebus.SubscriptionRuleArgs.Builder)
    /**
     * @param correlationFilter A `correlationFilter` block as documented below to be evaluated against a BrokeredMessage. Required when `filterType` is set to `CorrelationFilter`.
     * @return builder
     */
    def correlationFilter(args: Endofunction[com.pulumi.azure.servicebus.inputs.SubscriptionRuleCorrelationFilterArgs.Builder]):
        com.pulumi.azure.servicebus.SubscriptionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.SubscriptionRuleCorrelationFilterArgs.builder
      builder.correlationFilter(args(argsBuilder).build)

  /** Manages a ServiceBus Topic authorization Rule within a ServiceBus Topic. */
  def TopicAuthorizationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.servicebus.TopicAuthorizationRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.servicebus.TopicAuthorizationRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.servicebus.TopicAuthorizationRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.servicebus.NamespaceArgs.Builder)
    /**
     * @param customerManagedKey An `customerManagedKey` block as defined below.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.servicebus.inputs.NamespaceCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.servicebus.NamespaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.NamespaceCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.servicebus.inputs.NamespaceIdentityArgs.Builder]):
        com.pulumi.azure.servicebus.NamespaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.NamespaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkRuleSet An `networkRuleSet` block as defined below.
     * @return builder
     */
    def networkRuleSet(args: Endofunction[com.pulumi.azure.servicebus.inputs.NamespaceNetworkRuleSetArgs.Builder]):
        com.pulumi.azure.servicebus.NamespaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.NamespaceNetworkRuleSetArgs.builder
      builder.networkRuleSet(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.servicebus.NamespaceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a ServiceBus Namespace. */
  def Namespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.servicebus.NamespaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.servicebus.NamespaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.servicebus.Namespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a ServiceBus Queue. */
  def Queue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.servicebus.QueueArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.servicebus.QueueArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.servicebus.Queue(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type ServicebusFunctions = com.pulumi.azure.servicebus.ServicebusFunctions
  object ServicebusFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.servicebus.ServicebusFunctions.*
  extension (self: ServicebusFunctions.type)
    /** Use this data source to access information about an existing ServiceBus Namespace. */
    def getNamespace(args: Endofunction[com.pulumi.azure.servicebus.inputs.GetNamespaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.servicebus.outputs.GetNamespaceResult] =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.GetNamespaceArgs.builder
      com.pulumi.azure.servicebus.ServicebusFunctions.getNamespace(args(argsBuilder).build)

    /** Use this data source to access information about an existing ServiceBus Namespace. */
    def getNamespacePlain(args: Endofunction[com.pulumi.azure.servicebus.inputs.GetNamespacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.servicebus.outputs.GetNamespaceResult] =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.GetNamespacePlainArgs.builder
      com.pulumi.azure.servicebus.ServicebusFunctions.getNamespacePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing ServiceBus Namespace Authorization Rule. */
    def getNamespaceAuthorizationRule(args: Endofunction[com.pulumi.azure.servicebus.inputs.GetNamespaceAuthorizationRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.servicebus.outputs.GetNamespaceAuthorizationRuleResult] =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.GetNamespaceAuthorizationRuleArgs.builder
      com.pulumi.azure.servicebus.ServicebusFunctions.getNamespaceAuthorizationRule(args(argsBuilder).build)

    /** Use this data source to access information about an existing ServiceBus Namespace Authorization Rule. */
    def getNamespaceAuthorizationRulePlain(args: Endofunction[com.pulumi.azure.servicebus.inputs.GetNamespaceAuthorizationRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.servicebus.outputs.GetNamespaceAuthorizationRuleResult] =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.GetNamespaceAuthorizationRulePlainArgs.builder
      com.pulumi.azure.servicebus.ServicebusFunctions.getNamespaceAuthorizationRulePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Service Bus Disaster Recovery Config. */
    def getNamespaceDisasterRecoveryConfig(args: Endofunction[com.pulumi.azure.servicebus.inputs.GetNamespaceDisasterRecoveryConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.servicebus.outputs.GetNamespaceDisasterRecoveryConfigResult] =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.GetNamespaceDisasterRecoveryConfigArgs.builder
      com.pulumi.azure.servicebus.ServicebusFunctions.getNamespaceDisasterRecoveryConfig(args(argsBuilder).build)

    /** Use this data source to access information about an existing Service Bus Disaster Recovery Config. */
    def getNamespaceDisasterRecoveryConfigPlain(args: Endofunction[com.pulumi.azure.servicebus.inputs.GetNamespaceDisasterRecoveryConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.servicebus.outputs.GetNamespaceDisasterRecoveryConfigResult] =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.GetNamespaceDisasterRecoveryConfigPlainArgs.builder
      com.pulumi.azure.servicebus.ServicebusFunctions.getNamespaceDisasterRecoveryConfigPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Service Bus Queue. */
    def getQueue(args: Endofunction[com.pulumi.azure.servicebus.inputs.GetQueueArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.servicebus.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.GetQueueArgs.builder
      com.pulumi.azure.servicebus.ServicebusFunctions.getQueue(args(argsBuilder).build)

    /** Use this data source to access information about an existing Service Bus Queue. */
    def getQueuePlain(args: Endofunction[com.pulumi.azure.servicebus.inputs.GetQueuePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.servicebus.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.GetQueuePlainArgs.builder
      com.pulumi.azure.servicebus.ServicebusFunctions.getQueuePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing ServiceBus Queue Authorisation Rule within a ServiceBus Queue. */
    def getQueueAuthorizationRule(args: Endofunction[com.pulumi.azure.servicebus.inputs.GetQueueAuthorizationRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.servicebus.outputs.GetQueueAuthorizationRuleResult] =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.GetQueueAuthorizationRuleArgs.builder
      com.pulumi.azure.servicebus.ServicebusFunctions.getQueueAuthorizationRule(args(argsBuilder).build)

    /** Use this data source to access information about an existing ServiceBus Queue Authorisation Rule within a ServiceBus Queue. */
    def getQueueAuthorizationRulePlain(args: Endofunction[com.pulumi.azure.servicebus.inputs.GetQueueAuthorizationRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.servicebus.outputs.GetQueueAuthorizationRuleResult] =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.GetQueueAuthorizationRulePlainArgs.builder
      com.pulumi.azure.servicebus.ServicebusFunctions.getQueueAuthorizationRulePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing ServiceBus Subscription. */
    def getSubscription(args: Endofunction[com.pulumi.azure.servicebus.inputs.GetSubscriptionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.servicebus.outputs.GetSubscriptionResult] =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.GetSubscriptionArgs.builder
      com.pulumi.azure.servicebus.ServicebusFunctions.getSubscription(args(argsBuilder).build)

    /** Use this data source to access information about an existing ServiceBus Subscription. */
    def getSubscriptionPlain(args: Endofunction[com.pulumi.azure.servicebus.inputs.GetSubscriptionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.servicebus.outputs.GetSubscriptionResult] =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.GetSubscriptionPlainArgs.builder
      com.pulumi.azure.servicebus.ServicebusFunctions.getSubscriptionPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Service Bus Topic. */
    def getTopic(args: Endofunction[com.pulumi.azure.servicebus.inputs.GetTopicArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.servicebus.outputs.GetTopicResult] =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.GetTopicArgs.builder
      com.pulumi.azure.servicebus.ServicebusFunctions.getTopic(args(argsBuilder).build)

    /** Use this data source to access information about an existing Service Bus Topic. */
    def getTopicPlain(args: Endofunction[com.pulumi.azure.servicebus.inputs.GetTopicPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.servicebus.outputs.GetTopicResult] =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.GetTopicPlainArgs.builder
      com.pulumi.azure.servicebus.ServicebusFunctions.getTopicPlain(args(argsBuilder).build)

    /** Use this data source to access information about a ServiceBus Topic Authorization Rule within a ServiceBus Topic. */
    def getTopicAuthorizationRule(args: Endofunction[com.pulumi.azure.servicebus.inputs.GetTopicAuthorizationRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.servicebus.outputs.GetTopicAuthorizationRuleResult] =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.GetTopicAuthorizationRuleArgs.builder
      com.pulumi.azure.servicebus.ServicebusFunctions.getTopicAuthorizationRule(args(argsBuilder).build)

    /** Use this data source to access information about a ServiceBus Topic Authorization Rule within a ServiceBus Topic. */
    def getTopicAuthorizationRulePlain(args: Endofunction[com.pulumi.azure.servicebus.inputs.GetTopicAuthorizationRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.servicebus.outputs.GetTopicAuthorizationRuleResult] =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.GetTopicAuthorizationRulePlainArgs.builder
      com.pulumi.azure.servicebus.ServicebusFunctions.getTopicAuthorizationRulePlain(args(argsBuilder).build)

  /**
   * Manages a ServiceBus Topic.
   * 
   *  &gt; **Note:** Topics can only be created in Namespaces with an SKU of `Standard` or higher.
   */
  def Topic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.servicebus.TopicArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.servicebus.TopicArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.servicebus.Topic(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Service Bus Namespace Customer Managed Key.
   * 
   *  !&gt; **Note:** It is not possible to remove the Customer Managed Key from the Service Bus Namespace once it&#39;s been added. To remove the Customer Managed Key, the parent Service Bus Namespace must be deleted and recreated.
   * 
   *  &gt; **Note:** This resource should only be used to create a Customer Managed Key for Service Bus Namespaces with System Assigned identities. The `customerManagedKey` block in `azure.servicebus.Namespace` should be used to create a Customer Managed Key for a Service Bus Namespace with a User Assigned identity.
   */
  def NamespaceCustomerManagedKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.servicebus.NamespaceCustomerManagedKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.servicebus.NamespaceCustomerManagedKeyArgs.builder
    com.pulumi.azure.servicebus.NamespaceCustomerManagedKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Disaster Recovery Config for a Service Bus Namespace.
   * 
   *  &gt; **Note:** Disaster Recovery Config is a Premium SKU only capability.
   */
  def NamespaceDisasterRecoveryConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.servicebus.NamespaceDisasterRecoveryConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.servicebus.NamespaceDisasterRecoveryConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.servicebus.NamespaceDisasterRecoveryConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a ServiceBus Subscription. */
  def Subscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.servicebus.SubscriptionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.servicebus.SubscriptionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.servicebus.Subscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a ServiceBus Namespace authorization Rule within a ServiceBus. */
  def NamespaceAuthorizationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.servicebus.NamespaceAuthorizationRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.servicebus.NamespaceAuthorizationRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.servicebus.NamespaceAuthorizationRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.servicebus.inputs.NamespaceNetworkRuleSetArgs.Builder)
    /**
     * @param networkRules One or more `networkRules` blocks as defined below.
     * @return builder
     */
    def networkRules(args: Endofunction[com.pulumi.azure.servicebus.inputs.NamespaceNetworkRuleSetNetworkRuleArgs.Builder]*):
        com.pulumi.azure.servicebus.inputs.NamespaceNetworkRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.servicebus.inputs.NamespaceNetworkRuleSetNetworkRuleArgs.builder
      builder.networkRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.servicebus.inputs.SubscriptionState.Builder)
    /**
     * @param clientScopedSubscription A `clientScopedSubscription` block as defined below.
     * @return builder
     */
    def clientScopedSubscription(args: Endofunction[com.pulumi.azure.servicebus.inputs.SubscriptionClientScopedSubscriptionArgs.Builder]):
        com.pulumi.azure.servicebus.inputs.SubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.SubscriptionClientScopedSubscriptionArgs.builder
      builder.clientScopedSubscription(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.servicebus.inputs.SubscriptionRuleState.Builder)
    /**
     * @param correlationFilter A `correlationFilter` block as documented below to be evaluated against a BrokeredMessage. Required when `filterType` is set to `CorrelationFilter`.
     * @return builder
     */
    def correlationFilter(args: Endofunction[com.pulumi.azure.servicebus.inputs.SubscriptionRuleCorrelationFilterArgs.Builder]):
        com.pulumi.azure.servicebus.inputs.SubscriptionRuleState.Builder =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.SubscriptionRuleCorrelationFilterArgs.builder
      builder.correlationFilter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.servicebus.inputs.NamespaceState.Builder)
    /**
     * @param customerManagedKey An `customerManagedKey` block as defined below.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.servicebus.inputs.NamespaceCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.servicebus.inputs.NamespaceState.Builder =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.NamespaceCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.servicebus.inputs.NamespaceIdentityArgs.Builder]):
        com.pulumi.azure.servicebus.inputs.NamespaceState.Builder =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.NamespaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkRuleSet An `networkRuleSet` block as defined below.
     * @return builder
     */
    def networkRuleSet(args: Endofunction[com.pulumi.azure.servicebus.inputs.NamespaceNetworkRuleSetArgs.Builder]):
        com.pulumi.azure.servicebus.inputs.NamespaceState.Builder =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.NamespaceNetworkRuleSetArgs.builder
      builder.networkRuleSet(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.servicebus.inputs.NamespaceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
