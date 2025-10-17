package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object resourcegroups:
  /** Provides a Resource Group. */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.resourcegroups.GroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.resourcegroups.GroupArgs.builder
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
    com.pulumi.aws.resourcegroups.Group(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.resourcegroups.GroupArgs.Builder)
    /**
     * @param configurations A configuration associates the resource group with an AWS service and specifies how the service can interact with the resources in the group. See below for details.
     * @return builder
     */
    def configurations(args: Endofunction[com.pulumi.aws.resourcegroups.inputs.GroupConfigurationArgs.Builder]*):
        com.pulumi.aws.resourcegroups.GroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.resourcegroups.inputs.GroupConfigurationArgs.builder
      builder.configurations(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceQuery A `resourceQuery` block. Resource queries are documented below.
     * @return builder
     */
    def resourceQuery(args: Endofunction[com.pulumi.aws.resourcegroups.inputs.GroupResourceQueryArgs.Builder]):
        com.pulumi.aws.resourcegroups.GroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.resourcegroups.inputs.GroupResourceQueryArgs.builder
      builder.resourceQuery(args(argsBuilder).build)

  /** Resource for managing an AWS Resource Groups Resource. */
  def Resource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.resourcegroups.ResourceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.resourcegroups.ResourceArgs.builder
    com.pulumi.aws.resourcegroups.Resource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.resourcegroups.inputs.GroupConfigurationArgs.Builder)
    /**
     * @param parameters A collection of parameters for this group configuration item. See below for details.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.resourcegroups.inputs.GroupConfigurationParameterArgs.Builder]*):
        com.pulumi.aws.resourcegroups.inputs.GroupConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.resourcegroups.inputs.GroupConfigurationParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.resourcegroups.inputs.GroupState.Builder)
    /**
     * @param configurations A configuration associates the resource group with an AWS service and specifies how the service can interact with the resources in the group. See below for details.
     * @return builder
     */
    def configurations(args: Endofunction[com.pulumi.aws.resourcegroups.inputs.GroupConfigurationArgs.Builder]*):
        com.pulumi.aws.resourcegroups.inputs.GroupState.Builder =
      def argsBuilder = com.pulumi.aws.resourcegroups.inputs.GroupConfigurationArgs.builder
      builder.configurations(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceQuery A `resourceQuery` block. Resource queries are documented below.
     * @return builder
     */
    def resourceQuery(args: Endofunction[com.pulumi.aws.resourcegroups.inputs.GroupResourceQueryArgs.Builder]):
        com.pulumi.aws.resourcegroups.inputs.GroupState.Builder =
      val argsBuilder = com.pulumi.aws.resourcegroups.inputs.GroupResourceQueryArgs.builder
      builder.resourceQuery(args(argsBuilder).build)
