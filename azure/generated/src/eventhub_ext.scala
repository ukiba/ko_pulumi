package jp.ukiba.ko_pulumi
package azure

object eventhub_ext:
  extension (builder: com.pulumi.azure.eventhub.DomainArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.eventhub.inputs.DomainIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.DomainArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.DomainIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param inboundIpRules One or more `inboundIpRule` blocks as defined below.
     * @return builder
     */
    inline def inboundIpRules(args: Endofunction[com.pulumi.azure.eventhub.inputs.DomainInboundIpRuleArgs.Builder]*):
        com.pulumi.azure.eventhub.DomainArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.DomainInboundIpRuleArgs.builder
      builder.inboundIpRules(args.map(_(argsBuilder).build)*)

    /**
     * @param inputMappingDefaultValues A `inputMappingDefaultValues` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def inputMappingDefaultValues(args: Endofunction[com.pulumi.azure.eventhub.inputs.DomainInputMappingDefaultValuesArgs.Builder]):
        com.pulumi.azure.eventhub.DomainArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.DomainInputMappingDefaultValuesArgs.builder
      builder.inputMappingDefaultValues(args(argsBuilder).build)

    /**
     * @param inputMappingFields A `inputMappingFields` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def inputMappingFields(args: Endofunction[com.pulumi.azure.eventhub.inputs.DomainInputMappingFieldsArgs.Builder]):
        com.pulumi.azure.eventhub.DomainArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.DomainInputMappingFieldsArgs.builder
      builder.inputMappingFields(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventhub.EventGridTopicArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventGridTopicIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.EventGridTopicArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventGridTopicIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param inboundIpRules One or more `inboundIpRule` blocks as defined below.
     * @return builder
     */
    inline def inboundIpRules(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventGridTopicInboundIpRuleArgs.Builder]*):
        com.pulumi.azure.eventhub.EventGridTopicArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventGridTopicInboundIpRuleArgs.builder
      builder.inboundIpRules(args.map(_(argsBuilder).build)*)

    /**
     * @param inputMappingDefaultValues A `inputMappingDefaultValues` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def inputMappingDefaultValues(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventGridTopicInputMappingDefaultValuesArgs.Builder]):
        com.pulumi.azure.eventhub.EventGridTopicArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventGridTopicInputMappingDefaultValuesArgs.builder
      builder.inputMappingDefaultValues(args(argsBuilder).build)

    /**
     * @param inputMappingFields A `inputMappingFields` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def inputMappingFields(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventGridTopicInputMappingFieldsArgs.Builder]):
        com.pulumi.azure.eventhub.EventGridTopicArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventGridTopicInputMappingFieldsArgs.builder
      builder.inputMappingFields(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventhub.EventHubArgs.Builder)
    /**
     * @param captureDescription A `captureDescription` block as defined below.
     * @return builder
     */
    inline def captureDescription(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubCaptureDescriptionArgs.Builder]):
        com.pulumi.azure.eventhub.EventHubArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubCaptureDescriptionArgs.builder
      builder.captureDescription(args(argsBuilder).build)

    /**
     * @param retentionDescription A `retentionDescription` block as defined below.
     * @return builder
     */
    inline def retentionDescription(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubRetentionDescriptionArgs.Builder]):
        com.pulumi.azure.eventhub.EventHubArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubRetentionDescriptionArgs.builder
      builder.retentionDescription(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventhub.EventHubNamespaceArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubNamespaceIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.EventHubNamespaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubNamespaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkRulesets A `networkRulesets` block as defined below.
     * @return builder
     */
    inline def networkRulesets(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsArgs.Builder]):
        com.pulumi.azure.eventhub.EventHubNamespaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsArgs.builder
      builder.networkRulesets(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder)
    /**
     * @param advancedFilter A `advancedFilter` block as defined below.
     * @return builder
     */
    inline def advancedFilter(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder]):
        com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.builder
      builder.advancedFilter(args(argsBuilder).build)

    /**
     * @param azureFunctionEndpoint An `azureFunctionEndpoint` block as defined below.
     * @return builder
     */
    inline def azureFunctionEndpoint(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAzureFunctionEndpointArgs.Builder]):
        com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAzureFunctionEndpointArgs.builder
      builder.azureFunctionEndpoint(args(argsBuilder).build)

    /**
     * @param deadLetterIdentity A `deadLetterIdentity` block as defined below.
     * 
     * &gt; **Note:** `storageBlobDeadLetterDestination` must be specified when a `deadLetterIdentity` is specified
     * @return builder
     */
    inline def deadLetterIdentity(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionDeadLetterIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionDeadLetterIdentityArgs.builder
      builder.deadLetterIdentity(args(argsBuilder).build)

    /**
     * @param deliveryIdentity A `deliveryIdentity` block as defined below.
     * @return builder
     */
    inline def deliveryIdentity(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionDeliveryIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionDeliveryIdentityArgs.builder
      builder.deliveryIdentity(args(argsBuilder).build)

    /**
     * @param deliveryProperties One or more `deliveryProperty` blocks as defined below.
     * @return builder
     */
    inline def deliveryProperties(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionDeliveryPropertyArgs.Builder]*):
        com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionDeliveryPropertyArgs.builder
      builder.deliveryProperties(args.map(_(argsBuilder).build)*)

    /**
     * @param retryPolicy A `retryPolicy` block as defined below.
     * @return builder
     */
    inline def retryPolicy(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionRetryPolicyArgs.Builder]):
        com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param storageBlobDeadLetterDestination A `storageBlobDeadLetterDestination` block as defined below.
     * @return builder
     */
    inline def storageBlobDeadLetterDestination(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionStorageBlobDeadLetterDestinationArgs.Builder]):
        com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionStorageBlobDeadLetterDestinationArgs.builder
      builder.storageBlobDeadLetterDestination(args(argsBuilder).build)

    /**
     * @param storageQueueEndpoint A `storageQueueEndpoint` block as defined below.
     * @return builder
     */
    inline def storageQueueEndpoint(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionStorageQueueEndpointArgs.Builder]):
        com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionStorageQueueEndpointArgs.builder
      builder.storageQueueEndpoint(args(argsBuilder).build)

    /**
     * @param subjectFilter A `subjectFilter` block as defined below.
     * @return builder
     */
    inline def subjectFilter(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionSubjectFilterArgs.Builder]):
        com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionSubjectFilterArgs.builder
      builder.subjectFilter(args(argsBuilder).build)

    /**
     * @param webhookEndpoint A `webhookEndpoint` block as defined below.
     * 
     * &gt; **Note:** One of `eventhubEndpointId`, `hybridConnectionEndpointId`, `serviceBusQueueEndpointId`, `serviceBusTopicEndpointId`, `storageQueueEndpoint`, `webhookEndpoint` or `azureFunctionEndpoint` must be specified.
     * @return builder
     */
    inline def webhookEndpoint(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionWebhookEndpointArgs.Builder]):
        com.pulumi.azure.eventhub.EventSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionWebhookEndpointArgs.builder
      builder.webhookEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventhub.NamespaceArgs.Builder)
    /**
     * @param customerManagedKey An `customerManagedKey` block as defined below.
     * @return builder
     */
    inline def customerManagedKey(args: Endofunction[com.pulumi.azure.eventhub.inputs.NamespaceCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.eventhub.NamespaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.NamespaceCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.eventhub.inputs.NamespaceIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.NamespaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.NamespaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkRuleSet An `networkRuleSet` block as defined below.
     * @return builder
     */
    inline def networkRuleSet(args: Endofunction[com.pulumi.azure.eventhub.inputs.NamespaceNetworkRuleSetArgs.Builder]):
        com.pulumi.azure.eventhub.NamespaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.NamespaceNetworkRuleSetArgs.builder
      builder.networkRuleSet(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventhub.SubscriptionArgs.Builder)
    /**
     * @param clientScopedSubscription A `clientScopedSubscription` block as defined below.
     * @return builder
     */
    inline def clientScopedSubscription(args: Endofunction[com.pulumi.azure.eventhub.inputs.SubscriptionClientScopedSubscriptionArgs.Builder]):
        com.pulumi.azure.eventhub.SubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.SubscriptionClientScopedSubscriptionArgs.builder
      builder.clientScopedSubscription(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventhub.SubscriptionRuleArgs.Builder)
    /**
     * @param correlationFilter A `correlationFilter` block as documented below to be evaluated against a BrokeredMessage. Required when `filterType` is set to `CorrelationFilter`.
     * @return builder
     */
    inline def correlationFilter(args: Endofunction[com.pulumi.azure.eventhub.inputs.SubscriptionRuleCorrelationFilterArgs.Builder]):
        com.pulumi.azure.eventhub.SubscriptionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.SubscriptionRuleCorrelationFilterArgs.builder
      builder.correlationFilter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventhub.inputs.DomainState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.eventhub.inputs.DomainIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.DomainIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param inboundIpRules One or more `inboundIpRule` blocks as defined below.
     * @return builder
     */
    inline def inboundIpRules(args: Endofunction[com.pulumi.azure.eventhub.inputs.DomainInboundIpRuleArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.DomainState.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.DomainInboundIpRuleArgs.builder
      builder.inboundIpRules(args.map(_(argsBuilder).build)*)

    /**
     * @param inputMappingDefaultValues A `inputMappingDefaultValues` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def inputMappingDefaultValues(args: Endofunction[com.pulumi.azure.eventhub.inputs.DomainInputMappingDefaultValuesArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.DomainInputMappingDefaultValuesArgs.builder
      builder.inputMappingDefaultValues(args(argsBuilder).build)

    /**
     * @param inputMappingFields A `inputMappingFields` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def inputMappingFields(args: Endofunction[com.pulumi.azure.eventhub.inputs.DomainInputMappingFieldsArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.DomainInputMappingFieldsArgs.builder
      builder.inputMappingFields(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventhub.inputs.EventGridTopicState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventGridTopicIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventGridTopicState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventGridTopicIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param inboundIpRules One or more `inboundIpRule` blocks as defined below.
     * @return builder
     */
    inline def inboundIpRules(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventGridTopicInboundIpRuleArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventGridTopicState.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventGridTopicInboundIpRuleArgs.builder
      builder.inboundIpRules(args.map(_(argsBuilder).build)*)

    /**
     * @param inputMappingDefaultValues A `inputMappingDefaultValues` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def inputMappingDefaultValues(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventGridTopicInputMappingDefaultValuesArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventGridTopicState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventGridTopicInputMappingDefaultValuesArgs.builder
      builder.inputMappingDefaultValues(args(argsBuilder).build)

    /**
     * @param inputMappingFields A `inputMappingFields` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def inputMappingFields(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventGridTopicInputMappingFieldsArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventGridTopicState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventGridTopicInputMappingFieldsArgs.builder
      builder.inputMappingFields(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventhub.inputs.EventHubCaptureDescriptionArgs.Builder)
    /**
     * @param destination A `destination` block as defined below.
     * @return builder
     */
    inline def destination(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubCaptureDescriptionDestinationArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventHubCaptureDescriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubCaptureDescriptionDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsArgs.Builder)
    /**
     * @param ipRules One or more `ipRule` blocks as defined below.
     * @return builder
     */
    inline def ipRules(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsIpRuleArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsIpRuleArgs.builder
      builder.ipRules(args.map(_(argsBuilder).build)*)

    /**
     * @param virtualNetworkRules One or more `virtualNetworkRule` blocks as defined below.
     * @return builder
     */
    inline def virtualNetworkRules(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsVirtualNetworkRuleArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsVirtualNetworkRuleArgs.builder
      builder.virtualNetworkRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.eventhub.inputs.EventHubNamespaceState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubNamespaceIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventHubNamespaceState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubNamespaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkRulesets A `networkRulesets` block as defined below.
     * @return builder
     */
    inline def networkRulesets(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventHubNamespaceState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubNamespaceNetworkRulesetsArgs.builder
      builder.networkRulesets(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventhub.inputs.EventHubState.Builder)
    /**
     * @param captureDescription A `captureDescription` block as defined below.
     * @return builder
     */
    inline def captureDescription(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubCaptureDescriptionArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventHubState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubCaptureDescriptionArgs.builder
      builder.captureDescription(args(argsBuilder).build)

    /**
     * @param retentionDescription A `retentionDescription` block as defined below.
     * @return builder
     */
    inline def retentionDescription(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventHubRetentionDescriptionArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventHubState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventHubRetentionDescriptionArgs.builder
      builder.retentionDescription(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder)
    /**
     * @param boolEquals Compares a value of an event using a single boolean value.
     * @return builder
     */
    inline def boolEquals(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterBoolEqualArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterBoolEqualArgs.builder
      builder.boolEquals(args.map(_(argsBuilder).build)*)

    /**
     * @param isNotNulls Evaluates if a value of an event isn&#39;t NULL or undefined.
     * @return builder
     */
    inline def isNotNulls(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterIsNotNullArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterIsNotNullArgs.builder
      builder.isNotNulls(args.map(_(argsBuilder).build)*)

    /**
     * @param isNullOrUndefineds Evaluates if a value of an event is NULL or undefined.
     * 
     * Each nested block consists of a key and a value(s) element.
     * @return builder
     */
    inline def isNullOrUndefineds(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterIsNullOrUndefinedArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterIsNullOrUndefinedArgs.builder
      builder.isNullOrUndefineds(args.map(_(argsBuilder).build)*)

    /**
     * @param numberGreaterThanOrEquals Compares a value of an event using a single floating point number.
     * @return builder
     */
    inline def numberGreaterThanOrEquals(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberGreaterThanOrEqualArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberGreaterThanOrEqualArgs.builder
      builder.numberGreaterThanOrEquals(args.map(_(argsBuilder).build)*)

    /**
     * @param numberGreaterThans Compares a value of an event using a single floating point number.
     * @return builder
     */
    inline def numberGreaterThans(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberGreaterThanArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberGreaterThanArgs.builder
      builder.numberGreaterThans(args.map(_(argsBuilder).build)*)

    /**
     * @param numberInRanges Compares a value of an event using multiple floating point number ranges.
     * @return builder
     */
    inline def numberInRanges(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberInRangeArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberInRangeArgs.builder
      builder.numberInRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param numberIns Compares a value of an event using multiple floating point numbers.
     * @return builder
     */
    inline def numberIns(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberInArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberInArgs.builder
      builder.numberIns(args.map(_(argsBuilder).build)*)

    /**
     * @param numberLessThanOrEquals Compares a value of an event using a single floating point number.
     * @return builder
     */
    inline def numberLessThanOrEquals(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs.builder
      builder.numberLessThanOrEquals(args.map(_(argsBuilder).build)*)

    /**
     * @param numberLessThans Compares a value of an event using a single floating point number.
     * @return builder
     */
    inline def numberLessThans(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberLessThanArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberLessThanArgs.builder
      builder.numberLessThans(args.map(_(argsBuilder).build)*)

    /**
     * @param numberNotInRanges Compares a value of an event using multiple floating point number ranges.
     * @return builder
     */
    inline def numberNotInRanges(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberNotInRangeArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberNotInRangeArgs.builder
      builder.numberNotInRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param numberNotIns Compares a value of an event using multiple floating point numbers.
     * @return builder
     */
    inline def numberNotIns(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberNotInArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterNumberNotInArgs.builder
      builder.numberNotIns(args.map(_(argsBuilder).build)*)

    /**
     * @param stringBeginsWiths Compares a value of an event using multiple string values.
     * @return builder
     */
    inline def stringBeginsWiths(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringBeginsWithArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringBeginsWithArgs.builder
      builder.stringBeginsWiths(args.map(_(argsBuilder).build)*)

    /**
     * @param stringContains Compares a value of an event using multiple string values.
     * @return builder
     */
    inline def stringContains(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringContainArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringContainArgs.builder
      builder.stringContains(args.map(_(argsBuilder).build)*)

    /**
     * @param stringEndsWiths Compares a value of an event using multiple string values.
     * @return builder
     */
    inline def stringEndsWiths(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringEndsWithArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringEndsWithArgs.builder
      builder.stringEndsWiths(args.map(_(argsBuilder).build)*)

    /**
     * @param stringIns Compares a value of an event using multiple string values.
     * @return builder
     */
    inline def stringIns(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringInArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringInArgs.builder
      builder.stringIns(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotBeginsWiths Compares a value of an event using multiple string values.
     * @return builder
     */
    inline def stringNotBeginsWiths(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringNotBeginsWithArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringNotBeginsWithArgs.builder
      builder.stringNotBeginsWiths(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotContains Compares a value of an event using multiple string values.
     * @return builder
     */
    inline def stringNotContains(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringNotContainArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringNotContainArgs.builder
      builder.stringNotContains(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotEndsWiths Compares a value of an event using multiple string values.
     * @return builder
     */
    inline def stringNotEndsWiths(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringNotEndsWithArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringNotEndsWithArgs.builder
      builder.stringNotEndsWiths(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotIns Compares a value of an event using multiple string values.
     * @return builder
     */
    inline def stringNotIns(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringNotInArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterStringNotInArgs.builder
      builder.stringNotIns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder)
    /**
     * @param advancedFilter A `advancedFilter` block as defined below.
     * @return builder
     */
    inline def advancedFilter(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs.builder
      builder.advancedFilter(args(argsBuilder).build)

    /**
     * @param azureFunctionEndpoint An `azureFunctionEndpoint` block as defined below.
     * @return builder
     */
    inline def azureFunctionEndpoint(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionAzureFunctionEndpointArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionAzureFunctionEndpointArgs.builder
      builder.azureFunctionEndpoint(args(argsBuilder).build)

    /**
     * @param deadLetterIdentity A `deadLetterIdentity` block as defined below.
     * 
     * &gt; **Note:** `storageBlobDeadLetterDestination` must be specified when a `deadLetterIdentity` is specified
     * @return builder
     */
    inline def deadLetterIdentity(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionDeadLetterIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionDeadLetterIdentityArgs.builder
      builder.deadLetterIdentity(args(argsBuilder).build)

    /**
     * @param deliveryIdentity A `deliveryIdentity` block as defined below.
     * @return builder
     */
    inline def deliveryIdentity(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionDeliveryIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionDeliveryIdentityArgs.builder
      builder.deliveryIdentity(args(argsBuilder).build)

    /**
     * @param deliveryProperties One or more `deliveryProperty` blocks as defined below.
     * @return builder
     */
    inline def deliveryProperties(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionDeliveryPropertyArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionDeliveryPropertyArgs.builder
      builder.deliveryProperties(args.map(_(argsBuilder).build)*)

    /**
     * @param retryPolicy A `retryPolicy` block as defined below.
     * @return builder
     */
    inline def retryPolicy(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionRetryPolicyArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param storageBlobDeadLetterDestination A `storageBlobDeadLetterDestination` block as defined below.
     * @return builder
     */
    inline def storageBlobDeadLetterDestination(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionStorageBlobDeadLetterDestinationArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionStorageBlobDeadLetterDestinationArgs.builder
      builder.storageBlobDeadLetterDestination(args(argsBuilder).build)

    /**
     * @param storageQueueEndpoint A `storageQueueEndpoint` block as defined below.
     * @return builder
     */
    inline def storageQueueEndpoint(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionStorageQueueEndpointArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionStorageQueueEndpointArgs.builder
      builder.storageQueueEndpoint(args(argsBuilder).build)

    /**
     * @param subjectFilter A `subjectFilter` block as defined below.
     * @return builder
     */
    inline def subjectFilter(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionSubjectFilterArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionSubjectFilterArgs.builder
      builder.subjectFilter(args(argsBuilder).build)

    /**
     * @param webhookEndpoint A `webhookEndpoint` block as defined below.
     * 
     * &gt; **Note:** One of `eventhubEndpointId`, `hybridConnectionEndpointId`, `serviceBusQueueEndpointId`, `serviceBusTopicEndpointId`, `storageQueueEndpoint`, `webhookEndpoint` or `azureFunctionEndpoint` must be specified.
     * @return builder
     */
    inline def webhookEndpoint(args: Endofunction[com.pulumi.azure.eventhub.inputs.EventSubscriptionWebhookEndpointArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.EventSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.EventSubscriptionWebhookEndpointArgs.builder
      builder.webhookEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventhub.inputs.NamespaceNetworkRuleSetArgs.Builder)
    /**
     * @param networkRules One or more `networkRules` blocks as defined below.
     * @return builder
     */
    inline def networkRules(args: Endofunction[com.pulumi.azure.eventhub.inputs.NamespaceNetworkRuleSetNetworkRuleArgs.Builder]*):
        com.pulumi.azure.eventhub.inputs.NamespaceNetworkRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.eventhub.inputs.NamespaceNetworkRuleSetNetworkRuleArgs.builder
      builder.networkRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.eventhub.inputs.NamespaceState.Builder)
    /**
     * @param customerManagedKey An `customerManagedKey` block as defined below.
     * @return builder
     */
    inline def customerManagedKey(args: Endofunction[com.pulumi.azure.eventhub.inputs.NamespaceCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.NamespaceState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.NamespaceCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.eventhub.inputs.NamespaceIdentityArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.NamespaceState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.NamespaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkRuleSet An `networkRuleSet` block as defined below.
     * @return builder
     */
    inline def networkRuleSet(args: Endofunction[com.pulumi.azure.eventhub.inputs.NamespaceNetworkRuleSetArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.NamespaceState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.NamespaceNetworkRuleSetArgs.builder
      builder.networkRuleSet(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventhub.inputs.SubscriptionRuleState.Builder)
    /**
     * @param correlationFilter A `correlationFilter` block as documented below to be evaluated against a BrokeredMessage. Required when `filterType` is set to `CorrelationFilter`.
     * @return builder
     */
    inline def correlationFilter(args: Endofunction[com.pulumi.azure.eventhub.inputs.SubscriptionRuleCorrelationFilterArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.SubscriptionRuleState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.SubscriptionRuleCorrelationFilterArgs.builder
      builder.correlationFilter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.eventhub.inputs.SubscriptionState.Builder)
    /**
     * @param clientScopedSubscription A `clientScopedSubscription` block as defined below.
     * @return builder
     */
    inline def clientScopedSubscription(args: Endofunction[com.pulumi.azure.eventhub.inputs.SubscriptionClientScopedSubscriptionArgs.Builder]):
        com.pulumi.azure.eventhub.inputs.SubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.eventhub.inputs.SubscriptionClientScopedSubscriptionArgs.builder
      builder.clientScopedSubscription(args(argsBuilder).build)
