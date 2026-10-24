package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object kinesisanalyticsv2:
  /**
   * Manages a Kinesis Analytics v2 Application.
   * This resource can be used to manage both Kinesis Data Analytics for SQL applications and Kinesis Data Analytics for Apache Flink applications.
   * 
   * &gt; **Note:** Kinesis Data Analytics for SQL applications created using this resource cannot currently be viewed in the AWS Console. To manage Kinesis Data Analytics for SQL applications that can also be viewed in the AWS Console, use the `aws.kinesis.AnalyticsApplication` resource.
   */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.ApplicationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kinesisanalyticsv2.ApplicationArgs.builder
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
    com.pulumi.aws.kinesisanalyticsv2.Application(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Kinesis Analytics v2 Application Snapshot.
   * Snapshots are the AWS implementation of [Flink Savepoints](https://ci.apache.org/projects/flink/flink-docs-release-1.11/ops/state/savepoints.html).
   */
  def ApplicationSnapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.ApplicationSnapshotArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.ApplicationSnapshotArgs.builder
    com.pulumi.aws.kinesisanalyticsv2.ApplicationSnapshot(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
