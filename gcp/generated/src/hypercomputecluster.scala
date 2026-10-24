package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object hypercomputecluster:
  /** A collection of virtual machines and connected resources forming a high-performance computing cluster capable of running large-scale, tightly coupled workloads. A cluster combines a set a compute resources that perform computations, storage resources that contain inputs and store outputs, an orchestrator that is responsible for assigning jobs to compute resources, and network resources that connect everything together. */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.hypercomputecluster.ClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.hypercomputecluster.ClusterArgs.builder
    com.pulumi.gcp.hypercomputecluster.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
