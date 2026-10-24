package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object hypercomputecluster:
  /** A collection of virtual machines and connected resources forming a high-performance computing cluster capable of running large-scale, tightly coupled workloads. A cluster combines a set a compute resources that perform computations, storage resources that contain inputs and store outputs, an orchestrator that is responsible for assigning jobs to compute resources, and network resources that connect everything together. */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.hypercomputecluster.ClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.hypercomputecluster.ClusterArgs.builder
    com.pulumi.gcp.hypercomputecluster.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
