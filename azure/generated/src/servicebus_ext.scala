package jp.ukiba.ko_pulumi
package azure

object servicebus_ext:
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

  extension (builder: com.pulumi.azure.servicebus.SubscriptionArgs.Builder)
    /**
     * @param clientScopedSubscription A `clientScopedSubscription` block as defined below.
     * @return builder
     */
    def clientScopedSubscription(args: Endofunction[com.pulumi.azure.servicebus.inputs.SubscriptionClientScopedSubscriptionArgs.Builder]):
        com.pulumi.azure.servicebus.SubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.SubscriptionClientScopedSubscriptionArgs.builder
      builder.clientScopedSubscription(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.servicebus.SubscriptionRuleArgs.Builder)
    /**
     * @param correlationFilter A `correlationFilter` block as documented below to be evaluated against a BrokeredMessage. Required when `filterType` is set to `CorrelationFilter`.
     * @return builder
     */
    def correlationFilter(args: Endofunction[com.pulumi.azure.servicebus.inputs.SubscriptionRuleCorrelationFilterArgs.Builder]):
        com.pulumi.azure.servicebus.SubscriptionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.SubscriptionRuleCorrelationFilterArgs.builder
      builder.correlationFilter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.servicebus.inputs.NamespaceNetworkRuleSetArgs.Builder)
    /**
     * @param networkRules One or more `networkRules` blocks as defined below.
     * @return builder
     */
    def networkRules(args: Endofunction[com.pulumi.azure.servicebus.inputs.NamespaceNetworkRuleSetNetworkRuleArgs.Builder]*):
        com.pulumi.azure.servicebus.inputs.NamespaceNetworkRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.servicebus.inputs.NamespaceNetworkRuleSetNetworkRuleArgs.builder
      builder.networkRules(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.azure.servicebus.inputs.SubscriptionRuleState.Builder)
    /**
     * @param correlationFilter A `correlationFilter` block as documented below to be evaluated against a BrokeredMessage. Required when `filterType` is set to `CorrelationFilter`.
     * @return builder
     */
    def correlationFilter(args: Endofunction[com.pulumi.azure.servicebus.inputs.SubscriptionRuleCorrelationFilterArgs.Builder]):
        com.pulumi.azure.servicebus.inputs.SubscriptionRuleState.Builder =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.SubscriptionRuleCorrelationFilterArgs.builder
      builder.correlationFilter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.servicebus.inputs.SubscriptionState.Builder)
    /**
     * @param clientScopedSubscription A `clientScopedSubscription` block as defined below.
     * @return builder
     */
    def clientScopedSubscription(args: Endofunction[com.pulumi.azure.servicebus.inputs.SubscriptionClientScopedSubscriptionArgs.Builder]):
        com.pulumi.azure.servicebus.inputs.SubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.servicebus.inputs.SubscriptionClientScopedSubscriptionArgs.builder
      builder.clientScopedSubscription(args(argsBuilder).build)
