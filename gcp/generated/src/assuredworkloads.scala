package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object assuredworkloads:
  /** The AssuredWorkloads Workload resource */
  inline def Workload(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.assuredworkloads.WorkloadArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.assuredworkloads.WorkloadArgs.builder
    com.pulumi.gcp.assuredworkloads.Workload(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
