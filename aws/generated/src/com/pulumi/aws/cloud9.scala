package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object cloud9:
  /** Provides an environment member to an AWS Cloud9 development environment. */
  def EnvironmentMembership(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloud9.EnvironmentMembershipArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloud9.EnvironmentMembershipArgs.builder
    
    com.pulumi.aws.cloud9.EnvironmentMembership(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Cloud9 EC2 Development Environment. */
  def EnvironmentEC2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloud9.EnvironmentEC2Args.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloud9.EnvironmentEC2Args.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloud9.EnvironmentEC2(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
