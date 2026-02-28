package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object mq:
  /**
   * 
   */
  def Broker(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.mq.BrokerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.mq.BrokerArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.mq.Broker(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def users(args: Endofunction[com.pulumi.aws.mq.inputs.BrokerUserArgs.Builder]*):
        com.pulumi.aws.mq.BrokerArgs.Builder =
      def argsBuilder = com.pulumi.aws.mq.inputs.BrokerUserArgs.builder
      builder.users(args.map(_(argsBuilder).build)*)

  /** Manages an Amazon MQ configuration. Use this resource to create and manage broker configurations for ActiveMQ and RabbitMQ brokers. */
  def Configuration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.mq.ConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.mq.ConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.mq.Configuration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type MqFunctions = com.pulumi.aws.mq.MqFunctions
  object MqFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.mq.MqFunctions.*
  extension (self: MqFunctions.type)
    /** Provides details about an existing Amazon MQ broker. Use this data source to retrieve configuration and metadata for an Amazon MQ broker by ID or name. */
    def getBroker(args: Endofunction[com.pulumi.aws.mq.inputs.GetBrokerArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.mq.outputs.GetBrokerResult] =
      val argsBuilder = com.pulumi.aws.mq.inputs.GetBrokerArgs.builder
      com.pulumi.aws.mq.MqFunctions.getBroker(args(argsBuilder).build)

    /** Provides details about an existing Amazon MQ broker. Use this data source to retrieve configuration and metadata for an Amazon MQ broker by ID or name. */
    def getBrokerPlain(args: Endofunction[com.pulumi.aws.mq.inputs.GetBrokerPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.mq.outputs.GetBrokerResult] =
      val argsBuilder = com.pulumi.aws.mq.inputs.GetBrokerPlainArgs.builder
      com.pulumi.aws.mq.MqFunctions.getBrokerPlain(args(argsBuilder).build)

    /** Provides details about available MQ broker engine types. Use this data source to retrieve supported engine types and their versions for Amazon MQ brokers. */
    def getBrokerEngineTypes(args: Endofunction[com.pulumi.aws.mq.inputs.GetBrokerEngineTypesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.mq.outputs.GetBrokerEngineTypesResult] =
      val argsBuilder = com.pulumi.aws.mq.inputs.GetBrokerEngineTypesArgs.builder
      com.pulumi.aws.mq.MqFunctions.getBrokerEngineTypes(args(argsBuilder).build)

    /** Provides details about available MQ broker engine types. Use this data source to retrieve supported engine types and their versions for Amazon MQ brokers. */
    def getBrokerEngineTypesPlain(args: Endofunction[com.pulumi.aws.mq.inputs.GetBrokerEngineTypesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.mq.outputs.GetBrokerEngineTypesResult] =
      val argsBuilder = com.pulumi.aws.mq.inputs.GetBrokerEngineTypesPlainArgs.builder
      com.pulumi.aws.mq.MqFunctions.getBrokerEngineTypesPlain(args(argsBuilder).build)

    /** Provides details about available MQ broker instance type offerings. Use this data source to discover supported instance types, storage types, and deployment modes for Amazon MQ brokers. */
    def getInstanceTypeOfferings(args: Endofunction[com.pulumi.aws.mq.inputs.GetInstanceTypeOfferingsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.mq.outputs.GetInstanceTypeOfferingsResult] =
      val argsBuilder = com.pulumi.aws.mq.inputs.GetInstanceTypeOfferingsArgs.builder
      com.pulumi.aws.mq.MqFunctions.getInstanceTypeOfferings(args(argsBuilder).build)

    /** Provides details about available MQ broker instance type offerings. Use this data source to discover supported instance types, storage types, and deployment modes for Amazon MQ brokers. */
    def getInstanceTypeOfferingsPlain(args: Endofunction[com.pulumi.aws.mq.inputs.GetInstanceTypeOfferingsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.mq.outputs.GetInstanceTypeOfferingsResult] =
      val argsBuilder = com.pulumi.aws.mq.inputs.GetInstanceTypeOfferingsPlainArgs.builder
      com.pulumi.aws.mq.MqFunctions.getInstanceTypeOfferingsPlain(args(argsBuilder).build)

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
     * @param instances List of information about allocated brokers (both active &amp; standby).
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
     * @param users Configuration block for broker users. For `engineType` of `RabbitMQ`, Amazon MQ does not return broker users preventing this resource from making user updates and drift detection. Detailed below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def users(args: Endofunction[com.pulumi.aws.mq.inputs.BrokerUserArgs.Builder]*):
        com.pulumi.aws.mq.inputs.BrokerState.Builder =
      def argsBuilder = com.pulumi.aws.mq.inputs.BrokerUserArgs.builder
      builder.users(args.map(_(argsBuilder).build)*)
