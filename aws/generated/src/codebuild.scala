package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object codebuild:
  object CodebuildFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieve information about an CodeBuild Fleet. */
    inline def getFleet(args: Endofunction[com.pulumi.aws.codebuild.inputs.GetFleetArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.codebuild.outputs.GetFleetResult] =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.GetFleetArgs.builder
      com.pulumi.aws.codebuild.CodebuildFunctions.getFleet(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieve information about an CodeBuild Fleet. */
    inline def getFleetPlain(args: Endofunction[com.pulumi.aws.codebuild.inputs.GetFleetPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.codebuild.outputs.GetFleetResult] =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.GetFleetPlainArgs.builder
      com.pulumi.aws.codebuild.CodebuildFunctions.getFleetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Provides a CodeBuild Fleet Resource. */
  def Fleet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.codebuild.FleetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codebuild.FleetArgs.builder
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
    com.pulumi.aws.codebuild.Fleet(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a CodeBuild Project resource. See also the
   * `aws.codebuild.Webhook` resource, which manages the webhook to the
   * source (e.g., the &#34;rebuild every time a code change is pushed&#34; option in the CodeBuild web console).
   */
  def Project(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.codebuild.ProjectArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codebuild.ProjectArgs.builder
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
    com.pulumi.aws.codebuild.Project(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CodeBuild Report Groups Resource. */
  def ReportGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.codebuild.ReportGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codebuild.ReportGroupArgs.builder
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
    com.pulumi.aws.codebuild.ReportGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CodeBuild Resource Policy Resource. */
  def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.codebuild.ResourcePolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.codebuild.ResourcePolicyArgs.builder
    com.pulumi.aws.codebuild.ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a CodeBuild Source Credentials Resource.
   * 
   * &gt; **NOTE:
   * ** [CodeBuild only allows a single credential per given server type in a given region](https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_codebuild.GitHubSourceCredentials.html).
   * Therefore, when you define `aws.codebuild.SourceCredential`,
   * `aws.codebuild.Project` resource defined in the same module will use it.
   */
  def SourceCredential(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.codebuild.SourceCredentialArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.codebuild.SourceCredentialArgs.builder
    com.pulumi.aws.codebuild.SourceCredential(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a CodeBuild webhook, which is an endpoint accepted by the CodeBuild service to trigger builds from source code repositories. Depending on the source type of the CodeBuild project, the CodeBuild service may also automatically create and delete the actual repository webhook as well. */
  def Webhook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.codebuild.WebhookArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.codebuild.WebhookArgs.builder
    com.pulumi.aws.codebuild.Webhook(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
