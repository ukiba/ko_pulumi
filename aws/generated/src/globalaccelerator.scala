package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object globalaccelerator:
  /** Creates a Global Accelerator accelerator. */
  def Accelerator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.globalaccelerator.AcceleratorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.globalaccelerator.AcceleratorArgs.builder
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
    com.pulumi.aws.globalaccelerator.Accelerator(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Global Accelerator Cross Account Attachment. */
  def CrossAccountAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.globalaccelerator.CrossAccountAttachmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.globalaccelerator.CrossAccountAttachmentArgs.builder
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
    com.pulumi.aws.globalaccelerator.CrossAccountAttachment(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Creates a Global Accelerator custom routing accelerator. */
  def CustomRoutingAccelerator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.globalaccelerator.CustomRoutingAcceleratorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.globalaccelerator.CustomRoutingAcceleratorArgs.builder
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
    com.pulumi.aws.globalaccelerator.CustomRoutingAccelerator(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Global Accelerator custom routing endpoint group. */
  def CustomRoutingEndpointGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.globalaccelerator.CustomRoutingEndpointGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.globalaccelerator.CustomRoutingEndpointGroupArgs.builder
    com.pulumi.aws.globalaccelerator.CustomRoutingEndpointGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Global Accelerator custom routing listener. */
  def CustomRoutingListener(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.globalaccelerator.CustomRoutingListenerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.globalaccelerator.CustomRoutingListenerArgs.builder
    com.pulumi.aws.globalaccelerator.CustomRoutingListener(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Global Accelerator endpoint group. */
  def EndpointGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.globalaccelerator.EndpointGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.globalaccelerator.EndpointGroupArgs.builder
    com.pulumi.aws.globalaccelerator.EndpointGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object GlobalacceleratorFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides information about a Global Accelerator accelerator. */
    inline def getAccelerator(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.GetAcceleratorArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.globalaccelerator.outputs.GetAcceleratorResult] =
      val argsBuilder = com.pulumi.aws.globalaccelerator.inputs.GetAcceleratorArgs.builder
      com.pulumi.aws.globalaccelerator.GlobalacceleratorFunctions.getAccelerator(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides information about a Global Accelerator accelerator. */
    inline def getAcceleratorPlain(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.GetAcceleratorPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.globalaccelerator.outputs.GetAcceleratorResult] =
      val argsBuilder = com.pulumi.aws.globalaccelerator.inputs.GetAcceleratorPlainArgs.builder
      com.pulumi.aws.globalaccelerator.GlobalacceleratorFunctions.getAcceleratorPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides information about a Global Accelerator custom routing accelerator. */
    inline def getCustomRoutingAccelerator(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.GetCustomRoutingAcceleratorArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.globalaccelerator.outputs.GetCustomRoutingAcceleratorResult] =
      val argsBuilder = com.pulumi.aws.globalaccelerator.inputs.GetCustomRoutingAcceleratorArgs.builder
      com.pulumi.aws.globalaccelerator.GlobalacceleratorFunctions.getCustomRoutingAccelerator(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides information about a Global Accelerator custom routing accelerator. */
    inline def getCustomRoutingAcceleratorPlain(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.GetCustomRoutingAcceleratorPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.globalaccelerator.outputs.GetCustomRoutingAcceleratorResult] =
      val argsBuilder = com.pulumi.aws.globalaccelerator.inputs.GetCustomRoutingAcceleratorPlainArgs.builder
      com.pulumi.aws.globalaccelerator.GlobalacceleratorFunctions.getCustomRoutingAcceleratorPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Provides a Global Accelerator listener. */
  def Listener(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.globalaccelerator.ListenerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.globalaccelerator.ListenerArgs.builder
    com.pulumi.aws.globalaccelerator.Listener(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
