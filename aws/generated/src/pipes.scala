package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object pipes:
  /**
   * Resource for managing an AWS EventBridge Pipes Pipe.
   * 
   * You can find out more about EventBridge Pipes in the [User Guide](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html).
   * 
   * EventBridge Pipes are very configurable, and may require IAM permissions to work correctly. More information on the configuration options and IAM permissions can be found in the [User Guide](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html).
   * 
   * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  def Pipe(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pipes.PipeArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.pipes.PipeArgs.builder
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
    com.pulumi.aws.pipes.Pipe(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
