package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object iotcentral:
  /** Manages an IoT Central Application */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iotcentral.ApplicationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.iotcentral.ApplicationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.iotcentral.Application(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an IoT Central Application Network Rule Set. */
  def ApplicationNetworkRuleSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iotcentral.ApplicationNetworkRuleSetArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.iotcentral.ApplicationNetworkRuleSetArgs.builder
    com.pulumi.azure.iotcentral.ApplicationNetworkRuleSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.iotcentral.ApplicationNetworkRuleSetArgs.Builder)
    /**
     * @param ipRules One or more `ipRule` blocks as defined below.
     * @return builder
     */
    def ipRules(args: Endofunction[com.pulumi.azure.iotcentral.inputs.ApplicationNetworkRuleSetIpRuleArgs.Builder]*):
        com.pulumi.azure.iotcentral.ApplicationNetworkRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.iotcentral.inputs.ApplicationNetworkRuleSetIpRuleArgs.builder
      builder.ipRules(args.map(_(argsBuilder).build)*)

  /** Manages an IoT Central Organization */
  def Organization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iotcentral.OrganizationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.iotcentral.OrganizationArgs.builder
    com.pulumi.azure.iotcentral.Organization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.iotcentral.ApplicationArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.iotcentral.inputs.ApplicationIdentityArgs.Builder]):
        com.pulumi.azure.iotcentral.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.azure.iotcentral.inputs.ApplicationIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.iotcentral.ApplicationArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.iotcentral.inputs.ApplicationNetworkRuleSetState.Builder)
    /**
     * @param ipRules One or more `ipRule` blocks as defined below.
     * @return builder
     */
    def ipRules(args: Endofunction[com.pulumi.azure.iotcentral.inputs.ApplicationNetworkRuleSetIpRuleArgs.Builder]*):
        com.pulumi.azure.iotcentral.inputs.ApplicationNetworkRuleSetState.Builder =
      def argsBuilder = com.pulumi.azure.iotcentral.inputs.ApplicationNetworkRuleSetIpRuleArgs.builder
      builder.ipRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.iotcentral.inputs.ApplicationState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.iotcentral.inputs.ApplicationIdentityArgs.Builder]):
        com.pulumi.azure.iotcentral.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.azure.iotcentral.inputs.ApplicationIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.iotcentral.inputs.ApplicationState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
