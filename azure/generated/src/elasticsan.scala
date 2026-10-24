package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object elasticsan:
  /** Manages an Elastic SAN resource. */
  def ElasticSan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.elasticsan.ElasticSanArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.elasticsan.ElasticSanArgs.builder
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
    com.pulumi.azure.elasticsan.ElasticSan(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object ElasticsanFunctions:
    /** Use this data source to access information about an existing Elastic SAN. */
    inline def get(args: Endofunction[com.pulumi.azure.elasticsan.inputs.GetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.elasticsan.outputs.GetResult] =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.GetArgs.builder
      com.pulumi.azure.elasticsan.ElasticsanFunctions.get(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Elastic SAN. */
    inline def getPlain(args: Endofunction[com.pulumi.azure.elasticsan.inputs.GetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.elasticsan.outputs.GetResult] =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.GetPlainArgs.builder
      com.pulumi.azure.elasticsan.ElasticsanFunctions.getPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Elastic SAN Volume Group. */
    inline def getVolumeGroup(args: Endofunction[com.pulumi.azure.elasticsan.inputs.GetVolumeGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.elasticsan.outputs.GetVolumeGroupResult] =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.GetVolumeGroupArgs.builder
      com.pulumi.azure.elasticsan.ElasticsanFunctions.getVolumeGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Elastic SAN Volume Group. */
    inline def getVolumeGroupPlain(args: Endofunction[com.pulumi.azure.elasticsan.inputs.GetVolumeGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.elasticsan.outputs.GetVolumeGroupResult] =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.GetVolumeGroupPlainArgs.builder
      com.pulumi.azure.elasticsan.ElasticsanFunctions.getVolumeGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Elastic SAN Volume Snapshot. */
    inline def getVolumeSnapshot(args: Endofunction[com.pulumi.azure.elasticsan.inputs.GetVolumeSnapshotArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.elasticsan.outputs.GetVolumeSnapshotResult] =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.GetVolumeSnapshotArgs.builder
      com.pulumi.azure.elasticsan.ElasticsanFunctions.getVolumeSnapshot(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Elastic SAN Volume Snapshot. */
    inline def getVolumeSnapshotPlain(args: Endofunction[com.pulumi.azure.elasticsan.inputs.GetVolumeSnapshotPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.elasticsan.outputs.GetVolumeSnapshotResult] =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.GetVolumeSnapshotPlainArgs.builder
      com.pulumi.azure.elasticsan.ElasticsanFunctions.getVolumeSnapshotPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages an Elastic SAN Volume resource. */
  def Volume(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.elasticsan.VolumeArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.elasticsan.VolumeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.elasticsan.Volume(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Elastic SAN Volume Group resource. */
  def VolumeGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.elasticsan.VolumeGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.elasticsan.VolumeGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.elasticsan.VolumeGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
