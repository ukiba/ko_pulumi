package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object cur:
  /**
   * Manages Cost and Usage Report Definitions.
   * 
   *  &gt; *NOTE:* The AWS Cost and Usage Report service is only available in `us-east-1` currently.
   */
  def ReportDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cur.ReportDefinitionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cur.ReportDefinitionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.aws.cur.ReportDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object CurFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Use this data source to get information on an AWS Cost and Usage Report Definition.
     * 
     *  &gt; *NOTE:* The AWS Cost and Usage Report service is only available in `us-east-1` currently.
     * 
     *  &gt; *NOTE:* If AWS Organizations is enabled, only the master account can use this resource.
     */
    inline def getReportDefinition(args: Endofunction[com.pulumi.aws.cur.inputs.GetReportDefinitionArgs.Builder] = scala.Predef.identity):
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
    inline def getReportDefinitionPlain(args: Endofunction[com.pulumi.aws.cur.inputs.GetReportDefinitionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cur.outputs.GetReportDefinitionResult] =
      val argsBuilder = com.pulumi.aws.cur.inputs.GetReportDefinitionPlainArgs.builder
      com.pulumi.aws.cur.CurFunctions.getReportDefinitionPlain(args(argsBuilder).build)
