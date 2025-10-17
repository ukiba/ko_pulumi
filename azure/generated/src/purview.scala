package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object purview:
  /** Manages a Purview Account. */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.purview.AccountArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.purview.AccountArgs.builder
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
    com.pulumi.azure.purview.Account(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.purview.AccountArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.purview.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.purview.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.purview.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.purview.inputs.AccountState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.purview.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.purview.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.purview.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param managedResources A `managedResources` block as defined below.
     * @return builder
     */
    def managedResources(args: Endofunction[com.pulumi.azure.purview.inputs.AccountManagedResourceArgs.Builder]*):
        com.pulumi.azure.purview.inputs.AccountState.Builder =
      def argsBuilder = com.pulumi.azure.purview.inputs.AccountManagedResourceArgs.builder
      builder.managedResources(args.map(_(argsBuilder).build)*)
