package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object waf:
  /** Manages a Azure Web Application Firewall Policy instance. */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.waf.PolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.waf.PolicyArgs.builder
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
    com.pulumi.azure.waf.Policy(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object WafFunctions:
    /** Use this data source to access information about an existing Web Application Firewall Policy. */
    inline def getFirewallPolicy(args: Endofunction[com.pulumi.azure.waf.inputs.GetFirewallPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.waf.outputs.GetFirewallPolicyResult] =
      val argsBuilder = com.pulumi.azure.waf.inputs.GetFirewallPolicyArgs.builder
      com.pulumi.azure.waf.WafFunctions.getFirewallPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Web Application Firewall Policy. */
    inline def getFirewallPolicyPlain(args: Endofunction[com.pulumi.azure.waf.inputs.GetFirewallPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.waf.outputs.GetFirewallPolicyResult] =
      val argsBuilder = com.pulumi.azure.waf.inputs.GetFirewallPolicyPlainArgs.builder
      com.pulumi.azure.waf.WafFunctions.getFirewallPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
