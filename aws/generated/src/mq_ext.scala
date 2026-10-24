package jp.ukiba.ko_pulumi
package aws

object mq_ext:
  extension (builder: com.pulumi.aws.mq.BrokerArgs.Builder)
    /**
     * @param configuration Configuration block for broker configuration. Applies to `engineType` of `ActiveMQ` and `RabbitMQ` only. Detailed below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.mq.inputs.BrokerConfigurationArgs.Builder]):
        com.pulumi.aws.mq.BrokerArgs.Builder =
      val argsBuilder = com.pulumi.aws.mq.inputs.BrokerConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param encryptionOptions Configuration block containing encryption options. Detailed below.
     * @return builder
     */
    def encryptionOptions(args: Endofunction[com.pulumi.aws.mq.inputs.BrokerEncryptionOptionsArgs.Builder]):
        com.pulumi.aws.mq.BrokerArgs.Builder =
      val argsBuilder = com.pulumi.aws.mq.inputs.BrokerEncryptionOptionsArgs.builder
      builder.encryptionOptions(args(argsBuilder).build)

    /**
     * @param ldapServerMetadata Configuration block for the LDAP server used to authenticate and authorize connections. Not supported for `engineType` `RabbitMQ`. Detailed below.
     * @return builder
     */
    def ldapServerMetadata(args: Endofunction[com.pulumi.aws.mq.inputs.BrokerLdapServerMetadataArgs.Builder]):
        com.pulumi.aws.mq.BrokerArgs.Builder =
      val argsBuilder = com.pulumi.aws.mq.inputs.BrokerLdapServerMetadataArgs.builder
      builder.ldapServerMetadata(args(argsBuilder).build)

    /**
     * @param logs Configuration block for the logging configuration. Detailed below.
     * @return builder
     */
    def logs(args: Endofunction[com.pulumi.aws.mq.inputs.BrokerLogsArgs.Builder]):
        com.pulumi.aws.mq.BrokerArgs.Builder =
      val argsBuilder = com.pulumi.aws.mq.inputs.BrokerLogsArgs.builder
      builder.logs(args(argsBuilder).build)

    /**
     * @param maintenanceWindowStartTime Configuration block for the maintenance window start time. Detailed below.
     * @return builder
     */
    def maintenanceWindowStartTime(args: Endofunction[com.pulumi.aws.mq.inputs.BrokerMaintenanceWindowStartTimeArgs.Builder]):
        com.pulumi.aws.mq.BrokerArgs.Builder =
      val argsBuilder = com.pulumi.aws.mq.inputs.BrokerMaintenanceWindowStartTimeArgs.builder
      builder.maintenanceWindowStartTime(args(argsBuilder).build)

    /**
     * @param users Configuration block for broker users. For `engineType` of `RabbitMQ`, Amazon MQ does not return broker users preventing this resource from making user updates and drift detection. Detailed below.
     * @return builder
     */
    def users(args: Endofunction[com.pulumi.aws.mq.inputs.BrokerUserArgs.Builder]*):
        com.pulumi.aws.mq.BrokerArgs.Builder =
      def argsBuilder = com.pulumi.aws.mq.inputs.BrokerUserArgs.builder
      builder.users(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.mq.inputs.BrokerState.Builder)
    /**
     * @param configuration Configuration block for broker configuration. Applies to `engineType` of `ActiveMQ` and `RabbitMQ` only. Detailed below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.mq.inputs.BrokerConfigurationArgs.Builder]):
        com.pulumi.aws.mq.inputs.BrokerState.Builder =
      val argsBuilder = com.pulumi.aws.mq.inputs.BrokerConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param encryptionOptions Configuration block containing encryption options. Detailed below.
     * @return builder
     */
    def encryptionOptions(args: Endofunction[com.pulumi.aws.mq.inputs.BrokerEncryptionOptionsArgs.Builder]):
        com.pulumi.aws.mq.inputs.BrokerState.Builder =
      val argsBuilder = com.pulumi.aws.mq.inputs.BrokerEncryptionOptionsArgs.builder
      builder.encryptionOptions(args(argsBuilder).build)

    /**
     * @param instances List of information about allocated brokers (both active &amp; standby). See `instances` Block for details.
     * @return builder
     */
    def instances(args: Endofunction[com.pulumi.aws.mq.inputs.BrokerInstanceArgs.Builder]*):
        com.pulumi.aws.mq.inputs.BrokerState.Builder =
      def argsBuilder = com.pulumi.aws.mq.inputs.BrokerInstanceArgs.builder
      builder.instances(args.map(_(argsBuilder).build)*)

    /**
     * @param ldapServerMetadata Configuration block for the LDAP server used to authenticate and authorize connections. Not supported for `engineType` `RabbitMQ`. Detailed below.
     * @return builder
     */
    def ldapServerMetadata(args: Endofunction[com.pulumi.aws.mq.inputs.BrokerLdapServerMetadataArgs.Builder]):
        com.pulumi.aws.mq.inputs.BrokerState.Builder =
      val argsBuilder = com.pulumi.aws.mq.inputs.BrokerLdapServerMetadataArgs.builder
      builder.ldapServerMetadata(args(argsBuilder).build)

    /**
     * @param logs Configuration block for the logging configuration. Detailed below.
     * @return builder
     */
    def logs(args: Endofunction[com.pulumi.aws.mq.inputs.BrokerLogsArgs.Builder]):
        com.pulumi.aws.mq.inputs.BrokerState.Builder =
      val argsBuilder = com.pulumi.aws.mq.inputs.BrokerLogsArgs.builder
      builder.logs(args(argsBuilder).build)

    /**
     * @param maintenanceWindowStartTime Configuration block for the maintenance window start time. Detailed below.
     * @return builder
     */
    def maintenanceWindowStartTime(args: Endofunction[com.pulumi.aws.mq.inputs.BrokerMaintenanceWindowStartTimeArgs.Builder]):
        com.pulumi.aws.mq.inputs.BrokerState.Builder =
      val argsBuilder = com.pulumi.aws.mq.inputs.BrokerMaintenanceWindowStartTimeArgs.builder
      builder.maintenanceWindowStartTime(args(argsBuilder).build)

    /**
     * @param sharedResources List of resources shared with the broker via `resourceShareArns`. Only populated for `engineType` of `RabbitMQ`. See `sharedResources` Block for details.
     * @return builder
     */
    def sharedResources(args: Endofunction[com.pulumi.aws.mq.inputs.BrokerSharedResourceArgs.Builder]*):
        com.pulumi.aws.mq.inputs.BrokerState.Builder =
      def argsBuilder = com.pulumi.aws.mq.inputs.BrokerSharedResourceArgs.builder
      builder.sharedResources(args.map(_(argsBuilder).build)*)

    /**
     * @param users Configuration block for broker users. For `engineType` of `RabbitMQ`, Amazon MQ does not return broker users preventing this resource from making user updates and drift detection. Detailed below.
     * @return builder
     */
    def users(args: Endofunction[com.pulumi.aws.mq.inputs.BrokerUserArgs.Builder]*):
        com.pulumi.aws.mq.inputs.BrokerState.Builder =
      def argsBuilder = com.pulumi.aws.mq.inputs.BrokerUserArgs.builder
      builder.users(args.map(_(argsBuilder).build)*)
