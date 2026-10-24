package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object eventgrid:
  /** Manages an EventGrid Domain */
  inline def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.DomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.DomainArgs.builder
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
    com.pulumi.azure.eventgrid.Domain(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an EventGrid Domain Topic */
  inline def DomainTopic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.DomainTopicArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.DomainTopicArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventgrid.DomainTopic(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an EventGrid Event Subscription */
  inline def EventSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.EventSubscriptionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.EventSubscriptionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventgrid.EventSubscription(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object EventgridFunctions:
    /** Use this data source to access information about an existing EventGrid Domain */
    inline def getDomain(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetDomainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.eventgrid.outputs.GetDomainResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetDomainArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getDomain(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing EventGrid Domain */
    inline def getDomainPlain(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetDomainPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventgrid.outputs.GetDomainResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetDomainPlainArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getDomainPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing EventGrid Domain Topic */
    inline def getDomainTopic(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetDomainTopicArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.eventgrid.outputs.GetDomainTopicResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetDomainTopicArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getDomainTopic(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing EventGrid Domain Topic */
    inline def getDomainTopicPlain(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetDomainTopicPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventgrid.outputs.GetDomainTopicResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetDomainTopicPlainArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getDomainTopicPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Event Grid Partner Namespace */
    inline def getPartnerNamespace(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetPartnerNamespaceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.eventgrid.outputs.GetPartnerNamespaceResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetPartnerNamespaceArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getPartnerNamespace(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Event Grid Partner Namespace */
    inline def getPartnerNamespacePlain(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetPartnerNamespacePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventgrid.outputs.GetPartnerNamespaceResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetPartnerNamespacePlainArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getPartnerNamespacePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing EventGrid Partner Registration */
    inline def getPartnerRegistration(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetPartnerRegistrationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.eventgrid.outputs.GetPartnerRegistrationResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetPartnerRegistrationArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getPartnerRegistration(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing EventGrid Partner Registration */
    inline def getPartnerRegistrationPlain(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetPartnerRegistrationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventgrid.outputs.GetPartnerRegistrationResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetPartnerRegistrationPlainArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getPartnerRegistrationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Event Grid System Topic */
    inline def getSystemTopic(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetSystemTopicArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.eventgrid.outputs.GetSystemTopicResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetSystemTopicArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getSystemTopic(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Event Grid System Topic */
    inline def getSystemTopicPlain(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetSystemTopicPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventgrid.outputs.GetSystemTopicResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetSystemTopicPlainArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getSystemTopicPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing EventGrid Topic */
    inline def getTopic(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetTopicArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.eventgrid.outputs.GetTopicResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetTopicArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getTopic(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing EventGrid Topic */
    inline def getTopicPlain(args: Endofunction[com.pulumi.azure.eventgrid.inputs.GetTopicPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.eventgrid.outputs.GetTopicResult] =
      val argsBuilder = com.pulumi.azure.eventgrid.inputs.GetTopicPlainArgs.builder
      com.pulumi.azure.eventgrid.EventgridFunctions.getTopicPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages an EventGrid Namespace */
  inline def Namespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.NamespaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.NamespaceArgs.builder
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
    com.pulumi.azure.eventgrid.Namespace(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Event Grid Namespace Topic. */
  inline def NamespaceTopic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.NamespaceTopicArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.NamespaceTopicArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventgrid.NamespaceTopic(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Event Grid Partner Configuration. */
  inline def PartnerConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.PartnerConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.PartnerConfigurationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.eventgrid.PartnerConfiguration(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Event Grid Partner Namespace. */
  inline def PartnerNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.PartnerNamespaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.PartnerNamespaceArgs.builder
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
    com.pulumi.azure.eventgrid.PartnerNamespace(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an EventGrid Partner Registration. */
  inline def PartnerRegistration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.PartnerRegistrationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.PartnerRegistrationArgs.builder
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
    com.pulumi.azure.eventgrid.PartnerRegistration(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Event Grid System Topic. */
  inline def SystemTopic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.SystemTopicArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.SystemTopicArgs.builder
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
    com.pulumi.azure.eventgrid.SystemTopic(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an EventGrid System Topic Event Subscription. */
  inline def SystemTopicEventSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.SystemTopicEventSubscriptionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.SystemTopicEventSubscriptionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.eventgrid.SystemTopicEventSubscription(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an EventGrid Topic
   * 
   * &gt; **Note:** at this time EventGrid Topics are only available in a limited number of regions.
   */
  inline def Topic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.eventgrid.TopicArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.eventgrid.TopicArgs.builder
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
    com.pulumi.azure.eventgrid.Topic(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
