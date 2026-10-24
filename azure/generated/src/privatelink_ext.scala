package jp.ukiba.ko_pulumi
package azure

object privatelink_ext:
  extension (builder: com.pulumi.azure.privatelink.EndpointArgs.Builder)
    /**
     * @param ipConfigurations One or more `ipConfiguration` blocks as defined below. This allows a static IP address to be set for this Private Endpoint, otherwise an address is dynamically allocated from the Subnet.
     * @return builder
     */
    def ipConfigurations(args: Endofunction[com.pulumi.azure.privatelink.inputs.EndpointIpConfigurationArgs.Builder]*):
        com.pulumi.azure.privatelink.EndpointArgs.Builder =
      def argsBuilder = com.pulumi.azure.privatelink.inputs.EndpointIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param privateDnsZoneGroup A `privateDnsZoneGroup` block as defined below.
     * @return builder
     */
    def privateDnsZoneGroup(args: Endofunction[com.pulumi.azure.privatelink.inputs.EndpointPrivateDnsZoneGroupArgs.Builder]):
        com.pulumi.azure.privatelink.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.azure.privatelink.inputs.EndpointPrivateDnsZoneGroupArgs.builder
      builder.privateDnsZoneGroup(args(argsBuilder).build)

    /**
     * @param privateServiceConnection A `privateServiceConnection` block as defined below.
     * @return builder
     */
    def privateServiceConnection(args: Endofunction[com.pulumi.azure.privatelink.inputs.EndpointPrivateServiceConnectionArgs.Builder]):
        com.pulumi.azure.privatelink.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.azure.privatelink.inputs.EndpointPrivateServiceConnectionArgs.builder
      builder.privateServiceConnection(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.privatelink.inputs.EndpointPrivateDnsZoneConfigArgs.Builder)
    /**
     * @param recordSets A `recordSets` block as defined below.
     * @return builder
     */
    def recordSets(args: Endofunction[com.pulumi.azure.privatelink.inputs.EndpointPrivateDnsZoneConfigRecordSetArgs.Builder]*):
        com.pulumi.azure.privatelink.inputs.EndpointPrivateDnsZoneConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.privatelink.inputs.EndpointPrivateDnsZoneConfigRecordSetArgs.builder
      builder.recordSets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.privatelink.inputs.EndpointState.Builder)
    /**
     * @param customDnsConfigs A `customDnsConfigs` block as defined below.
     * @return builder
     */
    def customDnsConfigs(args: Endofunction[com.pulumi.azure.privatelink.inputs.EndpointCustomDnsConfigArgs.Builder]*):
        com.pulumi.azure.privatelink.inputs.EndpointState.Builder =
      def argsBuilder = com.pulumi.azure.privatelink.inputs.EndpointCustomDnsConfigArgs.builder
      builder.customDnsConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param ipConfigurations One or more `ipConfiguration` blocks as defined below. This allows a static IP address to be set for this Private Endpoint, otherwise an address is dynamically allocated from the Subnet.
     * @return builder
     */
    def ipConfigurations(args: Endofunction[com.pulumi.azure.privatelink.inputs.EndpointIpConfigurationArgs.Builder]*):
        com.pulumi.azure.privatelink.inputs.EndpointState.Builder =
      def argsBuilder = com.pulumi.azure.privatelink.inputs.EndpointIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param networkInterfaces A `networkInterface` block as defined below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.azure.privatelink.inputs.EndpointNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.privatelink.inputs.EndpointState.Builder =
      def argsBuilder = com.pulumi.azure.privatelink.inputs.EndpointNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param privateDnsZoneConfigs A `privateDnsZoneConfigs` block as defined below.
     * @return builder
     */
    def privateDnsZoneConfigs(args: Endofunction[com.pulumi.azure.privatelink.inputs.EndpointPrivateDnsZoneConfigArgs.Builder]*):
        com.pulumi.azure.privatelink.inputs.EndpointState.Builder =
      def argsBuilder = com.pulumi.azure.privatelink.inputs.EndpointPrivateDnsZoneConfigArgs.builder
      builder.privateDnsZoneConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param privateDnsZoneGroup A `privateDnsZoneGroup` block as defined below.
     * @return builder
     */
    def privateDnsZoneGroup(args: Endofunction[com.pulumi.azure.privatelink.inputs.EndpointPrivateDnsZoneGroupArgs.Builder]):
        com.pulumi.azure.privatelink.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.azure.privatelink.inputs.EndpointPrivateDnsZoneGroupArgs.builder
      builder.privateDnsZoneGroup(args(argsBuilder).build)

    /**
     * @param privateServiceConnection A `privateServiceConnection` block as defined below.
     * @return builder
     */
    def privateServiceConnection(args: Endofunction[com.pulumi.azure.privatelink.inputs.EndpointPrivateServiceConnectionArgs.Builder]):
        com.pulumi.azure.privatelink.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.azure.privatelink.inputs.EndpointPrivateServiceConnectionArgs.builder
      builder.privateServiceConnection(args(argsBuilder).build)
