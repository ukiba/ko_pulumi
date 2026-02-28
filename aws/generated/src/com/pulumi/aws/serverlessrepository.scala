package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object serverlessrepository:
  /** Deploys an Application CloudFormation Stack from the Serverless Application Repository. */
  def CloudFormationStack(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.serverlessrepository.CloudFormationStackArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.serverlessrepository.CloudFormationStackArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.serverlessrepository.CloudFormationStack(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type ServerlessrepositoryFunctions = com.pulumi.aws.serverlessrepository.ServerlessrepositoryFunctions
  object ServerlessrepositoryFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.serverlessrepository.ServerlessrepositoryFunctions.*
  extension (self: ServerlessrepositoryFunctions.type)
    /** Use this data source to get information about an AWS Serverless Application Repository application. For example, this can be used to determine the required `capabilities` for an application. */
    def getApplication(args: Endofunction[com.pulumi.aws.serverlessrepository.inputs.GetApplicationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.serverlessrepository.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.aws.serverlessrepository.inputs.GetApplicationArgs.builder
      com.pulumi.aws.serverlessrepository.ServerlessrepositoryFunctions.getApplication(args(argsBuilder).build)

    /** Use this data source to get information about an AWS Serverless Application Repository application. For example, this can be used to determine the required `capabilities` for an application. */
    def getApplicationPlain(args: Endofunction[com.pulumi.aws.serverlessrepository.inputs.GetApplicationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.serverlessrepository.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.aws.serverlessrepository.inputs.GetApplicationPlainArgs.builder
      com.pulumi.aws.serverlessrepository.ServerlessrepositoryFunctions.getApplicationPlain(args(argsBuilder).build)
