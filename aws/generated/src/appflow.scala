package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object appflow:
  /**
   * Provides an AppFlow connector profile resource.
   * 
   * For information about AppFlow flows, see the [Amazon AppFlow API Reference](https://docs.aws.amazon.com/appflow/1.0/APIReference/Welcome.html).
   * For specific information about creating an AppFlow connector profile, see the
   * [CreateConnectorProfile](https://docs.aws.amazon.com/appflow/1.0/APIReference/API_CreateConnectorProfile.html) page in the Amazon AppFlow API Reference.
   */
  def ConnectorProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.appflow.ConnectorProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appflow.ConnectorProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.appflow.ConnectorProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides an AppFlow flow resource. */
  def Flow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.appflow.FlowArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appflow.FlowArgs.builder
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
    com.pulumi.aws.appflow.Flow(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
