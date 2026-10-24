package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object oam:
  /**
   * Resource for managing an AWS CloudWatch Observability Access Manager Link.
   * 
   * &gt; **NOTE:** Creating an `aws.oam.Link` may sometimes fail if the `aws.oam.SinkPolicy` for the attached `aws.oam.Sink` is not created before the `aws.oam.Link`. To prevent this, declare an explicit dependency using a `dependsOn` meta-argument.
   */
  def Link(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.oam.LinkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.oam.LinkArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.oam.Link(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object OamFunctions:
    /** Data source for managing an AWS CloudWatch Observability Access Manager Link. */
    inline def getLink(args: Endofunction[com.pulumi.aws.oam.inputs.GetLinkArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.oam.outputs.GetLinkResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetLinkArgs.builder
      com.pulumi.aws.oam.OamFunctions.getLink(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS CloudWatch Observability Access Manager Link. */
    inline def getLinkPlain(args: Endofunction[com.pulumi.aws.oam.inputs.GetLinkPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.oam.outputs.GetLinkResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetLinkPlainArgs.builder
      com.pulumi.aws.oam.OamFunctions.getLinkPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS CloudWatch Observability Access Manager Links. */
    inline def getLinks(args: Endofunction[com.pulumi.aws.oam.inputs.GetLinksArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.oam.outputs.GetLinksResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetLinksArgs.builder
      com.pulumi.aws.oam.OamFunctions.getLinks(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS CloudWatch Observability Access Manager Links. */
    inline def getLinksPlain(args: Endofunction[com.pulumi.aws.oam.inputs.GetLinksPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.oam.outputs.GetLinksResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetLinksPlainArgs.builder
      com.pulumi.aws.oam.OamFunctions.getLinksPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS CloudWatch Observability Access Manager Sink. */
    inline def getSink(args: Endofunction[com.pulumi.aws.oam.inputs.GetSinkArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.oam.outputs.GetSinkResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetSinkArgs.builder
      com.pulumi.aws.oam.OamFunctions.getSink(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS CloudWatch Observability Access Manager Sink. */
    inline def getSinkPlain(args: Endofunction[com.pulumi.aws.oam.inputs.GetSinkPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.oam.outputs.GetSinkResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetSinkPlainArgs.builder
      com.pulumi.aws.oam.OamFunctions.getSinkPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS CloudWatch Observability Access Manager Sinks. */
    inline def getSinks(args: Endofunction[com.pulumi.aws.oam.inputs.GetSinksArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.oam.outputs.GetSinksResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetSinksArgs.builder
      com.pulumi.aws.oam.OamFunctions.getSinks(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS CloudWatch Observability Access Manager Sinks. */
    inline def getSinksPlain(args: Endofunction[com.pulumi.aws.oam.inputs.GetSinksPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.oam.outputs.GetSinksResult] =
      val argsBuilder = com.pulumi.aws.oam.inputs.GetSinksPlainArgs.builder
      com.pulumi.aws.oam.OamFunctions.getSinksPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Resource for managing an AWS CloudWatch Observability Access Manager Sink. */
  def Sink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.oam.SinkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.oam.SinkArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.oam.Sink(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS CloudWatch Observability Access Manager Sink Policy. */
  def SinkPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.oam.SinkPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.oam.SinkPolicyArgs.builder
    com.pulumi.aws.oam.SinkPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
