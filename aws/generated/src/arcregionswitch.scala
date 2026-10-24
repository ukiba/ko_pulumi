package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object arcregionswitch:
  object ArcregionswitchFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an Amazon ARC Region Switch plan. */
    inline def getPlan(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.GetPlanArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.arcregionswitch.outputs.GetPlanResult] =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.GetPlanArgs.builder
      com.pulumi.aws.arcregionswitch.ArcregionswitchFunctions.getPlan(args(argsBuilder).build)

    /** Data source for managing an Amazon ARC Region Switch plan. */
    inline def getPlanPlain(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.GetPlanPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.arcregionswitch.outputs.GetPlanResult] =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.GetPlanPlainArgs.builder
      com.pulumi.aws.arcregionswitch.ArcregionswitchFunctions.getPlanPlain(args(argsBuilder).build)

    /** Data source for managing Amazon ARC Region Switch Route53 Health Checks. */
    inline def getRoute53HealthChecks(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.GetRoute53HealthChecksArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.arcregionswitch.outputs.GetRoute53HealthChecksResult] =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.GetRoute53HealthChecksArgs.builder
      com.pulumi.aws.arcregionswitch.ArcregionswitchFunctions.getRoute53HealthChecks(args(argsBuilder).build)

    /** Data source for managing Amazon ARC Region Switch Route53 Health Checks. */
    inline def getRoute53HealthChecksPlain(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.GetRoute53HealthChecksPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.arcregionswitch.outputs.GetRoute53HealthChecksResult] =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.GetRoute53HealthChecksPlainArgs.builder
      com.pulumi.aws.arcregionswitch.ArcregionswitchFunctions.getRoute53HealthChecksPlain(args(argsBuilder).build)

  /** Resource for managing an Amazon ARC Region Switch plan. */
  def Plan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.arcregionswitch.PlanArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.arcregionswitch.PlanArgs.builder
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
    com.pulumi.aws.arcregionswitch.Plan(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
