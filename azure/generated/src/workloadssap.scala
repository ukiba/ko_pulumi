package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object workloadssap:
  /**
   * Manages an SAP Discovery Virtual Instance.
   * 
   * &gt; **Note:** Before using this resource, it&#39;s required to submit the request of registering the Resource Provider with Azure CLI `az provider register --namespace &#34;Microsoft.Workloads&#34;`. The Resource Provider can take a while to register, you can check the status by running `az provider show --namespace &#34;Microsoft.Workloads&#34; --query &#34;registrationState&#34;`. Once this outputs &#34;Registered&#34; the Resource Provider is available for use.
   */
  def DiscoveryVirtualInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.workloadssap.DiscoveryVirtualInstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.workloadssap.DiscoveryVirtualInstanceArgs.builder
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
    com.pulumi.azure.workloadssap.DiscoveryVirtualInstance(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an SAP Single Node Virtual Instance with new SAP System.
   * 
   * &gt; **Note:** Before using this resource, it&#39;s required to submit the request of registering the Resource Provider with Azure CLI `az provider register --namespace &#34;Microsoft.Workloads&#34;`. The Resource Provider can take a while to register, you can check the status by running `az provider show --namespace &#34;Microsoft.Workloads&#34; --query &#34;registrationState&#34;`. Once this outputs &#34;Registered&#34; the Resource Provider is available for use.
   */
  def SingleNodeVirtualInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.workloadssap.SingleNodeVirtualInstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.workloadssap.SingleNodeVirtualInstanceArgs.builder
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
    com.pulumi.azure.workloadssap.SingleNodeVirtualInstance(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an SAP Three Tier Virtual Instance with a new SAP System.
   * 
   * &gt; **Note:** Before using this resource, it&#39;s required to submit the request of registering the Resource Provider with Azure CLI `az provider register --namespace &#34;Microsoft.Workloads&#34;`. The Resource Provider can take a while to register, you can check the status by running `az provider show --namespace &#34;Microsoft.Workloads&#34; --query &#34;registrationState&#34;`. Once this outputs &#34;Registered&#34; the Resource Provider is available for use.
   */
  def ThreeTierVirtualInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.workloadssap.ThreeTierVirtualInstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.workloadssap.ThreeTierVirtualInstanceArgs.builder
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
    com.pulumi.azure.workloadssap.ThreeTierVirtualInstance(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
