package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object recoveryservices:
  object RecoveryservicesFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Recovery Services Vault. */
    inline def getVault(args: Endofunction[com.pulumi.azure.recoveryservices.inputs.GetVaultArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.recoveryservices.outputs.GetVaultResult] =
      val argsBuilder = com.pulumi.azure.recoveryservices.inputs.GetVaultArgs.builder
      com.pulumi.azure.recoveryservices.RecoveryservicesFunctions.getVault(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Recovery Services Vault. */
    inline def getVaultPlain(args: Endofunction[com.pulumi.azure.recoveryservices.inputs.GetVaultPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.recoveryservices.outputs.GetVaultResult] =
      val argsBuilder = com.pulumi.azure.recoveryservices.inputs.GetVaultPlainArgs.builder
      com.pulumi.azure.recoveryservices.RecoveryservicesFunctions.getVaultPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages a Recovery Services Vault. */
  def Vault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.recoveryservices.VaultArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.recoveryservices.VaultArgs.builder
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
    com.pulumi.azure.recoveryservices.Vault(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an association of a Resource Guard and Recovery Services Vault. */
  def VaultResourceGuardAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.recoveryservices.VaultResourceGuardAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.recoveryservices.VaultResourceGuardAssociationArgs.builder
    com.pulumi.azure.recoveryservices.VaultResourceGuardAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
