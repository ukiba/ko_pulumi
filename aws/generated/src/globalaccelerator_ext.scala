package jp.ukiba.ko_pulumi
package aws

object globalaccelerator_ext:
  extension (builder: com.pulumi.aws.globalaccelerator.AcceleratorArgs.Builder)
    /**
     * @param attributes Configuration block with accelerator attributes. See `attributes` below.
     * @return builder
     */
    inline def attributes(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.AcceleratorAttributesArgs.Builder]):
        com.pulumi.aws.globalaccelerator.AcceleratorArgs.Builder =
      val argsBuilder = com.pulumi.aws.globalaccelerator.inputs.AcceleratorAttributesArgs.builder
      builder.attributes(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.globalaccelerator.CrossAccountAttachmentArgs.Builder)
    /**
     * @param resources List of resources to be associated with the accelerator. See `resource` below.
     * @return builder
     */
    inline def resources(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CrossAccountAttachmentResourceArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.CrossAccountAttachmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CrossAccountAttachmentResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.globalaccelerator.CustomRoutingAcceleratorArgs.Builder)
    /**
     * @param attributes Configuration block with accelerator attributes. See `attributes` below.
     * @return builder
     */
    inline def attributes(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CustomRoutingAcceleratorAttributesArgs.Builder]):
        com.pulumi.aws.globalaccelerator.CustomRoutingAcceleratorArgs.Builder =
      val argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CustomRoutingAcceleratorAttributesArgs.builder
      builder.attributes(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.globalaccelerator.CustomRoutingEndpointGroupArgs.Builder)
    /**
     * @param destinationConfigurations Port ranges and protocols for all endpoints in a custom routing endpoint group to accept client traffic on. See `destinationConfiguration` below.
     * @return builder
     */
    inline def destinationConfigurations(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupDestinationConfigurationArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.CustomRoutingEndpointGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupDestinationConfigurationArgs.builder
      builder.destinationConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param endpointConfigurations Endpoint objects. See `endpointConfiguration` below.
     * @return builder
     */
    inline def endpointConfigurations(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupEndpointConfigurationArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.CustomRoutingEndpointGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupEndpointConfigurationArgs.builder
      builder.endpointConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.globalaccelerator.CustomRoutingListenerArgs.Builder)
    /**
     * @param portRanges Port ranges for the connections from clients to the accelerator. See `portRange` below.
     * @return builder
     */
    inline def portRanges(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CustomRoutingListenerPortRangeArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.CustomRoutingListenerArgs.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CustomRoutingListenerPortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.globalaccelerator.EndpointGroupArgs.Builder)
    /**
     * @param endpointConfigurations Endpoint objects. See `endpointConfiguration` below.
     * @return builder
     */
    inline def endpointConfigurations(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.EndpointGroupEndpointConfigurationArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.EndpointGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.EndpointGroupEndpointConfigurationArgs.builder
      builder.endpointConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param portOverrides Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. See `portOverride` below.
     * @return builder
     */
    inline def portOverrides(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.EndpointGroupPortOverrideArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.EndpointGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.EndpointGroupPortOverrideArgs.builder
      builder.portOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.globalaccelerator.ListenerArgs.Builder)
    /**
     * @param portRanges Port ranges for the connections from clients to the accelerator. See `portRange` below.
     * @return builder
     */
    inline def portRanges(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.ListenerPortRangeArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.ListenerArgs.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.ListenerPortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.globalaccelerator.inputs.AcceleratorState.Builder)
    /**
     * @param attributes Configuration block with accelerator attributes. See `attributes` below.
     * @return builder
     */
    inline def attributes(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.AcceleratorAttributesArgs.Builder]):
        com.pulumi.aws.globalaccelerator.inputs.AcceleratorState.Builder =
      val argsBuilder = com.pulumi.aws.globalaccelerator.inputs.AcceleratorAttributesArgs.builder
      builder.attributes(args(argsBuilder).build)

    /**
     * @param ipSets IP address set associated with the accelerator. See `ipSets` below.
     * @return builder
     */
    inline def ipSets(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.AcceleratorIpSetArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.inputs.AcceleratorState.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.AcceleratorIpSetArgs.builder
      builder.ipSets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.globalaccelerator.inputs.CrossAccountAttachmentState.Builder)
    /**
     * @param resources List of resources to be associated with the accelerator. See `resource` below.
     * @return builder
     */
    inline def resources(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CrossAccountAttachmentResourceArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.inputs.CrossAccountAttachmentState.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CrossAccountAttachmentResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.globalaccelerator.inputs.CustomRoutingAcceleratorState.Builder)
    /**
     * @param attributes Configuration block with accelerator attributes. See `attributes` below.
     * @return builder
     */
    inline def attributes(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CustomRoutingAcceleratorAttributesArgs.Builder]):
        com.pulumi.aws.globalaccelerator.inputs.CustomRoutingAcceleratorState.Builder =
      val argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CustomRoutingAcceleratorAttributesArgs.builder
      builder.attributes(args(argsBuilder).build)

    /**
     * @param ipSets IP address set associated with the accelerator. See `ipSets` below.
     * @return builder
     */
    inline def ipSets(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CustomRoutingAcceleratorIpSetArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.inputs.CustomRoutingAcceleratorState.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CustomRoutingAcceleratorIpSetArgs.builder
      builder.ipSets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupState.Builder)
    /**
     * @param destinationConfigurations Port ranges and protocols for all endpoints in a custom routing endpoint group to accept client traffic on. See `destinationConfiguration` below.
     * @return builder
     */
    inline def destinationConfigurations(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupDestinationConfigurationArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupState.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupDestinationConfigurationArgs.builder
      builder.destinationConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param endpointConfigurations Endpoint objects. See `endpointConfiguration` below.
     * @return builder
     */
    inline def endpointConfigurations(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupEndpointConfigurationArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupState.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupEndpointConfigurationArgs.builder
      builder.endpointConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.globalaccelerator.inputs.CustomRoutingListenerState.Builder)
    /**
     * @param portRanges Port ranges for the connections from clients to the accelerator. See `portRange` below.
     * @return builder
     */
    inline def portRanges(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.CustomRoutingListenerPortRangeArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.inputs.CustomRoutingListenerState.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.CustomRoutingListenerPortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.globalaccelerator.inputs.EndpointGroupState.Builder)
    /**
     * @param endpointConfigurations Endpoint objects. See `endpointConfiguration` below.
     * @return builder
     */
    inline def endpointConfigurations(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.EndpointGroupEndpointConfigurationArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.inputs.EndpointGroupState.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.EndpointGroupEndpointConfigurationArgs.builder
      builder.endpointConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param portOverrides Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. See `portOverride` below.
     * @return builder
     */
    inline def portOverrides(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.EndpointGroupPortOverrideArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.inputs.EndpointGroupState.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.EndpointGroupPortOverrideArgs.builder
      builder.portOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.globalaccelerator.inputs.ListenerState.Builder)
    /**
     * @param portRanges Port ranges for the connections from clients to the accelerator. See `portRange` below.
     * @return builder
     */
    inline def portRanges(args: Endofunction[com.pulumi.aws.globalaccelerator.inputs.ListenerPortRangeArgs.Builder]*):
        com.pulumi.aws.globalaccelerator.inputs.ListenerState.Builder =
      def argsBuilder = com.pulumi.aws.globalaccelerator.inputs.ListenerPortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)
