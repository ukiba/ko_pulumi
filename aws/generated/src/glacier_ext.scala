package jp.ukiba.ko_pulumi
package aws

object glacier_ext:
  extension (builder: com.pulumi.aws.glacier.VaultArgs.Builder)
    /**
     * @param notification Notifications for the Vault. See below.
     * @return builder
     */
    inline def notification(args: Endofunction[com.pulumi.aws.glacier.inputs.VaultNotificationArgs.Builder]):
        com.pulumi.aws.glacier.VaultArgs.Builder =
      val argsBuilder = com.pulumi.aws.glacier.inputs.VaultNotificationArgs.builder
      builder.notification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glacier.inputs.VaultState.Builder)
    /**
     * @param notification Notifications for the Vault. See below.
     * @return builder
     */
    inline def notification(args: Endofunction[com.pulumi.aws.glacier.inputs.VaultNotificationArgs.Builder]):
        com.pulumi.aws.glacier.inputs.VaultState.Builder =
      val argsBuilder = com.pulumi.aws.glacier.inputs.VaultNotificationArgs.builder
      builder.notification(args(argsBuilder).build)
