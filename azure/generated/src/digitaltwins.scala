package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object digitaltwins:
  type DigitaltwinsFunctions = com.pulumi.azure.digitaltwins.DigitaltwinsFunctions
  object DigitaltwinsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.digitaltwins.DigitaltwinsFunctions.*
  extension (self: DigitaltwinsFunctions.type)
    /** Use this data source to access information about an existing Digital Twins instance. */
    def getInstance(args: Endofunction[com.pulumi.azure.digitaltwins.inputs.GetInstanceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.digitaltwins.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.azure.digitaltwins.inputs.GetInstanceArgs.builder
      com.pulumi.azure.digitaltwins.DigitaltwinsFunctions.getInstance(args(argsBuilder).build)

    /** Use this data source to access information about an existing Digital Twins instance. */
    def getInstancePlain(args: Endofunction[com.pulumi.azure.digitaltwins.inputs.GetInstancePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.digitaltwins.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.azure.digitaltwins.inputs.GetInstancePlainArgs.builder
      com.pulumi.azure.digitaltwins.DigitaltwinsFunctions.getInstancePlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.digitaltwins.InstanceArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.digitaltwins.inputs.InstanceIdentityArgs.Builder]):
        com.pulumi.azure.digitaltwins.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.digitaltwins.inputs.InstanceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.digitaltwins.InstanceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Digital Twins Time Series Database Connection. */
  def TimeSeriesDatabaseConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.digitaltwins.TimeSeriesDatabaseConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.digitaltwins.TimeSeriesDatabaseConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.digitaltwins.TimeSeriesDatabaseConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Digital Twins instance. */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.digitaltwins.InstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.digitaltwins.InstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.digitaltwins.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Digital Twins Event Grid Endpoint. */
  def EndpointEventGrid(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.digitaltwins.EndpointEventGridArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.digitaltwins.EndpointEventGridArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.digitaltwins.EndpointEventGrid(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Digital Twins Event Hub Endpoint. */
  def EndpointEventHub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.digitaltwins.EndpointEventHubArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.digitaltwins.EndpointEventHubArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.digitaltwins.EndpointEventHub(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.digitaltwins.inputs.InstanceState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.digitaltwins.inputs.InstanceIdentityArgs.Builder]):
        com.pulumi.azure.digitaltwins.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.azure.digitaltwins.inputs.InstanceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.digitaltwins.inputs.InstanceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Digital Twins Service Bus Endpoint. */
  def EndpointServicebus(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.digitaltwins.EndpointServicebusArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.digitaltwins.EndpointServicebusArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.digitaltwins.EndpointServicebus(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
