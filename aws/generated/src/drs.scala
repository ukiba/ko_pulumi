package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object drs:
  /**
   * Provides an Elastic Disaster Recovery replication configuration template resource. Before using DRS, your account must be [initialized](https://docs.aws.amazon.com/drs/latest/userguide/getting-started-initializing.html).
   * 
   * &gt; **NOTE:** Your configuration must use the PIT policy shown in the basic configuration due to AWS rules. The only value that you can change is the `retentionDuration` of `ruleId` 3.
   */
  def ReplicationConfigurationTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.drs.ReplicationConfigurationTemplateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.drs.ReplicationConfigurationTemplateArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.drs.ReplicationConfigurationTemplate(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
