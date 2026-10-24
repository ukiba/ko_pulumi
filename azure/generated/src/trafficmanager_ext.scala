package jp.ukiba.ko_pulumi
package azure

object trafficmanager_ext:
  extension (builder: com.pulumi.azure.trafficmanager.ProfileArgs.Builder)
    /**
     * @param dnsConfig This block specifies the DNS configuration of the Profile. One `dnsConfig` block as defined below.
     * @return builder
     */
    inline def dnsConfig(args: Endofunction[com.pulumi.azure.trafficmanager.inputs.ProfileDnsConfigArgs.Builder]):
        com.pulumi.azure.trafficmanager.ProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.trafficmanager.inputs.ProfileDnsConfigArgs.builder
      builder.dnsConfig(args(argsBuilder).build)

    /**
     * @param monitorConfig This block specifies the Endpoint monitoring configuration for the Profile. One `monitorConfig` block as defined below.
     * @return builder
     */
    inline def monitorConfig(args: Endofunction[com.pulumi.azure.trafficmanager.inputs.ProfileMonitorConfigArgs.Builder]):
        com.pulumi.azure.trafficmanager.ProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.trafficmanager.inputs.ProfileMonitorConfigArgs.builder
      builder.monitorConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.trafficmanager.inputs.ProfileMonitorConfigArgs.Builder)
    /**
     * @param customHeaders One or more `customHeader` blocks as defined below.
     * @return builder
     */
    inline def customHeaders(args: Endofunction[com.pulumi.azure.trafficmanager.inputs.ProfileMonitorConfigCustomHeaderArgs.Builder]*):
        com.pulumi.azure.trafficmanager.inputs.ProfileMonitorConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.trafficmanager.inputs.ProfileMonitorConfigCustomHeaderArgs.builder
      builder.customHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.trafficmanager.inputs.ProfileState.Builder)
    /**
     * @param dnsConfig This block specifies the DNS configuration of the Profile. One `dnsConfig` block as defined below.
     * @return builder
     */
    inline def dnsConfig(args: Endofunction[com.pulumi.azure.trafficmanager.inputs.ProfileDnsConfigArgs.Builder]):
        com.pulumi.azure.trafficmanager.inputs.ProfileState.Builder =
      val argsBuilder = com.pulumi.azure.trafficmanager.inputs.ProfileDnsConfigArgs.builder
      builder.dnsConfig(args(argsBuilder).build)

    /**
     * @param monitorConfig This block specifies the Endpoint monitoring configuration for the Profile. One `monitorConfig` block as defined below.
     * @return builder
     */
    inline def monitorConfig(args: Endofunction[com.pulumi.azure.trafficmanager.inputs.ProfileMonitorConfigArgs.Builder]):
        com.pulumi.azure.trafficmanager.inputs.ProfileState.Builder =
      val argsBuilder = com.pulumi.azure.trafficmanager.inputs.ProfileMonitorConfigArgs.builder
      builder.monitorConfig(args(argsBuilder).build)
