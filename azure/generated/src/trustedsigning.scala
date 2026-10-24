package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object trustedsigning:
  /** Manages a Trusted Signing Account. */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.trustedsigning.AccountArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.trustedsigning.AccountArgs.builder
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
    com.pulumi.azure.trustedsigning.Account(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object TrustedsigningFunctions:
    /** Use this data source to access information about an existing Trusted Signing Account. */
    inline def getAccount(args: Endofunction[com.pulumi.azure.trustedsigning.inputs.GetAccountArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.trustedsigning.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.trustedsigning.inputs.GetAccountArgs.builder
      com.pulumi.azure.trustedsigning.TrustedsigningFunctions.getAccount(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Trusted Signing Account. */
    inline def getAccountPlain(args: Endofunction[com.pulumi.azure.trustedsigning.inputs.GetAccountPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.trustedsigning.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.trustedsigning.inputs.GetAccountPlainArgs.builder
      com.pulumi.azure.trustedsigning.TrustedsigningFunctions.getAccountPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
