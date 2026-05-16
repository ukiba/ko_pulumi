package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object trustedsigning:
  object TrustedsigningFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Trusted Signing Account. */
    inline def getAccount(args: Endofunction[com.pulumi.azure.trustedsigning.inputs.GetAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.trustedsigning.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.trustedsigning.inputs.GetAccountArgs.builder
      com.pulumi.azure.trustedsigning.TrustedsigningFunctions.getAccount(args(argsBuilder).build)

    /** Use this data source to access information about an existing Trusted Signing Account. */
    inline def getAccountPlain(args: Endofunction[com.pulumi.azure.trustedsigning.inputs.GetAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.trustedsigning.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.trustedsigning.inputs.GetAccountPlainArgs.builder
      com.pulumi.azure.trustedsigning.TrustedsigningFunctions.getAccountPlain(args(argsBuilder).build)

  /** Manages a Trusted Signing Account. */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.trustedsigning.AccountArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.trustedsigning.AccountArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.trustedsigning.Account(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
