package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object cognitive:
  /**
   * Manages an AI Services Account.
   * 
   * &gt; **Note:** The `azure.cognitive.AIServices` resource has been deprecated and will be removed in v5.0 of the AzureRM Provider. Please use `azure.cognitive.Account` resource instead.
   * 
   * ## Migration to `azure.cognitive.Account`
   * 
   * The `azure.cognitive.AIServices` resource is superseded by `azure.cognitive.Account`. The table below lists the attributes that have changed; all other attributes are carried over unchanged.
   * 
   * | `azure.cognitive.AIServices` | `azure.cognitive.Account` | Notes |
   * |-----------------------|-----------------------------|-------|
   * | (not present) | `kind` | **Required**. Set to `&#34;AIServices&#34;` to match the behaviour of `azure.cognitive.AIServices`. |
   * | `localAuthenticationEnabled` | `localAuthEnabled` | **Renamed**. Both default to `true`. |
   * | `publicNetworkAccess` | `publicNetworkAccessEnabled` | **Changed type**. String (`&#34;Enabled&#34;` / `&#34;Disabled&#34;`) \u2192 Boolean (`true` / `false`). Defaults to `true`. |
   * | (not present) | `projectManagementEnabled` |**Required**. Set to `true` to match the behaviour of `azure.cognitive.AIServices`. |
   * | `customer_managed_key.managed_hsm_key_id`  | (not present) | Use `customer_managed_key.key_vault_key_id` property, it can accept both regular and HSM key id. |
   * 
   * &gt; **Note:** If your configuration included a `storage` block under `azure.cognitive.AIServices`, `pulumi preview` may show changes after migration even though the Azure resource itself has not changed. This occurs because `azure.cognitive.AIServices` silently ignored the `storage` block and never sent those values to the API, so the imported state does not reflect them. Running `pulumi up` will reconcile the state by applying the storage configuration for the first time.
   */
  def AIServices(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cognitive.AIServicesArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cognitive.AIServicesArgs.builder
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
    com.pulumi.azure.cognitive.AIServices(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.cognitive.AIServicesArgs.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as documented below.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.cognitive.inputs.AIServicesCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.cognitive.AIServicesArgs.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AIServicesCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.cognitive.inputs.AIServicesIdentityArgs.Builder]):
        com.pulumi.azure.cognitive.AIServicesArgs.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AIServicesIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkAcls A `networkAcls` block as defined below. When this property is specified, `customSubdomainName` is also required to be set.
     * @return builder
     */
    def networkAcls(args: Endofunction[com.pulumi.azure.cognitive.inputs.AIServicesNetworkAclsArgs.Builder]):
        com.pulumi.azure.cognitive.AIServicesArgs.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AIServicesNetworkAclsArgs.builder
      builder.networkAcls(args(argsBuilder).build)

    /**
     * @param storages A `storage` block as defined below.
     * @return builder
     */
    def storages(args: Endofunction[com.pulumi.azure.cognitive.inputs.AIServicesStorageArgs.Builder]*):
        com.pulumi.azure.cognitive.AIServicesArgs.Builder =
      def argsBuilder = com.pulumi.azure.cognitive.inputs.AIServicesStorageArgs.builder
      builder.storages(args.map(_(argsBuilder).build)*)

  /**
   * Manages a Cognitive Services Account.
   * 
   * &gt; **Note:** The Cognitive Services Account manages the resource type for various Azure AI resource implementations, including Azure AI Foundry, Azure OpenAI, Azure Speech, Azure Vision and others. Each service shares the same control plane but exposes a different subset of developer APIs. Azure AI Foundry (kind = `AIServices`) provides the superset of capabilities. For more information, please see [Azure AI Foundry architecture](https://learn.microsoft.com/en-us/azure/ai-foundry/concepts/architecture).
   * 
   * &gt; **Note:** The Azure Provider will attempt to Purge the Cognitive Services Account during deletion. This feature can be disabled using the `features` block within the `provider` block, see the provider documentation on the features block for more information.
   */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cognitive.AccountArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cognitive.AccountArgs.builder
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
    com.pulumi.azure.cognitive.Account(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.cognitive.AccountArgs.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as documented below.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.cognitive.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AccountCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.cognitive.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkAcls A `networkAcls` block as defined below. When this property is specified, `customSubdomainName` is also required to be set.
     * @return builder
     */
    def networkAcls(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountNetworkAclsArgs.Builder]):
        com.pulumi.azure.cognitive.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AccountNetworkAclsArgs.builder
      builder.networkAcls(args(argsBuilder).build)

    /**
     * @param networkInjection A `networkInjection` block as defined below. Only applicable if the `kind` is set to `AIServices`.
     * @return builder
     */
    def networkInjection(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountNetworkInjectionArgs.Builder]):
        com.pulumi.azure.cognitive.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AccountNetworkInjectionArgs.builder
      builder.networkInjection(args(argsBuilder).build)

    /**
     * @param storages A `storage` block as defined below.
     * @return builder
     */
    def storages(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountStorageArgs.Builder]*):
        com.pulumi.azure.cognitive.AccountArgs.Builder =
      def argsBuilder = com.pulumi.azure.cognitive.inputs.AccountStorageArgs.builder
      builder.storages(args.map(_(argsBuilder).build)*)

  /**
   * Manages a Customer Managed Key for a Cognitive Services Account.
   * 
   * &gt; **Note:** It&#39;s possible to define a Customer Managed Key both within the `azure.cognitive.Account` resource via the `customerManagedKey` block and by using the `azure.cognitive.AccountCustomerManagedKey` resource. However it&#39;s not possible to use both methods to manage a Customer Managed Key for a Cognitive Account, since there&#39;ll be conflicts.
   */
  def AccountCustomerManagedKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cognitive.AccountCustomerManagedKeyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.cognitive.AccountCustomerManagedKeyArgs.builder
    com.pulumi.azure.cognitive.AccountCustomerManagedKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a Cognitive Account Project.
   * 
   * &gt; **Note:** Cognitive Account Projects can only be created under a Cognitive Account that has `projectManagementEnabled = true`, `kind = &#34;AIServices&#34;`, a managed identity configured, and a `customSubdomainName` specified.
   */
  def AccountProject(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cognitive.AccountProjectArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cognitive.AccountProjectArgs.builder
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
    com.pulumi.azure.cognitive.AccountProject(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.cognitive.AccountProjectArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountProjectIdentityArgs.Builder]):
        com.pulumi.azure.cognitive.AccountProjectArgs.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AccountProjectIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  /** Manages a Microsoft Foundry &#34;Guardrails + Controls&#34; blocklist. Microsoft Foundry was previously known as &#34;Cognitive Account&#34;. */
  def AccountRaiBlocklist(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cognitive.AccountRaiBlocklistArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cognitive.AccountRaiBlocklistArgs.builder
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
    com.pulumi.azure.cognitive.AccountRaiBlocklist(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Cognitive Services Account RAI Policy. */
  def AccountRaiPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cognitive.AccountRaiPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cognitive.AccountRaiPolicyArgs.builder
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
    com.pulumi.azure.cognitive.AccountRaiPolicy(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.cognitive.AccountRaiPolicyArgs.Builder)
    /**
     * @param contentFilters A `contentFilter` block as defined below.
     * @return builder
     */
    def contentFilters(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountRaiPolicyContentFilterArgs.Builder]*):
        com.pulumi.azure.cognitive.AccountRaiPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.cognitive.inputs.AccountRaiPolicyContentFilterArgs.builder
      builder.contentFilters(args.map(_(argsBuilder).build)*)

  object CognitiveFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Cognitive Services Account. */
    inline def getAccount(args: Endofunction[com.pulumi.azure.cognitive.inputs.GetAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.cognitive.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.GetAccountArgs.builder
      com.pulumi.azure.cognitive.CognitiveFunctions.getAccount(args(argsBuilder).build)

    /** Use this data source to access information about an existing Cognitive Services Account. */
    inline def getAccountPlain(args: Endofunction[com.pulumi.azure.cognitive.inputs.GetAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cognitive.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.GetAccountPlainArgs.builder
      com.pulumi.azure.cognitive.CognitiveFunctions.getAccountPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Cognitive Services Account Project. */
    inline def getAccountProject(args: Endofunction[com.pulumi.azure.cognitive.inputs.GetAccountProjectArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.cognitive.outputs.GetAccountProjectResult] =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.GetAccountProjectArgs.builder
      com.pulumi.azure.cognitive.CognitiveFunctions.getAccountProject(args(argsBuilder).build)

    /** Use this data source to access information about an existing Cognitive Services Account Project. */
    inline def getAccountProjectPlain(args: Endofunction[com.pulumi.azure.cognitive.inputs.GetAccountProjectPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cognitive.outputs.GetAccountProjectResult] =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.GetAccountProjectPlainArgs.builder
      com.pulumi.azure.cognitive.CognitiveFunctions.getAccountProjectPlain(args(argsBuilder).build)

  /** Manages a Cognitive Services Account Deployment. */
  def Deployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cognitive.DeploymentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cognitive.DeploymentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cognitive.Deployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.cognitive.DeploymentArgs.Builder)
    /**
     * @param model A `model` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def model(args: Endofunction[com.pulumi.azure.cognitive.inputs.DeploymentModelArgs.Builder]):
        com.pulumi.azure.cognitive.DeploymentArgs.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.DeploymentModelArgs.builder
      builder.model(args(argsBuilder).build)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.cognitive.inputs.DeploymentSkuArgs.Builder]):
        com.pulumi.azure.cognitive.DeploymentArgs.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.DeploymentSkuArgs.builder
      builder.sku(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cognitive.inputs.AIServicesNetworkAclsArgs.Builder)
    /**
     * @param virtualNetworkRules A `virtualNetworkRules` block as defined below.
     * @return builder
     */
    def virtualNetworkRules(args: Endofunction[com.pulumi.azure.cognitive.inputs.AIServicesNetworkAclsVirtualNetworkRuleArgs.Builder]*):
        com.pulumi.azure.cognitive.inputs.AIServicesNetworkAclsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cognitive.inputs.AIServicesNetworkAclsVirtualNetworkRuleArgs.builder
      builder.virtualNetworkRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cognitive.inputs.AIServicesState.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as documented below.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.cognitive.inputs.AIServicesCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.cognitive.inputs.AIServicesState.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AIServicesCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.cognitive.inputs.AIServicesIdentityArgs.Builder]):
        com.pulumi.azure.cognitive.inputs.AIServicesState.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AIServicesIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkAcls A `networkAcls` block as defined below. When this property is specified, `customSubdomainName` is also required to be set.
     * @return builder
     */
    def networkAcls(args: Endofunction[com.pulumi.azure.cognitive.inputs.AIServicesNetworkAclsArgs.Builder]):
        com.pulumi.azure.cognitive.inputs.AIServicesState.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AIServicesNetworkAclsArgs.builder
      builder.networkAcls(args(argsBuilder).build)

    /**
     * @param storages A `storage` block as defined below.
     * @return builder
     */
    def storages(args: Endofunction[com.pulumi.azure.cognitive.inputs.AIServicesStorageArgs.Builder]*):
        com.pulumi.azure.cognitive.inputs.AIServicesState.Builder =
      def argsBuilder = com.pulumi.azure.cognitive.inputs.AIServicesStorageArgs.builder
      builder.storages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cognitive.inputs.AccountNetworkAclsArgs.Builder)
    /**
     * @param virtualNetworkRules A `virtualNetworkRules` block as defined below.
     * @return builder
     */
    def virtualNetworkRules(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountNetworkAclsVirtualNetworkRuleArgs.Builder]*):
        com.pulumi.azure.cognitive.inputs.AccountNetworkAclsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cognitive.inputs.AccountNetworkAclsVirtualNetworkRuleArgs.builder
      builder.virtualNetworkRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cognitive.inputs.AccountProjectState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountProjectIdentityArgs.Builder]):
        com.pulumi.azure.cognitive.inputs.AccountProjectState.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AccountProjectIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cognitive.inputs.AccountRaiPolicyState.Builder)
    /**
     * @param contentFilters A `contentFilter` block as defined below.
     * @return builder
     */
    def contentFilters(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountRaiPolicyContentFilterArgs.Builder]*):
        com.pulumi.azure.cognitive.inputs.AccountRaiPolicyState.Builder =
      def argsBuilder = com.pulumi.azure.cognitive.inputs.AccountRaiPolicyContentFilterArgs.builder
      builder.contentFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cognitive.inputs.AccountState.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as documented below.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.cognitive.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AccountCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.cognitive.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkAcls A `networkAcls` block as defined below. When this property is specified, `customSubdomainName` is also required to be set.
     * @return builder
     */
    def networkAcls(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountNetworkAclsArgs.Builder]):
        com.pulumi.azure.cognitive.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AccountNetworkAclsArgs.builder
      builder.networkAcls(args(argsBuilder).build)

    /**
     * @param networkInjection A `networkInjection` block as defined below. Only applicable if the `kind` is set to `AIServices`.
     * @return builder
     */
    def networkInjection(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountNetworkInjectionArgs.Builder]):
        com.pulumi.azure.cognitive.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.AccountNetworkInjectionArgs.builder
      builder.networkInjection(args(argsBuilder).build)

    /**
     * @param storages A `storage` block as defined below.
     * @return builder
     */
    def storages(args: Endofunction[com.pulumi.azure.cognitive.inputs.AccountStorageArgs.Builder]*):
        com.pulumi.azure.cognitive.inputs.AccountState.Builder =
      def argsBuilder = com.pulumi.azure.cognitive.inputs.AccountStorageArgs.builder
      builder.storages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cognitive.inputs.DeploymentState.Builder)
    /**
     * @param model A `model` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def model(args: Endofunction[com.pulumi.azure.cognitive.inputs.DeploymentModelArgs.Builder]):
        com.pulumi.azure.cognitive.inputs.DeploymentState.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.DeploymentModelArgs.builder
      builder.model(args(argsBuilder).build)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.cognitive.inputs.DeploymentSkuArgs.Builder]):
        com.pulumi.azure.cognitive.inputs.DeploymentState.Builder =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.DeploymentSkuArgs.builder
      builder.sku(args(argsBuilder).build)
