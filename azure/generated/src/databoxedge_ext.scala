package jp.ukiba.ko_pulumi
package azure

object databoxedge_ext:
  extension (builder: com.pulumi.azure.databoxedge.inputs.DeviceState.Builder)
    /**
     * @param deviceProperties A `deviceProperties` block as defined below.
     * @return builder
     */
    def deviceProperties(args: Endofunction[com.pulumi.azure.databoxedge.inputs.DeviceDevicePropertyArgs.Builder]*):
        com.pulumi.azure.databoxedge.inputs.DeviceState.Builder =
      def argsBuilder = com.pulumi.azure.databoxedge.inputs.DeviceDevicePropertyArgs.builder
      builder.deviceProperties(args.map(_(argsBuilder).build)*)
