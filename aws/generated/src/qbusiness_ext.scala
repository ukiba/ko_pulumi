package jp.ukiba.ko_pulumi
package aws

object qbusiness_ext:
  extension (builder: com.pulumi.aws.qbusiness.ApplicationArgs.Builder)
    /**
     * @param attachmentsConfiguration Information about whether file upload functionality is activated or deactivated for your end user. See `attachmentsConfiguration` below.
     * @return builder
     */
    def attachmentsConfiguration(args: Endofunction[com.pulumi.aws.qbusiness.inputs.ApplicationAttachmentsConfigurationArgs.Builder]):
        com.pulumi.aws.qbusiness.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.qbusiness.inputs.ApplicationAttachmentsConfigurationArgs.builder
      builder.attachmentsConfiguration(args(argsBuilder).build)

    /**
     * @param encryptionConfiguration Information about encryption configuration. See `encryptionConfiguration` below.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.qbusiness.inputs.ApplicationEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.qbusiness.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.qbusiness.inputs.ApplicationEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.qbusiness.inputs.ApplicationTimeoutsArgs.Builder]):
        com.pulumi.aws.qbusiness.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.qbusiness.inputs.ApplicationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.qbusiness.inputs.ApplicationState.Builder)
    /**
     * @param attachmentsConfiguration Information about whether file upload functionality is activated or deactivated for your end user. See `attachmentsConfiguration` below.
     * @return builder
     */
    def attachmentsConfiguration(args: Endofunction[com.pulumi.aws.qbusiness.inputs.ApplicationAttachmentsConfigurationArgs.Builder]):
        com.pulumi.aws.qbusiness.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.qbusiness.inputs.ApplicationAttachmentsConfigurationArgs.builder
      builder.attachmentsConfiguration(args(argsBuilder).build)

    /**
     * @param encryptionConfiguration Information about encryption configuration. See `encryptionConfiguration` below.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.qbusiness.inputs.ApplicationEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.qbusiness.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.qbusiness.inputs.ApplicationEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.qbusiness.inputs.ApplicationTimeoutsArgs.Builder]):
        com.pulumi.aws.qbusiness.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.qbusiness.inputs.ApplicationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
