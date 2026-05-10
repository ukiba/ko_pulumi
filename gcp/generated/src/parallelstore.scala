package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object parallelstore:
  /** A Parallelstore Instance. */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.parallelstore.InstanceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.parallelstore.InstanceArgs.builder
    com.pulumi.gcp.parallelstore.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
