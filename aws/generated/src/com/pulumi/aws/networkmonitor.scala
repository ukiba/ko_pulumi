package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object networkmonitor:
  /** Resource for managing an AWS Network Monitor Probe. */
  def Probe(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmonitor.ProbeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmonitor.ProbeArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.networkmonitor.Probe(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Network Monitor Monitor. */
  def Monitor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmonitor.MonitorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmonitor.MonitorArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.networkmonitor.Monitor(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
