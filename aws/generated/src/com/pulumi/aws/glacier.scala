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
   * Manages a Glacier Vault Lock. You can refer to the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock.html) for a full explanation of the Glacier Vault Lock functionality.
   *  
   *  &gt; **NOTE:** This resource allows you to test Glacier Vault Lock policies by setting the `completeLock` argument to `false`. When testing policies in this manner, the Glacier Vault Lock automatically expires after 24 hours and this provider will show this resource as needing recreation after that time. To permanently apply the policy, set the `completeLock` argument to `true`. When changing `completeLock` to `true`, it is expected the resource will show as recreating.
   *  
   *  &gt; **NOTE:** We suggest using `jsonencode()` or `aws.iam.getPolicyDocument` when assigning a value to `policy`. They seamlessly translate Terraform language into JSON, enabling you to maintain consistency within your configuration without the need for context switches. Also, you can sidestep potential complications arising from formatting discrepancies, whitespace inconsistencies, and other nuances inherent to JSON.
   *  
   *  !&gt; **WARNING:** Once a Glacier Vault Lock is completed, it is immutable. The deletion of the Glacier Vault Lock is not be possible and attempting to remove it from this provider will return an error. Set the `ignoreDeletionError` argument to `true` and apply this configuration before attempting to delete this resource via this provider or remove this resource from this provider&#39;s management.
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
