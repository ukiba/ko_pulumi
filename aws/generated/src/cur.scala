package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object cur:
  /**
   * Manages Cost and Usage Report Definitions.
   *  
   *  &gt; *NOTE:* The AWS Cost and Usage Report service is only available in `us-east-1` currently.
   */
  def ReportDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cur.ReportDefinitionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cur.ReportDefinitionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cur.ReportDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type CurFunctions = com.pulumi.aws.cur.CurFunctions
  object CurFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.cur.CurFunctions.*
  extension (self: CurFunctions.type)
    /**
     * Use this data source to get information on an AWS Cost and Usage Report Definition.
     *  
     *  &gt; *NOTE:* The AWS Cost and Usage Report service is only available in `us-east-1` currently.
     *  
     *  &gt; *NOTE:* If AWS Organizations is enabled, only the master account can use this resource.
     */
    def getReportDefinition(args: Endofunction[com.pulumi.aws.cur.inputs.GetReportDefinitionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cur.outputs.GetReportDefinitionResult] =
      val argsBuilder = com.pulumi.aws.cur.inputs.GetReportDefinitionArgs.builder
      com.pulumi.aws.cur.CurFunctions.getReportDefinition(args(argsBuilder).build)

    /**
     * Use this data source to get information on an AWS Cost and Usage Report Definition.
     *  
     *  &gt; *NOTE:* The AWS Cost and Usage Report service is only available in `us-east-1` currently.
     *  
     *  &gt; *NOTE:* If AWS Organizations is enabled, only the master account can use this resource.
     */
    def getReportDefinitionPlain(args: Endofunction[com.pulumi.aws.cur.inputs.GetReportDefinitionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cur.outputs.GetReportDefinitionResult] =
      val argsBuilder = com.pulumi.aws.cur.inputs.GetReportDefinitionPlainArgs.builder
      com.pulumi.aws.cur.CurFunctions.getReportDefinitionPlain(args(argsBuilder).build)
