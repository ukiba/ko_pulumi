package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object attestation:
  object AttestationFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Attestation Provider. */
    inline def getProvider(args: Endofunction[com.pulumi.azure.attestation.inputs.GetProviderArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.attestation.outputs.GetProviderResult] =
      val argsBuilder = com.pulumi.azure.attestation.inputs.GetProviderArgs.builder
      com.pulumi.azure.attestation.AttestationFunctions.getProvider(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Attestation Provider. */
    inline def getProviderPlain(args: Endofunction[com.pulumi.azure.attestation.inputs.GetProviderPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.attestation.outputs.GetProviderResult] =
      val argsBuilder = com.pulumi.azure.attestation.inputs.GetProviderPlainArgs.builder
      com.pulumi.azure.attestation.AttestationFunctions.getProviderPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages an Attestation Provider. */
  def Provider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.attestation.ProviderArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.attestation.ProviderArgs.builder
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
    com.pulumi.azure.attestation.Provider(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
