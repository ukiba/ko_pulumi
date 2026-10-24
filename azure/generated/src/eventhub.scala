package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object eventhub:
  /** Manages a Event Hubs authorization Rule within an Event Hub. */
  def AuthorizationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.AuthorizationRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.AuthorizationRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.AuthorizationRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an EventHub Cluster */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.ClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.ClusterArgs.builder
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
    com.pulumi.azure.eventhub.Cluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Event Hubs Consumer Group as a nested resource within an Event Hub. */
  def ConsumerGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.ConsumerGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.ConsumerGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.ConsumerGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an EventGrid Domain */
  @deprecated("azure.eventhub.Domain has been deprecated in favor of azure.eventgrid.Domain") def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.DomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.DomainArgs.builder
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
    com.pulumi.azure.eventhub.Domain(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an EventGrid Topic
   * 
   * &gt; **Note:** at this time EventGrid Topics are only available in a limited number of regions.
   */
  @deprecated("azure.eventhub.EventGridTopic has been deprecated in favor of azure.eventgrid.Topic") def EventGridTopic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.EventGridTopicArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.EventGridTopicArgs.builder
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
    com.pulumi.azure.eventhub.EventGridTopic(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Event Hubs as a nested resource within a Event Hubs namespace. */
  def EventHub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.EventHubArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.EventHubArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.EventHub(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Event Hubs authorization Rule within an Event Hub. */
  @deprecated("azure.eventhub.EventHubAuthorizationRule has been deprecated in favor of azure.eventhub.AuthorizationRule") def EventHubAuthorizationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.EventHubAuthorizationRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.EventHubAuthorizationRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.EventHubAuthorizationRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Event Hubs Consumer Group as a nested resource within an Event Hub. */
  @deprecated("azure.eventhub.EventHubConsumerGroup has been deprecated in favor of azure.eventhub.ConsumerGroup") def EventHubConsumerGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.EventHubConsumerGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.EventHubConsumerGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.EventHubConsumerGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an EventHub Namespace. */
  def EventHubNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.EventHubNamespaceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.EventHubNamespaceArgs.builder
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
    com.pulumi.azure.eventhub.EventHubNamespace(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Authorization Rule for an Event Hub Namespace. */
  def EventHubNamespaceAuthorizationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.EventHubNamespaceAuthorizationRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.EventHubNamespaceAuthorizationRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.EventHubNamespaceAuthorizationRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an EventGrid Event Subscription */
  @deprecated("azure.eventhub.EventSubscription has been deprecated in favor of azure.eventgrid.EventSubscription") def EventSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.EventSubscriptionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.EventSubscription(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
    @deprecated("azure.eventhub.getEventhubNamespace has been deprecated in favor of azure.eventhub.getNamespace") inline def getEventhubNamespace(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetEventhubNamespaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.eventhub.outputs.GetEventhubNamespaceResult] =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.GetEventhubNamespaceArgs.builder
      com.pulumi.azure.eventhub.EventhubFunctions.getEventhubNamespace(args(argsBuilder).build)

    /** Use this data source to access information about an existing EventHub Namespace. */
    @deprecated("azure.eventhub.getEventhubNamespace has been deprecated in favor of azure.eventhub.getNamespace") inline def getEventhubNamespacePlain(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetEventhubNamespacePlainArgs.Builder] = scala.Predef.identity):
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
    @deprecated("azure.eventhub.getServiceBusNamespace has been deprecated in favor of azure.servicebus.getNamespace") inline def getServiceBusNamespace(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetServiceBusNamespaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.eventhub.outputs.GetServiceBusNamespaceResult] =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.GetServiceBusNamespaceArgs.builder
      com.pulumi.azure.eventhub.EventhubFunctions.getServiceBusNamespace(args(argsBuilder).build)

    /** Use this data source to access information about an existing ServiceBus Namespace. */
    @deprecated("azure.eventhub.getServiceBusNamespace has been deprecated in favor of azure.servicebus.getNamespace") inline def getServiceBusNamespacePlain(args: Endofunction[com.pulumi.azure.eventhub.inputs.GetServiceBusNamespacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventhub.outputs.GetServiceBusNamespaceResult] =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.GetServiceBusNamespacePlainArgs.builder
      com.pulumi.azure.eventhub.EventhubFunctions.getServiceBusNamespacePlain(args(argsBuilder).build)

  /** Manages an Disaster Recovery Config for an Event Hub Namespace. */
  def EventhubNamespaceDisasterRecoveryConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.EventhubNamespaceDisasterRecoveryConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.EventhubNamespaceDisasterRecoveryConfigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.EventhubNamespaceDisasterRecoveryConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a ServiceBus Namespace. */
  @deprecated("azure.eventhub.Namespace has been deprecated in favor of azure.servicebus.Namespace") def Namespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.NamespaceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.NamespaceArgs.builder
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
    com.pulumi.azure.eventhub.Namespace(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a ServiceBus Namespace authorization Rule within a ServiceBus. */
  @deprecated("azure.eventhub.NamespaceAuthorizationRule has been deprecated in favor of azure.servicebus.NamespaceAuthorizationRule") def NamespaceAuthorizationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.NamespaceAuthorizationRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.NamespaceAuthorizationRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.NamespaceAuthorizationRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Customer Managed Key for a EventHub Namespace.
   * 
   * &gt; **Note:** In 2.x versions of the Azure Provider during deletion this resource will **delete and recreate the parent EventHub Namespace which may involve data loss** as it&#39;s not possible to remove the Customer Managed Key from the EventHub Namespace once it&#39;s been added. Version 3.0 of the Azure Provider will change this so that the Delete operation is a noop, requiring the parent EventHub Namespace is deleted/recreated to remove the Customer Managed Key.
   */
  def NamespaceCustomerManagedKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.NamespaceCustomerManagedKeyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.eventhub.NamespaceCustomerManagedKeyArgs.builder
    com.pulumi.azure.eventhub.NamespaceCustomerManagedKey(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  def NamespaceSchemaGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.NamespaceSchemaGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.NamespaceSchemaGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.NamespaceSchemaGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a ServiceBus Queue. */
  @deprecated("azure.eventhub.Queue has been deprecated in favor of azure.servicebus.Queue") def Queue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.QueueArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.QueueArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.Queue(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Authorization Rule for a ServiceBus Queue. */
  @deprecated("azure.eventhub.QueueAuthorizationRule has been deprecated in favor of azure.servicebus.QueueAuthorizationRule") def QueueAuthorizationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.QueueAuthorizationRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.QueueAuthorizationRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.QueueAuthorizationRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a ServiceBus Subscription. */
  @deprecated("azure.eventhub.Subscription has been deprecated in favor of azure.servicebus.Subscription") def Subscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.SubscriptionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.SubscriptionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.Subscription(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a ServiceBus Subscription Rule. */
  @deprecated("azure.eventhub.SubscriptionRule has been deprecated in favor of azure.servicebus.SubscriptionRule") def SubscriptionRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.SubscriptionRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.SubscriptionRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.SubscriptionRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a ServiceBus Topic.
   * 
   * &gt; **Note:** Topics can only be created in Namespaces with an SKU of `Standard` or higher.
   */
  @deprecated("azure.eventhub.Topic has been deprecated in favor of azure.servicebus.Topic") def Topic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.TopicArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.TopicArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.Topic(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a ServiceBus Topic authorization Rule within a ServiceBus Topic. */
  @deprecated("azure.eventhub.TopicAuthorizationRule has been deprecated in favor of azure.servicebus.TopicAuthorizationRule") def TopicAuthorizationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.eventhub.TopicAuthorizationRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventhub.TopicAuthorizationRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventhub.TopicAuthorizationRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
