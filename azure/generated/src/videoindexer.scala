package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object videoindexer:
  /** Manages a Video Indexer Account */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.videoindexer.AccountArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.videoindexer.AccountArgs.builder
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
    com.pulumi.azure.videoindexer.Account(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.videoindexer.AccountArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.videoindexer.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.videoindexer.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.videoindexer.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param storage A `storage` block as defined below.
     * @return builder
     */
    def storage(args: Endofunction[com.pulumi.azure.videoindexer.inputs.AccountStorageArgs.Builder]):
        com.pulumi.azure.videoindexer.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.videoindexer.inputs.AccountStorageArgs.builder
      builder.storage(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.videoindexer.inputs.AccountState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.videoindexer.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.videoindexer.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.videoindexer.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param storage A `storage` block as defined below.
     * @return builder
     */
    def storage(args: Endofunction[com.pulumi.azure.videoindexer.inputs.AccountStorageArgs.Builder]):
        com.pulumi.azure.videoindexer.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.videoindexer.inputs.AccountStorageArgs.builder
      builder.storage(args(argsBuilder).build)
