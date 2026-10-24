package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object cloudscheduler:
  /**
   * A scheduled job that can publish a PubSub message or an HTTP request
   * every X interval of time, using a crontab format string.
   * 
   * To get more information about Job, see:
   * 
   * * [API documentation](https://cloud.google.com/scheduler/docs/reference/rest/)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/scheduler/)
   */
  def Job(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudscheduler.JobArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudscheduler.JobArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudscheduler.Job(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
