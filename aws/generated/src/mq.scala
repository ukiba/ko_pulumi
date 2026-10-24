package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object mq:
  /**
   * Manages an AWS MQ broker. Use to create and manage message brokers for ActiveMQ and RabbitMQ engines.
   * 
   * &gt; For more information on Amazon MQ, see [Amazon MQ documentation](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/welcome.html).
   * 
   * &gt; **Note:** For RabbitMQ brokers, only one administrative user can be created during provisioning. Additional users must be created via the [RabbitMQ Management API](https://www.rabbitmq.com/management.html) or the Amazon MQ console after the broker is provisioned. Terraform cannot update or manage users after broker creation. Any changes to the `user` block will trigger full broker recreation. Amazon MQ does not return RabbitMQ user information via APIs, meaning drift of the `user` attribute can not be detected.
   * 
   * &gt; **Warning:** Amazon MQ currently places limits on **RabbitMQ** brokers. For example, a RabbitMQ broker cannot have: instances with an associated IP address of an ENI attached to the broker, an associated LDAP server to authenticate and authorize broker connections, storage type `EFS`, or audit logging. Although this resource allows you to create RabbitMQ users, RabbitMQ users cannot have console access or groups.
   * 
   * &gt; **Warning:** All arguments including the username and password will be stored in the raw state as plain-text. &gt; **Note:** Changes to an MQ Broker can occur when you change a parameter, such as `configuration` or `user`, and are reflected in the next maintenance window. Because of this, Terraform may report a difference in its planning phase because a modification has not yet taken place. You can use the `applyImmediately` flag to instruct the service to apply the change immediately (see documentation below). Using `applyImmediately` can result in a brief downtime as the broker reboots.
   */
  def Broker(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.mq.BrokerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.mq.BrokerArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.mq.Broker(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Amazon MQ configuration. Use this resource to create and manage broker configurations for ActiveMQ and RabbitMQ brokers. */
  def Configuration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.mq.ConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.mq.ConfigurationArgs.builder
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
    com.pulumi.aws.mq.Configuration(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object MqFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides details about an existing Amazon MQ broker. Use this data source to retrieve configuration and metadata for an Amazon MQ broker by ID or name. */
    inline def getBroker(args: Endofunction[com.pulumi.aws.mq.inputs.GetBrokerArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.mq.outputs.GetBrokerResult] =
      val argsBuilder = com.pulumi.aws.mq.inputs.GetBrokerArgs.builder
      com.pulumi.aws.mq.MqFunctions.getBroker(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about an existing Amazon MQ broker. Use this data source to retrieve configuration and metadata for an Amazon MQ broker by ID or name. */
    inline def getBrokerPlain(args: Endofunction[com.pulumi.aws.mq.inputs.GetBrokerPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.mq.outputs.GetBrokerResult] =
      val argsBuilder = com.pulumi.aws.mq.inputs.GetBrokerPlainArgs.builder
      com.pulumi.aws.mq.MqFunctions.getBrokerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about available MQ broker engine types. Use this data source to retrieve supported engine types and their versions for Amazon MQ brokers. */
    inline def getBrokerEngineTypes(args: Endofunction[com.pulumi.aws.mq.inputs.GetBrokerEngineTypesArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.mq.outputs.GetBrokerEngineTypesResult] =
      val argsBuilder = com.pulumi.aws.mq.inputs.GetBrokerEngineTypesArgs.builder
      com.pulumi.aws.mq.MqFunctions.getBrokerEngineTypes(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about available MQ broker engine types. Use this data source to retrieve supported engine types and their versions for Amazon MQ brokers. */
    inline def getBrokerEngineTypesPlain(args: Endofunction[com.pulumi.aws.mq.inputs.GetBrokerEngineTypesPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.mq.outputs.GetBrokerEngineTypesResult] =
      val argsBuilder = com.pulumi.aws.mq.inputs.GetBrokerEngineTypesPlainArgs.builder
      com.pulumi.aws.mq.MqFunctions.getBrokerEngineTypesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about available MQ broker instance type offerings. Use this data source to discover supported instance types, storage types, and deployment modes for Amazon MQ brokers. */
    inline def getInstanceTypeOfferings(args: Endofunction[com.pulumi.aws.mq.inputs.GetInstanceTypeOfferingsArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.mq.outputs.GetInstanceTypeOfferingsResult] =
      val argsBuilder = com.pulumi.aws.mq.inputs.GetInstanceTypeOfferingsArgs.builder
      com.pulumi.aws.mq.MqFunctions.getInstanceTypeOfferings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about available MQ broker instance type offerings. Use this data source to discover supported instance types, storage types, and deployment modes for Amazon MQ brokers. */
    inline def getInstanceTypeOfferingsPlain(args: Endofunction[com.pulumi.aws.mq.inputs.GetInstanceTypeOfferingsPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.mq.outputs.GetInstanceTypeOfferingsResult] =
      val argsBuilder = com.pulumi.aws.mq.inputs.GetInstanceTypeOfferingsPlainArgs.builder
      com.pulumi.aws.mq.MqFunctions.getInstanceTypeOfferingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
