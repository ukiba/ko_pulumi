package jp.ukiba.ko_pulumi
package aws

object servicediscovery_ext:
  extension (builder: com.pulumi.aws.servicediscovery.ServiceArgs.Builder)
    /**
     * @param dnsConfig A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance. See `dnsConfig` Block for details.
     * @return builder
     */
    def dnsConfig(args: Endofunction[com.pulumi.aws.servicediscovery.inputs.ServiceDnsConfigArgs.Builder]):
        com.pulumi.aws.servicediscovery.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.servicediscovery.inputs.ServiceDnsConfigArgs.builder
      builder.dnsConfig(args(argsBuilder).build)

    /**
     * @param healthCheckConfig A complex type that contains settings for an optional health check. Only for Public DNS namespaces. See `healthCheckConfig` Block for details.
     * @return builder
     */
    def healthCheckConfig(args: Endofunction[com.pulumi.aws.servicediscovery.inputs.ServiceHealthCheckConfigArgs.Builder]):
        com.pulumi.aws.servicediscovery.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.servicediscovery.inputs.ServiceHealthCheckConfigArgs.builder
      builder.healthCheckConfig(args(argsBuilder).build)

    /**
     * @param healthCheckCustomConfig Please use `healthCheckConfig` instead. See `healthCheckCustomConfig` Block for details.
     * @return builder
     */
    def healthCheckCustomConfig(args: Endofunction[com.pulumi.aws.servicediscovery.inputs.ServiceHealthCheckCustomConfigArgs.Builder]):
        com.pulumi.aws.servicediscovery.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.servicediscovery.inputs.ServiceHealthCheckCustomConfigArgs.builder
      builder.healthCheckCustomConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.servicediscovery.inputs.ServiceDnsConfigArgs.Builder)
    /**
     * @param dnsRecords An array that contains one DnsRecord object for each resource record set. See `dnsRecords` Block for details.
     * @return builder
     */
    def dnsRecords(args: Endofunction[com.pulumi.aws.servicediscovery.inputs.ServiceDnsConfigDnsRecordArgs.Builder]*):
        com.pulumi.aws.servicediscovery.inputs.ServiceDnsConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.servicediscovery.inputs.ServiceDnsConfigDnsRecordArgs.builder
      builder.dnsRecords(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.servicediscovery.inputs.ServiceState.Builder)
    /**
     * @param dnsConfig A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance. See `dnsConfig` Block for details.
     * @return builder
     */
    def dnsConfig(args: Endofunction[com.pulumi.aws.servicediscovery.inputs.ServiceDnsConfigArgs.Builder]):
        com.pulumi.aws.servicediscovery.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.servicediscovery.inputs.ServiceDnsConfigArgs.builder
      builder.dnsConfig(args(argsBuilder).build)

    /**
     * @param healthCheckConfig A complex type that contains settings for an optional health check. Only for Public DNS namespaces. See `healthCheckConfig` Block for details.
     * @return builder
     */
    def healthCheckConfig(args: Endofunction[com.pulumi.aws.servicediscovery.inputs.ServiceHealthCheckConfigArgs.Builder]):
        com.pulumi.aws.servicediscovery.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.servicediscovery.inputs.ServiceHealthCheckConfigArgs.builder
      builder.healthCheckConfig(args(argsBuilder).build)

    /**
     * @param healthCheckCustomConfig Please use `healthCheckConfig` instead. See `healthCheckCustomConfig` Block for details.
     * @return builder
     */
    def healthCheckCustomConfig(args: Endofunction[com.pulumi.aws.servicediscovery.inputs.ServiceHealthCheckCustomConfigArgs.Builder]):
        com.pulumi.aws.servicediscovery.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.servicediscovery.inputs.ServiceHealthCheckCustomConfigArgs.builder
      builder.healthCheckCustomConfig(args(argsBuilder).build)
