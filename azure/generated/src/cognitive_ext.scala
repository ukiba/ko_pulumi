package jp.ukiba.ko_pulumi
package azure

object cognitive_ext:
  extension (builder: com.pulumi.azure.cognitive.AIServicesArgs.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as documented below.
     * @return builder
     */
    inline def customerManagedKey(args: Endofunction[com.pulumi.azure.cognitive.inputs.AIServicesCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.cognitive.AIServicesArgs.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AIServicesCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.cognitive.inputs.AIServicesIdentityArgs.Builder]):
        com.pulumi.azure.cognitive.AIServicesArgs.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AIServicesIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkAcls A `networkAcls` block as defined below. When this property is specified, `customSubdomainName` is also required to be set.
     * @return builder
     */
    inline def networkAcls(args: Endofunction[com.pulumi.azure.cognitive.inputs.AIServicesNetworkAclsArgs.Builder]):
        com.pulumi.azure.cognitive.AIServicesArgs.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AIServicesNetworkAclsArgs.builder
      builder.networkAcls(args(argsBuilder).build)

    /**
     * @param storages A `storage` block as defined below.
     * @return builder
     */
    inline def storages(args: Endofunction[com.pulumi.azure.cognitive.inputs.AIServicesStorageArgs.Builder]*):
        com.pulumi.azure.cognitive.AIServicesArgs.Builder =
      def argsBuilder = com.pulumi.azure.cognitive.inputs.AIServicesStorageArgs.builder
      builder.storages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cognitive.AccountArgs.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as documented below.
     * @return builder
     */
    inline def customerManagedKey(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.cognitive.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AccountCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.cognitive.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkAcls A `networkAcls` block as defined below. When this property is specified, `customSubdomainName` is also required to be set.
     * @return builder
     */
    inline def networkAcls(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountNetworkAclsArgs.Builder]):
        com.pulumi.azure.cognitive.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AccountNetworkAclsArgs.builder
      builder.networkAcls(args(argsBuilder).build)

    /**
     * @param networkInjection A `networkInjection` block as defined below. Only applicable if the `kind` is set to `AIServices`.
     * @return builder
     */
    inline def networkInjection(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountNetworkInjectionArgs.Builder]):
        com.pulumi.azure.cognitive.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AccountNetworkInjectionArgs.builder
      builder.networkInjection(args(argsBuilder).build)

    /**
     * @param storages A `storage` block as defined below.
     * @return builder
     */
    inline def storages(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountStorageArgs.Builder]*):
        com.pulumi.azure.cognitive.AccountArgs.Builder =
      def argsBuilder = com.pulumi.azure.cognitive.inputs.AccountStorageArgs.builder
      builder.storages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cognitive.AccountProjectArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountProjectIdentityArgs.Builder]):
        com.pulumi.azure.cognitive.AccountProjectArgs.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AccountProjectIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cognitive.AccountRaiPolicyArgs.Builder)
    /**
     * @param contentFilters A `contentFilter` block as defined below.
     * @return builder
     */
    inline def contentFilters(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountRaiPolicyContentFilterArgs.Builder]*):
        com.pulumi.azure.cognitive.AccountRaiPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.cognitive.inputs.AccountRaiPolicyContentFilterArgs.builder
      builder.contentFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cognitive.DeploymentArgs.Builder)
    /**
     * @param model A `model` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def model(args: Endofunction[com.pulumi.azure.cognitive.inputs.DeploymentModelArgs.Builder]):
        com.pulumi.azure.cognitive.DeploymentArgs.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.DeploymentModelArgs.builder
      builder.model(args(argsBuilder).build)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.cognitive.inputs.DeploymentSkuArgs.Builder]):
        com.pulumi.azure.cognitive.DeploymentArgs.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.DeploymentSkuArgs.builder
      builder.sku(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cognitive.inputs.AIServicesNetworkAclsArgs.Builder)
    /**
     * @param virtualNetworkRules A `virtualNetworkRules` block as defined below.
     * @return builder
     */
    inline def virtualNetworkRules(args: Endofunction[com.pulumi.azure.cognitive.inputs.AIServicesNetworkAclsVirtualNetworkRuleArgs.Builder]*):
        com.pulumi.azure.cognitive.inputs.AIServicesNetworkAclsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cognitive.inputs.AIServicesNetworkAclsVirtualNetworkRuleArgs.builder
      builder.virtualNetworkRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cognitive.inputs.AIServicesState.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as documented below.
     * @return builder
     */
    inline def customerManagedKey(args: Endofunction[com.pulumi.azure.cognitive.inputs.AIServicesCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.cognitive.inputs.AIServicesState.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AIServicesCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.cognitive.inputs.AIServicesIdentityArgs.Builder]):
        com.pulumi.azure.cognitive.inputs.AIServicesState.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AIServicesIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkAcls A `networkAcls` block as defined below. When this property is specified, `customSubdomainName` is also required to be set.
     * @return builder
     */
    inline def networkAcls(args: Endofunction[com.pulumi.azure.cognitive.inputs.AIServicesNetworkAclsArgs.Builder]):
        com.pulumi.azure.cognitive.inputs.AIServicesState.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AIServicesNetworkAclsArgs.builder
      builder.networkAcls(args(argsBuilder).build)

    /**
     * @param storages A `storage` block as defined below.
     * @return builder
     */
    inline def storages(args: Endofunction[com.pulumi.azure.cognitive.inputs.AIServicesStorageArgs.Builder]*):
        com.pulumi.azure.cognitive.inputs.AIServicesState.Builder =
      def argsBuilder = com.pulumi.azure.cognitive.inputs.AIServicesStorageArgs.builder
      builder.storages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cognitive.inputs.AccountNetworkAclsArgs.Builder)
    /**
     * @param virtualNetworkRules A `virtualNetworkRules` block as defined below.
     * @return builder
     */
    inline def virtualNetworkRules(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountNetworkAclsVirtualNetworkRuleArgs.Builder]*):
        com.pulumi.azure.cognitive.inputs.AccountNetworkAclsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cognitive.inputs.AccountNetworkAclsVirtualNetworkRuleArgs.builder
      builder.virtualNetworkRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cognitive.inputs.AccountProjectState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountProjectIdentityArgs.Builder]):
        com.pulumi.azure.cognitive.inputs.AccountProjectState.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AccountProjectIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cognitive.inputs.AccountRaiPolicyState.Builder)
    /**
     * @param contentFilters A `contentFilter` block as defined below.
     * @return builder
     */
    inline def contentFilters(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountRaiPolicyContentFilterArgs.Builder]*):
        com.pulumi.azure.cognitive.inputs.AccountRaiPolicyState.Builder =
      def argsBuilder = com.pulumi.azure.cognitive.inputs.AccountRaiPolicyContentFilterArgs.builder
      builder.contentFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cognitive.inputs.AccountState.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as documented below.
     * @return builder
     */
    inline def customerManagedKey(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.cognitive.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AccountCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.cognitive.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkAcls A `networkAcls` block as defined below. When this property is specified, `customSubdomainName` is also required to be set.
     * @return builder
     */
    inline def networkAcls(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountNetworkAclsArgs.Builder]):
        com.pulumi.azure.cognitive.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AccountNetworkAclsArgs.builder
      builder.networkAcls(args(argsBuilder).build)

    /**
     * @param networkInjection A `networkInjection` block as defined below. Only applicable if the `kind` is set to `AIServices`.
     * @return builder
     */
    inline def networkInjection(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountNetworkInjectionArgs.Builder]):
        com.pulumi.azure.cognitive.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AccountNetworkInjectionArgs.builder
      builder.networkInjection(args(argsBuilder).build)

    /**
     * @param storages A `storage` block as defined below.
     * @return builder
     */
    inline def storages(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountStorageArgs.Builder]*):
        com.pulumi.azure.cognitive.inputs.AccountState.Builder =
      def argsBuilder = com.pulumi.azure.cognitive.inputs.AccountStorageArgs.builder
      builder.storages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cognitive.inputs.DeploymentState.Builder)
    /**
     * @param model A `model` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def model(args: Endofunction[com.pulumi.azure.cognitive.inputs.DeploymentModelArgs.Builder]):
        com.pulumi.azure.cognitive.inputs.DeploymentState.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.DeploymentModelArgs.builder
      builder.model(args(argsBuilder).build)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.cognitive.inputs.DeploymentSkuArgs.Builder]):
        com.pulumi.azure.cognitive.inputs.DeploymentState.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.DeploymentSkuArgs.builder
      builder.sku(args(argsBuilder).build)
