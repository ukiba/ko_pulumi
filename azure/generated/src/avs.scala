package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object avs:
  object AvsFunctions:
    /** Use this data source to access information about an existing Azure VMware Solution Private Cloud. */
    inline def getPrivateCloud(args: Endofunction[com.pulumi.azure.avs.inputs.GetPrivateCloudArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.avs.outputs.GetPrivateCloudResult] =
      val argsBuilder = com.pulumi.azure.avs.inputs.GetPrivateCloudArgs.builder
      com.pulumi.azure.avs.AvsFunctions.getPrivateCloud(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Azure VMware Solution Private Cloud. */
    inline def getPrivateCloudPlain(args: Endofunction[com.pulumi.azure.avs.inputs.GetPrivateCloudPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.avs.outputs.GetPrivateCloudResult] =
      val argsBuilder = com.pulumi.azure.avs.inputs.GetPrivateCloudPlainArgs.builder
      com.pulumi.azure.avs.AvsFunctions.getPrivateCloudPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages an Azure VMware Solution Cluster. */
  inline def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.avs.ClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.avs.ClusterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.avs.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure VMware Solution ExpressRoute Circuit Authorization. */
  inline def ExpressRouteAuthorization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.avs.ExpressRouteAuthorizationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.avs.ExpressRouteAuthorizationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.avs.ExpressRouteAuthorization(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure VMware Solution Private Cloud Netapp File Attachment. */
  inline def NetappVolumeAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.avs.NetappVolumeAttachmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.avs.NetappVolumeAttachmentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.avs.NetappVolumeAttachment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure VMware Solution Private Cloud. */
  inline def PrivateCloud(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.avs.PrivateCloudArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.avs.PrivateCloudArgs.builder
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
    com.pulumi.azure.avs.PrivateCloud(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
