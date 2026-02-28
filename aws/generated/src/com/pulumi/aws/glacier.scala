package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object glacier:
  extension (builder: com.pulumi.aws.glacier.VaultArgs.Builder)
    /**
     * @param notification The notifications for the Vault. Fields documented below.
     * @return builder
     */
    def notification(args: Endofunction[com.pulumi.aws.glacier.inputs.VaultNotificationArgs.Builder]):
        com.pulumi.aws.glacier.VaultArgs.Builder =
      val argsBuilder = com.pulumi.aws.glacier.inputs.VaultNotificationArgs.builder
      builder.notification(args(argsBuilder).build)

  /**
   * 
   */
  def VaultLock(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glacier.VaultLockArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.glacier.VaultLockArgs.builder
    
    com.pulumi.aws.glacier.VaultLock(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Glacier Vault Resource. You can refer to the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-vaults.html) for a full explanation of the Glacier Vault functionality
   *  
   *  &gt; **NOTE:** When removing a Glacier Vault, the Vault must be empty.
   */
  def Vault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glacier.VaultArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glacier.VaultArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.glacier.Vault(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.glacier.inputs.VaultState.Builder)
    /**
     * @param notification The notifications for the Vault. Fields documented below.
     * @return builder
     */
    def notification(args: Endofunction[com.pulumi.aws.glacier.inputs.VaultNotificationArgs.Builder]):
        com.pulumi.aws.glacier.inputs.VaultState.Builder =
      val argsBuilder = com.pulumi.aws.glacier.inputs.VaultNotificationArgs.builder
      builder.notification(args(argsBuilder).build)
