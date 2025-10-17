package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object analysisservices:
  /** Manages an Analysis Services Server. */
  def Server(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.analysisservices.ServerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.analysisservices.ServerArgs.builder
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
    com.pulumi.azure.analysisservices.Server(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.analysisservices.ServerArgs.Builder)
    /**
     * @param ipv4FirewallRules One or more `ipv4FirewallRule` block(s) as defined below.
     * @return builder
     */
    def ipv4FirewallRules(args: Endofunction[com.pulumi.azure.analysisservices.inputs.ServerIpv4FirewallRuleArgs.Builder]*):
        com.pulumi.azure.analysisservices.ServerArgs.Builder =
      def argsBuilder = com.pulumi.azure.analysisservices.inputs.ServerIpv4FirewallRuleArgs.builder
      builder.ipv4FirewallRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.analysisservices.inputs.ServerState.Builder)
    /**
     * @param ipv4FirewallRules One or more `ipv4FirewallRule` block(s) as defined below.
     * @return builder
     */
    def ipv4FirewallRules(args: Endofunction[com.pulumi.azure.analysisservices.inputs.ServerIpv4FirewallRuleArgs.Builder]*):
        com.pulumi.azure.analysisservices.inputs.ServerState.Builder =
      def argsBuilder = com.pulumi.azure.analysisservices.inputs.ServerIpv4FirewallRuleArgs.builder
      builder.ipv4FirewallRules(args.map(_(argsBuilder).build)*)
