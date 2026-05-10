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

  type AttestationFunctions = com.pulumi.azure.attestation.AttestationFunctions
  object AttestationFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.attestation.AttestationFunctions.*
  extension (self: AttestationFunctions.type)
    /** Use this data source to access information about an existing Attestation Provider. */
    def getProvider(args: Endofunction[com.pulumi.azure.attestation.inputs.GetProviderArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.attestation.outputs.GetProviderResult] =
      val argsBuilder = com.pulumi.azure.attestation.inputs.GetProviderArgs.builder
      com.pulumi.azure.attestation.AttestationFunctions.getProvider(args(argsBuilder).build)

    /** Use this data source to access information about an existing Attestation Provider. */
    def getProviderPlain(args: Endofunction[com.pulumi.azure.attestation.inputs.GetProviderPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.attestation.outputs.GetProviderResult] =
      val argsBuilder = com.pulumi.azure.attestation.inputs.GetProviderPlainArgs.builder
      com.pulumi.azure.attestation.AttestationFunctions.getProviderPlain(args(argsBuilder).build)
