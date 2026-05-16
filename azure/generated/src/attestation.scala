package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object attestation:
  /** Manages an Attestation Provider. */
  def Provider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.attestation.ProviderArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.attestation.ProviderArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.attestation.Provider(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object AttestationFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Attestation Provider. */
    inline def getProvider(args: Endofunction[com.pulumi.azure.attestation.inputs.GetProviderArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.attestation.outputs.GetProviderResult] =
      val argsBuilder = com.pulumi.azure.attestation.inputs.GetProviderArgs.builder
      com.pulumi.azure.attestation.AttestationFunctions.getProvider(args(argsBuilder).build)

    /** Use this data source to access information about an existing Attestation Provider. */
    inline def getProviderPlain(args: Endofunction[com.pulumi.azure.attestation.inputs.GetProviderPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.attestation.outputs.GetProviderResult] =
      val argsBuilder = com.pulumi.azure.attestation.inputs.GetProviderPlainArgs.builder
      com.pulumi.azure.attestation.AttestationFunctions.getProviderPlain(args(argsBuilder).build)
