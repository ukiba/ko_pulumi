package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object emrcontainers:
  object EmrcontainersFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieve information about an EMR Containers (EMR on EKS) Virtual Cluster. */
    inline def getVirtualCluster(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.GetVirtualClusterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.emrcontainers.outputs.GetVirtualClusterResult] =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.GetVirtualClusterArgs.builder
      com.pulumi.aws.emrcontainers.EmrcontainersFunctions.getVirtualCluster(args(argsBuilder).build)

    /** Retrieve information about an EMR Containers (EMR on EKS) Virtual Cluster. */
    inline def getVirtualClusterPlain(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.GetVirtualClusterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.emrcontainers.outputs.GetVirtualClusterResult] =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.GetVirtualClusterPlainArgs.builder
      com.pulumi.aws.emrcontainers.EmrcontainersFunctions.getVirtualClusterPlain(args(argsBuilder).build)

  /** Manages an EMR Containers (EMR on EKS) Job Template. */
  def JobTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.emrcontainers.JobTemplateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an EMR Containers (EMR on EKS) Virtual Cluster. */
  def VirtualCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.emrcontainers.VirtualClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
