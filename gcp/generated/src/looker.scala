package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object looker:
  /**
   * A Google Cloud Looker instance.
   * 
   * To get more information about Instance, see:
   * 
   * * [API documentation](https://cloud.google.com/looker/docs/reference/rest/v1/projects.locations.instances)
   * * How-to Guides
   *     * [Configure a Looker (Google Cloud core) instance](https://cloud.google.com/looker/docs/looker-core-instance-setup)
   *     * [Create a Looker (Google Cloud core) instance](https://cloud.google.com/looker/docs/looker-core-instance-create)
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.looker.InstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.looker.InstanceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.looker.Instance(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
