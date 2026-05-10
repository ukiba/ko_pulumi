package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object cloudids:
  /**
   * Cloud IDS is an intrusion detection service that provides threat detection for intrusions, malware, spyware, and command-and-control attacks on your network.
   * 
   *  To get more information about Endpoint, see:
   * 
   *  * [API documentation](https://cloud.google.com/intrusion-detection-system/docs/configuring-ids)
   */
  def Endpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudids.EndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudids.EndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudids.Endpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
