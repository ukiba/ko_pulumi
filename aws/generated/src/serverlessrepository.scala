package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object serverlessrepository:
  /**
   * Manages an Application CloudFormation Stack from the Serverless Application Repository.
   * 
   * &gt; **Warning:** CloudFormation masks `NoEcho` parameter values as `****` in API responses, which may set an expectation that they remain hidden. They do not \u2014 like any other argument, the configured value is persisted to state. To mask a specific parameter in plan and `terraform show` output, wrap it with Terraform&#39;s `sensitive()` function, for example `parameters = { password = sensitive(var.password) }`.
   */
  inline def CloudFormationStack(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.serverlessrepository.CloudFormationStackArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object ServerlessrepositoryFunctions:
    /** Use this data source to get information about an AWS Serverless Application Repository application. For example, this can be used to determine the required `capabilities` for an application. */
    inline def getApplication(args: Endofunction[com.pulumi.aws.serverlessrepository.inputs.GetApplicationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.serverlessrepository.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.aws.serverlessrepository.inputs.GetApplicationArgs.builder
      com.pulumi.aws.serverlessrepository.ServerlessrepositoryFunctions.getApplication(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information about an AWS Serverless Application Repository application. For example, this can be used to determine the required `capabilities` for an application. */
    inline def getApplicationPlain(args: Endofunction[com.pulumi.aws.serverlessrepository.inputs.GetApplicationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.serverlessrepository.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.aws.serverlessrepository.inputs.GetApplicationPlainArgs.builder
      com.pulumi.aws.serverlessrepository.ServerlessrepositoryFunctions.getApplicationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
