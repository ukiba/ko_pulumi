package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object servicediscovery:
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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.servicediscovery.ServiceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  object ServicediscoveryFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves information about a Service Discovery private or public DNS namespace. */
    inline def getDnsNamespace(args: Endofunction[com.pulumi.aws.servicediscovery.inputs.GetDnsNamespaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.servicediscovery.outputs.GetDnsNamespaceResult] =
      val argsBuilder = com.pulumi.aws.servicediscovery.inputs.GetDnsNamespaceArgs.builder
      com.pulumi.aws.servicediscovery.ServicediscoveryFunctions.getDnsNamespace(args(argsBuilder).build)

    /** Retrieves information about a Service Discovery private or public DNS namespace. */
    inline def getDnsNamespacePlain(args: Endofunction[com.pulumi.aws.servicediscovery.inputs.GetDnsNamespacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.servicediscovery.outputs.GetDnsNamespaceResult] =
      val argsBuilder = com.pulumi.aws.servicediscovery.inputs.GetDnsNamespacePlainArgs.builder
      com.pulumi.aws.servicediscovery.ServicediscoveryFunctions.getDnsNamespacePlain(args(argsBuilder).build)

    /**
     * 
     */
    inline def getHttpNamespace(args: Endofunction[com.pulumi.aws.servicediscovery.inputs.GetHttpNamespaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.servicediscovery.outputs.GetHttpNamespaceResult] =
      val argsBuilder = com.pulumi.aws.servicediscovery.inputs.GetHttpNamespaceArgs.builder
      com.pulumi.aws.servicediscovery.ServicediscoveryFunctions.getHttpNamespace(args(argsBuilder).build)

    /**
     * 
     */
    inline def getHttpNamespacePlain(args: Endofunction[com.pulumi.aws.servicediscovery.inputs.GetHttpNamespacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.servicediscovery.outputs.GetHttpNamespaceResult] =
      val argsBuilder = com.pulumi.aws.servicediscovery.inputs.GetHttpNamespacePlainArgs.builder
      com.pulumi.aws.servicediscovery.ServicediscoveryFunctions.getHttpNamespacePlain(args(argsBuilder).build)

    /** Retrieves information about a Service Discovery Service. */
    inline def getService(args: Endofunction[com.pulumi.aws.servicediscovery.inputs.GetServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.servicediscovery.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.aws.servicediscovery.inputs.GetServiceArgs.builder
      com.pulumi.aws.servicediscovery.ServicediscoveryFunctions.getService(args(argsBuilder).build)

    /** Retrieves information about a Service Discovery Service. */
    inline def getServicePlain(args: Endofunction[com.pulumi.aws.servicediscovery.inputs.GetServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.servicediscovery.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.aws.servicediscovery.inputs.GetServicePlainArgs.builder
      com.pulumi.aws.servicediscovery.ServicediscoveryFunctions.getServicePlain(args(argsBuilder).build)

  /** Provides a Service Discovery Private DNS Namespace resource. */
  def PrivateDnsNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.servicediscovery.PrivateDnsNamespaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.servicediscovery.PrivateDnsNamespaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.aws.servicediscovery.PrivateDnsNamespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Service Discovery Service resource. */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.servicediscovery.ServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.servicediscovery.ServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.aws.servicediscovery.Service(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Service Discovery Instance resource. */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.servicediscovery.InstanceArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.servicediscovery.InstanceArgs.builder
    com.pulumi.aws.servicediscovery.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * 
   */
  def HttpNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.servicediscovery.HttpNamespaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.servicediscovery.HttpNamespaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.aws.servicediscovery.HttpNamespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Service Discovery Public DNS Namespace resource. */
  def PublicDnsNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.servicediscovery.PublicDnsNamespaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.servicediscovery.PublicDnsNamespaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.aws.servicediscovery.PublicDnsNamespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.servicediscovery.inputs.ServiceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
