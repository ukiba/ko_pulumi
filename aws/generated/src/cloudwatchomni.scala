package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object cloudwatchomni:
  /**
   * Manages an Amazon CloudWatch Omni domain.
   * 
   * A domain is the top-level container for CloudWatch Omni. It configures how users sign in and contains the spaces that hold telemetry. An account can have one domain.
   * 
   * &gt; **NOTE:** A domain cannot be deleted while it contains spaces.
   */
  inline def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatchomni.DomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatchomni.DomainArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudwatchomni.Domain(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a CloudWatch Omni Space. A space is the container that holds your observability data within a CloudWatch Omni domain.
   * 
   * &gt; **NOTE:** CloudWatch Omni allows only **one space per AWS account per region**. Creating a second space in the same region returns `ConflictException`. A space in a different region is permitted, and a space does not have to be in the same region as its domain.
   * 
   * &gt; **NOTE:** CloudWatch Omni is not available in every region. In unsupported regions the API returns `AccessDeniedException`.
   */
  inline def Space(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatchomni.SpaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatchomni.SpaceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudwatchomni.Space(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
