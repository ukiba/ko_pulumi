package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object fluidrelay:
  extension (builder: com.pulumi.azure.fluidrelay.ServerArgs.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.fluidrelay.inputs.ServerCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.fluidrelay.ServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.fluidrelay.inputs.ServerCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.fluidrelay.inputs.ServerIdentityArgs.Builder]):
        com.pulumi.azure.fluidrelay.ServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.fluidrelay.inputs.ServerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.fluidrelay.ServerArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Fluid Relay Server. */
  def Server(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.fluidrelay.ServerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.fluidrelay.ServerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.fluidrelay.Server(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.fluidrelay.inputs.ServerState.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.fluidrelay.inputs.ServerCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.fluidrelay.inputs.ServerState.Builder =
      val argsBuilder = com.pulumi.azure.fluidrelay.inputs.ServerCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.fluidrelay.inputs.ServerIdentityArgs.Builder]):
        com.pulumi.azure.fluidrelay.inputs.ServerState.Builder =
      val argsBuilder = com.pulumi.azure.fluidrelay.inputs.ServerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.fluidrelay.inputs.ServerState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
