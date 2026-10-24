package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object timestreaminfluxdb:
  /**
   * Resource for managing an Amazon Timestream for InfluxDB read-replica cluster.
   * 
   * &gt; **NOTE:** This resource requires a subscription to [Timestream for InfluxDB Read Replicas (Add-On) on the AWS Marketplace](https://aws.amazon.com/marketplace/pp/prodview-lftzfxtb5xlv4?applicationId=AWS-Marketplace-Console&amp;ref_=beagle&amp;sr=0-2).
   */
  inline def DbCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.timestreaminfluxdb.DbClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.timestreaminfluxdb.DbClusterArgs.builder
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
    com.pulumi.aws.timestreaminfluxdb.DbCluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an Amazon Timestream for InfluxDB database instance. */
  inline def DbInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.timestreaminfluxdb.DbInstanceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.timestreaminfluxdb.DbInstanceArgs.builder
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
    com.pulumi.aws.timestreaminfluxdb.DbInstance(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
