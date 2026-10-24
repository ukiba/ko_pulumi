package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object costexplorer:
  /** Provides a CE Anomaly Monitor. */
  def AnomalyMonitor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.costexplorer.AnomalyMonitorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.costexplorer.AnomalyMonitorArgs.builder
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
    com.pulumi.aws.costexplorer.AnomalyMonitor(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CE Anomaly Subscription. */
  def AnomalySubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.costexplorer.AnomalySubscriptionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.costexplorer.AnomalySubscriptionArgs.builder
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
    com.pulumi.aws.costexplorer.AnomalySubscription(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a CE Cost Allocation Tag.
   * 
   * &gt; **NOTE:** After the user-defined tags are created and applied to resources, it can take up to 24 hours for the tag keys to appear on Cost Allocation tag page for activation.
   */
  def CostAllocationTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.costexplorer.CostAllocationTagArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.costexplorer.CostAllocationTagArgs.builder
    com.pulumi.aws.costexplorer.CostAllocationTag(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CE Cost Category. */
  def CostCategory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.costexplorer.CostCategoryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.costexplorer.CostCategoryArgs.builder
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
    com.pulumi.aws.costexplorer.CostCategory(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object CostexplorerFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides details about a specific CostExplorer Cost Category. */
    inline def getCostCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetCostCategoryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.costexplorer.outputs.GetCostCategoryResult] =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetCostCategoryArgs.builder
      com.pulumi.aws.costexplorer.CostexplorerFunctions.getCostCategory(args(argsBuilder).build)

    /** Provides details about a specific CostExplorer Cost Category. */
    inline def getCostCategoryPlain(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetCostCategoryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.costexplorer.outputs.GetCostCategoryResult] =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetCostCategoryPlainArgs.builder
      com.pulumi.aws.costexplorer.CostexplorerFunctions.getCostCategoryPlain(args(argsBuilder).build)

    /** Provides the available cost allocation tag keys and tag values for a specified period. */
    inline def getTags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.costexplorer.outputs.GetTagsResult] =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsArgs.builder
      com.pulumi.aws.costexplorer.CostexplorerFunctions.getTags(args(argsBuilder).build)

    /** Provides the available cost allocation tag keys and tag values for a specified period. */
    inline def getTagsPlain(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.costexplorer.outputs.GetTagsResult] =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsPlainArgs.builder
      com.pulumi.aws.costexplorer.CostexplorerFunctions.getTagsPlain(args(argsBuilder).build)
