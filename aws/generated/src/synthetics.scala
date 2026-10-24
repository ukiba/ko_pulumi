package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object synthetics:
  /**
   * Provides a Synthetics Canary resource.
   * 
   * &gt; **NOTE:** When you create a canary, AWS creates supporting implicit resources. See the Amazon CloudWatch Synthetics documentation on [DeleteCanary](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_DeleteCanary.html) for a full list. Neither AWS nor this provider deletes these implicit resources automatically when the canary is deleted. Before deleting a canary, ensure you have all the information about the canary that you need to delete the implicit resources using the AWS Console, or AWS CLI.
   */
  def Canary(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.synthetics.CanaryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.synthetics.CanaryArgs.builder
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
    com.pulumi.aws.synthetics.Canary(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Synthetics Group resource. */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.synthetics.GroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.synthetics.GroupArgs.builder
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
    com.pulumi.aws.synthetics.Group(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Synthetics Group Association resource. */
  def GroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.synthetics.GroupAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.synthetics.GroupAssociationArgs.builder
    com.pulumi.aws.synthetics.GroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object SyntheticsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS CloudWatch Synthetics Runtime Version. */
    inline def getRuntimeVersion(args: Endofunction[com.pulumi.aws.synthetics.inputs.GetRuntimeVersionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.synthetics.outputs.GetRuntimeVersionResult] =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.GetRuntimeVersionArgs.builder
      com.pulumi.aws.synthetics.SyntheticsFunctions.getRuntimeVersion(args(argsBuilder).build)

    /** Data source for managing an AWS CloudWatch Synthetics Runtime Version. */
    inline def getRuntimeVersionPlain(args: Endofunction[com.pulumi.aws.synthetics.inputs.GetRuntimeVersionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.synthetics.outputs.GetRuntimeVersionResult] =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.GetRuntimeVersionPlainArgs.builder
      com.pulumi.aws.synthetics.SyntheticsFunctions.getRuntimeVersionPlain(args(argsBuilder).build)

    /** Data source for managing an AWS CloudWatch Synthetics Runtime Versions. */
    inline def getRuntimeVersions(args: Endofunction[com.pulumi.aws.synthetics.inputs.GetRuntimeVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.synthetics.outputs.GetRuntimeVersionsResult] =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.GetRuntimeVersionsArgs.builder
      com.pulumi.aws.synthetics.SyntheticsFunctions.getRuntimeVersions(args(argsBuilder).build)

    /** Data source for managing an AWS CloudWatch Synthetics Runtime Versions. */
    inline def getRuntimeVersionsPlain(args: Endofunction[com.pulumi.aws.synthetics.inputs.GetRuntimeVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.synthetics.outputs.GetRuntimeVersionsResult] =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.GetRuntimeVersionsPlainArgs.builder
      com.pulumi.aws.synthetics.SyntheticsFunctions.getRuntimeVersionsPlain(args(argsBuilder).build)
