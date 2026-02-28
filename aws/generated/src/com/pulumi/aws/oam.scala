package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object oam:
  /**
   * Resource for managing an AWS CloudWatch Observability Access Manager Link.
   *  
   *  &gt; **NOTE:** Creating an `aws.oam.Link` may sometimes fail if the `aws.oam.SinkPolicy` for the attached `aws.oam.Sink` is not created before the `aws.oam.Link`. To prevent this, declare an explicit dependency using a `dependsOn` meta-argument.
   */
  def Link(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.oam.LinkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.oam.LinkArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.oam.Link(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS CloudWatch Observability Access Manager Sink. */
  def Sink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
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

  /** Resource for managing an AWS CloudWatch Observability Access Manager Sink Policy. */
  def SinkPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.oam.SinkPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.oam.SinkPolicyArgs.builder
    
    com.pulumi.aws.oam.SinkPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type OamFunctions = com.pulumi.aws.oam.OamFunctions
  object OamFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.oam.OamFunctions.*
  extension (self: OamFunctions.type)
    /** Data source for managing an AWS CloudWatch Observability Access Manager Link. */
    def getLink(args: Endofunction[com.pulumi.aws.oam.inputs.GetLinkArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.oam.outputs.GetLinkResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetLinkArgs.builder
      com.pulumi.aws.oam.OamFunctions.getLink(args(argsBuilder).build)

    /** Data source for managing an AWS CloudWatch Observability Access Manager Link. */
    def getLinkPlain(args: Endofunction[com.pulumi.aws.oam.inputs.GetLinkPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.oam.outputs.GetLinkResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetLinkPlainArgs.builder
      com.pulumi.aws.oam.OamFunctions.getLinkPlain(args(argsBuilder).build)

    /** Data source for managing an AWS CloudWatch Observability Access Manager Links. */
    def getLinks(args: Endofunction[com.pulumi.aws.oam.inputs.GetLinksArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.oam.outputs.GetLinksResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetLinksArgs.builder
      com.pulumi.aws.oam.OamFunctions.getLinks(args(argsBuilder).build)

    /** Data source for managing an AWS CloudWatch Observability Access Manager Links. */
    def getLinksPlain(args: Endofunction[com.pulumi.aws.oam.inputs.GetLinksPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.oam.outputs.GetLinksResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetLinksPlainArgs.builder
      com.pulumi.aws.oam.OamFunctions.getLinksPlain(args(argsBuilder).build)

    /** Data source for managing an AWS CloudWatch Observability Access Manager Sink. */
    def getSink(args: Endofunction[com.pulumi.aws.oam.inputs.GetSinkArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.oam.outputs.GetSinkResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetSinkArgs.builder
      com.pulumi.aws.oam.OamFunctions.getSink(args(argsBuilder).build)

    /** Data source for managing an AWS CloudWatch Observability Access Manager Sink. */
    def getSinkPlain(args: Endofunction[com.pulumi.aws.oam.inputs.GetSinkPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.oam.outputs.GetSinkResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetSinkPlainArgs.builder
      com.pulumi.aws.oam.OamFunctions.getSinkPlain(args(argsBuilder).build)

    /** Data source for managing an AWS CloudWatch Observability Access Manager Sinks. */
    def getSinks(args: Endofunction[com.pulumi.aws.oam.inputs.GetSinksArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.oam.outputs.GetSinksResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetSinksArgs.builder
      com.pulumi.aws.oam.OamFunctions.getSinks(args(argsBuilder).build)

    /** Data source for managing an AWS CloudWatch Observability Access Manager Sinks. */
    def getSinksPlain(args: Endofunction[com.pulumi.aws.oam.inputs.GetSinksPlainArgs.Builder] = identity):
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
