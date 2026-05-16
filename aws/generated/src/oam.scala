package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object oam:
  /**
   * Resource for managing an AWS CloudWatch Observability Access Manager Link.
   * 
   *  &gt; **NOTE:** Creating an `aws.oam.Link` may sometimes fail if the `aws.oam.SinkPolicy` for the attached `aws.oam.Sink` is not created before the `aws.oam.Link`. To prevent this, declare an explicit dependency using a `dependsOn` meta-argument.
   */
  def Link(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.oam.LinkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.oam.LinkArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.aws.oam.Link(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS CloudWatch Observability Access Manager Sink. */
  def Sink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.oam.SinkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.oam.SinkArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.aws.oam.Sink(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.oam.LinkArgs.Builder)
    /**
     * @param linkConfiguration Configuration for creating filters that specify that only some metric namespaces or log groups are to be shared from the source account to the monitoring account. See `linkConfiguration` Block for details.
     * @return builder
     */
    def linkConfiguration(args: Endofunction[com.pulumi.aws.oam.inputs.LinkLinkConfigurationArgs.Builder]):
        com.pulumi.aws.oam.LinkArgs.Builder =
      val argsBuilder = com.pulumi.aws.oam.inputs.LinkLinkConfigurationArgs.builder
      builder.linkConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.oam.LinkArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Resource for managing an AWS CloudWatch Observability Access Manager Sink Policy. */
  def SinkPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.oam.SinkPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.oam.SinkPolicyArgs.builder
    com.pulumi.aws.oam.SinkPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object OamFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS CloudWatch Observability Access Manager Link. */
    inline def getLink(args: Endofunction[com.pulumi.aws.oam.inputs.GetLinkArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.oam.outputs.GetLinkResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetLinkArgs.builder
      com.pulumi.aws.oam.OamFunctions.getLink(args(argsBuilder).build)

    /** Data source for managing an AWS CloudWatch Observability Access Manager Link. */
    inline def getLinkPlain(args: Endofunction[com.pulumi.aws.oam.inputs.GetLinkPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.oam.outputs.GetLinkResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetLinkPlainArgs.builder
      com.pulumi.aws.oam.OamFunctions.getLinkPlain(args(argsBuilder).build)

    /** Data source for managing an AWS CloudWatch Observability Access Manager Links. */
    inline def getLinks(args: Endofunction[com.pulumi.aws.oam.inputs.GetLinksArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.oam.outputs.GetLinksResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetLinksArgs.builder
      com.pulumi.aws.oam.OamFunctions.getLinks(args(argsBuilder).build)

    /** Data source for managing an AWS CloudWatch Observability Access Manager Links. */
    inline def getLinksPlain(args: Endofunction[com.pulumi.aws.oam.inputs.GetLinksPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.oam.outputs.GetLinksResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetLinksPlainArgs.builder
      com.pulumi.aws.oam.OamFunctions.getLinksPlain(args(argsBuilder).build)

    /** Data source for managing an AWS CloudWatch Observability Access Manager Sink. */
    inline def getSink(args: Endofunction[com.pulumi.aws.oam.inputs.GetSinkArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.oam.outputs.GetSinkResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetSinkArgs.builder
      com.pulumi.aws.oam.OamFunctions.getSink(args(argsBuilder).build)

    /** Data source for managing an AWS CloudWatch Observability Access Manager Sink. */
    inline def getSinkPlain(args: Endofunction[com.pulumi.aws.oam.inputs.GetSinkPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.oam.outputs.GetSinkResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetSinkPlainArgs.builder
      com.pulumi.aws.oam.OamFunctions.getSinkPlain(args(argsBuilder).build)

    /** Data source for managing an AWS CloudWatch Observability Access Manager Sinks. */
    inline def getSinks(args: Endofunction[com.pulumi.aws.oam.inputs.GetSinksArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.oam.outputs.GetSinksResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetSinksArgs.builder
      com.pulumi.aws.oam.OamFunctions.getSinks(args(argsBuilder).build)

    /** Data source for managing an AWS CloudWatch Observability Access Manager Sinks. */
    inline def getSinksPlain(args: Endofunction[com.pulumi.aws.oam.inputs.GetSinksPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.oam.outputs.GetSinksResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetSinksPlainArgs.builder
      com.pulumi.aws.oam.OamFunctions.getSinksPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.oam.inputs.LinkState.Builder)
    /**
     * @param linkConfiguration Configuration for creating filters that specify that only some metric namespaces or log groups are to be shared from the source account to the monitoring account. See `linkConfiguration` Block for details.
     * @return builder
     */
    def linkConfiguration(args: Endofunction[com.pulumi.aws.oam.inputs.LinkLinkConfigurationArgs.Builder]):
        com.pulumi.aws.oam.inputs.LinkState.Builder =
      val argsBuilder = com.pulumi.aws.oam.inputs.LinkLinkConfigurationArgs.builder
      builder.linkConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.oam.inputs.LinkState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.aws.oam.inputs.LinkLinkConfigurationArgs.Builder)
    /**
     * @param logGroupConfiguration Configuration for filtering which log groups are to send log events from the source account to the monitoring account. See `logGroupConfiguration` Block for details.
     * @return builder
     */
    def logGroupConfiguration(args: Endofunction[com.pulumi.aws.oam.inputs.LinkLinkConfigurationLogGroupConfigurationArgs.Builder]):
        com.pulumi.aws.oam.inputs.LinkLinkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.oam.inputs.LinkLinkConfigurationLogGroupConfigurationArgs.builder
      builder.logGroupConfiguration(args(argsBuilder).build)

    /**
     * @param metricConfiguration Configuration for filtering which metric namespaces are to be shared from the source account to the monitoring account. See `metricConfiguration` Block for details.
     * @return builder
     */
    def metricConfiguration(args: Endofunction[com.pulumi.aws.oam.inputs.LinkLinkConfigurationMetricConfigurationArgs.Builder]):
        com.pulumi.aws.oam.inputs.LinkLinkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.oam.inputs.LinkLinkConfigurationMetricConfigurationArgs.builder
      builder.metricConfiguration(args(argsBuilder).build)
