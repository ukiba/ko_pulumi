package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object scheduler:
  /**
   * Provides an EventBridge Scheduler Schedule resource.
   * 
   * You can find out more about EventBridge Scheduler in the [User Guide](https://docs.aws.amazon.com/scheduler/latest/UserGuide/what-is-scheduler.html).
   * 
   * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  def Schedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.scheduler.ScheduleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.scheduler.ScheduleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.scheduler.Schedule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an EventBridge Scheduler Schedule Group resource.
   * 
   * You can find out more about EventBridge Scheduler in the [User Guide](https://docs.aws.amazon.com/scheduler/latest/UserGuide/what-is-scheduler.html).
   * 
   * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  def ScheduleGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.scheduler.ScheduleGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.scheduler.ScheduleGroupArgs.builder
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
    com.pulumi.aws.scheduler.ScheduleGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
