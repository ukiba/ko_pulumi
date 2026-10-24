package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object codecatalyst:
  object CodecatalystFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS CodeCatalyst Dev Environment. */
    inline def getDevEnvironment(args: Endofunction[com.pulumi.aws.codecatalyst.inputs.GetDevEnvironmentArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.codecatalyst.outputs.GetDevEnvironmentResult] =
      val argsBuilder = com.pulumi.aws.codecatalyst.inputs.GetDevEnvironmentArgs.builder
      com.pulumi.aws.codecatalyst.CodecatalystFunctions.getDevEnvironment(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS CodeCatalyst Dev Environment. */
    inline def getDevEnvironmentPlain(args: Endofunction[com.pulumi.aws.codecatalyst.inputs.GetDevEnvironmentPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.codecatalyst.outputs.GetDevEnvironmentResult] =
      val argsBuilder = com.pulumi.aws.codecatalyst.inputs.GetDevEnvironmentPlainArgs.builder
      com.pulumi.aws.codecatalyst.CodecatalystFunctions.getDevEnvironmentPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Resource for managing an AWS CodeCatalyst Dev Environment. */
  def DevEnvironment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.codecatalyst.DevEnvironmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.codecatalyst.DevEnvironmentArgs.builder
    com.pulumi.aws.codecatalyst.DevEnvironment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS CodeCatalyst Project. */
  def Project(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.codecatalyst.ProjectArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.codecatalyst.ProjectArgs.builder
    com.pulumi.aws.codecatalyst.Project(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS CodeCatalyst Source Repository. */
  def SourceRepository(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.codecatalyst.SourceRepositoryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codecatalyst.SourceRepositoryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.codecatalyst.SourceRepository(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
