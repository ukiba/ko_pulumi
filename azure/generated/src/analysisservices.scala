package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object analysisservices:
  extension (builder: com.pulumi.azure.analysisservices.ServerArgs.Builder)
    /**
     * @param ipv4FirewallRules One or more `ipv4FirewallRule` block(s) as defined below.
     * @return builder
     */
    def ipv4FirewallRules(args: Endofunction[com.pulumi.azure.analysisservices.inputs.ServerIpv4FirewallRuleArgs.Builder]*):
        com.pulumi.azure.analysisservices.ServerArgs.Builder =
      def argsBuilder = com.pulumi.azure.analysisservices.inputs.ServerIpv4FirewallRuleArgs.builder
      builder.ipv4FirewallRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.analysisservices.ServerArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Analysis Services Server. */
  def Server(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.analysisservices.ServerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.analysisservices.ServerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.analysisservices.Server(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.analysisservices.inputs.ServerState.Builder)
    /**
     * @param ipv4FirewallRules One or more `ipv4FirewallRule` block(s) as defined below.
     * @return builder
     */
    def ipv4FirewallRules(args: Endofunction[com.pulumi.azure.analysisservices.inputs.ServerIpv4FirewallRuleArgs.Builder]*):
        com.pulumi.azure.analysisservices.inputs.ServerState.Builder =
      def argsBuilder = com.pulumi.azure.analysisservices.inputs.ServerIpv4FirewallRuleArgs.builder
      builder.ipv4FirewallRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.analysisservices.inputs.ServerState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
