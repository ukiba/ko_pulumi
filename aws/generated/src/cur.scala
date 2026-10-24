package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object cur:
  object CurFunctions:
    /**
     * Use this data source to get information on an AWS Cost and Usage Report Definition.
     * 
     * &gt; *NOTE:* The AWS Cost and Usage Report service is only available in `us-east-1` currently.
     * 
     * &gt; *NOTE:* If AWS Organizations is enabled, only the master account can use this resource.
     */
    inline def getReportDefinition(args: Endofunction[com.pulumi.aws.cur.inputs.GetReportDefinitionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cur.outputs.GetReportDefinitionResult] =
      val argsBuilder = com.pulumi.aws.cur.inputs.GetReportDefinitionArgs.builder
      com.pulumi.aws.cur.CurFunctions.getReportDefinition(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get information on an AWS Cost and Usage Report Definition.
     * 
     * &gt; *NOTE:* The AWS Cost and Usage Report service is only available in `us-east-1` currently.
     * 
     * &gt; *NOTE:* If AWS Organizations is enabled, only the master account can use this resource.
     */
    inline def getReportDefinitionPlain(args: Endofunction[com.pulumi.aws.cur.inputs.GetReportDefinitionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cur.outputs.GetReportDefinitionResult] =
      val argsBuilder = com.pulumi.aws.cur.inputs.GetReportDefinitionPlainArgs.builder
      com.pulumi.aws.cur.CurFunctions.getReportDefinitionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Manages Cost and Usage Report Definitions.
   * 
   * &gt; *NOTE:* The AWS Cost and Usage Report service is only available in `us-east-1` currently.
   */
  def ReportDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cur.ReportDefinitionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cur.ReportDefinitionArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cur.ReportDefinition(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
