package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object recoveryservices:
  /** Manages an association of a Resource Guard and Recovery Services Vault. */
  def VaultResourceGuardAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.recoveryservices.VaultResourceGuardAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.recoveryservices.VaultResourceGuardAssociationArgs.builder
    com.pulumi.azure.recoveryservices.VaultResourceGuardAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object RecoveryservicesFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Recovery Services Vault. */
    inline def getVault(args: Endofunction[com.pulumi.azure.recoveryservices.inputs.GetVaultArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.recoveryservices.outputs.GetVaultResult] =
      val argsBuilder = com.pulumi.azure.recoveryservices.inputs.GetVaultArgs.builder
      com.pulumi.azure.recoveryservices.RecoveryservicesFunctions.getVault(args(argsBuilder).build)

    /** Use this data source to access information about an existing Recovery Services Vault. */
    inline def getVaultPlain(args: Endofunction[com.pulumi.azure.recoveryservices.inputs.GetVaultPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.recoveryservices.outputs.GetVaultResult] =
      val argsBuilder = com.pulumi.azure.recoveryservices.inputs.GetVaultPlainArgs.builder
      com.pulumi.azure.recoveryservices.RecoveryservicesFunctions.getVaultPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.recoveryservices.VaultArgs.Builder)
    /**
     * @param encryption An `encryption` block as defined below. Required with `identity`.
     * 
     *  !&gt; **Note:** Once Encryption with your own key has been Enabled it&#39;s not possible to Disable it.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.azure.recoveryservices.inputs.VaultEncryptionArgs.Builder]):
        com.pulumi.azure.recoveryservices.VaultArgs.Builder =
      val argsBuilder = com.pulumi.azure.recoveryservices.inputs.VaultEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.recoveryservices.inputs.VaultIdentityArgs.Builder]):
        com.pulumi.azure.recoveryservices.VaultArgs.Builder =
      val argsBuilder = com.pulumi.azure.recoveryservices.inputs.VaultIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param monitoring A `monitoring` block as defined below.
     * @return builder
     */
    def monitoring(args: Endofunction[com.pulumi.azure.recoveryservices.inputs.VaultMonitoringArgs.Builder]):
        com.pulumi.azure.recoveryservices.VaultArgs.Builder =
      val argsBuilder = com.pulumi.azure.recoveryservices.inputs.VaultMonitoringArgs.builder
      builder.monitoring(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.recoveryservices.VaultArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Recovery Services Vault. */
  def Vault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.recoveryservices.VaultArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.recoveryservices.VaultArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.recoveryservices.Vault(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.recoveryservices.inputs.VaultState.Builder)
    /**
     * @param encryption An `encryption` block as defined below. Required with `identity`.
     * 
     *  !&gt; **Note:** Once Encryption with your own key has been Enabled it&#39;s not possible to Disable it.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.azure.recoveryservices.inputs.VaultEncryptionArgs.Builder]):
        com.pulumi.azure.recoveryservices.inputs.VaultState.Builder =
      val argsBuilder = com.pulumi.azure.recoveryservices.inputs.VaultEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.recoveryservices.inputs.VaultIdentityArgs.Builder]):
        com.pulumi.azure.recoveryservices.inputs.VaultState.Builder =
      val argsBuilder = com.pulumi.azure.recoveryservices.inputs.VaultIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param monitoring A `monitoring` block as defined below.
     * @return builder
     */
    def monitoring(args: Endofunction[com.pulumi.azure.recoveryservices.inputs.VaultMonitoringArgs.Builder]):
        com.pulumi.azure.recoveryservices.inputs.VaultState.Builder =
      val argsBuilder = com.pulumi.azure.recoveryservices.inputs.VaultMonitoringArgs.builder
      builder.monitoring(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.recoveryservices.inputs.VaultState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
