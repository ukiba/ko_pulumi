package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object hsm:
  /**
   * Manages a Dedicated Hardware Security Module.
   * 
   *  &gt; **Note:** Before using this resource, it&#39;s required to submit the request of registering the providers and features with Azure CLI `az provider register --namespace Microsoft.HardwareSecurityModules &amp;&amp; az feature register --namespace Microsoft.HardwareSecurityModules --name AzureDedicatedHSM &amp;&amp; az provider register --namespace Microsoft.Network &amp;&amp; az feature register --namespace Microsoft.Network --name AllowBaremetalServers` and ask service team (hsmrequest{@literal @}microsoft.com) to approve. See more details from &lt;https://docs.microsoft.com/azure/dedicated-hsm/tutorial-deploy-hsm-cli#prerequisites&gt;.
   * 
   *  &gt; **Note:** If the quota is not enough in some region, please submit the quota request to service team.
   */
  def Module(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.hsm.ModuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.hsm.ModuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.hsm.Module(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.hsm.ModuleArgs.Builder)
    /**
     * @param managementNetworkProfile A `managementNetworkProfile` block as defined below.
     * 
     *  &gt; **Note:** The `managementNetworkProfile` should not be specified when `skuName` is `SafeNet Luna Network HSM A790`.
     * @return builder
     */
    def managementNetworkProfile(args: Endofunction[com.pulumi.azure.hsm.inputs.ModuleManagementNetworkProfileArgs.Builder]):
        com.pulumi.azure.hsm.ModuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.hsm.inputs.ModuleManagementNetworkProfileArgs.builder
      builder.managementNetworkProfile(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below.
     * @return builder
     */
    def networkProfile(args: Endofunction[com.pulumi.azure.hsm.inputs.ModuleNetworkProfileArgs.Builder]):
        com.pulumi.azure.hsm.ModuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.hsm.inputs.ModuleNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.hsm.ModuleArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.hsm.inputs.ModuleState.Builder)
    /**
     * @param managementNetworkProfile A `managementNetworkProfile` block as defined below.
     * 
     *  &gt; **Note:** The `managementNetworkProfile` should not be specified when `skuName` is `SafeNet Luna Network HSM A790`.
     * @return builder
     */
    def managementNetworkProfile(args: Endofunction[com.pulumi.azure.hsm.inputs.ModuleManagementNetworkProfileArgs.Builder]):
        com.pulumi.azure.hsm.inputs.ModuleState.Builder =
      val argsBuilder = com.pulumi.azure.hsm.inputs.ModuleManagementNetworkProfileArgs.builder
      builder.managementNetworkProfile(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below.
     * @return builder
     */
    def networkProfile(args: Endofunction[com.pulumi.azure.hsm.inputs.ModuleNetworkProfileArgs.Builder]):
        com.pulumi.azure.hsm.inputs.ModuleState.Builder =
      val argsBuilder = com.pulumi.azure.hsm.inputs.ModuleNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.hsm.inputs.ModuleState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
