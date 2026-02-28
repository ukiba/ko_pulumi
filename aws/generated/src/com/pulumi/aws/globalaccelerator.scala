package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object globalaccelerator:
  /** Provides a Global Accelerator custom routing endpoint group. */
  def CustomRoutingEndpointGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.globalaccelerator.CustomRoutingEndpointGroupArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.globalaccelerator.CustomRoutingEndpointGroupArgs.builder
    
    com.pulumi.aws.globalaccelerator.CustomRoutingEndpointGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type GlobalacceleratorFunctions = com.pulumi.aws.globalaccelerator.GlobalacceleratorFunctions
  object GlobalacceleratorFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.globalaccelerator.GlobalacceleratorFunctions.*
  extension (self: GlobalacceleratorFunctions.type)
    /** Provides information about a Global Accelerator accelerator. */
    def getAccelerator(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.GetAcceleratorArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.globalaccelerator.outputs.GetAcceleratorResult] =
      val argsBuilder = com.pulumi.aws.globalaccelerator.inputs.GetAcceleratorArgs.builder
      com.pulumi.aws.globalaccelerator.GlobalacceleratorFunctions.getAccelerator(args(argsBuilder).build)

    /** Provides information about a Global Accelerator accelerator. */
    def getAcceleratorPlain(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.GetAcceleratorPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.globalaccelerator.outputs.GetAcceleratorResult] =
      val argsBuilder = com.pulumi.aws.globalaccelerator.inputs.GetAcceleratorPlainArgs.builder
      com.pulumi.aws.globalaccelerator.GlobalacceleratorFunctions.getAcceleratorPlain(args(argsBuilder).build)

    /** Provides information about a Global Accelerator custom routing accelerator. */
    def getCustomRoutingAccelerator(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.GetCustomRoutingAcceleratorArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.globalaccelerator.outputs.GetCustomRoutingAcceleratorResult] =
      val argsBuilder = com.pulumi.aws.globalaccelerator.inputs.GetCustomRoutingAcceleratorArgs.builder
      com.pulumi.aws.globalaccelerator.GlobalacceleratorFunctions.getCustomRoutingAccelerator(args(argsBuilder).build)

    /** Provides information about a Global Accelerator custom routing accelerator. */
    def getCustomRoutingAcceleratorPlain(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.GetCustomRoutingAcceleratorPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.globalaccelerator.outputs.GetCustomRoutingAcceleratorResult] =
      val argsBuilder = com.pulumi.aws.globalaccelerator.inputs.GetCustomRoutingAcceleratorPlainArgs.builder
      com.pulumi.aws.globalaccelerator.GlobalacceleratorFunctions.getCustomRoutingAcceleratorPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.globalaccelerator.EndpointGroupArgs.Builder)
    /**
     * @param endpointConfigurations The list of endpoint objects. Fields documented below.
     * @return builder
     */
    def endpointConfigurations(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.EndpointGroupEndpointConfigurationArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.EndpointGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.EndpointGroupEndpointConfigurationArgs.builder
      builder.endpointConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param portOverrides Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. Fields documented below.
     * @return builder
     */
    def portOverrides(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.EndpointGroupPortOverrideArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.EndpointGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.EndpointGroupPortOverrideArgs.builder
      builder.portOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.globalaccelerator.AcceleratorArgs.Builder)
    /**
     * @param attributes The attributes of the accelerator. Fields documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.AcceleratorAttributesArgs.Builder]):
        com.pulumi.aws.globalaccelerator.AcceleratorArgs.Builder =
      val argsBuilder = com.pulumi.aws.globalaccelerator.inputs.AcceleratorAttributesArgs.builder
      builder.attributes(args(argsBuilder).build)

  /** Provides a Global Accelerator custom routing listener. */
  def CustomRoutingListener(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.globalaccelerator.CustomRoutingListenerArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.globalaccelerator.CustomRoutingListenerArgs.builder
    
    com.pulumi.aws.globalaccelerator.CustomRoutingListener(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Global Accelerator Cross Account Attachment. */
  def CrossAccountAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.globalaccelerator.CrossAccountAttachmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.globalaccelerator.CrossAccountAttachmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.globalaccelerator.CrossAccountAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.globalaccelerator.CrossAccountAttachmentArgs.Builder)
    /**
     * @param resources List of resources to be associated with the accelerator.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CrossAccountAttachmentResourceArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.CrossAccountAttachmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CrossAccountAttachmentResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.globalaccelerator.CustomRoutingEndpointGroupArgs.Builder)
    /**
     * @param destinationConfigurations The port ranges and protocols for all endpoints in a custom routing endpoint group to accept client traffic on. Fields documented below.
     * @return builder
     */
    def destinationConfigurations(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupDestinationConfigurationArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.CustomRoutingEndpointGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupDestinationConfigurationArgs.builder
      builder.destinationConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param endpointConfigurations The list of endpoint objects. Fields documented below.
     * @return builder
     */
    def endpointConfigurations(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupEndpointConfigurationArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.CustomRoutingEndpointGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupEndpointConfigurationArgs.builder
      builder.endpointConfigurations(args.map(_(argsBuilder).build)*)

  /** Creates a Global Accelerator custom routing accelerator. */
  def CustomRoutingAccelerator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.globalaccelerator.CustomRoutingAcceleratorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.globalaccelerator.CustomRoutingAcceleratorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.globalaccelerator.CustomRoutingAccelerator(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates a Global Accelerator accelerator. */
  def Accelerator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.globalaccelerator.AcceleratorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.globalaccelerator.AcceleratorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.globalaccelerator.Accelerator(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Global Accelerator endpoint group. */
  def EndpointGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.globalaccelerator.EndpointGroupArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.globalaccelerator.EndpointGroupArgs.builder
    
    com.pulumi.aws.globalaccelerator.EndpointGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.globalaccelerator.CustomRoutingListenerArgs.Builder)
    /**
     * @param portRanges The list of port ranges for the connections from clients to the accelerator. Fields documented below.
     * @return builder
     */
    def portRanges(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CustomRoutingListenerPortRangeArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.CustomRoutingListenerArgs.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CustomRoutingListenerPortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  /** Provides a Global Accelerator listener. */
  def Listener(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.globalaccelerator.ListenerArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.globalaccelerator.ListenerArgs.builder
    
    com.pulumi.aws.globalaccelerator.Listener(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.globalaccelerator.ListenerArgs.Builder)
    /**
     * @param portRanges The list of port ranges for the connections from clients to the accelerator. Fields documented below.
     * @return builder
     */
    def portRanges(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.ListenerPortRangeArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.ListenerArgs.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.ListenerPortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.globalaccelerator.CustomRoutingAcceleratorArgs.Builder)
    /**
     * @param attributes The attributes of the accelerator. Fields documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CustomRoutingAcceleratorAttributesArgs.Builder]):
        com.pulumi.aws.globalaccelerator.CustomRoutingAcceleratorArgs.Builder =
      val argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CustomRoutingAcceleratorAttributesArgs.builder
      builder.attributes(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.globalaccelerator.inputs.ListenerState.Builder)
    /**
     * @param portRanges The list of port ranges for the connections from clients to the accelerator. Fields documented below.
     * @return builder
     */
    def portRanges(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.ListenerPortRangeArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.inputs.ListenerState.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.ListenerPortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.globalaccelerator.inputs.CrossAccountAttachmentState.Builder)
    /**
     * @param resources List of resources to be associated with the accelerator.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CrossAccountAttachmentResourceArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.inputs.CrossAccountAttachmentState.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CrossAccountAttachmentResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.globalaccelerator.inputs.CustomRoutingAcceleratorState.Builder)
    /**
     * @param attributes The attributes of the accelerator. Fields documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CustomRoutingAcceleratorAttributesArgs.Builder]):
        com.pulumi.aws.globalaccelerator.inputs.CustomRoutingAcceleratorState.Builder =
      val argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CustomRoutingAcceleratorAttributesArgs.builder
      builder.attributes(args(argsBuilder).build)

    /**
     * @param ipSets IP address set associated with the accelerator.
     * @return builder
     */
    def ipSets(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CustomRoutingAcceleratorIpSetArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.inputs.CustomRoutingAcceleratorState.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CustomRoutingAcceleratorIpSetArgs.builder
      builder.ipSets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.globalaccelerator.inputs.AcceleratorState.Builder)
    /**
     * @param attributes The attributes of the accelerator. Fields documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.AcceleratorAttributesArgs.Builder]):
        com.pulumi.aws.globalaccelerator.inputs.AcceleratorState.Builder =
      val argsBuilder = com.pulumi.aws.globalaccelerator.inputs.AcceleratorAttributesArgs.builder
      builder.attributes(args(argsBuilder).build)

    /**
     * @param ipSets IP address set associated with the accelerator.
     * @return builder
     */
    def ipSets(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.AcceleratorIpSetArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.inputs.AcceleratorState.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.AcceleratorIpSetArgs.builder
      builder.ipSets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.globalaccelerator.inputs.CustomRoutingListenerState.Builder)
    /**
     * @param portRanges The list of port ranges for the connections from clients to the accelerator. Fields documented below.
     * @return builder
     */
    def portRanges(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CustomRoutingListenerPortRangeArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.inputs.CustomRoutingListenerState.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CustomRoutingListenerPortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.globalaccelerator.inputs.EndpointGroupState.Builder)
    /**
     * @param endpointConfigurations The list of endpoint objects. Fields documented below.
     * @return builder
     */
    def endpointConfigurations(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.EndpointGroupEndpointConfigurationArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.inputs.EndpointGroupState.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.EndpointGroupEndpointConfigurationArgs.builder
      builder.endpointConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param portOverrides Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. Fields documented below.
     * @return builder
     */
    def portOverrides(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.EndpointGroupPortOverrideArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.inputs.EndpointGroupState.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.EndpointGroupPortOverrideArgs.builder
      builder.portOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupState.Builder)
    /**
     * @param destinationConfigurations The port ranges and protocols for all endpoints in a custom routing endpoint group to accept client traffic on. Fields documented below.
     * @return builder
     */
    def destinationConfigurations(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupDestinationConfigurationArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupState.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupDestinationConfigurationArgs.builder
      builder.destinationConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param endpointConfigurations The list of endpoint objects. Fields documented below.
     * @return builder
     */
    def endpointConfigurations(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupEndpointConfigurationArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupState.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupEndpointConfigurationArgs.builder
      builder.endpointConfigurations(args.map(_(argsBuilder).build)*)
