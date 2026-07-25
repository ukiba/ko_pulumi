package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object serverlessrepository:
  /**
   * Manages an Application CloudFormation Stack from the Serverless Application Repository.
   * 
   * &gt; **Warning:** CloudFormation masks `NoEcho` parameter values as `****` in API responses, which may set an expectation that they remain hidden. They do not \u2014 like any other argument, the configured value is persisted to state. To mask a specific parameter in plan and `terraform show` output, wrap it with Terraform&#39;s `sensitive()` function, for example `parameters = { password = sensitive(var.password) }`.
   */
  def CloudFormationStack(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.serverlessrepository.CloudFormationStackArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.serverlessrepository.CloudFormationStackArgs.builder
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
    com.pulumi.aws.serverlessrepository.CloudFormationStack(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object ServerlessrepositoryFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to get information about an AWS Serverless Application Repository application. For example, this can be used to determine the required `capabilities` for an application. */
    inline def getApplication(args: Endofunction[com.pulumi.aws.serverlessrepository.inputs.GetApplicationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.serverlessrepository.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.aws.serverlessrepository.inputs.GetApplicationArgs.builder
      com.pulumi.aws.serverlessrepository.ServerlessrepositoryFunctions.getApplication(args(argsBuilder).build)

    /** Use this data source to get information about an AWS Serverless Application Repository application. For example, this can be used to determine the required `capabilities` for an application. */
    inline def getApplicationPlain(args: Endofunction[com.pulumi.aws.serverlessrepository.inputs.GetApplicationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.serverlessrepository.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.aws.serverlessrepository.inputs.GetApplicationPlainArgs.builder
      com.pulumi.aws.serverlessrepository.ServerlessrepositoryFunctions.getApplicationPlain(args(argsBuilder).build)
