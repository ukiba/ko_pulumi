package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object hsm:
  /**
   * Manages a Dedicated Hardware Security Module.
   * 
   * &gt; **Note:** Before using this resource, it&#39;s required to submit the request of registering the providers and features with Azure CLI `az provider register --namespace Microsoft.HardwareSecurityModules &amp;&amp; az feature register --namespace Microsoft.HardwareSecurityModules --name AzureDedicatedHSM &amp;&amp; az provider register --namespace Microsoft.Network &amp;&amp; az feature register --namespace Microsoft.Network --name AllowBaremetalServers` and ask service team (hsmrequest{@literal @}microsoft.com) to approve. See more details from &lt;https://docs.microsoft.com/azure/dedicated-hsm/tutorial-deploy-hsm-cli#prerequisites&gt;.
   * 
   * &gt; **Note:** If the quota is not enough in some region, please submit the quota request to service team.
   */
  inline def Module(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.hsm.ModuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.hsm.ModuleArgs.builder
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
    com.pulumi.azure.hsm.Module(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
