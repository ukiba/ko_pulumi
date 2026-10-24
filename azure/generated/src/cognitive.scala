package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
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
  def AIServices(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cognitive.AIServicesArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Cognitive Services Account.
   * 
   * &gt; **Note:** The Cognitive Services Account manages the resource type for various Azure AI resource implementations, including Azure AI Foundry, Azure OpenAI, Azure Speech, Azure Vision and others. Each service shares the same control plane but exposes a different subset of developer APIs. Azure AI Foundry (kind = `AIServices`) provides the superset of capabilities. For more information, please see [Azure AI Foundry architecture](https://learn.microsoft.com/en-us/azure/ai-foundry/concepts/architecture).
   * 
   * &gt; **Note:** The Azure Provider will attempt to Purge the Cognitive Services Account during deletion. This feature can be disabled using the `features` block within the `provider` block, see the provider documentation on the features block for more information.
   */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cognitive.AccountArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Cognitive Services (Microsoft Foundry) Account Connection with Account Key authentication.
   * 
   * &gt; **Note:** In the new Foundry portal experience, &#34;Account Connections&#34; are shown as &#34;Tools&#34; under the &#34;Build&#34; menu.
   */
  def AccountConnectionAccountKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cognitive.AccountConnectionAccountKeyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cognitive.AccountConnectionAccountKeyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cognitive.AccountConnectionAccountKey(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Cognitive Services (Microsoft Foundry) Account Connection with Account Managed Identity authentication.
   * 
   * &gt; **Note:** In the new Foundry portal experience, &#34;Account Connections&#34; are shown as &#34;Tools&#34; under the &#34;Build&#34; menu.
   */
  def AccountConnectionAccountManagedIdentity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cognitive.AccountConnectionAccountManagedIdentityArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cognitive.AccountConnectionAccountManagedIdentityArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cognitive.AccountConnectionAccountManagedIdentity(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Cognitive Services (Microsoft Foundry) Account Connection with API Key authentication.
   * 
   * &gt; **Note:** In the new Foundry portal experience, &#34;Account Connections&#34; are shown as &#34;Tools&#34; under the &#34;Build&#34; menu.
   */
  def AccountConnectionApiKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cognitive.AccountConnectionApiKeyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cognitive.AccountConnectionApiKeyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cognitive.AccountConnectionApiKey(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Cognitive Services (Microsoft Foundry) Account Connection with Custom Keys authentication.
   * 
   * &gt; **Note:** In the new Foundry portal experience, &#34;Account Connections&#34; are shown as &#34;Tools&#34; under the &#34;Build&#34; menu.
   */
  def AccountConnectionCustomKeys(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cognitive.AccountConnectionCustomKeysArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cognitive.AccountConnectionCustomKeysArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cognitive.AccountConnectionCustomKeys(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Cognitive Services (Microsoft Foundry) Account Connection with Entra ID (formerly Azure Active Directory) authentication.
   * 
   * &gt; **Note:** In the new Foundry portal experience, &#34;Account Connections&#34; are shown as &#34;Tools&#34; under the &#34;Build&#34; menu.
   */
  def AccountConnectionEntraId(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cognitive.AccountConnectionEntraIdArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cognitive.AccountConnectionEntraIdArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cognitive.AccountConnectionEntraId(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Customer Managed Key for a Cognitive Services Account.
   * 
   * &gt; **Note:** It&#39;s possible to define a Customer Managed Key both within the `azure.cognitive.Account` resource via the `customerManagedKey` block and by using the `azure.cognitive.AccountCustomerManagedKey` resource. However it&#39;s not possible to use both methods to manage a Customer Managed Key for a Cognitive Account, since there&#39;ll be conflicts.
   */
  def AccountCustomerManagedKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cognitive.AccountCustomerManagedKeyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.cognitive.AccountCustomerManagedKeyArgs.builder
    com.pulumi.azure.cognitive.AccountCustomerManagedKey(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Cognitive Account Project.
   * 
   * &gt; **Note:** Cognitive Account Projects can only be created under a Cognitive Account that has `projectManagementEnabled = true`, `kind = &#34;AIServices&#34;`, a managed identity configured, and a `customSubdomainName` specified.
   */
  def AccountProject(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cognitive.AccountProjectArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Microsoft Foundry &#34;Guardrails + Controls&#34; blocklist. Microsoft Foundry was previously known as &#34;Cognitive Account&#34;. */
  def AccountRaiBlocklist(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cognitive.AccountRaiBlocklistArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Cognitive Services Account RAI Policy. */
  def AccountRaiPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cognitive.AccountRaiPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object CognitiveFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Cognitive Services Account. */
    inline def getAccount(args: Endofunction[com.pulumi.azure.cognitive.inputs.GetAccountArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.cognitive.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.GetAccountArgs.builder
      com.pulumi.azure.cognitive.CognitiveFunctions.getAccount(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Cognitive Services Account. */
    inline def getAccountPlain(args: Endofunction[com.pulumi.azure.cognitive.inputs.GetAccountPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cognitive.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.GetAccountPlainArgs.builder
      com.pulumi.azure.cognitive.CognitiveFunctions.getAccountPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Cognitive Services Account Project. */
    inline def getAccountProject(args: Endofunction[com.pulumi.azure.cognitive.inputs.GetAccountProjectArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.cognitive.outputs.GetAccountProjectResult] =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.GetAccountProjectArgs.builder
      com.pulumi.azure.cognitive.CognitiveFunctions.getAccountProject(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Cognitive Services Account Project. */
    inline def getAccountProjectPlain(args: Endofunction[com.pulumi.azure.cognitive.inputs.GetAccountProjectPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cognitive.outputs.GetAccountProjectResult] =
      val argsBuilder = com.pulumi.azure.cognitive.inputs.GetAccountProjectPlainArgs.builder
      com.pulumi.azure.cognitive.CognitiveFunctions.getAccountProjectPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages a Cognitive Services Account Deployment. */
  def Deployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cognitive.DeploymentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cognitive.DeploymentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cognitive.Deployment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
