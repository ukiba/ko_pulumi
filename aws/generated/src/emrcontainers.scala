package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object emrcontainers:
  object EmrcontainersFunctions:
    /** Retrieve information about an EMR Containers (EMR on EKS) Virtual Cluster. */
    inline def getVirtualCluster(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.GetVirtualClusterArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.emrcontainers.outputs.GetVirtualClusterResult] =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.GetVirtualClusterArgs.builder
      com.pulumi.aws.emrcontainers.EmrcontainersFunctions.getVirtualCluster(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieve information about an EMR Containers (EMR on EKS) Virtual Cluster. */
    inline def getVirtualClusterPlain(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.GetVirtualClusterPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.emrcontainers.outputs.GetVirtualClusterResult] =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.GetVirtualClusterPlainArgs.builder
      com.pulumi.aws.emrcontainers.EmrcontainersFunctions.getVirtualClusterPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages an EMR Containers (EMR on EKS) Job Template. */
  inline def JobTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.emrcontainers.JobTemplateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.emrcontainers.JobTemplateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.emrcontainers.JobTemplate(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an EMR Containers (EMR on EKS) Virtual Cluster. */
  inline def VirtualCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.emrcontainers.VirtualClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.emrcontainers.VirtualClusterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.emrcontainers.VirtualCluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
